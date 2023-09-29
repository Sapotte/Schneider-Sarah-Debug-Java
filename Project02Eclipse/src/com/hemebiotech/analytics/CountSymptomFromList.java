package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSymptomFromList implements ISymptomCounter {

    /**
     * Count the number of symptoms in a list
     *
     * @param symptoms list of symptoms
     * @return countedSymptoms map of all the symptoms and their count
     */
    @Override
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> countedSymptoms = new HashMap<>();
        for (String symptom : symptoms) {
            if (countedSymptoms.containsKey(symptom)) {
                countedSymptoms.put(symptom, countedSymptoms.get(symptom) + 1);
            } else {
                countedSymptoms.put(symptom, 1);
            }
        }
        return countedSymptoms;
    }

}
