package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsApp {
    public static void main(String[] args) {

        ReadDataFromFile reader = new ReadDataFromFile();
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        WriteDataFromFile writer = new WriteDataFromFile();

        //    Get the symtpoms from symptoms.text
        List<String> symptomsList = reader.getDatas("Project02Eclipse/src/symptoms.txt");

        //    Count the occurences and put them in a TreeMap
        Map<String, Integer> sortedSymptomsandOccurences = analyticsCounter.getDatasOccurrencesInAlphabeticOrder(symptomsList);

        //    Write the symptoms in result.out
        writer.writeDatas(sortedSymptomsandOccurences, "Project02Eclipse/src/result.out");
    }
}
