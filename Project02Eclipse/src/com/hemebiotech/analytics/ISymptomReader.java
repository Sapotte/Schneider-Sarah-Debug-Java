package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/* Read a file and list the symptoms in a TreeMap
 * @param TreeMap to list the symptoms and their counter*/
public interface ISymptomReader {

    List<String> getSymptoms(String filePath) throws IOException;
}
