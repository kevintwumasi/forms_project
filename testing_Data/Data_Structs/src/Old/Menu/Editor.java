public class Editor extends Menu
{
	private Menu_Entry Data_Set = new Menu_Entry("Set Data");
	private Menu_Entry Data_Get = new Menu_Entry("Get Data");
	public Editor() {
		super("Data Interface");
		AddMenu_Entry(Data_Set);
		AddMenu_Entry(Data_Get);
	}
	public void SelectMenu(int choice, UserData z) {
		Editor_Set a = new Editor_Set(z);
		Editor_Get b = new Editor_Get(z);
		switch (choice) {
			case 1:	a.Menu_Main(z);
				break;
			case 2: b.Menu_Main(z);	
				break;
		}
	}
}
