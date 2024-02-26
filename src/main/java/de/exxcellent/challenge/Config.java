package de.exxcellent.challenge;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {

    // Define constant paths
    private static final String USER_HOME = System.getProperty("user.home");
    private static final String USER_FOLDER = USER_HOME.concat("/Documents");
    private static final String PROJECT_RESOURCES = USER_FOLDER.concat("/CodingChallenge/programming-challenge/src/main/resources");
    private static final String CSV_FILENAME_WEATHER = "weather.csv";
    private static final String CSV_FILENAME_FOOTBALL = "football.csv";

    // Full paths constructions
    public static final Path PATH_WEATHER = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", CSV_FILENAME_WEATHER));
    public static final Path PATH_FOOTHBALL = Paths.get(buildPath(PROJECT_RESOURCES, "de/exxcellent/challenge", CSV_FILENAME_FOOTBALL));

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
