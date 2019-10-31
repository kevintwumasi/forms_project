public class Editor extends Menu_Abstract
{
	private Menu_Entry Get_Data = new Menu_Entry("Get Data");
	private Menu_Entry Set_Data = new Menu_Entry("Set Data");

	public Editor(){
		super("Data Editor");
		AddMenu_Entry(Get_Data);
		AddMenu_Entry(Set_Data);
	}
	public void SelectMenu(int choice, UserData z) {
		Editor_Get a = new Editor_Get(z);
		Editor_Set b = new Editor_Set(z);
		switch (choice) {
			case 1:	a.Menu_Main(z);
				break;
			case 2:	b.Menu_Main(z);
				break;
		}
	}
}
