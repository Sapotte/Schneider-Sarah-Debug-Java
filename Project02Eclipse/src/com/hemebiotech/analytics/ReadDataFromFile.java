package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile implements IDataReader {
    /**
     * Read the file and list the datas
     *
     * @param filepath path to the file to read
     * @return list of datas
     */
    @Override
    public List<String> getDatas(String filepath) {
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
            System.err.println("An error occurred reading the file  :" + e);
        }
        return listDatas;
    }
}
