package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter {

    /**
     * Count the occurrences of each symptoms and sort in alphabetical order
     * @param listDatas, a list with the datas read from the file
     * @return datasAndTheirOccurrences, a treemap with each symptoms and their occurrences
     * @throws NullPointerException if there is no datas in the list or the list is not found
     */
    @Override
    public Map<String, Integer> getDatasOccurrencesInAlphabeticOrder(List<String> listDatas) throws NullPointerException {
        Map<String, Integer> datasAndTheirOccurrences = new TreeMap<>();
        try {
            if (!listDatas.isEmpty()) {
                for (String data : listDatas) {
                    datasAndTheirOccurrences.putIfAbsent(data, 0);
                    datasAndTheirOccurrences.put(data, datasAndTheirOccurrences.get(data) + 1);
                }
            } else {
                throw new NullPointerException("The list is empty");
            }

        } catch (NullPointerException e) {
            System.err.println("An error occurred : " + e.getMessage());
        }
        return datasAndTheirOccurrences;
    }
}
