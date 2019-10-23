public class FitnessApp
{
	public static void main(String[] args) {
		// init data structs
		Data FitnessData = new Data();
		Data_Date FitnessData_Date = new Data_Date();
		FitnessApp_Menu AppMenu = new FitnessApp_Menu(FitnessData, FitnessData_Date);
		TrackFitness_Menu TrackMenu = new TrackFitness_Menu(FitnessData, FitnessData_Date);
		FitnessDashboard_Menu DashboardMenu = new FitnessDashboard_Menu(FitnessData, FitnessData_Date);
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
