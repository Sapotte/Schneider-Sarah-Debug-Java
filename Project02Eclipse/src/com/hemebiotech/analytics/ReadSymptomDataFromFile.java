package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSymptomDataFromFile implements ISymptomReader {
    /**
     * Read the file and list the symptoms
     * @param filepath path to the file to read
     * @return listSymptoms array of the symptoms
     */
    @Override
    public ArrayList<String> getSymptoms(String filepath) {

        try {
            FileReader file = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(file);

            String symptom = reader.readLine();

            while (symptom != null) {
                listSymptoms.add(symptom);
                symptom = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listSymptoms;
    }
}
