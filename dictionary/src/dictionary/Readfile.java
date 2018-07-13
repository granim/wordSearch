package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Readfile {


	private static String hold;
	private static String[] stringArray = new String[3000];
	private static String other = null;
	private static HashMap<String, String> diction = new HashMap<String, String>();

	public HashMap<String, String> getDiction() {
		return diction;
	}

	public void setDiction(HashMap<String, String> diction) {
		Readfile.diction = diction;
	}

	/*
	 * Reads the .txt file and populates the hashMap, Key being the word and the
	 * value the definition of the word The Variable hold, holds the entire string
	 * for each line. The below if statement breaks up hold into the needed Key
	 * value and pair .
	 */
	public static void createMap(File file) {
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			hold = bufferedReader.readLine();

			while (hold != null) {

				if (bufferedReader.readLine() != "") {
					other = hold.substring(0);
					stringArray = other.split(" ");
					diction.put(stringArray[0].toLowerCase(), hold);
					hold = bufferedReader.readLine();

				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Sorry could not find the proper file " + file);
		} catch (IOException e) {
			System.out.println("Sorry there was a problem with the program ");
		}

	}

}
