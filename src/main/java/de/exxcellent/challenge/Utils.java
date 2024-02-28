package de.exxcellent.challenge;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 * General utility class that contains data processing functions
 * 
 * @author Charissa Morales <charissamorales.bscs@gmail.com>
 */
public class Utils {
    public static final String EXT_CSV = "csv";
    public static final String EXT_JSON = "json";
    public static final String EXT_XML = "xml";


    public static String getFileExtension(Path pPath) {
        String lFilename = pPath.getFileName().toString();
        int lDotIndex = lFilename.lastIndexOf('.');
        if (lDotIndex == -1 || lDotIndex == 0 || lDotIndex == lFilename.length() - 1){
            return "Invalid File";
            
        }

        return lFilename.substring(lDotIndex + 1);
    }
}
