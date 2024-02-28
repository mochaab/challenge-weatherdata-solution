package de.exxcellent.challenge;

import java.util.HashMap;
import java.util.Map;

/** 
* WeatherConstants class represents constants used for weather object
* 
* @author Charissa Morales <charissamorales.bscs@gmail.com>
*/
public class FootballConstants {

    // CSV column names
    public static final String COL_NAME_TEAM = "Team";
    public static final String COL_NAME_GAMES = "Games";
    public static final String COL_NAME_WINS = "Wins";
    public static final String COL_NAME_LOSSES = "Losses";
    public static final String COL_NAME_DRAWS = "Draws";
    public static final String COL_NAME_GOALS = "Goals";
    public static final String COL_NAME_GOALS_ALLOWED = "Goals Allowed";
    public static final String COL_NAME_POINTS = "Points";


    // CSV index
    public static final Map<String, Integer> COL_INDECES = new HashMap<String, Integer>() {{
        // Initialize the map with some initial entries
        put(COL_NAME_TEAM, 0);
        put(COL_NAME_GAMES, 1);
        put(COL_NAME_WINS, 2);
        put(COL_NAME_LOSSES, 3);
        put(COL_NAME_DRAWS, 4);
        put(COL_NAME_GOALS, 5);
        put(COL_NAME_GOALS_ALLOWED, 6);
        put(COL_NAME_POINTS, 7);
    }};


    // JSON Key Names
    public static final String KEY_NAME_TEAM = "team";
    public static final String KEY_NAME_GAMES = "games";
    public static final String KEY_NAME_WINS = "wins";
    public static final String KEY_NAME_LOSSES = "losses";
    public static final String KEY_NAME_DRAWS = "draws";
    public static final String KEY_NAME_GOALS = "goals";
    public static final String KEY_NAME_GOALS_ALLOWED = "goalsAllowed";
    public static final String KEY_NAME_POINTS = "points";
    
    
}
