public class Editor_Get extends Editor_Abstract
{
	private UserData tempdata;
	public Editor_Get(UserData z) {
		super("Get Values", z);
	}
	public void SelectMenu(int choice, UserData z) {
		System.out.println(GetData_String(choice, z));
	}
	private String GetData_String(int choice, UserData z) {
		String ArrayStringed = "";
		ArrayStringed = z.GetData_Type(choice) + "\t" + 
			z.GetData_Entry(choice) + " " +
			z.GetData_Units(choice);
		return ArrayStringed;
	}
}


