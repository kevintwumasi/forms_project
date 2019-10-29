public class Fitness extends Menu
{
	private Menu_Entry Editor = new Menu_Entry("View/Edit User Data");
	private Menu_Entry Display_Caloric = new Menu_Entry("Daily Caloric Requirements");
	private Menu_Entry Basal_Metabolic = new Menu_Entry("Basal Metabolic Rate");
	private Menu_Entry FFMI = new Menu_Entry("Fat Free Mass Index & Ranges");
	private Menu_Entry VO2_Max = new Menu_Entry("VO2 Max");
	private Menu_Entry BMI = new Menu_Entry("BMI & Range");
	private Menu_Entry Lifting_Stats = new Menu_Entry("Lifting Stats");

	public Fitness() {
		super("Fitness Dashboard");
		AddMenu_Entry(Editor);
		AddMenu_Entry(Display_Caloric);
		AddMenu_Entry(Basal_Metabolic);
	       	AddMenu_Entry(FFMI);
		AddMenu_Entry(VO2_Max);
		AddMenu_Entry(BMI);
		AddMenu_Entry(Lifting_Stats);
	}

	public void SelectMenu(int choice, UserData z) {
		Editor a = new Editor();
		switch (choice) {
			case 1:	a.Menu_Main(z);
				break;
			case 2:	System.out.println("Display Caloric (NI)");
				break;
			case 3:	System.out.println("Basal Metabolic (NI)");
				break;
			case 4:	System.out.println("FFMI (NI)");
				break;
			case 5: System.out.println("VO2 Max (NI)");
				break;
			case 6: System.out.println("BMI (NI)");
				break;
			case 7:	System.out.println("Lifting Stats (NI)");
				break;
		}
	}
}
