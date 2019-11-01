public class Editor_Set extends Editor_Abstract 
{
	public Editor_Set(UserData z) {
		super("Set Values", z);
	}
	public void SelectMenu(int choice, UserData z) {
		String target = tools.GetType_Interactive(choice);
		tools.Set_Interactive(target);
	}
}
