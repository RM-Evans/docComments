
package docComments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The TelevisionApp class provides a console-based menu for managing a list of
 * Television objects. Users can add, find, delete, and display TVs.
 */
public class TelevisionApp {
	private static int providedId;
	private static Scanner scan;

	/**
	 * The main method starts the application and presents a menu to the user for
	 * managing television inventory.
	 *
	 * @param args Command-line arguments (not used).
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);

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

		while (menuOption != 6) {

			printMenu();
			menuOption = scan.nextInt();
			System.out.println();
			scan.nextLine();

			switch (menuOption) {

			case 1: {
				showAllTvs(tvs);
				break;
			}

			case 2: {
				addTv(tvs);
				break;
			}

			case 3: {
				findTv(tvs, providedId);
				break;
			}

			case 4: {
				deleteTV(tvs, providedId);
				break;
			}

			case 5: {
				numTvs(tvs);
				break;
			}

			case 6: {
				break;
			}

			default:
				System.out.println("Must enter a selection 1 - 6");
			}
		}

		System.out.println("Goodbye");
		scan.close();
	}

	private static void printMenu() {
		System.out.println("\n1. Show all TVs");
		System.out.println("2. Add a TV");
		System.out.println("3. Find a TV");
		System.out.println("4. Delete a TV");
		System.out.println("5. Number of TVs");
		System.out.println("6. Exit");
		System.out.print("Enter your selection: ");
	}

	private static void showAllTvs(ArrayList<Television> tvs) {
		if (tvs.size() > 0) {
			for (int i = 0; i < tvs.size(); i++) {
				System.out.println(tvs.get(i));
			}
		} else {
			System.out.println("No TVs found.");
		}
	}

	private static void addTv(ArrayList<Television> tvs) {
		System.out.print("Manufacturer: ");
		String manufacturer = scan.nextLine();
		
		System.out.print("Size: ");
		int size = scan.nextInt();

		System.out.print("Resolution: ");
		int resolution = scan.nextInt();

		System.out.print("Refresh Rate: ");
		int refresh = scan.nextInt();

		Television newTv = new Television(manufacturer, resolution, refresh, size);
		tvs.add(newTv);

	}

	private static Television findTvById(ArrayList<Television> tvs, int providedId) {
		for (Television tv : tvs) {
			if (tv.getId() == providedId) {
				return tv;
			}
		}
		return null; // return null if tv doesnt exist
	}

	private static void findTv(ArrayList<Television> tvs, int providedId) {
		System.out.print("ID:");
		providedId = scan.nextInt();
		Television foundTV = findTvById(tvs, providedId);

		if (foundTV != null) {
			System.out.println(foundTV.toString());
		} else {
			System.out.println("\nNo TV found with ID: " + providedId);
		}
	}

	private static void deleteTV(ArrayList<Television> tvs, int providedId) {
		System.out.print("Id: ");
		providedId = scan.nextInt();

		for (int i = 0; i < tvs.size(); i++) {
			if (tvs.get(i).getId() == providedId) {
				System.out.println(tvs.get(i).toString() + " has been deleted");
				tvs.remove(i);
				return;
			}
		}
		System.out.println("The id " + providedId + " could not be found");
	}

	private static void numTvs(ArrayList<Television> tvs) {
		System.out.println("Number of TV's: " + tvs.size());
	}

	// private static void getTV(int tvID) {}

}
