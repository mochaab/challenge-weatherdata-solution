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
*
* @author Charissa Morales <charissamorales.bscs@gmail.com>
*/

public class WeatherData {
    
    /** 
     * Returns day with smallest temperature
     * 
     * @param pPath path of the source file
     * @return int
     */
    public int getDayWithSmallestTempSpread(Path pPath){
        int lDay = 0;

        // read file and convert to weather object
        List<Weather> lFileList = parseBasedOnFileType(pPath);

        // compute difference between maximum and minimum temperature
        lFileList.forEach(weather -> {
            weather.setDiff(weather.getMxT()-weather.getMnT());
        });

        // sort the list according to difference between mxt and mnt
        Collections.sort(lFileList);

        // get the first element of wList
        lDay = lFileList.get(0).getDay();

        return lDay;

    }

    
    
    /** 
     * Reads file and parse according to file type
     * 
     * @param pPath path of the source file
     * @return List<Weather> List of weather data
     */
    public List<Weather> parseBasedOnFileType(Path pPath){
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
            // skip header
            String[] lHeaders = reader.readNext();
            String[] lNextLine;

            while ((lNextLine = reader.readNext()) != null) {

                // only 3 variables are specified for now
                int lDay = Integer.parseInt(lNextLine[WeatherConstants.COL_INDECES.get(WeatherConstants.COL_NAME_DAY)]);
                int lMaxTemp = Integer.parseInt(lNextLine[WeatherConstants.COL_INDECES.get(WeatherConstants.COL_NAME_MXT)]);
                int lMinTemp = Integer.parseInt(lNextLine[WeatherConstants.COL_INDECES.get(WeatherConstants.COL_NAME_MNT)]);
                // ...

                // store in weather object
                Weather wObj = new Weather(lDay, lMaxTemp, lMinTemp);
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
                // ...

                // store in weather object
                Weather wObj = new Weather(lDay, lMaxTemp, lMinTemp);
                lObj.add(wObj);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return lObj;
    }

    // private List<Weather> parseXMLToList(Path pPath){ ... }
}

