import java.util.ArrayList;
public class TrackWeight_Menu extends Menu
{
	final static private String MenuTitle = "This is the Track Weight Menu";
	private ArrayList<String> MenuContents = new ArrayList<String>();
	private Data LocalFitnessData = new Data();
	private Data_Date LocalFitnessData_Date = new Data_Date();

	public TrackWeight_Menu(Data FitnessData, Data_Date FitnessData_Date) {
		MenuContents.add("Display Weight/Time Graph");
		MenuContents.add("Enter Current Weight");
		SetMenuAll(MenuTitle, MenuContents);
		Data LocalFitnessData = FitnessData;
		Data_Date LocalFitnessData_Date = FitnessData_Date;
	}

	public void SelectSubMenu(){
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu();
			switch (choice) {
				case 1:	LocalFitnessData_Date.GetAllData_Input();
					break;
				case 2:	LocalFitnessData_Date.SetData_Input();
					break;
			}
		}
	}
}
