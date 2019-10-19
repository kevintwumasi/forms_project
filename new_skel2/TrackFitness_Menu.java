import java.util.ArrayList;
public class TrackFitness_Menu extends Menu
{
	final static private String MenuTitle = "This is the Track Fitness Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	public TrackFitness_Menu() {
		MenuContents.add("to Track Weight");
		MenuContents.add("to Track Lifts");
		SetMenuAll(MenuTitle, MenuContents);
	}
}
