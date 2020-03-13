package Week2;

import java.util.*;

public class Example6 {
	static void printMenu() {
		System.out.println("Main menu");
		System.out.println("1. Show library information");
		System.out.println("2. Add new book");
		System.out.println("3. Find book");
		System.out.println("4. Edit book");
		System.out.println("5. Delete book");
		System.out.println("6. Exit");
		System.out.print("Enter menu ID: ");
	}
	public static void main(String[] args) {
		int x;
		String data[] = {
						"A Column of Fire",
						"A Face Like Glass",
						"A Legacy of Spies",
						"Al Franken, Giant of the Senate",
						"Artemis",
						"Before We Were Yours",
						"Beneath A Scarlet Sky",
						"Bobby Kennedy",
						"Bonfire",
						"Braving the Wilderness",
						"Camino Island",
						"Caroline",
						"Count to Ten",
						"Deep Freeze",
						"Diary of A Wimpy Kid",
						"Dinner in An Instant",
						"Don't Let Go",
						"End Game",
						"Endurance",
						"Enemy of the State",
						"Fairytale",
						"Fantasyland",
						"Future Home of the Living God",
						"George & Lizzie",
						"Glass Houses",
						"Grant",
						"Gwendy's Button Box",
						"Hardcore Twenty-four",
						"Haunted",
						"How to Instant Pot",
						"In This Moment",
						"In the Midst of Winter",
						"Into the Water",
						"Killers of the Flower Moon",
						"Killing England",
						"Killing Season",
						"La Belle Sauvage",
						"Leonardo Da Vinci",
						"Less",
						"Little Fires Everywhere",
						"Love and Other Consolation Prizes",
						"Magpie Murders",
						"Manhattan Beach",
						"Medical Medium Thyroid Healing",
						"Merry and Bright",
						"Mighty Jack",
						"My Absolute Darling",
						"Nomadland",
						"Obama",
						"Origin",
						"Orphan Island",
						"Past Perfect",
						"Promise Me Dad",
						"Proof of Life",
						"Quick & Dirty",
						"Righteous",
						"Same Kind of Different as Me",
						"Secrets in Death",
						"Seeing Red",
						"Sing, Unburied, Sing",
						"Sisters First",
						"Sleeping Beauties",
						"Smitten Kitchen Every Day",
						"Sourdough",
						"Spinning",
						"The Alice Network",
						"The Child Finder",
						"The Cuban Affair",
						"The Dangerous Case of Donald Trump",
						"The Dark Prophecy",
						"The Girl Who Takes An Eye for An Eye",
						"The House of Unexpected Sisters",
						"The Library at the Edge of the World",
						"The Lying Game",
						"The Midnight Line",
						"The People Vs. Alex Cross",
						"The Plant Paradox",
						"The Power",
						"The Romanov Ransom",
						"The Rooster Bar",
						"The Rules of Magic",
						"The Ship of the Dead",
						"The Store",
						"The Story of Arthur Truluv",
						"The War I Finally Won",
						"The Wendy Project",
						"The ninth Hour",
						"Thorhill",
						"To Be Where You Are",
						"Turtles All the Way Down",
						"Two Kinds of Truth",
						"Unbelievable",
						"Uncommon Type",
						"We Were Eight Years in Power",
						"What Happened",
						"Where the Past Begins",
						"Why Buddhism Is True",
						"Y Is for Yesterday",
						"Year One",
						"You Don't Have to Say You Love Me"
		};
		Collection<String> bookCollection = new ArrayList<>(Arrays.asList(data));
		Stack<String> bookStack = new Stack<String>();
		bookStack.addAll(bookCollection);
		do {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			String name;
			String newName;
			x = scanner.nextInt();
			Scanner scannerName;
			switch (x) {
				case 1:
					int tmp = 1;
					for (String datum : bookStack) {
						System.out.println(tmp++ + " "  + datum);
					}
					break;
				case 2:
					System.out.print("Enter book's name: ");
					Scanner scannerNewName = new Scanner(System.in);
					newName = scannerNewName.nextLine();
					for (int i = 0; i < bookStack.size(); i++) {
						if (newName.compareTo(bookStack.get(i)) < 0) {
							bookStack.add(i, newName);
							break;
						}
					}
					break;
				case 3:
					System.out.print("Enter book's name: ");
					scannerName = new Scanner(System.in);
					name = scannerName.nextLine();
					for (String s : bookStack) {
						if (s.indexOf(name) == 0) {
							System.out.println(s);
						}
					}
					break;
				case 4:
					System.out.print("Enter book's name: ");
					scannerName = new Scanner(System.in);
					name = scannerName.nextLine();
					if (bookStack.search(name) != -1) {
						System.out.print("Enter book's name: ");
						scannerName = new Scanner(System.in);
						newName = scannerName.nextLine();
						bookStack.remove(bookStack.indexOf(name));
						for (int i = 0; i < bookStack.size(); i++) {
							if (newName.compareTo(bookStack.get(i)) < 0) {
								bookStack.add(i, newName);
								break;
							}
						}
						break;
					}
					for (String s : bookStack) {
						if (s.indexOf(name) == 0) {
							if (s.indexOf(name) == 0) {
								System.out.println(s);
							}
						}
					}
					break;
				case 5:
					System.out.print("Enter book's name: ");
					scannerName = new Scanner(System.in);
					name = scannerName.nextLine();
					if (bookStack.search(name) != -1) {
						bookStack.remove(bookStack.indexOf(name));
						break;
					}
					for (String s : bookStack) {
						if (s.indexOf(name) == 0) {
							System.out.println(s);
						}
					}
					break;
			}
		} while (x != 6);
	}
}
