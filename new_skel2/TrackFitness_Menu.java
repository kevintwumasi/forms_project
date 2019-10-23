import java.util.ArrayList;
public class TrackFitness_Menu extends Menu
{
	final static private String MenuTitle = "This is the Track Fitness Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private Data LocalFitnessData = new Data();
	private Data_Date LocalFitnessData_Date = new Data_Date();
	public TrackFitness_Menu(Data FitnessData, Data_Date FitnessData_Date) {
		MenuContents.add("to Track Weight");
		MenuContents.add("to Track Lifts");
		SetMenuAll(MenuTitle, MenuContents);
		Data LocalFitnessData = FitnessData;
		Data_Date LocalFitnessData_Date = FitnessData_Date;
	}
	// methods
		
	// main submenu
	public void SelectSubMenu() {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu();
			switch (choice){
				case 1: TrackFitness_TrackWeight;
				case 2:	;
			}
		}
	}
}
