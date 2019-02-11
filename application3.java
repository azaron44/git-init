package PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class application3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Person> people = new ArrayList<>();
		int option = 0;

		do {
			System.out.println("1. Add new Entry");
			System.out.println("2. Search for entry by first name");
			System.out.println("3. Search for entry by last name");
			System.out.println("4. Search by phone number");
			System.out.println("5. Search by state");
			System.out.println("6. Search by city");
			System.out.println("7. Delete");
			System.out.println("8. Modify entry");
			System.out.println("9. Exit");
			option = input.nextInt();

			switch (option) {
			case 1:
				Person p = new Person();
				input.nextLine();

				System.out.println("Enter first name: ");
				p.setFirstName(input.nextLine());

				System.out.println("Enter middle name: ");
				p.setMiddleName(input.nextLine());

				System.out.println("Enter last name");
				p.setLastName(input.nextLine());

				System.out.println("Enter phone number");
				p.setPhoneNumber(input.nextLine());

				System.out.println("Enter Street number");
				p.getAddress().setStreetNumber(input.nextInt());

				System.out.println(input.nextLine());
				System.out.println("Enter street name");
				p.getAddress().setStreetName(input.nextLine());

				System.out.println("Enter city");
				p.getAddress().setCity(input.nextLine());
				System.out.println("Enter state");
				p.getAddress().setState(input.nextLine());
				System.out.println("Enter zipcode");
				p.getAddress().setZipcode(input.nextLine());
				System.out.println(p);
				people.add(p);

				break;

			case 2:
				input.nextLine();
				System.out.println("Enter First Name to Search for: ");
				String fname = input.nextLine();
				for (Person person : people) {
					if (person.getFirstName().equals(fname)) {
						System.out.println(people);
					}
				}
				break;

			case 3:
				input.nextLine();
				System.out.println("Enter Last Name to Search for: ");
				String lname = input.nextLine();
				for (Person person : people) {
					if (person.getLastName().equals(lname)) {
						System.out.println(person);
					}
				}
				break;

			case 4:
				input.nextLine();
				System.out.println("Enter phone number to search for:");
				String phoneNum = input.nextLine();
				for (Person person : people) {
					if (person.getPhoneNumber().equals(phoneNum)) {
						System.out.println(person);
					}
				}

				break;

			case 5:
				input.nextLine();
				System.out.println("Enter state to search for:");
				String state = input.nextLine();
				for (Person person : people) {
					if (person.getAddress().getState().equals(state)) {
						System.out.println(person);
					}
				}

				break;

			case 6:
				input.nextLine();
				System.out.println("Enter city to search for:");

				String city = input.nextLine();
				for (Person person : people) {
					if (person.getAddress().getState().equals(city)) {
						System.out.println(person);
					}
				}
				break;

			case 7:
				/*
				 * input.nextLine();
				 * System.out.println("Enter phone number to search and delete entry"); String
				 * deleteNumber = input.nextLine(); for(Person person : people) {
				 * if(person.getPhoneNumber().equals(deleteNumber)) {
				 * person.remove(deleteNumber); System.out.println("Person deleted");
				 * 
				 * } }
				 */

				/*
				 * input.nextLine(); System.out.println("Enter number to delete"); int index =
				 * 1; String numberRemoval = input.nextLine(); for(int i = 0;
				 * i<people.size();i++) { if(people.get(index).equals(numberRemoval)) {
				 * people.remove(index);
				 * 
				 * }
				 * 
				 * }
				 */
				input.nextLine();
				System.out.println("Enter number to delete");
				// int index = 1;
				// ArrayList<Person> List = new ArrayList<Person>();
				String numberRemoval = input.nextLine();
				for (Person person : people) {
					if (person.getPhoneNumber().equals(numberRemoval)) {
						person.remove(people);
						System.out.print("Deleted");
						break;
					}

				}

				break;

			case 8:
				input.hasNextLine();
				System.out.println("Array Sorting");
				Collections.sort(people);
				for (Person person : people) {
					System.out.println(person);
					
				}

			}

		} while (option <= 8);

	}
}
