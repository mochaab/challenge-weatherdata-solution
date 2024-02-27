package de.exxcellent.challenge;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;




public class Utils {
    public static final String EXT_CSV = "csv";
    public static final String EXT_JSON = "json";
    public static final String EXT_XML = "xml";


    public static String getFileExtension(Path pPath) {
        String filename = pPath.getFileName().toString();
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == filename.length() - 1){
            return "Invalid File";
            
        }

        return filename.substring(dotIndex + 1);
    }

    public static String convertJsonFileToString(String filePath) throws IOException {
        // Read the content of the JSON file into a byte array
        byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
        
        // Convert the byte array to a string using UTF-8 encoding
        String jsonString = new String(jsonData, "UTF-8");
        
        return jsonString;
    }
}
