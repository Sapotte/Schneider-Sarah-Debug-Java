package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class CountSymptomFromArray implements ISymptomCounter {

    /**
     * Count the number of symptoms in an array
     *
     * @param symptoms
     * @return
     */
    @Override
    public Map<String, Integer> countSymptoms(ArrayList<String> symptoms) {
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
