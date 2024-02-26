package de.exxcellent.challenge;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
    public static void main(String... args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CsvValidationException, IOException {

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

        int dayWithSmallestTempSpread = weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = footballData.getTeamWithSmallestGoalSpread(Config.PATH_FOOTHBALL); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
