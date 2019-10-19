import java.util.ArrayList;
public class FitnessDashboard_Menu extends Menu
{
	final static private String MenuTitle = "This the Fitness Dashboard Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	public FitnessDashboard_Menu() {
		MenuContents.add("for Data Entry");
		MenuContents.add("for Exercise Recommendations");
		SetMenuAll(MenuTitle, MenuContents);
	}
}
