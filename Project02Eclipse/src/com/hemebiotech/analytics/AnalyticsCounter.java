package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {

        try {
            ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
            SortSymptomFromMap sortSymptomFromMap = new SortSymptomFromMap();
            WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();


            Map<String, Integer> symptoms = readSymptomDataFromFile.GetSymptoms("Project02Eclipse/src/symptoms.txt");
            TreeMap<String, Integer> sortedSymptoms = sortSymptomFromMap.sortSymptoms(symptoms);


            writeSymptomDataFromFile.writeSymptoms(sortedSymptoms);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
