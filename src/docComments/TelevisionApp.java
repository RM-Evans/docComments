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

		//String test = sammysung.toString();
		//System.out.println(test);

		while (menuOption != 6) {
			
			System.out.println("\n1. Show all TVs \n2. Add a TV \n3. Find a TV \n4. Delete a TV \n5. Number of TVs \n6. Exit");
			System.out.println("Enter your selection: ");

			menuOption = scan.nextInt();

			System.out.println();

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
//		TODO:SAM
//		Whenever the user wants to find or delete a device s/he should be prompted for the id number.
//		If the user provides an id number that doesn’t exist, an appropriate message should be displayed.
//		If the id number could be found, the device information should be displayed as part of the response.

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

	private static void deleteTV(ArrayList<Television> tvs) {
//		TODO: SAM
//		Reference the findTvById method to finish this function.
//		Research ArrayList methods that can help you accomplish this task.
//		
		
		
		
//		System.out.println(.toString() + "has been deleted");

	}

	private static void getTV(int tvID) {

//		TODO: SAM
		//System.out.println(.toString());
		
		

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
		for (int i = 0; i < tvs.size(); i++) {
			System.out.println(tvs.get(i));
		}
	}

}
