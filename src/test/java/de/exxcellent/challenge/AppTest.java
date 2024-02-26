package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";
    private WeatherData weatherData;
    private FootballData footballData;
    

    @BeforeEach
    void setUp() {
        successLabel = "successful";
        weatherData = new WeatherData();
        footballData = new FootballData();
        
    }
    
    @Test 
    @DisplayName("Day with lowest temperature")
    void testGetDayWithSmallestTempSpread(){
        assertEquals(14,weatherData.getDayWithSmallestTempSpread(
            Config.PATH_WEATHER
        ), "Day should be 14: " + weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER));
    }

    @Test 
    void testGetTeamWithSmallestGoalSpread(){
        assertEquals("Aston_Villa",footballData.getTeamWithSmallestGoalSpread(
            Config.PATH_FOOTHBALL
        ), "Team should be Aston_Villa: " + footballData.getTeamWithSmallestGoalSpread(Config.PATH_FOOTHBALL));
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runWeather() {
        App.main("--weather", Config.PATH_WEATHER);
    }

    @Test
    void runFootball() {
        App.main("--football", Config.PATH_FOOTHBALL);
    }

}