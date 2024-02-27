package de.exxcellent.challenge;

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


    @Override
    public int compareTo(Football o) {
        // compare by diff (difference of mxt to mnt)
        return Integer.compare(this.cDiff, o.cDiff);
    }


    public Football(){
    }

    public Football(String pTeam, int pGoals,int pGoalsAllowed, int pDiff){
        this.cTeam = pTeam;
        this.cGoals = pGoals;
        this.cGoalsAllowed = pGoalsAllowed;
        this.cDiff = pDiff;
    }

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

    public String getTeam() {
        return cTeam;
    }


    public void setTeam(String pTeam) {
        this.cTeam = pTeam;
    }


    public int getGames() {
        return cGames;
    }


    public void setGames(int pGames) {
        this.cGames = pGames;
    }


    public int getWins() {
        return cWins;
    }


    public void setWins(int pWins) {
        this.cWins = pWins;
    }


    public int getLosses() {
        return cLosses;
    }


    public void setLosses(int pLosses) {
        this.cLosses = pLosses;
    }


    public int getDraws() {
        return cDraws;
    }


    public void setDraws(int pDraws) {
        this.cDraws = pDraws;
    }


    public int getGoals() {
        return cGoals;
    }


    public void setGoals(int pGoals) {
        this.cGoals = pGoals;
    }


    public int getGoalsAllowed() {
        return cGoalsAllowed;
    }


    public void setGoalsAllowed(int pGoalsAllowed) {
        this.cGoalsAllowed = pGoalsAllowed;
    }


    public int getPoints() {
        return cPoints;
    }


    public void setPoints(int pPoints) {
        this.cPoints = pPoints;
    }


    public int getDiff() {
        return cDiff;
    }


    public void setDiff(int pDiff) {
        this.cDiff = pDiff;
    }



}
