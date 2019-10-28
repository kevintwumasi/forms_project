import java.util.ArrayList;
public class Data_DateString extends Data_Date
{
	private ArrayList<String> EntryArray = new EntryArray<String>();
	// constructor
	public Data_DateString(String Data_Type) {
		SetData_Type(Data_Type);
		SetData_New();
	}

	public Data_DateString(String Data_Type, String Data_Units) {
		SetData_Type(Data_Type);
		SetData_Units(Data_Units);
		SetData_New();
	}
	// get methods
	public String GetData_Entry(int choice) {
		return this.EntryArray.get(choice);
	}

	public String GetData_Line(int choice) {
		return (GetData_Date(choice) + "\t" GetData_Entry(choice) + " " + GetData_Units());
	}

	public String GetData() {
		int i;
		String ArrayStringed = "";
		for (i = 0; i < EntryArray.size(); ++i) {
			ArrayStringed += GetData_Line(choice);
		}
		return ArrayStringed;
	}

	public SetData_Entry(String Data_Entry) {
		this.EntryArray.add(Data_Entry);
		SetData_DateEntry();
	}
}
