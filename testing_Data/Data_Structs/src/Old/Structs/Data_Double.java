public class Data_Double extends Data
{
	private double Data_Entry;
	// constructor
	public Data_Double(String Type) {
		super(Type);
	}

	public Data_Double(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public double GetData_Entry() {
		return this.Data_Entry;
	}

	public String GetData() {
		return (GetData_Type() + "\t" + GetData_Entry() + " " + GetData_Units());
	}
	// set methods
	public void SetData_Entry(double Data_Entry) {
		this.Data_Entry = Data_Entry;
	}
}
