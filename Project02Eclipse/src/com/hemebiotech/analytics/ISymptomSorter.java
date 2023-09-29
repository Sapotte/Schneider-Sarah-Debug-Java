package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Read a map to sort the index
 *
 * @params Map with the symptoms and their count
 */
public interface ISymptomSorter {
    Map<String, Integer> sortedSymptoms = new TreeMap<String, Integer>();
}
