import java.util.ArrayList;
public class TrackFitness_Menu extends Menu
{
	final static private String MenuTitle = "This is the Track Fitness Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	//final static private String MenuContents = "(1) to Track Weight" + "\n" + // transform this to an array later...
		//"(2) to Track Lifts";
	//final static private int MenuRange = 2;
	public TrackFitness_Menu() {
		MenuContents.add("(1) to Track Weight");
		MenuContents.add("(2) to Track Lifts");
		SetMenuAll(MenuTitle, MenuContents);
	}
}
