public class FitnessApp
{
	public static void main(String[] args) {
		FitnessApp_Menu AppMenu = new FitnessApp_Menu();
		TrackFitness_Menu TrackMenu = new TrackFitness_Menu();
		FitnessDashboard_Menu DashboardMenu = new FitnessDashboard_Menu();
		Data FitnessData = new Data();
		DashboardMenu.GetMenu();
		AppMenu.GetMenu();
		FitnessData.GetMenu();
		//AppMenu.GetMenu();
		//FitnessData.GetData_Input_Legend();
		//FitnessData.GetData_Input();
		//FitnessData.SetData_Input();
	}
}
