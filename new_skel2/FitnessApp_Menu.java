import java.util.ArrayList;
public class FitnessApp_Menu extends Menu
{
	final static private String MenuTitle = "This is the Fitness App";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	public FitnessApp_Menu() {
		MenuContents.add("for Food");
		MenuContents.add("for Drinks");
		SetMenuAll(MenuTitle, MenuContents);
	}
}
