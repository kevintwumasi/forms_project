import java.util.ArrayList;
public class Menu
{
	private String MenuTitle = "DEFAULT TITLE";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private int MenuRange = this.MenuContents.size();
	// set methods
	public void SetMenuTitle(String NewMenuTitle) {
		this.MenuTitle = NewMenuTitle;
	}
	public void SetMenuContents(ArrayList<String> NewMenuContents) {
		this.MenuContents = NewMenuContents;
		this.MenuContents.add(0, "to quit the current menu.");
	}
	public void SetMenuRange() {
		this.MenuRange = this.MenuContents.size();
	}
	// get methods
	private String GetMenuTitle() {
		return this.MenuTitle;
	}
	private String GetMenuContents() {
		String ArrayStringed = "";
		int i;
		SetMenuRange();
		for (i = 0; i < GetMenuRange(); i++) {
			ArrayStringed += "(" + i  + ") " +
				this.MenuContents.get(i) +
				"\n";
		}
		return ArrayStringed;
	}
	private int GetMenuRange() {
		return this.MenuRange;
	}
	// message methods
	public void MessageInvalidChoice() {
		System.out.println("Invalid choice. Please try again...");
	}

	// compound methods
	public void SetMenuAll(String a, ArrayList<String> b) {
		SetMenuTitle(a);
		SetMenuContents(b);
	}
	public void GetMenu() { // induces formatting
		String returnString = 
			GetMenuTitle() + "\n" +
			GetMenuContents() + "> ";
		System.out.println(returnString);
	}
	// select loop
	// TO DO LATER
}
