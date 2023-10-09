package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface IDatasWriter {
    void writeDatas(Map<String, Integer> symptoms, String filepath) throws IOException;
}
