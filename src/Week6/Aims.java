package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.UUID;


public class Aims {

	private static Order order = null;

	public Aims() {
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		String id;

		do {
			showMenu();
			choice = scanner.nextInt();
			if(choice == 1 || order != null) {
				switch (choice) {
					case 0:
						return;
					case 1:
						order = new Order();
						break;
					case 2:
						showMenu2();
						choice = scanner.nextInt();
						switch (choice) {
							case 1:
								addDigitalVideoDisc();
								break;
							case 2:
								addBook();
								break;
							case 0:
								break;
						}
						break;
					case 3:
						System.out.print("Id: ");
						scanner.nextLine();
						id = scanner.nextLine();
						Media item = order.getItemById(id);
						order.removeMedia(item);
						break;
					case 4:
						order.showAllItems();
						break;
					case 5:
						System.out.println("Total cost is " + order.totalCost());
						break;
				}
			}
		} while (true);
	}

	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("5. Total cost");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: 0-1-2-3-4-5: ");
	}

	public static void showMenu2() {
		System.out.println("Add Order");
		System.out.println("--------------------------------");
		System.out.println("1. Digital Video Disc");
		System.out.println("2. Book");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: 0-1-2: ");
	}

	public static void addDigitalVideoDisc() {
		Scanner scanner = new Scanner(System.in);
		String title, category, director, id = UUID.randomUUID().toString();
		System.out.println(id);
		int length;
		float cost;
		DigitalVideoDisc digitalVideoDisc = new DigitalVideoDisc();

		System.out.print("Title ");
		title = scanner.nextLine();
		System.out.print("Category: ");
		category = scanner.nextLine();
		System.out.print("Director: ");
		director = scanner.nextLine();
		System.out.print("Length: ");
		length = scanner.nextInt();
		System.out.print("Cost: ");
		cost = scanner.nextFloat();

		digitalVideoDisc.setTitle(title);
		digitalVideoDisc.setCategory(category);
		digitalVideoDisc.setDirector(director);
		digitalVideoDisc.setLength(length);
		digitalVideoDisc.setCost(cost);
		digitalVideoDisc.setId(id);
		digitalVideoDisc.setType("DigitalVideoDisc");

		order.addMedia(digitalVideoDisc);
	}

	public static void addBook() {
		Scanner scanner = new Scanner(System.in);
		String title, category, author, id = UUID.randomUUID().toString();
		System.out.println(id);
		float cost;
		Book book = new Book();
		ArrayList<String> authors = new ArrayList<>();

		System.out.print("Title ");
		title = scanner.nextLine();
		System.out.print("Category: ");
		category = scanner.nextLine();
		System.out.print("Authors: ");
		author = scanner.nextLine();
		System.out.print("Cost: ");
		cost = scanner.nextFloat();

		Collections.addAll(authors, author.split("/"));

		book.setTitle(title);
		book.setCategory(category);
		book.setAuthors(authors);
		book.setCost(cost);
		book.setId(id);
		book.setType("Book");

		order.addMedia(book);
	}
}