package tb.soft;

import java.util.*;

import tb.soft.SetTest;
import tb.soft.ListTest;
import tb.soft.MapTest;

public class CollectionsConsoleApp {

	private static final String GREETING_MESSAGE = 
			"Program Testu Kolekcji - wersja konsolowa\n" +
	        "Autor: Kacper Wilgus\n" +
			"Data:  listopad 2024 r.\n";

	private static final String MENU = 
			"    M E N U   G Ł Ó W N E  \n" +
			"1 - Testuj Sety			\n" +
			"2 - Testuj Listy			\n" +
			"3 - Testuj Mapy			\n" +
			"0 - Zakończ program		\n";
	
	private static final ConsoleUserDialog UI = new ConsoleUserDialog();
	
	
	public static void main(String[] args) {
		CollectionsConsoleApp application = new CollectionsConsoleApp();
		application.runMainLoop();
	} 
	
	
	public void runMainLoop() {
		UI.printMessage(GREETING_MESSAGE);

		while (true) {
			UI.clearConsole();

				switch (UI.enterInt(MENU + "==>> ")) {
				case 1:
					TestSets();
					break;
				case 2:
					TestLists();
					break;
				case 3:
					TestMaps();
					break;
				case 0:
					UI.printInfoMessage("\nProgram zakończył działanie!");
					System.exit(0);
				}
		}
	}

	static void TestSets()
	{
		SetTest ST = new SetTest();

		Scanner SetScanner = new Scanner(System.in);

		while (true) {
			UI.clearConsole();

			try {		
				switch (UI.enterInt(ST.getSetMenu() + "==>> ")) {
				case 1:
					ST.InsertWord(SetScanner.nextLine());
					break;
				case 2:
					ST.RemoveWord(SetScanner.nextLine());
					break;
				case 3:
					ST.PrintSequence();
					break;
				case 0: return;
				}
			} catch (SetException e) {
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		}
	}
	
	static void TestLists()
	{
		ListTest LT = new ListTest();

		Scanner ListScanner = new Scanner(System.in);

		while (true) {
			UI.clearConsole();

			try {
				switch (UI.enterInt(LT.getListMenu() + "==>> ")) {
				case 1:
					System.out.println("Podaj ile losowych elementów chcesz wsadzić do list: ");
					LT.FillLists(ListScanner.nextInt());
					break;
				case 2:
					System.out.println("Wpisz element który chcesz dodać do list: ");
					LT.InsertElement(ListScanner.nextInt());
					break;
				case 3:
					System.out.println("Podaj indeks elementu który chcesz usnuąć z list: ");
					LT.RemoveElement(ListScanner.nextInt());
					break;
				case 4:
					LT.PrintSequence();
					break;
				case 0: return;
				}
			} catch (ListException e) {
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		}
	}

	static void TestMaps()
	{
		MapTest MT = new MapTest();

		Scanner MapScanner = new Scanner(System.in);

		while (true) {
			UI.clearConsole();

			try {
				switch (UI.enterInt(MT.getMapMenu() + "==>> ")) {
				case 1:
					System.out.println("Podaj słowo które chcesz dodać: ");
					String slowo = MapScanner.nextLine();
					System.out.println("Podaj definicje tego słowa: ");
					String definicja = MapScanner.nextLine();

					MT.InsertElement(slowo, definicja);
					break;
				case 2:
					System.out.println("Podaj słowo które chcesz usunąć: ");
					MT.RemoveElement(MapScanner.nextLine());
					break;
				case 3:
					MT.PrintSequence();
					break;
				case 0: return;
				}
			} catch (MapException e) {
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		}
	}
	
}  // koniec klasy CollectionsConsoleApp
