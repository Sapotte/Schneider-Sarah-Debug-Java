package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	//	 @param filepath a full or partial path to file with symptom strings in it, one per line

	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0

	@Override
	public Map<String, Integer> GetSymptoms(String filepath) {

		Map<String, Integer> result = new HashMap<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					System.out.println("symptom from file: " + line);
					if (line.equals("headache")) {
						headacheCount++;
					}
					else if (line.equals("rash")) {
						rashCount++;
					}
					else if (line.contains("pupils")) {
						pupilCount++;
					}

					line = reader.readLine();	// get another symptom
				}
				reader.close();
				result.put("headaches", headacheCount);
				result.put("rashes", rashCount);
				result.put("dilated pupils", pupilCount);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
