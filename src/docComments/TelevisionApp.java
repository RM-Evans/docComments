package docComments;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionApp {
	private static int providedId;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menuOption = 999;
		ArrayList<Television> tvs = new ArrayList<Television>();

		Television sammysung = new Television("samsung", 1080, 140, 60);
		Television lg = new Television("lg", 2160, 140, 32);
		Television onn = new Television("onn", 144, 30, 24);
		Television insignia = new Television("insignia", 1080, 60, 42);

		tvs.add(sammysung);
		tvs.add(lg);
		tvs.add(onn);
		tvs.add(insignia);

		// String test = sammysung.toString();
		// System.out.println(test);

		while (menuOption != 6) {
			printMenu();
			menuOption = scan.nextInt();

//		TODO: Provide the functionality chosen by the user.
//		Use private methods to print the menu and to display, find, add, or delete devices.

			switch (menuOption) {

			case 1: { // Show all TV's
				showAllTvs(tvs);
				break;
			}

			case 2: { // Add a TV

				break;
			}
			case 3: { // Find a TV
//				System.out.println(lg.getId());  //for testing

				System.out.print("ID:");
				providedId = scan.nextInt();
				Television foundTV = findTvById(tvs, providedId);

				if (foundTV != null) {
					System.out.println(foundTV.toString());
				} else {
					System.out.println("\nNo TV found with ID: " + providedId);
				}

				break;
			}
			case 4: { // Delete a TV

				deleteTV(tvs, providedId);
				break;
			}
			case 5: { // # of TV's

				System.out.println("Number of TV's: " + tvs.size());

				break;
			}
			case 6: { // EXIT

				break;
			}
			default:

				System.out.println("Must enter a selection 1 - 6");

//				throw new IllegalArgumentException("INVALID MENU OPTION: " + menuOption);

			}

		}

		System.out.println("Goodbye");

	}

	private static void deleteTV(ArrayList<Television> tvs, int providedId) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Id: ");
		providedId = scnr.nextInt();

		for (int i = 0; i < tvs.size(); i++) {
			if (tvs.get(i).getId() == providedId) {
				System.out.println(tvs.get(i).toString() + " has been deleted");
				tvs.remove(i);
				return;
			}
		}
		System.out.println("The id " + providedId + " could not be found");
	}

	private static void getTV(int tvID) {

//		TODO: SAM
		// System.out.println(.toString());

	}

	/**
	 * Finds Television object that contains an id that matches the user provided id
	 * 
	 * @return Television
	 */
	private static Television findTvById(ArrayList<Television> tvs, int providedId) {
		for (Television tv : tvs) {
			if (tv.getId() == providedId) {
				return tv;
			}
		}
		return null; // return null if tv doesnt exist

	}

	private static void showAllTvs(ArrayList<Television> tvs) {
		if (tvs.size() > 0) {
			for (int i = 0; i < tvs.size(); i++) {
				System.out.println(tvs.get(i));
			}
		} else {
			System.out.println("No TVs for you :'(");
		}
	}

	public static void printMenu() {
		System.out.println("\n1. Show all TVs");
		System.out.println("2. Add a TV");
		System.out.println("3. Find a TV");
		System.out.println("4. Delete a TV");
		System.out.println("5. Number of TVs");
		System.out.println("6. Exit");
		System.out.println("Enter your selection:");
	}
}
