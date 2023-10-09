package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReadDataFromFile implements IDataReader {
    /**
     * Read the file and list the datas
     *
     * @param filepath path to the file to read
     * @return list of datas
     */
    @Override
    public List<String> getDatas(String filepath) throws IOException {
        List<String> listDatas = new ArrayList<>();
        try {
            FileReader file = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(file);

            String symptom = reader.readLine();

            while (symptom != null) {
                listDatas.add(symptom);
                symptom = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new IOException("Error reading the datas :", e);
        }
        return listDatas;
    }

    @Override
    public Map<String, Integer> getDatasOccusrencesInAlphabeticOrder(List<String> listDatas) throws NullPointerException {
        Map<String, Integer> datasAndTheirOccurrences = new TreeMap<>();
        if (!listDatas.isEmpty()) {
            for (String data : listDatas) {
                if (datasAndTheirOccurrences.containsKey(data)) {
                    datasAndTheirOccurrences.put(data, datasAndTheirOccurrences.get(data) + 1);
                } else {
                    datasAndTheirOccurrences.put(data, 1);
                }
            }
            return datasAndTheirOccurrences;
        } else {
            throw new NullPointerException("The list is empty");
        }
    }
}
