package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

public class WriteDataFromFile implements IDatasWriter {
    /**
     * Write the final file
     *
     * @param symptoms all the symptoms to write down
     */
    @Override
    public void writeDatas(Map<String, Integer> symptoms, String filepath) {

        try {
            FileWriter fileWriter = new FileWriter(filepath, false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            if (symptoms.isEmpty()) {
                throw new NullPointerException("The map is empty");
            } else {
                for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
                    writer.write(symptom.getKey() + ": " + symptom.getValue() + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
            System.err.println("An error occurred writing the output :" + e.getMessage());
        }
    }
}
