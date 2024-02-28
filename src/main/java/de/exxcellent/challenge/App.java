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
 * @author Charissa Morales <charissamorales.bscs@gmail.com>
 */
public final class App {


    public static void main(String... args) {

         WeatherData weatherData = new WeatherData();
         FootballData footballData = new FootballData();

         int dayWithSmallestTempSpread = weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER);     // Your day analysis function call …
         System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

         String teamWithSmallestGoalSpread = footballData.getTeamWithSmallestGoalSpread(Config.PATH_FOOTBALL); // Your goal analysis function call …
         System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);

    }

    public static void main(String pDataType, Path pPathWeather) {
        // Entry point for unit testing

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
           default:
               // code to be executed if expression doesn't match any case
               System.out.printf("No class for this type of data");
       }
    }


}
