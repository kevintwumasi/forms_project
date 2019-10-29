public class Editor_Set extends Editor_Abstract
{
	public Editor_Set(UserData z) {
		super("Set", z);
	}
	public void SelectMenu(int choice, UserData z) {
		Data temp = SelectData(choice, z);
		System.out.println("You are currently editing " + temp.GetData_Type() + ".");
		while (true) {
			String UnitsMsg = "";
			if (!(temp.GetData_Units().equals(""))) {
				UnitsMsg += " (" + temp.GetData_Units() + ")";
			}
			System.out.println("Enter the new value for " + temp.GetData_Type() + UnitsMsg + ".");
			if (!(SetData(temp))) {
				System.out.println("The new value for " + temp.GetData_Type() + 
						" is " + ReturnData(temp) + UnitsMsg + ".");
				break;
			}
		}

	}
	// select data, have a prompt, scan for things, then seal the deal
	private boolean SetData(Data o) {
		switch (DetData_Type(o)) {
			case 1:	int i = Scan_Int();
				Data_Int a = (Data_Int) o;
				a.SetData_Entry(i);
				return false;
			case 2:	double j = Scan_Double();
				Data_Double b = (Data_Double) o;
				b.SetData_Entry(j);
				return false;
			case 3:	Scan_Lifts(o);
				return false;
			case 4:	String m = Scan_String();
				Data_String c = (Data_String) o;
				c.SetData_Entry(m);
				return false;
			default:	return true;
		}
	}
	private String ReturnData(Data o) {
		switch (DetData_Type(o)) {
			case 1:	Data_Int a = (Data_Int) o;
				return Integer.toString(a.GetData_Entry());
			case 2:	Data_Double b = (Data_Double) o;
				return Double.toString(b.GetData_Entry()); 
			case 3:	Lifts c = (Lifts) o;
				String ArrayStringed = "";
				ArrayStringed += c.GetData_Entry() + " per " + 
					c.GetLifts_Weight() + " "; //+ c.GetLifts_Units();
				return ArrayStringed = "";
			case 4:	Data_String d = (Data_String) o;
				return d.GetData_Entry();
			default:	return "";
		}
	}
}
