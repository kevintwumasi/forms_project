public class Data_Struct
{
	private String Data_Struct_String = "";
	private double Data_Struct_Value = -1.0;
	public Data_Struct() {
		;
	}
	// set methods
	public void SetData_Struct(String StringVal, double DoubleVal) {
		this.Data_Struct_String = StringVal;
		this.Data_Struct_Value = DoubleVal;
	}
	// get methods
	public String GetData_Struct_String() {
		return this.Data_Struct_String;
	}

	public double GetData_Struct_Value() {
		return this.Data_Struct_Value;
	}
}
