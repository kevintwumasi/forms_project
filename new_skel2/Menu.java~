import java.util.ArrayList;
import java.util.Scanner;
public class Menu
{
	private String MenuTitle = "DEFAULT TITLE";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private int MenuRange = this.MenuContents.size();
	private int modLock = 0;
	// set methods
	private void SetMenuTitle(String NewMenuTitle) {
		this.MenuTitle = NewMenuTitle;
	}
	private void SetMenuContents(ArrayList<String> NewMenuContents) {
		System.out.println("Refreshing menu...\n");
		this.MenuContents = NewMenuContents;
		if (modLock == 0) {
			this.MenuContents.add(0, "to quit the current menu.");
			modLock = 1;
		}
		SetMenuRange();
		System.out.println("Menu has been refreshed...\n");
	}
	private void SetMenuRange() {
		this.MenuRange = this.MenuContents.size();
	}
	// get methods
	private String GetMenuTitle() {
		return this.MenuTitle;
	}
	private String GetMenuContents() {
		String ArrayStringed = "";
		int i;
		for (i = 0; i < GetMenuRange(); i++) {
			ArrayStringed += "(" + i  + ") " +
				this.MenuContents.get(i) +
				"\n";
		}
		return ArrayStringed;
	}
	protected int GetMenuRange() {
		return this.MenuRange;
	}
	// message methods
	public boolean MessageInvalidChoice() {
		System.out.println("Invalid choice. Please try again...");
		return false;
	}
	public boolean MessageInvalidEntry() {
		System.out.println("Invalid entry. Please try again...");
		return false;
	}

	// code sauce: https://stackoverflow.com/questions/2979383/java-clear-the-console
	public static void clearScreen() {  
    		System.out.println("\033[H\033[2J");  
    		//System.out.flush();  
	}  

	// compound methods
	public void SetMenuAll(String a, ArrayList<String> b) {
		SetMenuTitle(a);
		SetMenuContents(b);
	}
	private void GetMenu() { // induces formatting
		String returnString = 
			GetMenuTitle() + "\n" +
			GetMenuContents() + "> ";
		System.out.println(returnString);
	}

	// select scanner components
	private boolean ScannerMenu_DetSize(int choice) {
		if ( choice >= 0 && choice < GetMenuRange() ) {
			return true;
		} else {
			return MessageInvalidChoice();
		}
	}

	private int ScannerMenu() {
		Scanner selection = new Scanner(System.in);
		while (true) {
			GetMenu();
			try {
				int choice = selection.nextInt();
				if (ScannerMenu_DetSize(choice)) {
					//System.out.println("You chose " + choice);
					return choice;
				}
			} catch (java.util.InputMismatchException e) {
				MessageInvalidEntry();
				selection.nextLine();
			}
		}
	}

	public boolean SelectMenu_0(int choice) {
		if (choice != 0) {
			return true;
		} else {
			System.out.println("Cancelling Operation...");
			return false;
		}
	}

	public int SelectMenu() {
		while (true) {
			//clearScreen();
			return ScannerMenu();
		}
	}
	// debug
	public void pdb() {
		System.out.println("Debugging...");
	}
}
