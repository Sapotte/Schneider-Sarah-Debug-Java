package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IAnalyticsCounter {

    /**
     * Count all the occurences of datas in a list
     *
     * @param listDatas, a list of all the datas to count and sort
     * @return a map with the datas and their occurrences
     * @throws NullPointerException, throw exception with the list
     */
    Map<String, Integer> getDatasOccurrencesInAlphabeticOrder(List<String> listDatas) throws NullPointerException;
}
