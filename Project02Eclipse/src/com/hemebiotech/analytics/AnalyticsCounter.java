package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) {

        try {
            ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
            CountSymptomFromArray countSymptomFromArray = new CountSymptomFromArray();
            SortSymptomFromMap sortSymptomFromMap = new SortSymptomFromMap();
            WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();


            ArrayList<String> symptoms = readSymptomDataFromFile.getSymptoms("Project02Eclipse/src/symptoms.txt");
            Map<String, Integer> countedSymptoms = countSymptomFromArray.countSymptoms(symptoms);
            TreeMap<String, Integer> sortedSymptoms = sortSymptomFromMap.sortSymptoms(countedSymptoms);


            writeSymptomDataFromFile.writeSymptoms(sortedSymptoms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
