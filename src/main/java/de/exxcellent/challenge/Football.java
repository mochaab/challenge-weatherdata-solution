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


    public void setcTeam(String cTeam) {
        this.cTeam = cTeam;
    }


    public int getcGames() {
        return cGames;
    }


    public void setcGames(int cGames) {
        this.cGames = cGames;
    }


    public int getcWins() {
        return cWins;
    }


    public void setcWins(int cWins) {
        this.cWins = cWins;
    }


    public int getcLosses() {
        return cLosses;
    }


    public void setcLosses(int cLosses) {
        this.cLosses = cLosses;
    }


    public int getcDraws() {
        return cDraws;
    }


    public void setcDraws(int cDraws) {
        this.cDraws = cDraws;
    }


    public int getcGoals() {
        return cGoals;
    }


    public void setcGoals(int cGoals) {
        this.cGoals = cGoals;
    }


    public int getcGoalsAllowed() {
        return cGoalsAllowed;
    }


    public void setcGoalsAllowed(int cGoalsAllowed) {
        this.cGoalsAllowed = cGoalsAllowed;
    }


    public int getcPoints() {
        return cPoints;
    }


    public void setcPoints(int cPoints) {
        this.cPoints = cPoints;
    }


    public int getcDiff() {
        return cDiff;
    }


    public void setcDiff(int cDiff) {
        this.cDiff = cDiff;
    }



}
