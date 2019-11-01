import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

abstract class Menu_Abstract {
	private String Menu_Title;
	private ArrayList<Menu_Entry> Menu_List = new ArrayList<Menu_Entry>();
	private Menu_Entry Menu_Exit = new Menu_Entry("Exit");
	public Menu_Abstract(String Menu_Title) {
		SetMenu_Title(Menu_Title);
		AddMenu_Entry(Menu_Exit);
	}
	// get methods
	public String GetMenu_Title() {
		return this.Menu_Title;
	}

	public String GetMenu_Entry(Menu_Entry Entry) {
		return Entry.GetMenu_Entry();
	}

	public String GetMenu_List() {
		String ArrayStringed = "";
		int i;
		ArrayStringed += GetMenu_Title() + "\n";
		for (i = 0; i < Menu_List.size(); i++) {
			ArrayStringed += "(" + i + ")\t" + 
				GetMenu_Entry(Menu_List.get(i)) + "\n";
		}
		return ArrayStringed;
	}
	// set methods
	public void SetMenu_Title(String Menu_Title) {
		this.Menu_Title = Menu_Title;
	}
	// add methods
	public void AddMenu_Entry(Menu_Entry NewEntry) {
		Menu_List.add(NewEntry);
	}
	// select methods
	public boolean SelectMenu_Bool(int choice) {
		ClearScreen();
		if (choice >= 0 && choice < Menu_List.size()) {
			return true;
		} else {
			System.out.println("Invalid choice");
			return false;
		}
	}

	public int SelectMenu_Scanner() {
		Scanner input = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println(GetMenu_List());
			try {
				choice = input.nextInt();
				if (SelectMenu_Bool(choice)) {
					return choice;
				}
			} catch (InputMismatchException e) {
				ClearScreen();
				System.out.println("Invalid input");
				input.nextLine();
			}
		}
	}
		
	abstract public void SelectMenu(int choice, UserData z);
	// menu main loop
	public void Menu_Main(UserData z) {
	       int choice = -1;
	       while (choice != 0) {
		       choice = SelectMenu_Scanner();
		       SelectMenu(choice, z);
	       }
	}
	// misc methods
	protected static void ClearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();  
	}
}
