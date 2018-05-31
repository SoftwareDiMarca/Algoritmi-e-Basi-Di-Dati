package Grafi.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TestMaps {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner;
		try {
			scanner = new Scanner(
				new File("src/esercitazione9/maps/", "notes.txt"));
			
			Scanner doc = scanner.useDelimiter("[^a-zA-Z]+");
			
			HashMap<String, Integer> counter = new HashMap<String, Integer>();
			
			TreeSet<String> startA = new TreeSet<String>();
			TreeSet<String> short5 = new TreeSet<String>();
			
			
			while (doc.hasNext( )) {
				String token = doc.next();
				
				if (counter.containsKey(token))
					counter.put(token, counter.get(token) + 1);
				else {
					 counter.put(token, 1);
					 
					 if (token.startsWith("a"))
							startA.add(token);
					 if (token.length() < 5)
						 	short5.add(token);					 
					}
				} 
			
			System.out.print("Starting with a:" + startA);
			
			System.out.print("\nShorter than 5:" + short5);			
			
			TreeSet<String> result = startA;
			//result.retainAll(short5);
			result.addAll(short5);
			//result.removeAll(short5);
			
			System.out.print("\nRESULT:" + result);
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
