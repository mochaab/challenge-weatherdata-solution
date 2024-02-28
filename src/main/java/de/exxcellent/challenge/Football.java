package de.exxcellent.challenge;

/**
 * Represents Football Object with related variables
 * 
 * @author Charissa Morales <charissamorales.bscs@gmail.com>
 */

public class Football implements Comparable<Football>{
    private String cTeam;
    private int cGames;
    private int cWins;
    private int cLosses;
    private int cDraws;
    private int cGoals;
    private int cGoalsAllowed;
    private int cPoints;
    private int cDiff;

    
    /** 
     * Compare Goals-GoalsAllowed difference for each team
     * 
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Football o) {
        // compare by diff (difference of mxt to mnt)
        return Integer.compare(this.cDiff, o.cDiff);
    }

    /** 
     * Default constructor
     */
    public Football(){

    }

    /** 
     * Constructor with Teams, Goals, GoalsAllowed and difference between goals and goalsAllowed
     * 
     * @param pTeam
     * @param pGoals
     * @param pGoalsAllowed
     * @param pDiff
     */
    public Football(String pTeam, int pGoals,int pGoalsAllowed){
        this.cTeam = pTeam;
        this.cGoals = pGoals;
        this.cGoalsAllowed = pGoalsAllowed;
    }


    /** 
     * Constructor with all related variables
     * 
     * @param pGames number of games
     * @param pWins number of wins
     * @param pLosses number of losses
     * @param pDraws number of draws
     * @param pGoals number of goals
     * @param pGoalsAllowed number of goalsAllowed
     * @param pPoints number of points
     * @param pDiff difference between goals and goalsAllowed
     */
    public Football(String pTeam,
    int pGames,
    int pWins,
    int pLosses,
    int pDraws,
    int pGoals,
    int pGoalsAllowed,
    int pPoints,
    int pDiff) {
        this.cTeam = pTeam;
        this.cGames = pGames;
        this.cWins = pWins;
        this.cLosses = pLosses;
        this.cDraws = pDraws;
        this.cGoals = pGoals;
        this.cGoalsAllowed = pGoalsAllowed;
        this.cPoints = pPoints;
        this.cDiff = pDiff;

    }

    
    /** 
     * Returns team name
     * 
     * @return String
     */
    public String getTeam() {
        return cTeam;
    }


    
    /** 
     * Sets team name
     * 
     * @param pTeam
     */
    public void setTeam(String pTeam) {
        this.cTeam = pTeam;
    }


    
    /** 
     * Returns number of games
     * 
     * @return int
     */
    public int getGames() {
        return cGames;
    }


    
    /** 
     * Set number of games
     * 
     * @param pGames
     */
    public void setGames(int pGames) {
        this.cGames = pGames;
    }


    
    /** 
     * Returns number of wins
     * 
     * @return int
     */
    public int getWins() {
        return cWins;
    }


    
    /** 
     * Sets number of wins
     * 
     * @param pWins
     */
    public void setWins(int pWins) {
        this.cWins = pWins;
    }


    
    /** 
     * Returns number of losses
     * 
     * @return int
     */
    public int getLosses() {
        return cLosses;
    }


    
    /** 
     * Sets number of losses
     * 
     * @param pLosses
     */
    public void setLosses(int pLosses) {
        this.cLosses = pLosses;
    }


    
    /** 
     * Returns number of draws
     * 
     * @return int
     */
    public int getDraws() {
        return cDraws;
    }


    
    /** 
     * Sets number of draws
     * 
     * @param pDraws
     */
    public void setDraws(int pDraws) {
        this.cDraws = pDraws;
    }


    
    /** 
     * Returns number of Goals
     * 
     * @return int
     */
    public int getGoals() {
        return cGoals;
    }


    
    /** 
     * Sets number of goals
     * 
     * @param pGoals
     */
    public void setGoals(int pGoals) {
        this.cGoals = pGoals;
    }


    
    /** 
     * Returns number of goals allowed
     * 
     * @return int
     */
    public int getGoalsAllowed() {
        return cGoalsAllowed;
    }


    
    /** 
     * Sets number of goals allowed
     * 
     * @param pGoalsAllowed
     */
    public void setGoalsAllowed(int pGoalsAllowed) {
        this.cGoalsAllowed = pGoalsAllowed;
    }


    
    /** 
     * Returns points
     * 
     * @return int
     */
    public int getPoints() {
        return cPoints;
    }


    
    /** 
     * Sets points
     * 
     * @param pPoints
     */
    public void setPoints(int pPoints) {
        this.cPoints = pPoints;
    }


    
    /** 
     * Returns difference between goals and goalsAllowed
     * 
     * @return int
     */
    public int getDiff() {
        return cDiff;
    }


    
    /** 
     * Sets difference between goals and goalsAllowed
     * 
     * @param pDiff
     */
    public void setDiff(int pDiff) {
        this.cDiff = pDiff;
    }

}
