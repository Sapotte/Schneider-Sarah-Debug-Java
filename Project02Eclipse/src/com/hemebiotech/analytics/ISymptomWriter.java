package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

interface ISYmptomWriter {
        void writeSymptoms(Map<String, Integer> symptoms) throws IOException;
}
