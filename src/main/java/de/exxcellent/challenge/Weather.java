package de.exxcellent.challenge;

public class Weather implements Comparable<Weather>{

    private int cDay;
    private int cMxT;
    private int cMnT;
    private int diff;
    // private int cAvT;
    // private double cAvDP;
    // private int c1HrPTPcpn;
    // private int cPDir;
    // private double cAvSp;
    // private double cDir;
    // private int cMxS;
    // private int cSkyC;
    // private double cMxR;
    // private int cMn;
    // private double cRAvSLP;


    @Override
    public int compareTo(Weather o) {
        // compare by diff (difference of mxt to mnt)
        return Integer.compare(this.diff, o.diff);
    }




    public Weather(int cDay, int cMxT,int cMnT, int diff){
        this.cDay = cDay;
        this.cMxT = cMxT;
        this.cMnT = cMnT;
        this.diff = diff;
    }

    // public Weather(int cDay, int cMxT, int cMnT, int cAvT,double cAvDP,
    // int c1HrPTPcpn, int cPDir, double cAvSp, double cDir, int cMxS,
    // int cSkyC, double cMxR, int cMn, double cRAvSLP){
        
    //     this.cDay = cDay;
    //     this.cMxT = cMxT;
    //     this.cMnT = cMnT;
    //     this.cAvT = cAvT;
    //     this.cAvDP = cAvDP;
    //     this.c1HrPTPcpn = c1HrPTPcpn;
    //     this.cPDir = cPDir;
    //     this.cAvSp = cAvSp;
    //     this.cDir = cDir;
    //     this.cMxS = cMxS;
    //     this.cSkyC = cSkyC;
    //     this.cMxR = cMxR;
    //     this.cMn = cMn;
    //     this.cRAvSLP = cRAvSLP;

    // }


    public int getcDay() {
        return cDay;
    }
    public void setcDay(int cDay) {
        this.cDay = cDay;
    }
    public int getcMxT() {
        return cMxT;
    }
    public void setcMxT(int cMxT) {
        this.cMxT = cMxT;
    }
    public int getcMnT() {
        return cMnT;
    }
    public void setcMnT(int cMnT) {
        this.cMnT = cMnT;
    }
    public int getDiff() {
        return diff;
    }
    public void setDiff(int diff) {
        this.diff = diff;
    }
    // public int getcAvT() {
    //     return cAvT;
    // }
    // public void setcAvT(int cAvT) {
    //     this.cAvT = cAvT;
    // }
    // public double getcAvDP() {
    //     return cAvDP;
    // }
    // public void setcAvDP(double cAvDP) {
    //     this.cAvDP = cAvDP;
    // }
    // public int getC1HrPTPcpn() {
    //     return c1HrPTPcpn;
    // }
    // public void setC1HrPTPcpn(int c1HrPTPcpn) {
    //     this.c1HrPTPcpn = c1HrPTPcpn;
    // }
    // public int getcPDir() {
    //     return cPDir;
    // }
    // public void setcPDir(int cPDir) {
    //     this.cPDir = cPDir;
    // }
    // public double getcAvSp() {
    //     return cAvSp;
    // }
    // public void setcAvSp(double cAvSp) {
    //     this.cAvSp = cAvSp;
    // }
    // public double getcDir() {
    //     return cDir;
    // }
    // public void setcDir(double cDir) {
    //     this.cDir = cDir;
    // }
    // public int getcMxS() {
    //     return cMxS;
    // }
    // public void setcMxS(int cMxS) {
    //     this.cMxS = cMxS;
    // }
    // public int getcSkyC() {
    //     return cSkyC;
    // }
    // public void setcSkyC(int cSkyC) {
    //     this.cSkyC = cSkyC;
    // }
    // public double getcMxR() {
    //     return cMxR;
    // }
    // public void setcMxR(double cMxR) {
    //     this.cMxR = cMxR;
    // }
    // public int getcMn() {
    //     return cMn;
    // }
    // public void setcMn(int cMn) {
    //     this.cMn = cMn;
    // }
    // public double getcRAvSLP() {
    //     return cRAvSLP;
    // }
    // public void setcRAvSLP(double cRAvSLP) {
    //     this.cRAvSLP = cRAvSLP;
    // }

  
}
