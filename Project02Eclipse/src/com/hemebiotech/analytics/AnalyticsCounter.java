package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String[] args) throws Exception {

		try {

			ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
			WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();

			//get input
			Map<String, Integer> symptoms = readSymptomDataFromFile.GetSymptoms("C:\\Users\\sarah\\DepotGit\\OpenClassrooms\\Schneider-Sarah-Debug-Java\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");

//			write the output
			writeSymptomDataFromFile.writeSymptoms(symptoms);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
