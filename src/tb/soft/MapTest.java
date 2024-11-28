package tb.soft;

import java.util.*;


class MapException extends Exception {

	private static final long serialVersionUID = 1L;

	public MapException(String message) {
		super(message);
	}
	
}

public class MapTest {
	
	public static final String LIST_MENU =
			"    M E N U    M A P	 	\n" +
			"1 - Dodaj element			\n" +
			"2 - Usuń element			\n" +
			"3 - Wypisz elementy		\n" +
			"0 - Wróć do menu głównego	\n";

	public String getMapMenu() {
		return LIST_MENU;
	}

	private HashMap<String, String> hm = new HashMap<>();
	private TreeMap<String, String> tm = new TreeMap<>();

	long start;
	long finish;
	
	public void InsertElement(String key, String value) throws MapException {
		start = System.nanoTime();
			hm.put(key, value);
		finish = System.nanoTime();
		System.out.println("Time taken to insert element into HashMap: " + (finish - start) + " nanoseconds");

		start = System.nanoTime();
			tm.put(key, value);
		finish = System.nanoTime();
		System.out.println("Time taken to insert element into TreeMap: " + (finish - start) + " nanoseconds");
	}

	public void RemoveElement(String key) throws MapException {
		start = System.nanoTime();
			hm.remove(key);
		finish = System.nanoTime();
		System.out.println("Time taken to remove element from HashMap: " + (finish - start) + " nanoseconds");

		start = System.nanoTime();
			tm.remove(key);
		finish = System.nanoTime();
		System.out.println("Time taken to remove element from TreeMap: " + (finish - start) + " nanoseconds");
	}

	public void PrintSequence() {
		System.out.println("HashMap elements: " + hm);
		System.out.println("TreeMap elements: " + tm);
	}

}
