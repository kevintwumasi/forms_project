public class FitnessApp_Main
{
	public static void main(String[] args) {
		// init data structs
		Data FitnessData = new Data();
		Data_Date Weight = new Data_Date("Weight");
		FitnessApp_Menu AppMenu = new FitnessApp_Menu(FitnessData, Weight);
		TrackFitness_Menu TrackMenu = new TrackFitness_Menu(FitnessData, Weight);
		FitnessDashboard_Menu DashboardMenu = new FitnessDashboard_Menu(FitnessData, Weight);
		// main menu
		int choice = -1;
		while (choice != 0) {
			choice = AppMenu.SelectMenu();
			switch (choice) {
				case 1:	TrackMenu.SelectSubMenu();
					break;
				case 2:	DashboardMenu.SelectSubMenu();
					break;
			}
		}
		System.out.println("Goodbye...");
	}
}
