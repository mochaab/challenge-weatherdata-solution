package de.exxcellent.challenge;

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


    @Override
    public int compareTo(Weather o) {
        // compare by diff (difference of mxt to mnt)
        return Integer.compare(this.cDiff, o.cDiff);
    }


    public Weather(){
    }

    public Weather(int pDay, int pMxT,int pMnT, int pDiff){
        this.cDay = pDay;
        this.cMxT = pMxT;
        this.cMnT = pMnT;
        this.cDiff = pDiff;
    }

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


    public int getDay() {
        return cDay;
    }
    public void setDay(int pDay) {
        this.cDay = pDay;
    }
    public int getMxT() {
        return cMxT;
    }
    public void setMxT(int pMxT) {
        this.cMxT = pMxT;
    }
    public int getMnT() {
        return cMnT;
    }
    public void setMnT(int pMnT) {
        this.cMnT = pMnT;
    }
    public int getAvT() {
        return cAvT;
    }
    public void setAvT(int pAvT) {
        this.cAvT = pAvT;
    }
    public double getAvDP() {
        return cAvDP;
    }
    public void setAvDP(double pAvDP) {
        this.cAvDP = pAvDP;
    }
    public int getHrPTPcpn() {
        return c1HrPTPcpn;
    }
    public void setHrPTPcpn(int p1HrPTPcpn) {
        this.c1HrPTPcpn = p1HrPTPcpn;
    }
    public int getPdir() {
        return cPDir;
    }
    public void setPdir(int pPDir) {
        this.cPDir = pPDir;
    }
    public double getAvSp() {
        return cAvSp;
    }
    public void setAvSp(double pAvSp) {
        this.cAvSp = pAvSp;
    }
    public double getDir() {
        return cDir;
    }
    public void setDir(double pDir) {
        this.cDir = pDir;
    }
    public int getMxS() {
        return cMxS;
    }
    public void setMxS(int pMxS) {
        this.cMxS = pMxS;
    }
    public int getSkyC() {
        return cSkyC;
    }
    public void setSkyC(int pSkyC) {
        this.cSkyC = pSkyC;
    }
    public double getMxR() {
        return cMxR;
    }
    public void setMxR(double pMxR) {
        this.cMxR = pMxR;
    }
    public int getMn() {
        return cMn;
    }
    public void setMn(int pMn) {
        this.cMn = pMn;
    }
    public double getRavSLP() {
        return cRAvSLP;
    }
    public void setRavSLP(double pRAvSLP) {
        this.cRAvSLP = pRAvSLP;
    }

    public int getDiff() {
        return cDiff;
    }
    public void setDiff(int pDiff) {
        this.cDiff = pDiff;
    }

  
}
