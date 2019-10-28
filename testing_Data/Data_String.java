public class Data_String extends Data
{
	private String Data_Entry;
	// constructor
	public Data_String(String Data_Type) {
		SetData_Type(Data_Type);
		SetData_New();
	}

	public Data_String(String Data_Type, String Data_Units) {
		SetData_Type(Data_Type);
		SetData_Units(Data_Units);
		SetData_New();
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
