package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IDataReader {

    /**
     * Read datas from a file     *
     *
     * @param filePath , file to read
     * @return List containing the datas
     * @throws IOException
     */
    List<String> getDatas(String filePath) throws IOException;

    /**
     * @param datas
     * @return TreeMap with the datas and their occurrences
     * @throws NullPointerException
     */
    Map<String, Integer> getDatasOccusrencesInAlphabeticOrder(List<String> datas) throws NullPointerException;

}
