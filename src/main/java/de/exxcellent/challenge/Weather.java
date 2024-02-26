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


    public int getcDay() {
        return cDay;
    }
    public void setcDay(int pDay) {
        this.cDay = pDay;
    }
    public int getcMxT() {
        return cMxT;
    }
    public void setcMxT(int pMxT) {
        this.cMxT = pMxT;
    }
    public int getcMnT() {
        return cMnT;
    }
    public void setcMnT(int pMnT) {
        this.cMnT = pMnT;
    }
    public int getDiff() {
        return cDiff;
    }
    public void setDiff(int pDiff) {
        this.cDiff = pDiff;
    }
    public int getcAvT() {
        return cAvT;
    }
    public void setcAvT(int pAvT) {
        this.cAvT = pAvT;
    }
    public double getcAvDP() {
        return cAvDP;
    }
    public void setcAvDP(double pAvDP) {
        this.cAvDP = pAvDP;
    }
    public int getC1HrPTPcpn() {
        return c1HrPTPcpn;
    }
    public void setC1HrPTPcpn(int p1HrPTPcpn) {
        this.c1HrPTPcpn = p1HrPTPcpn;
    }
    public int getcPDir() {
        return cPDir;
    }
    public void setcPDir(int pPDir) {
        this.cPDir = pPDir;
    }
    public double getcAvSp() {
        return cAvSp;
    }
    public void setcAvSp(double pAvSp) {
        this.cAvSp = pAvSp;
    }
    public double getcDir() {
        return cDir;
    }
    public void setcDir(double pDir) {
        this.cDir = pDir;
    }
    public int getcMxS() {
        return cMxS;
    }
    public void setcMxS(int pMxS) {
        this.cMxS = pMxS;
    }
    public int getcSkyC() {
        return cSkyC;
    }
    public void setcSkyC(int pSkyC) {
        this.cSkyC = pSkyC;
    }
    public double getcMxR() {
        return cMxR;
    }
    public void setcMxR(double pMxR) {
        this.cMxR = pMxR;
    }
    public int getcMn() {
        return cMn;
    }
    public void setcMn(int pMn) {
        this.cMn = pMn;
    }
    public double getcRAvSLP() {
        return cRAvSLP;
    }
    public void setcRAvSLP(double pRAvSLP) {
        this.cRAvSLP = pRAvSLP;
    }

  
}
