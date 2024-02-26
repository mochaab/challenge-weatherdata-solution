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

    public String getcTeam() {
        return cTeam;
    }


    public void setcTeam(String pTeam) {
        this.cTeam = pTeam;
    }


    public int getcGames() {
        return cGames;
    }


    public void setcGames(int pGames) {
        this.cGames = pGames;
    }


    public int getcWins() {
        return cWins;
    }


    public void setcWins(int pWins) {
        this.cWins = pWins;
    }


    public int getcLosses() {
        return cLosses;
    }


    public void setcLosses(int pLosses) {
        this.cLosses = pLosses;
    }


    public int getcDraws() {
        return cDraws;
    }


    public void setcDraws(int pDraws) {
        this.cDraws = pDraws;
    }


    public int getcGoals() {
        return cGoals;
    }


    public void setcGoals(int pGoals) {
        this.cGoals = pGoals;
    }


    public int getcGoalsAllowed() {
        return cGoalsAllowed;
    }


    public void setcGoalsAllowed(int pGoalsAllowed) {
        this.cGoalsAllowed = pGoalsAllowed;
    }


    public int getcPoints() {
        return cPoints;
    }


    public void setcPoints(int pPoints) {
        this.cPoints = pPoints;
    }


    public int getcDiff() {
        return cDiff;
    }


    public void setcDiff(int pDiff) {
        this.cDiff = pDiff;
    }



}
