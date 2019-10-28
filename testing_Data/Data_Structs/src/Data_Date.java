import java.util.ArrayList;
import java.util.Date;
abstract class Data_Date extends Data
{
	private ArrayList<Date> DateArray = new ArrayList<Date>();

	// constructor
	public Data_Date(String Type) {
		super(Type);
	}

	public Data_Date(String Type, String Units) {
		super(Type, Units);
	}
	// get methods
	public Date GetData_Date(int choice) {
		return this.DateArray.get(choice);
	}

	// set/add methods
	public void SetData_DateEntry() {
		Date today = new Date();
		this.DateArray.add(today);
	}
}
