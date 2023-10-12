package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface IDatasWriter {
    /**
     * Write keys and values of a map in an output file
     *
     * @param symptoms, map of datas and occurrences to write down
     * @param filepath, path to the output file
     * @throws IOException          for exception writing the file
     * @throws NullPointerException for exception with the map
     */
    void writeDatas(Map<String, Integer> symptoms, String filepath) throws IOException, NullPointerException;
}
