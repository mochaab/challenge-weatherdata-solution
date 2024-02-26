package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class DataProcessor {
 

    public static List<String[]> parseData(Path pPath) throws CsvValidationException, IOException{
        String lExt = getFileExtension(pPath).toString();
        List<String[]> lRows = new ArrayList<>();

        switch (lExt) {
            case "csv":
                // process csv            
                lRows = readCSVToList(pPath);
                break;
            case "json":
                // process json
               lRows = readJSONToList(pPath);
                break;
            default:
            lRows.add(null);
        }
        
        return lRows;

    }

    private static String getFileExtension(Path pPath) {
        String filename = pPath.getFileName().toString();
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == filename.length() - 1){
            return "Invalid File";
            
        }

        return filename.substring(dotIndex + 1);
    }

    private static List<String[]> readCSVToList(Path pPath) {
        List<String[]> rows = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(pPath.toString()))) {
            // skip headers
            String[] headers = reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                rows.add(nextLine);
              
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return rows;
    }

    private static List<String[]> readJSONToList(Path pPath) throws JsonProcessingException, FileNotFoundException, IOException {
        List<String[]> rows = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new FileReader(pPath.toString()));

        if (rootNode.isArray()) {
            Iterator<JsonNode> elements = rootNode.elements();
            while (elements.hasNext()) {
                JsonNode element = elements.next();
                List<String> rowValues = new ArrayList<>();
                Iterator<String> fieldNames = element.fieldNames();
                while (fieldNames.hasNext()) {
                    String fieldName = fieldNames.next();
                    rowValues.add(element.get(fieldName).asText());
                }
                rows.add(rowValues.toArray(new String[0]));
            }
        }
        return rows;
    }
}
