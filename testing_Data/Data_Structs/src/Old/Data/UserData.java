import java.util.ArrayList;
public class UserData
{
	// default value
	private int DInt = -1;
	private double DDouble = -1.0;
	private String DString = "";
	// Data_Int
	private Steps i1 = new Steps(DInt);
	private Resting_BPM i2 = new Resting_BPM(DInt);
	private Data[] ListData_Int = {i1, i2};
	// Data_Double
	private Height d1 = new Height(DDouble);
	private Weight d2 = new Weight(DDouble);
	private BF d3 = new BF(DDouble);
	private Activity_Level d4 = new Activity_Level(DDouble);
	private Data[] ListData_Double = {d1, d2, d3, d4}; 
	// Data_Lifts
	private Benches l1 = new Benches(DInt, DDouble);
	private Deadlifts l2 = new Deadlifts(DInt, DDouble);
	private Squats l3 = new Squats(DInt, DDouble);
	private Data[] ListData_Lifts = {l1, l2, l3};
	// Data_String
	private Info s1 = new Info(DString);
	private Gender s2 = new Gender(DString);
	private Data[] ListData_String = {s1, s2};
	// full constructor
	private ArrayList<Data> DataArray = new ArrayList<Data>();
	// other
	private boolean User_New = false;
	// constructors
	public UserData() {
		Init_Data();
	}
	// get methods
	/*
	public int GetData_Entry(Data_Int o) {
		return o.GetData_Entry();
	}

	public double GetData_Entry(Data_Double o) {
		return o.GetData_Entry();
	}

	public String GetData_Entry(Data_String o) {
		return o.GetData_Entry();
	}

	public double GetLifts_Weight(Lifts o) {
		return o.GetLifts_Weight();
	}

	public int GetLifts_Entry(Lifts o) {
		return GetData_Entry(o);
	}
	*/
	public Data GetData_Entry(int choice) {
		return this.DataArray.get(choice);
	}

	public ArrayList<String> GetUserData_List() {
		ArrayList<String> temp = new ArrayList<String>();
		for (Data o : ListData_Int) {
			temp.add(o.GetData_Type());
		}
		for (Data o : ListData_Double) {
			temp.add(o.GetData_Type());
		}
		for (Data o : ListData_Lifts) {
			temp.add(o.GetData_Type());
		}
		for (Data o : ListData_String) {
			temp.add(o.GetData_Type());
		}
		return temp;
	}

	// init methods
	public void Init_Data() {
		for (Data o : ListData_Int) {
			this.DataArray.add(o);
		}
		for (Data o : ListData_Double) {
			this.DataArray.add(o);
		}
		for (Data o : ListData_Lifts) {
			this.DataArray.add(o);
		}
		for (Data o : ListData_String) {
			this.DataArray.add(o);
		}
	}

	// set methods
	/*
	protected void SetData_Entry(int choice, Object Data_Entry) {
		this.DataArray.set(choice, Data_Entry);
	}*/
	/*
	public void SetData_Entry(Data_Int o, int Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}

	public void SetData_Entry(Data_Double o, double Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}

	public void SetData_Entry(Data_String o, String Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}

	public void SetLifts_Weight(Lifts o, double weight) {
		o.SetLifts_Weight(weight);
	}
	// data filters
	*/
}
