public class Data_String extends Data
{
	private String Data_Entry;
	// constructor
	public Data_String(String Type) {
		super(Type);
	}

	public Data_String(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public String GetData_Entry() {
		return this.Data_Entry;
	}

	public String GetData() {
		return (GetData_Type() + "\t" + GetData_Entry() + " " + GetData_Units());
	}
	// set methods
	public void SetData_Entry(String Data_Entry) {
		this.Data_Entry = Data_Entry;
	}
}
