package Pattern;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		System.out.println("\t\t\tAditya Restaurant");
		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		float total = 0;
		float gstRate = 18;
		System.out.println("Enter the Aadhar Number: ");
		int aadhar = sc.nextInt();
		System.out.println("Enter the Name :");
		String name = sc.next();
		int seatNumber = (int) (Math.random() * (100) + 1);
		System.out.println("Yout Table Number is - " + seatNumber);
		System.out.println("Press 1 for Breakfast");
		System.out.println("Press 2 for Lunch");
		System.out.println("Press 3 for Dinner");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			int food1price = 100;
			int food2price = 200;
			int food3price = 300;
			System.out.println("you have Choosen For Breakfast");
			System.out.println("Please Choose From The Given Choice: ");
			System.out.println("1. Food 1 - 100rs");
			System.out.println("2.Food 2 - 200rs");
			System.out.println("3. Food 3 - 300rs");
			int breakchoice = sc.nextInt();
			switch (breakchoice) {
			case 1: {
				System.out.println("you have Choosen Food 1");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food1price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 2: {
				System.out.println("you have Choosen Food 2");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total += food2price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 3: {
				System.out.println("you have Choosen Food 3");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food3price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}

			default: {
				System.out.println("Not Available!!!!!! Enter the Right Choice");
				break;

			}

			}
			break;
		}
		case 2: {
			int food1price = 100;
			int food2price = 200;
			int food3price = 300;
			System.out.println("you have Choosen For Lunch");
			System.out.println("Please Choose From The Given Choice: ");
			System.out.println("1. Food 1 - 100rs");
			System.out.println("2.Food 2 - 200rs");
			System.out.println("3. Food 3 - 300rs");
			int breakchoice = sc.nextInt();
			switch (breakchoice) {
			case 1: {
				System.out.println("you have Choosen Food 1");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food1price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 2: {
				System.out.println("you have Choosen Food 2");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food2price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 3: {
				System.out.println("you have Choosen Food 3");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food3price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}

			default: {
				System.out.println("Not Available!!!!!! Enter the Right Choice");
				break;

			}

			}
			break;
		}
		case 3: {
			int food1price = 100;
			int food2price = 200;
			int food3price = 300;
			System.out.println("you have Choosen For Dinner");
			System.out.println("Please Choose From The Given Choice: ");
			System.out.println("1. Food 1 - 100rs");
			System.out.println("2.Food 2 - 200rs");
			System.out.println("3. Food 3 - 300rs");
			int breakchoice = sc.nextInt();
			switch (breakchoice) {
			case 1: {
				System.out.println("you have Choosen Food 1");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total = food1price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				System.out.println("Total " + total);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 2: {
				System.out.println("you have Choosen Food 2");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total += food2price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay-- " + total);
				break;
			}
			case 3: {
				System.out.println("you have Choosen Food 3");
				System.out.println("Enter the Number of servings");
				int serving = sc.nextInt();
				total += food3price * serving;
				float gst = (gstRate / 100) * total;
				System.out.println("Total gst is" + gst);
				total = total + gst;
				System.out.println("Your Order is Placed thankyou!!!");
				System.out.println("Total price to Pay -- " + total);
				break;
			}

			default: {
				System.out.println("Not Available!!!!!! Enter the Right Choice");
				break;

			}

			}
			break;
		}
		default: {
			System.out.println("'Enter the Right Choice!!!");
			break;
		}

		}

	}

}