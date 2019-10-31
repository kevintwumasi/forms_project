public class Editor_Set extends Editor_Abstract 
{
	private UserData tempdata;
	public Editor_Set(UserData z) {
		super("Set Values", z);
	}
	public void SelectMenu(int choice, UserData z) {
		z.SetEntry(choice);
	}
}
