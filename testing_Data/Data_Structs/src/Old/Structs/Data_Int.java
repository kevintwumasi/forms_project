public class Data_Int extends Data
{
	private int Data_Entry;
	// constructor
	public Data_Int(String Type) {
		super(Type);
	}

	public Data_Int(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public int GetData_Entry() {
		return this.Data_Entry;
	}

	public String GetData() {
		return (GetData_Type() + "\t" + GetData_Entry() + " " + GetData_Units());
	}
	// set methods
	public void SetData_Entry(int Data_Entry) {
		this.Data_Entry = Data_Entry;
	}
}
