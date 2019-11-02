public class Editor_Get extends Editor_Abstract
{
	public Editor_Get(UserData z) {
		super("Get Values", z);
	}
	public void SelectMenu(int choice, UserData z) {
		System.out.println(GetData_String(choice));
	}
	private String GetData_String(int choice) {
		String ArrayStringed = "";
		String type = tools.GetType_Interactive(choice);
		String units = tools.GetUnits_Interactive(type);
		Object entry = tools.Get_Interactive(type);
		ArrayStringed = type + "\t" + entry + " " + units;
		return ArrayStringed;
	}
}


