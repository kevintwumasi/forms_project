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
	protected String Scan_String() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextLine());
	}

	protected double Scan_Double() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextDouble());
	}

	protected int Scan_Int() {
		Scanner temp = new Scanner(System.in);
		return (temp.nextInt());
	}

	protected void Scan_Lifts(Data o) {
		Lifts m = (Lifts) o;
		System.out.println("Enter the amount of reps");
		int i = Scan_Int();
		m.SetData_Entry(i);
		System.out.println("Enter the weight in " + o.GetData_Units() + ".");
		double j = Scan_Double();
		m.SetLifts_Weight(j);
	}

	public Object Scan_Input() {
		Scanner temp = new Scanner(System.in);
		return (temp.next("\n"));
	}
	// check methods
	private boolean Check_Positive(double c) {
		if (c > 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean Check_Gender(String c) {
		if (c.equals("M") || c.equals("F") || 
				c.equals("m") ||
				c.equals("f")) {
			return true;
				}
		else {
			return false;
		}
	}

	private boolean Check_Percent(double c) {
		if (c > 0 && c <= 1) {
			return true;
		} else {
			return false;
		}
	}

	// override Menu_Main due to array size
	public void Menu_Main(UserData z) {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu_Scanner();
			if (choice != 0) {
				SelectMenu(choice - 1, z); // here's the change...
			}
		}
	}
	// editor actions
	protected Data CastData_Type(Object o) {
		if (o instanceof Data) {
			return (Data) o;
		} else if (o instanceof Data_Int) {
			return (Data_Int) o;
		} else if (o instanceof Data_Double) {
			return (Data_Double) o;
		} else if (o instanceof Lifts) {
			return (Lifts) o;
		} else if (o instanceof Data_String) {
			return (Data_String) o;
		} else {
			return (Data) null;
		}
	}

	protected int DetData_Type(Object o) {
		if (o instanceof Data_Int) {
			return 1;
		} else if (o instanceof Data_Double) {
			return 2;
		} else if (o instanceof Lifts) {
			return 3;
		} else if (o instanceof Data_String) {
			return 4;
		} else {
			return 0;
		}
	}

	protected Object Cast_Type(Object o) {
		if (o instanceof String) {
			return (String) o;
		} else if (o instanceof Double) {
			return (double) o;
		} else if (o instanceof Integer) {
			return (int) o;
		} else {
			return (Object) null;
		}
	}

	protected Data SelectData(int choice, UserData z) {
		Object temp = z.GetUserData().get(choice);
		return CastData_Type(temp);
	}
}
