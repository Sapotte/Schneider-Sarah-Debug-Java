package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface IDataReader {
    /**
     * Read the file to list the datas
     *
     * @param filePath , path to the file listing the datas
     * @return a list with all the datas in the file
     * @throws IOException, catch exceptions reading the file
     */
    List<String> getDatas(String filePath) throws IOException;
}
