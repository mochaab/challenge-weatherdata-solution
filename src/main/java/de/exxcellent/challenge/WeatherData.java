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

/** 
* Represents list of weather data
*/

public class WeatherData {
    private static final int MAX_VALUE = 100;
    

    
    /** 
     * Returns day with smallest temperature
     * 
     * @param pPath path of the source file
     * @return int
     */
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

    
    
    /** 
     * Returns mapped object values from the source file
     * 
     * @param pPath path of the source file
     * @return List<Weather> List of weather data
     */
    public List<Weather> convertFileToList(Path pPath){
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

    
    
    /** 
     * Read csv file and map csv values to object
     * 
     * @param pPath path of the source file
     * @return List<Weather> List of weather data
     */
    public List<Weather> parseCSVToList(Path pPath){
        List<Weather> lObj = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pPath.toString()))) {
            // skip headers
            String[] lHeaders = reader.readNext();
            String[] lNextLine;

            while ((lNextLine = reader.readNext()) != null) {

                int lDay = Integer.parseInt(lNextLine[0]);
                int lMaxTemp = Integer.parseInt(lNextLine[1]);
                int lMinTemp = Integer.parseInt(lNextLine[2]);
                
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

      
    
    /** 
     * Read json file and map json values to object
     * 
     * @param pPath path of the source file
     * @return List<Weather> List of weather data
     */
    public List<Weather> parseJSONToList(Path pPath){
        List<Weather> lObj = new ArrayList<>();
         try {
            ObjectMapper lMapper = new ObjectMapper();
            List<Weather> lWeather = lMapper.readValue(new File(pPath.toString()), new TypeReference<List<Weather>>(){});

            // Now you have a List<Person> containing the objects from the JSON file
            for (Weather w : lWeather) { 

                int lDay = w.getDay();
                int lMaxTemp = w.getMxT();
                int lMinTemp = w.getMnT();
                
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

