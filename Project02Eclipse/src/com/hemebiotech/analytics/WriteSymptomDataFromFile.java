package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataFromFile implements ISYmptomWriter {
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        /*int headacheCount = symptoms.get("headaches");
        int rashCount = symptoms.get("rashes");
        int pupilCount = symptoms.get("pupils");*/

        try {

            FileWriter fileWriter = new FileWriter("Project02Eclipse/src/result.out", false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
                writer.write(symptom.getKey() + ": " + symptom.getValue() + "\n");
            }

            /*writer.write("headache: " + headacheCount + "\n");
            writer.write("rash: " + rashCount + "\n");
            writer.write("dilated pupils: " + pupilCount + "\n");*/
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
