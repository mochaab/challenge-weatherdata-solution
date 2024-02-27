package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

// import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class WeatherData {
    

    public int getDayWithSmallestTempSpread(Path pPath){
        int lDay = 0;

        // read file and convert to weather object
        List<Weather> lFileList = convertFileToList(pPath);

        // sort the list according to difference between mxt and mnt
        Collections.sort(lFileList);

        // get the first element of wList
        lDay = lFileList.get(0).getDay();

        return lDay;

    }

    private List<Weather> convertFileToList(Path pPath){
        String lExt = Utils.getFileExtension(pPath);
        List<Weather> lObj = new ArrayList<>();

        switch (lExt) {
            case Utils.EXT_CSV:          
                   lObj = parseCSVToList(pPath);
                break;
            case Utils.EXT_JSON:
                    lObj = parseJSONToList(pPath);
                break;
            case Utils.EXT_XML:
                // Process xml
                break;
            default:
                lObj.add(null);
        }
        return lObj;

    }

    private List<Weather> parseCSVToList(Path pPath){
        List<Weather> lObj = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pPath.toString()))) {
            // skip headers
            String[] headers = reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                int lDay = Integer.parseInt(nextLine[0]);
                int lMaxTemp = Integer.parseInt(nextLine[1]);
                int lMinTemp = Integer.parseInt(nextLine[2]);
                
                // calculate difference between mxt and mnt
                int lDiff = lMaxTemp - lMinTemp;

                // save in Weather object
                Weather wObj = new Weather(lDay, lMaxTemp, lMinTemp, lDiff);
                lObj.add(wObj);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return lObj;
    }

     
    List<Weather> parseJSONToList(Path pPath){
        List<Weather> lObj = new ArrayList<>();
         try {
            ObjectMapper mapper = new ObjectMapper();
            // List<Weather> weather = mapper.readValue(new File(pPath.toString()), 
            //                         mapper.getTypeFactory().constructCollectionType(List.class, 
            //                                                                         Weather.class));

            List<Weather> weather = mapper.readValue(new File(pPath.toString()), new TypeReference<List<Weather>>(){});
            // String jsonArray = Utils.convertJsonFileToString(pPath.toString());
            // List<Weather> weather = mapper.readValue(jsonArray, new TypeReference<List<Weather>>(){});
            // List<Weather> weather = mapper.readValue(new File(pPath.toString()), Weather.class);

            // Now you have a List<Person> containing the objects from the JSON file
            for (Weather w : weather) { 

                int lDay = w.getDay();
                int lMaxTemp = w.getMxT();
                int lMinTemp = w.getMnT();

                System.out.println(lDay+" "+lMaxTemp+" "+lMinTemp);
                
                // calculate difference between mxt and mnt
                int lDiff = lMaxTemp - lMinTemp;

                Weather wObj = new Weather(lDay, lMaxTemp, lMinTemp, lDiff);
                lObj.add(wObj);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return lObj;
    }

    // private List<Weather> parseXMLToList(Path pPath){ ... }
}

