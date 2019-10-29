import java.util.ArrayList;
import java.util.Scanner;
abstract class Editor_Abstract extends Menu
{
	private UserData tempdata;
	public Editor_Abstract(String Title, UserData z) {
		super(Title);
		tempdata = z;
		for (Data o : tempdata.GetUserData()) {
			Menu_Entry temp = new Menu_Entry(o.GetData_Type());
			AddMenu_Entry(temp);
		}
	}	
	// get methods
	public UserData GetUserData() {
		return tempdata;
	}
	// scanner methods
	public String Scan_String() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextLine());
	}

	public double Scan_Double() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextDouble());
	}

	public int Scan_Int() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextInt());
	}
	// check methods
	public boolean Check_Positive(double c) {
		if (c > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Check_Gender(String c) {
		if (c.equals("M") || c.equals("F") || 
				c.equals("m") ||
				c.equals("f")) {
			return true;
				}
		else {
			return false;
		}
	}

	public boolean Check_Percent(double c) {
		if (c > 0 && c <= 1) {
			return true;
		} else {
			return false;
		}
	}
	// editor actions
}
