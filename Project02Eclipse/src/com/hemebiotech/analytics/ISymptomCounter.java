package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface ISymptomCounter {
    Map<String, Integer> countedSymptoms = new HashMap<>();

    Map<String, Integer> countSymptoms(ArrayList<String> symptoms);
}
