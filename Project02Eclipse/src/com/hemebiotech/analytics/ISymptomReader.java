package com.hemebiotech.analytics;

import java.util.ArrayList;

/* Read a file and list the symptoms in a TreeMap
 * @param TreeMap to list the symptoms and their counter*/
public interface ISymptomReader {
    ArrayList<String> listSymptoms = new ArrayList<>();

    ArrayList<String> getSymptoms(String file);
}
