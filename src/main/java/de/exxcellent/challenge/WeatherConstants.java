package de.exxcellent.challenge;

import java.util.HashMap;
import java.util.Map;

/** 
* WeatherConstants class represents constants used for weather object
*
* @author Charissa Morales <charissamorales.bscs@gmail.com>
*/
public class WeatherConstants {

    // CSV column names
    public static final String COL_NAME_DAY = "Day";
    public static final String COL_NAME_MXT = "MxT";
    public static final String COL_NAME_MNT = "MnT";
    public static final String COL_NAME_AVT = "AvT";
    public static final String COL_NAME_AVDP = "AvDP";
    public static final String COL_NAME_1HRP_TPCPN = "1HrP TPcpn";
    public static final String COL_NAME_PDIR = "PDir";
    public static final String COL_NAME_AVSP = "AvSp";
    public static final String COL_NAME_DIR = "Dir";
    public static final String COL_NAME_MXS = "MxS";
    public static final String COL_NAME_SKYC = "SkyC";
    public static final String COL_NAME_MXR = "MxR";
    public static final String COL_NAME_MN = "Mn";
    public static final String COL_NAME_R_AVSLP = "R AvSLP";

    // CSV index
    public static final Map<String, Integer> COL_INDECES = new HashMap<String, Integer>() {{
        // Initialize the map with some initial entries
        put(COL_NAME_DAY, 0);
        put(COL_NAME_MXT, 1);
        put(COL_NAME_MNT, 2);
        put(COL_NAME_AVT, 3);
        put(COL_NAME_AVDP, 4);
        put(COL_NAME_1HRP_TPCPN, 5);
        put(COL_NAME_PDIR, 6);
        put(COL_NAME_AVSP, 7);
        put(COL_NAME_DIR, 8);
        put(COL_NAME_MXS, 9);
        put(COL_NAME_SKYC, 10);
        put(COL_NAME_MXR, 11);
        put(COL_NAME_MN, 12);
        put(COL_NAME_R_AVSLP, 13);
    }};


        // JSON Key Names
        public static final String KEY_NAME_DAY = "day";
        public static final String KEY_NAME_MXT = "mxT";
        public static final String KEY_NAME_MNT = "mnT";
        public static final String KEY_NAME_AVT = "avT";
        public static final String KEY_NAME_AVDP = "avDP";
        public static final String KEY_NAME_1HRP_TPCPN = "hrPTPcpn";
        public static final String KEY_NAME_PDIR = "pdir";
        public static final String KEY_NAME_AVSP = "avSp";
        public static final String KEY_NAME_DIR = "dir";
        public static final String KEY_NAME_MXS = "mxS";
        public static final String KEY_NAME_SKYC = "skyC";
        public static final String KEY_NAME_MXR = "mxR";
        public static final String KEY_NAME_MN = "mn";
        public static final String KEY_NAME_R_AVSLP = "ravSLP";
    
    
}
