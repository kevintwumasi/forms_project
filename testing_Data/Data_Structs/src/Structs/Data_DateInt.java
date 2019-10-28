import java.util.ArrayList;
public class Data_DateInt extends Data_Date
{
	private ArrayList<Integer> EntryArray = new ArrayList<Integer>();
	// constructor
	public Data_DateInt(String Type) {
		super(Type);
	}

	public Data_DateInt(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public int GetData_Entry(int choice) {
		return this.EntryArray.get(choice);
	}

	public String GetData_Line(int choice) {
		return (GetData_Date(choice) + "\t" + GetData_Entry(choice) + " " + GetData_Units() + "\n");
	}

	public String GetData() {
		int i;
		String ArrayStringed = "";
		for (i = 0; i < EntryArray.size(); ++i) {
			ArrayStringed += GetData_Line(i);
		}
		return ArrayStringed;
	}
	// set methods
	public void SetData_Entry(int Data_Entry) {
		this.EntryArray.add(Data_Entry);
		SetData_DateEntry();
	}
}
