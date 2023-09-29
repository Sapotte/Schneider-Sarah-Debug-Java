package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * Read the file and put all the symptoms and their count in a Map
     *
     * @param filepath
     * @return Map with the symptoms and their count
     */
    @Override
    public Map<String, Integer> GetSymptoms(String filepath) {

        try {
            FileReader file = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(file);

            String symptom = reader.readLine();

            while (symptom != null) {
                if (listSymptomsCount.containsKey(symptom)) {
                    int symptomCount = listSymptomsCount.get(symptom);
                    symptomCount++;

                    listSymptomsCount.put(symptom, symptomCount);
                } else {
                    listSymptomsCount.put(symptom, 1);
                }
                symptom = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return listSymptomsCount;
        }
    }
}
