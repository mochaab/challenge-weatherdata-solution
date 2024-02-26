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
        lDay = lFileList.get(0).getcDay();

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

                int day = Integer.parseInt(nextLine[0]);
                int mxt = Integer.parseInt(nextLine[1]);
                int mnt = Integer.parseInt(nextLine[2]);
                
                // calculate difference between mxt and mnt
                int diff = mxt - mnt;

                // save in Weather object
                Weather wObj = new Weather(day, mxt, mnt, diff);
                lObj.add(wObj);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return lObj;
    }

     
    private List<Weather> parseJSONToList(Path pPath){
        List<Weather> lObj = new ArrayList<>();
         try {
            ObjectMapper mapper = new ObjectMapper();
            List<Weather> weather = mapper.readValue(new File(pPath.toString()), mapper.getTypeFactory().constructCollectionType(List.class, Weather.class));

            // Now you have a List<Person> containing the objects from the JSON file
            for (Weather w : weather) {

                int day = w.getcDay();
                int mxt = w.getcMxT();
                int mnt = w.getcMnT();
                
                // calculate difference between mxt and mnt
                int diff = mxt - mnt;

                Weather wObj = new Weather(day, mxt, mnt, diff);
                lObj.add(wObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lObj;
    }






         

}

