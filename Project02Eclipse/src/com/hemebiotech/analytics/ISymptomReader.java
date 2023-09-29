package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

/* Read a file and list the symptoms in a TreeMap
 * @param TreeMap to list the symptoms and their counter*/
public interface ISymptomReader {
    Map<String, Integer> listSymptomsCount = new HashMap<>();

    Map<String, Integer> GetSymptoms(String file);
}
