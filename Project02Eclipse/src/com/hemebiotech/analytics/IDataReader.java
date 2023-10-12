package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface IDataReader {
    List<String> getDatas(String filePath) throws IOException;
}
