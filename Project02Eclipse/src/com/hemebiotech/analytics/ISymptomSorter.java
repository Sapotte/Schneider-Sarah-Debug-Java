package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomSorter {
    Map<String, Integer> sortSymptoms(Map<String, Integer> countedSymptoms) throws Exception;
}
