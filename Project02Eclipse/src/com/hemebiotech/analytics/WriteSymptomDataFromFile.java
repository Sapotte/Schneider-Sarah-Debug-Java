package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataFromFile implements ISYmptomWriter {
    //    write down the symptoms and the number of times they appear in result.out
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        try {

            FileWriter fileWriter = new FileWriter("Project02Eclipse/src/result.out", false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
                writer.write(symptom.getKey() + ": " + symptom.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
