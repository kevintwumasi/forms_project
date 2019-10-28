abstract class Data
{
	private String Data_Type;
	private String Data_Units = "";
	private boolean Data_New = true;

	// get methods
	public String GetData_Type() {
		return this.Data_Type;
	}

	public String GetData_Units() {
		return this.Data_Units;
	}

	abstract public String GetData();

	public boolean GetData_New() {
		return this.Data_New;
	}

	// set methods
	public void SetData_Type(String Data_Type) {
		this.Data_Type = Data_Type;
	}

	public void SetData_Units(String Data_Units) {
		this.Data_Units = Data_Units;
	}

	public void SetData_New() {
		this.Data_New = false;
	}
}

