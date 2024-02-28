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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

// import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/** 
* Represents list of football data
*
* @author Charissa Morales <charissamorales.bscs@gmail.com>
*/
public class FootballData {
    
    /** 
     * Returns the team name with smallest distance between goals and goalsAllowed
     * 
     * @param pPath path of the source file
     * @return int
     */
    public String getTeamWithSmallestGoalSpread(Path pPath){
        String lTeam = "";

        // read file and convert to weather object
        List<Football> lFileList = parseBasedOnFileType(pPath);

        // compute difference between maximum and minimum temperature
        lFileList.forEach(football -> {
            football.setDiff(Math.abs(football.getGoals()-football.getGoalsAllowed()));
        });
    
        // sort the list according to difference between mxt and mnt
        Collections.sort(lFileList);

        // get the first element of wList
        lTeam = lFileList.get(0).getTeam();

        return lTeam;
    }

     /** 
     * Reads file and parse according to file type
     * 
     * @param pPath path of the source file
     * @return List<Football> List of football data
     */
    public List<Football> parseBasedOnFileType(Path pPath){
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

    /** 
     * Read csv file and map csv values to object
     * 
     * @param pPath path of the source file
     * @return List<Football> List of football data
     */
    public List<Football> parseCSVToList(Path pPath){
        List<Football> lObj = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pPath.toString()))) {
            // skip headers
            String[] lHeaders = reader.readNext();
            String[] lNextLine;

            while ((lNextLine = reader.readNext()) != null) {

                String lTeam = lNextLine[FootballConstants.COL_INDECES.get(FootballConstants.COL_NAME_TEAM)];
                int lGoals = Integer.parseInt(lNextLine[FootballConstants.COL_INDECES.get(FootballConstants.COL_NAME_GOALS)]);
                int lGoalsAllowed = Integer.parseInt(lNextLine[FootballConstants.COL_INDECES.get(FootballConstants.COL_NAME_GOALS_ALLOWED)]);
                // ...
                
                // save in Weather object
                Football wObj = new Football(lTeam, lGoals, lGoalsAllowed);
                lObj.add(wObj);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return lObj;
    }

    /** 
     * Read json file and map json values to object
     * 
     * @param pPath path of the source file
     * @return List<Football> List of football data
     */
    public List<Football> parseJSONToList(Path pPath){
        List<Football> lObj = new ArrayList<>();
         try {
            ObjectMapper mapper = new ObjectMapper();
            List<Football> football = mapper.readValue(new File(pPath.toString()), new TypeReference<List<Football>>(){});


            // Now you have a List<Person> containing the objects from the JSON file
            for (Football f : football) {

                String lTeam = f.getTeam();
                int lGoals = f.getGoals();
                int lGoalsAllowed = f.getGoalsAllowed();
                // ...

                Football wObj = new Football(lTeam, lGoals, lGoalsAllowed);
                lObj.add(wObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lObj;
    }


    // private List<Football> parseXMLToList(Path pPath){ ... }
}

