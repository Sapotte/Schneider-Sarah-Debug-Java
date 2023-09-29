package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {

        try {
            ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
            WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();


            Map<String, Integer> symptoms = readSymptomDataFromFile.GetSymptoms("Project02Eclipse/src/symptoms.txt");


            writeSymptomDataFromFile.writeSymptoms(symptoms);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
