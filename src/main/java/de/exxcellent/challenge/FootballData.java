package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import com.fasterxml.jackson.databind.ObjectMapper;

// import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class FootballData {
    

    public String getTeamWithSmallestGoalSpread(Path pPath){
        String lTeam = "";

        // read file and convert to weather object
        List<Football> lFileList = convertFileToList(pPath);

        // sort the list according to difference between mxt and mnt
        Collections.sort(lFileList);

        // get the first element of wList
        lTeam = lFileList.get(0).getTeam();

        return lTeam;

    }

    private List<Football> convertFileToList(Path pPath){
        String lExt = Utils.getFileExtension(pPath);
        List<Football> lObj = new ArrayList<>();

        switch (lExt) {
            case Utils.EXT_CSV:          
                   lObj = parseCSVToList(pPath);
                break;
            case Utils.EXT_JSON:
                    lObj = parseJSONToList(pPath);
                break;
            case Utils.EXT_XML:
                // Process xml
                break;
            default:
                lObj.add(null);
        }
        return lObj;

    }

    private List<Football> parseCSVToList(Path pPath){
        List<Football> lObj = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pPath.toString()))) {
            // skip headers
            String[] headers = reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                String lTeam = nextLine[0];
                int lGoals = Integer.parseInt(nextLine[5]);
                int lGoalsAllowed = Integer.parseInt(nextLine[6]);
                
                // calculate difference between mxt and mnt
                int diff = Math.abs(lGoals - lGoalsAllowed);
        
                // save in Weather object
                Football wObj = new Football(lTeam, lGoals, lGoalsAllowed, diff);
                lObj.add(wObj);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return lObj;
    }

     
    private List<Football> parseJSONToList(Path pPath){
        List<Football> lObj = new ArrayList<>();
         try {
            ObjectMapper mapper = new ObjectMapper();
            List<Football> football = mapper.readValue(new File(pPath.toString()), mapper.getTypeFactory().constructCollectionType(List.class, Football.class));

            // Now you have a List<Person> containing the objects from the JSON file
            for (Football f : football) {

                String lTeam = f.getTeam();
                int lGoals = f.getGoals();
                int lGoalsAllowed = f.getGoalsAllowed();
                
                // calculate difference between mxt and mnt
                int diff = Math.abs(lGoals - lGoalsAllowed);

                Football wObj = new Football(lTeam, lGoals, lGoalsAllowed, diff);
                lObj.add(wObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lObj;
    }

    // private List<Football> parseXMLToList(Path pPath){ ... }
}

