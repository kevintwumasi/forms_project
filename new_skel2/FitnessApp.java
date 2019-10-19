public class FitnessApp
{
	public static void main(String[] args) {
		FitnessApp_Menu menu = new FitnessApp_Menu();
		Data FitnessData = new Data();
		menu.GetMenu();
		FitnessData.GetData_Input_Legend();
		FitnessData.GetData_Input();
	}
}
