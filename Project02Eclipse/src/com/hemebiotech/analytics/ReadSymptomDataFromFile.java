package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadSymptomDataFromFile implements ISymptomReader {

	//	 @param filepath a full or partial path to file with symptom strings in it, one per line
	@Override
	public Map<String, Integer> GetSymptoms(String filepath) {

		Map<String, Integer> result = new HashMap<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					System.out.println("symptom from file: " + line);

					if(result.containsKey(line)) {
						int symptomCount = result.get(line);
						symptomCount++;

						result.put(line, symptomCount);
					} else {
						result.put(line, 1);
					}

					line = reader.readLine();	// get another symptom
				}
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
