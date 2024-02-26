package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class WeatherData {
    // data list

    public int getDayWithSmallestTempSpread(Path pCsvPathString){
        int day = 0;

        // DataProcessor.parseData(pCsvPathString);
        
        // read csv and convert to weather object
        List<Weather> wList = parseWeatherData(pCsvPathString);

        // sort the list according to difference between mxt and mnt
        Collections.sort(wList);

        // get the first element of wList
        day = wList.get(0).getcDay();

        return day;

    }

    private List<Weather> parseWeatherData(Path pCsvPathString){
        List<Weather> wList = new ArrayList<>();

        try {
            List<String[]> strList = DataProcessor.parseData(pCsvPathString);
            for (String[] row : strList) {
                // Iterate through each String[] (row)
                for (String element : row) {

                    int day = Integer.parseInt(row[0]);
                    int mxt = Integer.parseInt(row[1]);
                    int mnt = Integer.parseInt(row[2]);
                    
                    // calculate difference between mxt and mnt
                    int diff = mxt - mnt;
    
                    // save in Weather object
                    Weather wObj = new Weather(day, mxt, mnt, diff);
                    wList.add(wObj);
                }
                System.out.println(); // Print new line after each row
            }


        } catch (CsvValidationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        // read csv file
        // try (CSVReader reader = new CSVReader(new FileReader(pCsvPathString.toString()))) {
        //     // skip headers
        //     String[] headers = reader.readNext();
        //     String[] nextLine;

        //     while ((nextLine = reader.readNext()) != null) {

        //         int day = Integer.parseInt(nextLine[0]);
        //         int mxt = Integer.parseInt(nextLine[1]);
        //         int mnt = Integer.parseInt(nextLine[2]);
                
        //         // calculate difference between mxt and mnt
        //         int diff = mxt - mnt;

        //         // save in Weather object
        //         Weather wObj = new Weather(day, mxt, mnt, diff);
        //         wList.add(wObj);
        //     }
        // } catch (IOException | CsvException e) {
        //     e.printStackTrace();
        // }


        return wList;
    };



         

}

