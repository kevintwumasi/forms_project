import java.util.ArrayList;
public class TrackFitness_Menu extends Menu
{
	final static private String MenuTitle = "This is the Track Fitness Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	public TrackFitness_Menu(Data FitnessData) {
		MenuContents.add("to Track Weight");
		MenuContents.add("to Track Lifts");
		SetMenuAll(MenuTitle, MenuContents);
		Data LocalFitnessData = FitnessData;
	}
	// methods
		
	// main submenu
	public void SelectSubMenu() {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu();
			switch (choice){
				case 1: ;
				case 2:	;
			}
		}
	}
}
