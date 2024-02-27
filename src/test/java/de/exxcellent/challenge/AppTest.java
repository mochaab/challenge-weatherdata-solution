package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.List;


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
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }
    
    @Test 
    void testGetDayWithSmallestTempSpread(){
        assertEquals(14,weatherData.getDayWithSmallestTempSpread(
            Config.PATH_WEATHER
        ), "Day should be 14: " + weatherData.getDayWithSmallestTempSpread(Config.PATH_WEATHER));
    }

    @Test 
    void testGetTeamWithSmallestGoalSpread(){
        assertEquals("Aston_Villa",footballData.getTeamWithSmallestGoalSpread(
            Config.PATH_FOOTBALL
        ), "Team should be Aston_Villa: " + footballData.getTeamWithSmallestGoalSpread(Config.PATH_FOOTBALL));
    }

    @Test
    void testParseJSONDataWeather(){
        List<Weather> weatherList = weatherData.parseJSONToList(Config.PATH_WEATHER_JSON);
        
        // Assertions on the returned list
        assertNotNull(weatherList);
        assertFalse(weatherList.isEmpty());
        assertEquals(30, weatherList.size());

        for(Weather weather: weatherList){
            assertNotNull(weather);
        }
    }

    @Test
    void testParseJSONDataFootball(){
        List<Football> footballList = footballData.parseJSONToList(Config.PATH_FOOTBALL_JSON);
        
        // Assertions on the returned list
        assertNotNull(footballList);
        assertFalse(footballList.isEmpty());
        assertEquals(20, footballList.size());

        for(Football football: footballList){
            assertNotNull(football);
        }
    }

    @Test
    void runWeather() {
        App.main("--weather", Config.PATH_WEATHER_JSON);
    }

    @Test
    void runFootball() {
        App.main("--football", Config.PATH_FOOTBALL_JSON);
    }

}