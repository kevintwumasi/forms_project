public class test
{
	public static void main(String[] args) {
		// init data structs
		Data ex = new Data("Height", "m");
		Data_Date ex_d = new Data_Date("Weight", "lbs.");
		//ex_d.GetAllData_Input();
		//ex_d.SetData_Input();
		//ex_d.GetAllData_Input();
		System.out.println(ex.GetData());
	}
}
