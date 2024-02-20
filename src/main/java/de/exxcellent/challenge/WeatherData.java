package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;

public class WeatherData {
    // data list

    public int getDayWithSmallestTempSpread(String csvPathString){
        int day = 0;

        // read csv and convert to weather object
        List<Weather> wList = loadCSV(csvPathString);

        // sort the list according to difference between mxt and mnt
        Collections.sort(wList);

        // get the first element of wList
        day = wList.get(0).getcDay();

        return day;

    }

    private List<Weather> loadCSV(String csvPathString){
        List<Weather> wList = new ArrayList<>();
        
        // read csv file
        try (CSVReader reader = new CSVReader(new FileReader(csvPathString))) {
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
                wList.add(wObj);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }


        return wList;
    };



         

}

