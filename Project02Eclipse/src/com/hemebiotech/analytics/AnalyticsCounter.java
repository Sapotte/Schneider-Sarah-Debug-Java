package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) {

        try {
            ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
            CountSymptomFromList countSymptomFromList = new CountSymptomFromList();
            SortSymptomFromMap sortSymptomFromMap = new SortSymptomFromMap();
            WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();


            List<String> symptoms = readSymptomDataFromFile.getSymptoms("Project02Eclipse/src/symptoms.txt");
            Map<String, Integer> countedSymptoms = countSymptomFromList.countSymptoms(symptoms);
            TreeMap<String, Integer> sortedSymptoms = sortSymptomFromMap.sortSymptoms(countedSymptoms);


            writeSymptomDataFromFile.writeSymptoms(sortedSymptoms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
