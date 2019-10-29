public class Home extends Menu_Abstract
{
	private Menu_Entry Track_Fitness = new Menu_Entry("Track Fitness");
	private Menu_Entry View_Insights = new Menu_Entry("View Insights");
	public Home() {
		super("Home");
		AddMenu_Entry(Track_Fitness);
		AddMenu_Entry(View_Insights);
	}

	public void SelectMenu(int choice, UserData z) {
		Fitness b = new Fitness();
		switch (choice) {
			case 1:	System.out.println("To Track Fitness (NOT IMPLEMENTED)");
				break;
			case 2: b.Menu_Main(z);
		}
	}
}
