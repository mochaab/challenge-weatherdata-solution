package de.exxcellent.challenge;
import java.nio.file.Path;




public class Utils {
    public static final String EXT_CSV = "csv";
    public static final String EXT_JSON = "json";
    public static final String EXT_XML = "xml";


    static String getFileExtension(Path pPath) {
        String filename = pPath.getFileName().toString();
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == filename.length() - 1){
            return "Invalid File";
            
        }

        return filename.substring(dotIndex + 1);
    }
}
