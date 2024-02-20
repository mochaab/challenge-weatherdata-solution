package de.exxcellent.challenge;

import java.util.ArrayList;

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
    
        int dayWithSmallestTempSpread = weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
