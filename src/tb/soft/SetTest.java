package tb.soft;

import java.util.*;


class SetException extends Exception {

	private static final long serialVersionUID = 1L;

	public SetException(String message) {
		super(message);
	}
	
}


public class SetTest {
	
	public static final String SET_MENU =
			"    M E N U   S E T Ó W	\n" +
			"1 - Wprowadź słowo 		\n" +
			"2 - Usuń słowo				\n" +
			"3 - Wypisz słowa			\n" +
			"0 - Wróć do menu głównego	\n";

	public String getSetMenu() {
		return SET_MENU;
	}

	private HashSet<String> hs = new HashSet<>();
	private TreeSet<String> ts = new TreeSet<>();

	long start;
	long finish;
 
	
	public void InsertWord(String word) throws SetException {
		start = System.nanoTime();
			hs.add(word);
		finish = System.nanoTime();
		System.out.println("Time taken to insert word into HashSet: " + (finish - start) + " nanoseconds");

		start = System.nanoTime();
			ts.add(word);
		finish = System.nanoTime();
		System.out.println("Time taken to insert word into TreeSet: " + (finish - start) + " nanoseconds");
	}

	public void RemoveWord(String word) throws SetException {
		start = System.nanoTime();
			hs.remove(word);
		finish = System.nanoTime();
		System.out.println("Time taken to remove word from HashSet: " + (finish - start) + " nanoseconds");

		start = System.nanoTime();
			ts.remove(word);
		finish = System.nanoTime();
		System.out.println("Time taken to remove word from TreeSet: " + (finish - start) + " nanoseconds");
	}

	public void PrintSequence() {
		System.out.println("HashSet elements: " + hs);
		System.out.println("TreeSet elements: " + ts);
	}

}
