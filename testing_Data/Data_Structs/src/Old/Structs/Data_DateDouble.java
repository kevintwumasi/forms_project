import java.util.ArrayList;
public class Data_DateDouble extends Data_Date
{
	private ArrayList<Double> EntryArray = new ArrayList<Double>();
	// constructor
	public Data_DateDouble(String Type) {
		super(Type);
	}

	public Data_DateDouble(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public double GetData_Entry(int choice) {
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
	public void SetData_Entry(double Data_Entry) {
		this.EntryArray.add(Data_Entry);
		SetData_DateEntry();
	}
}
