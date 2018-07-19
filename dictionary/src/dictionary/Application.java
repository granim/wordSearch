package dictionary;

import java.io.File;
import java.util.HashMap;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		File file = new File("dictionaryTwo.txt");
		// creates and populates the hashMap
		Readfile.createMap(file);
		// create a populated hashmap
		Readfile newRead = new Readfile();
		HashMap<String, List<String>> useDiction = newRead.getDiction();
	
		System.out.println("Enter a word: " + " Or enter exit to exit the program");
		SearchWord.findWord(useDiction);
		
		
	}

}
