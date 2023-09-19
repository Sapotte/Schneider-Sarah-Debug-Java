package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteSymptomDataFromFile implements ISYmptomWriter {
//    @param filepath a full or partial path to file with symptom strings in it, one per line //
        private String filepath;

        public WriteSymptomDataFromFile (String filepath) {
            this.filepath = filepath;
        }

        @Override
        public List<String> GetSymptoms() {
            ArrayList<String> result = new ArrayList<String>();

            if (filepath != null) {
                try {
                    BufferedReader writer = new BufferedReader (new FileReader(filepath));
                    String line = writer.readLine();

                    while (line != null) {
                        result.add(line);
                        line = writer.readLine();
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return result;
        }

}
