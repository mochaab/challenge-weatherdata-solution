package de.exxcellent.challenge;

/**
 * Represents Weather Object with related variables
 */

public class Weather implements Comparable<Weather>{

    private int cDay;
    private int cMxT;
    private int cMnT;
    private int cAvT;
    private double cAvDP;
    private int c1HrPTPcpn;
    private int cPDir;
    private double cAvSp;
    private double cDir;
    private int cMxS;
    private int cSkyC;
    private double cMxR;
    private int cMn;
    private double cRAvSLP;
    private int cDiff;


    
    /** 
     * Compare maxTemp - minTemp of each day
     * 
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Weather o) {
        return Integer.compare(this.cDiff, o.cDiff);
    }

    /**
     * Default constructor
     */
    public Weather(){

    }

     /**
     * Constructs a new Weather object with day, maximum and minimum temperature and its difference
     * 
     * @param pDay day
     * @param pMxT maximum temperature
     * @param pMnT minumum temperature
     * @param pDiff difference between maximum and minimum temperature
     */
    public Weather(int pDay, int pMxT,int pMnT, int pDiff){
        this.cDay = pDay;
        this.cMxT = pMxT;
        this.cMnT = pMnT;
        this.cDiff = pDiff;
    }

    /**
     * Constructs a new Weather object with all related variables
     * 
     * @param pDay day
     * @param pMxT maximum temperature
     * @param pMnT minumum temperature
     * @param pAvT average temperature
     * @param pAvDP sample variable comment
     * @param p1HrPTPcpn One hour precepitation
     * @param pPDir sample variable comment
     * @param pAvSp average speed
     * @param pDir sample variable comment
     * @param pMxS maxmimum speed
     * @param pSkyC sample variable comment
     * @param pMxR sample variable comment
     * @param pMn sample variable comment
     * @param pRAvSLP sample variable comment
     * @param pDiff difference between maximum and minimum temperature
     */
    public Weather(int pDay, int pMxT, int pMnT, int pAvT,double pAvDP,
    int p1HrPTPcpn, int pPDir, double pAvSp, double pDir, int pMxS,
    int pSkyC, double pMxR, int pMn, double pRAvSLP){
        this.cDay = pDay;
        this.cMxT = pMxT;
        this.cMnT = pMnT;
        this.cAvT = pAvT;
        this.cAvDP = pAvDP;
        this.c1HrPTPcpn = p1HrPTPcpn;
        this.cPDir = pPDir;
        this.cAvSp = pAvSp;
        this.cDir = pDir;
        this.cMxS = pMxS;
        this.cSkyC = pSkyC;
        this.cMxR = pMxR;
        this.cMn = pMn;
        this.cRAvSLP = pRAvSLP;
    }


    
    /** 
     * Returns day
     * 
     * @return int
     */
    public int getDay() {
        return cDay;
    }

    
    /** 
     * Sets day
     * 
     * @param pDay
     */
    public void setDay(int pDay) {
        this.cDay = pDay;
    }


    
    /** 
     * Returns maximum temperature
     * 
     * @return int
     */
    public int getMxT() {
        return cMxT;
    }


    
    /** 
     * Sets maximum temperature
     * 
     * @param pMxT
     */
    public void setMxT(int pMxT) {
        this.cMxT = pMxT;
    }


    
    /** 
     * Returns minimum temperature
     * 
     * @return int
     */
    public int getMnT() {
        return cMnT;
    }


    /** 
     * Sets minimum temperature
     * 
     * @param pMnT
     */
    public void setMnT(int pMnT) {
        this.cMnT = pMnT;
    }


    
    /** 
     * Returns average temperature
     * 
     * @return int
     */
    public int getAvT() {
        return cAvT;
    }


    
    /** 
     * Sets average temperature
     * 
     * @param pAvT
     */
    public void setAvT(int pAvT) {
        this.cAvT = pAvT;
    }


    
    /** 
     * Sample get comment about cAvDP
     * 
     * @return double
     */
    public double getAvDP() {
        return cAvDP;
    }


    
    /** 
     * Sample set comment about cAvDP
     * 
     * @param pAvDP
     */
    public void setAvDP(double pAvDP) {
        this.cAvDP = pAvDP;
    }


    
    /** 
     * Returns 1 hour precepitation
     * 
     * @return int
     */
    public int getHrPTPcpn() {
        return c1HrPTPcpn;
    }


    
    /** 
     * Sets precepitation
     * 
     * @param p1HrPTPcpn
     */
    public void setHrPTPcpn(int p1HrPTPcpn) {
        this.c1HrPTPcpn = p1HrPTPcpn;
    }


    
    /** 
     *  Sample comment about cPDir
     * 
     * @return int
     */
    public int getPdir() {
        return cPDir;
    }


    
    /** 
     * Sample set comment about cPDir
     * 
     * @param pPDir
     */
    public void setPdir(int pPDir) {
        this.cPDir = pPDir;
    }


    
    /** 
     * Sample comment about cAvSp
     * 
     * @return double
     */
    public double getAvSp() {
        return cAvSp;
    }


    
    /** 
     * Sample set comment about cAvSp
     * 
     * @param pAvSp
     */
    public void setAvSp(double pAvSp) {
        this.cAvSp = pAvSp;
    }


    
    /** 
     * Sample comment about getDir
     * 
     * @return double
     */
    public double getDir() {
        return cDir;
    }


    
    /** 
     * Sample set comment about cDir
     * 
     * @param pDir
     */
    public void setDir(double pDir) {
        this.cDir = pDir;
    }


    
    /** 
     * Sample comment about cMxS
     * 
     * @return int
     */
    public int getMxS() {
        return cMxS;
    }


    
    /** 
     * Sample set comment about cMxS
     * 
     * @param pMxS
     */
    public void setMxS(int pMxS) {
        this.cMxS = pMxS;
    }


    
    /** 
     * Sample get comment about cSkyC
     * 
     * @return int
     */
    public int getSkyC() {
        return cSkyC;
    }


    
    /** 
     * Sample set comment about pSkyC
     * 
     * @param pSkyC
     */
    public void setSkyC(int pSkyC) {
        this.cSkyC = pSkyC;
    }


    
    /** 
     * Sample get comment about cMxR
     * 
     * @return double
     */
    public double getMxR() {
        return cMxR;
    }


    
    /** 
     * Sample set comment about cMxR
     * 
     * @param pMxR
     */
    public void setMxR(double pMxR) {
        this.cMxR = pMxR;
    }


    
    /** 
     * Sample get comment about cMn
     * 
     * @return int
     */
    public int getMn() {
        return cMn;
    }


    
    /** 
     * Sample set comment about cMn
     * 
     * @param pMn
     */
    public void setMn(int pMn) {
        this.cMn = pMn;
    }


    
    /** 
     * Sample get comment about cRAvSLP
     * 
     * @return double
     */
    public double getRavSLP() {
        return cRAvSLP;
    }


    
    /** 
     * Sample set comment about cRAvSLP
     * 
     * @param pRAvSLP
     */
    public void setRavSLP(double pRAvSLP) {
        this.cRAvSLP = pRAvSLP;
    }



    
    /** 
     * Returns difference betweem maximum and minimum temperature
     * 
     * @return int
     */
    public int getDiff() {
        return cDiff;
    }


    
    /** 
     * Sets difference between maximum and minimum temperature
     * 
     * @param pDiff
     */
    public void setDiff(int pDiff) {
        this.cDiff = pDiff;
    }



  
}
