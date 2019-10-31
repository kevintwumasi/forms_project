import java.util.ArrayList;
import java.util.Scanner;
public class UserData 
{
	// SInt
	private Steps i1 = new Steps();
	private Resting_BPM i2 = new Resting_BPM();
	private Struct[] List_Int = {i1, i2};
	// SDouble
	private Height d1 = new Height();
	private Weight d2 = new Weight();
	private BF d3 = new BF();
	private Activity_Level d4 = new Activity_Level();
	private Struct[] List_Double = {d1, d2, d3, d4};
	// Lifts
	private Benches l1 = new Benches();
	private Deadlifts l2 = new Deadlifts();
	private Squats l3 = new Squats();
	private Struct[] List_Lifts = {l1, l2, l3};
	// SString
	private Info s1 = new Info();
	private Gender s2 = new Gender();
	private Struct[] List_String = {s1, s2};
	// other
	private boolean UserNew = false;
	// data array
	private ArrayList<Struct> ArrayData = new ArrayList<Struct>();
	// constructor
	public UserData() {
		Init_Data();
	}
	// get methods
	public ArrayList<Struct> GetData() {
		return this.ArrayData;
	}
	public Struct GetData_Var(int choice) {
		return this.GetData().get(choice);
	}
	// local level
	public Object GetData_Entry(int choice) {
		return this.GetData_Var(choice).GetEntry();
	}
	public String GetData_Type(int choice) {
		return this.GetData_Var(choice).GetType();
	}
	public String GetData_Units(int choice) {
		return this.GetData_Var(choice).GetUnits();
	}	
	//
	public ArrayList<String> GetData_List() {
		ArrayList<String> temp = new ArrayList<String>();
		for (Struct o : GetData()) {
			temp.add(o.GetType());
		}
		return temp;
	}
	
	// set methods main
	public void SetEntry(int choice) {
		Struct s = GetData_Var(choice);
		while (true) {
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			if (s.SE(input)) {
				break;
			} else {
				System.out.println("Invalid input");
			}
		}
	}


	/*
	private boolean CCInt(Struct o) {
		if (o instanceof SInt) {
			return true;
		} else {
			return false;
		}
	}

	private boolean CCDouble(Struct o) {
		if (o instanceof SDouble) {
			return true;
		} else {
			return false;
		}
	}

	private boolean CCString(Struct o) {
		if (o instanceof SString) {
			return true;
		} else {
			return false;
		}
	}
	*/
	// init methods
	private void Init_Data() {
		for (Struct o : List_Int) {
			this.ArrayData.add(o);
		} 
		for (Struct o : List_Double) {
			this.ArrayData.add(o);
		} 
		for (Struct o : List_Lifts) {
			this.ArrayData.add(o);
		} 
		for (Struct o : List_String) {
			this.ArrayData.add(o);
		}
	}
}

