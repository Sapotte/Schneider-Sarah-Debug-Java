package com.hemebiotech.analytics;

import java.util.Map;
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	Map< String, Integer > GetSymptoms (String filepath);
}
