package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Main class
 * Implements
 */
public class AnalyticsCounter {

    /**
     * Read symptoms from the file, count the occurences, and write them in alphabetic order in result.out
     *
     * @param args
     */
    public static void main(String[] args) {
        ReadDataFromFile reader = new ReadDataFromFile();
        WriteDataFromFile writer = new WriteDataFromFile();

        try {
//            Get the symtpoms from symptoms.text
            List<String> symptomsList = reader.getDatas("Project02Eclipse/src/symptoms.txt");
//            Count the occurences and put them in a TreeMap
            Map<String, Integer> sortedSymptomsandOccurences = reader.getDatasOccusrencesInAlphabeticOrder(symptomsList);
//            Write the symptoms in result.out
            writer.writeDatas(sortedSymptomsandOccurences, "Project02Eclipse/src/result.out");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
