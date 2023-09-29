package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;


public class SortSymptomFromMap implements ISymptomSorter {
    /**
     * Sorts the entries of a Map
     *
     * @param countedSymptoms
     * @return sortedSymptoms
     */
    public TreeMap<String, Integer> sortSymptoms(Map<String, Integer> countedSymptoms) {
        Map<String, Integer> sortedSymptoms = new TreeMap<>();
        try {
            sortedSymptoms.putAll(countedSymptoms);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (TreeMap<String, Integer>) sortedSymptoms;
    }
}
