abstract class Data
{
	private String Data_Type;
	private String Data_Units = "";
	private Object Data_Entry;
	private boolean Data_New = true;

	// constructor
	public Data(String Type) {
		SetData_Type(Type);
		SetData_New();
	}

	public Data(String Type, String Units) {
		SetData_Type(Type);
		SetData_Units(Units);
		SetData_New();
	}

	// get methods
	public String GetData_Type() {
		return this.Data_Type;
	}

	public String GetData_Units() {
		return this.Data_Units;
	}

	abstract public Object GetData_Entry() {
		return this.Data_Entry;
	}

	abstract public String GetData();

	public boolean GetData_New() {
		return this.Data_New;
	}

	// set methods
	public void SetData_Type(String Type) {
		this.Data_Type = Type;
	}

	public void SetData_Units(String Units) {
		this.Data_Units = Units;
	}

	public void SetData_New() {
		this.Data_New = false;
	}
}

