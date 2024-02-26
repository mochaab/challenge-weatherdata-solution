package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
