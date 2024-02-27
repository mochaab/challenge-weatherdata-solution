package de.exxcellent.challenge;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.opencsv.exceptions.CsvValidationException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws IOException 
     * @throws CsvValidationException 
     */
    public static void main(String... args) {

        /**
         * WEATHER TASK PSEUDOCODE
         * 1. Create class for Weather
         * 2. Create class for WeatherData (For list of weather object)
         * 3. Read CSV file from WeatherData (difference of mxt and mnt in one variable)
         * 4. Sort list (ascending order) of Weather objects according to diff variable using comparable
         * 5. Choose the first element 
         * 6. Output object.day
         */

         WeatherData weatherData = new WeatherData();
         FootballData footballData = new FootballData();

         int dayWithSmallestTempSpread = weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER_JSON);     // Your day analysis function call …
         System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

         String teamWithSmallestGoalSpread = footballData.getTeamWithSmallestGoalSpread(Config.PATH_FOOTBALL_JSON); // Your goal analysis function call …
         System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);


      
    }

    public static void main(String pDataType, Path pPathWeather) {
        // TODO Auto-generated method stub

        String dataType = pDataType;
        switch (dataType) {
           case "--weather":
               // code to execute if data type is weather
               WeatherData weatherData = new WeatherData();
               int dayWithSmallestTempSpread = weatherData.getDayWithSmallestTempSpread(pPathWeather);     // Your day analysis function call …
               System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
               break;
           case "--football":
               // code to execute if data type is football
               FootballData footballData = new FootballData();
               String teamWithSmallestGoalSpread = footballData.getTeamWithSmallestGoalSpread(pPathWeather); // Your goal analysis function call …
               System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
               break;
           // additional cases as needed
           default:
               // code to be executed if expression doesn't match any case
               System.out.printf("No class for this type of data");
       }

        // throw new UnsupportedOperationException("Unimplemented method 'main'");
    }


}
