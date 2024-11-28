package tb.soft;

import java.util.*;


class ListException extends Exception {

	private static final long serialVersionUID = 1L;

	public ListException(String message) {
		super(message);
	}
	
}

public class ListTest {
	
	public static final String LIST_MENU =
			"    M E N U    L I S T 	\n" +
			"1 - Wypełnij listę 		\n" +
			"2 - Dodaj element			\n" +
			"3 - Usuń elementy			\n" +
			"4 - Wypisz elementy		\n" +
			"0 - Wróć do menu głównego	\n";

	public String getListMenu() {
		return LIST_MENU;
	}

	private ArrayList<Integer> al = new ArrayList<Integer>();
	private LinkedList<Integer> ll = new LinkedList<Integer>();

	long start;
	long finish;
 
	public void FillLists(int amount) {
		Random rand = new Random();

		for(int i = 0; i < amount; i++) {
			int r = rand.nextInt(1000);
			al.add(r);
			ll.add(r);
		}
	}
	
	public void InsertElement(int element) throws ListException {
		start = System.nanoTime();
			al.add(element);
		finish = System.nanoTime();
		System.out.println("Time taken to insert element into ArrayList: " + (finish - start) + " miliseconds");

		start = System.nanoTime();
			ll.add(element);
		finish = System.nanoTime();
		System.out.println("Time taken to insert element into LinknedList: " + (finish - start) + " miliseconds");
	}

	public void RemoveElement(int element) throws ListException {
		start = System.nanoTime();
			al.remove(element);
		finish = System.nanoTime();
		System.out.println("Time taken to remove element from ArrayList: " + (finish - start) + " miliseconds");

		start = System.nanoTime();
			ll.remove(element);
		finish = System.nanoTime();
		System.out.println("Time taken to remove element from LinknedList: " + (finish - start) + " miliseconds");
	}

	public void PrintSequence() {
		System.out.println("ArrayList elements: " + al);
		System.out.println("LinknedList elements: " + ll);
	}

}
