package Week2;

import java.util.*;

public class Example6 {
	static void printMenu() {
		System.out.println("Main menu");
		System.out.println("1. Show library information");
		System.out.println("2. Add new book");
		System.out.println("3. Find book");
		System.out.println("4. Exit");
		System.out.print("Enter menu ID: ");
	}
	public static void main(String[] args) {
		int x;
		String data[] = {
						"The Midnight Line",
						"The Rooster Bar",
						"Two Kinds of Truth",
						"Origin",
						"Artemis",
						"Hardcore Twenty-four",
						"Glass Houses",
						"Little Fires Everywhere",
						"The Wendy Project",
						"End Game",
						"Orphan Island",
						"What Happened",
						"Manhattan Beach",
						"Deep Freeze",
						"Turtles All the Way Down",
						"Y Is for Yesterday",
						"A Column of Fire",
						"The Ship of the Dead",
						"Before We Were Yours",
						"The Cuban Affair",
						"Uncommon Type",
						"Braving the Wilderness",
						"You Don't Have to Say You Love Me",
						"To Be Where You Are",
						"Proof of Life",
						"Killers of the Flower Moon",
						"Leonardo Da Vinci",
						"Spinning",
						"The Girl Who Takes An Eye for An Eye",
						"Magpie Murders",
						"Year One",
						"Don't Let Go",
						"The People Vs. Alex Cross",
						"Unbelievable",
						"We Were Eight Years in Power",
						"Camino Island",
						"Thorhill",
						"My Absolute Darling",
						"Killing England",
						"In the Midst of Winter",
						"Future Home of the Living God",
						"Diary of A Wimpy Kid",
						"Love and Other Consolation Prizes",
						"Enemy of the State",
						"La Belle Sauvage",
						"Sing, Unburied, Sing",
						"The Story of Arthur Truluv",
						"A Face Like Glass",
						"The Lying Game",
						"The Rules of Magic",
						"George & Lizzie",
						"Grant",
						"Haunted",
						"Al Franken, Giant of the Senate",
						"In This Moment",
						"A Legacy of Spies",
						"Sleeping Beauties",
						"Merry and Bright",
						"The ninth Hour",
						"Where the Past Begins",
						"Bobby Kennedy",
						"The Dark Prophecy",
						"The War I Finally Won",
						"Beneath A Scarlet Sky",
						"Fantasyland",
						"Into the Water",
						"The House of Unexpected Sisters",
						"Sourdough",
						"Nomadland",
						"Why Buddhism Is True",
						"Sisters First",
						"The Alice Network",
						"Smitten Kitchen Every Day",
						"Endurance",
						"Bonfire",
						"The Romanov Ransom",
						"Obama",
						"Fairytale",
						"How to Instant Pot",
						"The Child Finder",
						"Less",
						"Gwendy's Button Box",
						"Dinner in An Instant",
						"Promise Me Dad",
						"The Power",
						"Mighty Jack",
						"Past Perfect",
						"Righteous",
						"Caroline",
						"The Dangerous Case of Donald Trump",
						"The Library at the Edge of the World",
						"Same Kind of Different as Me",
						"The Store",
						"Quick & Dirty",
						"Secrets in Death",
						"Medical Medium Thyroid Healing",
						"The Plant Paradox",
						"Count to Ten",
						"Seeing Red",
						"Killing Season"
		};
		Collection<String> bookCollection = new ArrayList<>(Arrays.asList(data));
		Stack<String> bookStack = new Stack<String>();
		bookStack.addAll(bookCollection);
		System.out.println(bookStack);
		do {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			switch (x) {
				case 1:
					int tmp = 1;
					for (String datum : data) {
						System.out.println(tmp++ + ' ' + datum);
					}
				case 2:

			}
		} while (x != 4);
	}
}
