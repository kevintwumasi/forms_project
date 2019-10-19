import java.util.ArrayList;
public class FitnessDashboard_Menu extends Menu
{
	final static private String MenuTitle = "This the Fitness Dashboard Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private Data LocalFitnessData = new Data();
	public FitnessDashboard_Menu(Data FitnessData) {
		MenuContents.add("for Data Entry");
		MenuContents.add("for Exercise Recommendations");
		SetMenuAll(MenuTitle, MenuContents);
		LocalFitnessData = FitnessData;
	}
	public void SelectSubMenu() {
		int choice = -1;
		TrackFitness_Data MenuData = new TrackFitness_Data(LocalFitnessData);
		while (choice != 0) {
			choice = SelectMenu();
			switch (choice) {
				case 1:	MenuData.SelectSubMenu() ;
				case 2:	System.out.println("Will implement later...");
			}
		}
	}
}
