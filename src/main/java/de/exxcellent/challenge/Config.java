package de.exxcellent.challenge;

import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * The Config class represents a configuration utility for managing file paths
 * and constants used throughout the application.
 */
public class Config {

    // Define constant paths
    private static final String USER_HOME = System.getProperty("user.home");
    // private static final String USER_FOLDER = USER_HOME.concat("/Documents");
    private static final String USER_FOLDER = USER_HOME.concat("/work");
    private static final String PROJECT_RESOURCES = USER_FOLDER.concat("/CodingChallenge/programming-challenge/src/main/resources");
    
    // CSV Files
    private static final String CSV_FILENAME_WEATHER = "weather.csv";
    private static final String CSV_FILENAME_FOOTBALL = "football.csv";
   

    // JSON Files
    private static final String JSON_FILENAME_WEATHER = "weather.json";
    private static final String JSON_FILENAME_FOOTBALL = "football.json";



    // Full paths constructions
    public static final Path PATH_WEATHER = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", CSV_FILENAME_WEATHER));
    public static final Path PATH_FOOTBALL = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", CSV_FILENAME_FOOTBALL));
    public static final Path PATH_WEATHER_JSON = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", JSON_FILENAME_WEATHER));
    public static final Path PATH_FOOTBALL_JSON = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", JSON_FILENAME_FOOTBALL));

    // Build path using variable number of components
   private static String buildPath(String... components) {
        StringBuilder pathBuilder = new StringBuilder();
        for (String component : components) {
            pathBuilder.append(component);
            pathBuilder.append("/");
        }
        // Remove the trailing slash
        pathBuilder.deleteCharAt(pathBuilder.length() - 1);
        return pathBuilder.toString();
    }


}
