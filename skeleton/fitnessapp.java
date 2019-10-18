import java.util.Scanner;

public class fitnessapp
{
	Scanner entry = new Scanner(System.in);
	
	private int selection;

	private static void welcomeMessage() {
		System.out.println("Welcome to T04 Group 4's Fitness App!\n");
	}

	private void returnToAbove() {
		System.out.println("Returning to above menu...\n");
	}

	private void chooseValidOption() {
		System.out.println("Choose a valid option...\n");
	}

	private void optionsMain() {
		System.out.println("Select your option by entering the corresponding integer, then pressing enter.\n");
		System.out.println("1 for inputting your stats.\n");
		System.out.println("2 for calculating your stats.\n");
		System.out.println("3 for other options.\n");
	}

	private void voidFunction(int i) {
		System.out.println("function for " + i + ".");
	}
	
	// selectors

	public void selectionMain() {
		selection = -1;
		while (selection != 0) {
			optionsMain();
			selection = entry.nextInt();
			switch (selection) {
				case 1:		voidFunction(selection);
				case 2: 	voidFunction(selection);
				case 3: 	voidFunction(selection);
				case 0: 	selection = 0;
				default:	chooseValidOption();
						selection = -1;
			}
		}
	}
		
	public void mainMenu() {
		selectionMain();
	}

	//public static void main(String [] args)
	//{
	//	welcomeMessage();
	//	mainMenu();
	//}
}
