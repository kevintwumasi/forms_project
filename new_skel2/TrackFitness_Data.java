import java.util.ArrayList;

public class TrackFitness_Data extends Menu 
{
	final static private String MenuTitle = "This is the Data Entry Editor";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private Data LocalFitnessData = new Data();
	private Data_Date LocalFitnessData_Date = new Data_Date();
	public TrackFitness_Data(Data FitnessData, Data_Date FitnessData_Date) {
		MenuContents.add("Check one of your stats");
		MenuContents.add("Check all your stats");
		MenuContents.add("Edit an entry");
		SetMenuAll(MenuTitle, MenuContents);
		Data LocalFitnessData = FitnessData;
		Data_Date LocalFitnessData_Date = FitnessData_Date;
	}

	public void SelectSubMenu() {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu();
			switch (choice) {
				case 1:	LocalFitnessData.GetData_Input();
					break;
				case 2:	LocalFitnessData.GetAllData_Input();
					break;
				case 3:	LocalFitnessData.SetData_Input();
					break;
			}
		}
	}
}
