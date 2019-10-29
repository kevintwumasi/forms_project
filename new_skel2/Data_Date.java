import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Data_Date extends Menu
{
	private String DataType = "Weight";
	private String MenuTitle = "This is the " + DataType + "/Date Class";
	private ArrayList<String> MenuContents = new ArrayList<String>(); // Dates
	private ArrayList<Double> DataArray = new ArrayList<Double>();

	public Data_Date(String DataTypeName) {
		SetData_RefreshMenu();
		DataArray.add(0.0);
		this.DataType = DataTypeName;
		System.out.println("Initializing Data_Date...\n");
	}
	public Data_Date() {
		SetData_RefreshMenu();
		DataArray.add(0.0);
		System.out.println("Init");
	}

	// getter methods
	private String GetData_Date(int choice) {
		return MenuContents.get(choice);
	}

	private double GetData(int choice) {
		return DataArray.get(choice);
	}

	private String GetData_toString(int choice) {
		return (GetData_Date(choice) + "\t" +
			GetData(choice));
	}

	public String GetAllData_Input() {
		SetData_RefreshMenu();
		String ArrayStringed = "";
		int i;
		for (i = 1; i < GetMenuRange(); i++) {
			ArrayStringed += this.GetData_toString(i) + "\n";
		}
		if (ArrayStringed.equals("")) {
			ArrayStringed = "Data has not be initialized...\n";
		}
		System.out.println(ArrayStringed);
		return ArrayStringed;
	}

	public String GetData_Input() {
		int choice = SelectMenu();
		if (SelectMenu_0(choice)) {
			System.out.println(GetData(choice) + " was extracted from " + choice);
			return GetData_toString(choice);
		} else {
			return "";
		}
	}

	// setter methods
	private boolean SetData_Signed(double newValue) {
		if (newValue > 0.0) {
			return true;
		} else {
			return false;
		}
	}

	private void SetData_Date() {
		Date today = new Date();
		String todayString = today.toString();
		MenuContents.add(todayString);
		System.out.println("Initialize Date, which is " + todayString + "\n");
	}

	private void SetData_Entry(double newValue) {
		DataArray.add(newValue);
		System.out.println("Added " + newValue + "\n");
	}

	private void SetData_RefreshMenu() {
		SetMenuAll(MenuTitle, MenuContents);
	}

	private boolean SetData(double newValue) {
		if (SetData_Signed(newValue)) {
			SetData_Date();
			SetData_Entry(newValue);
			SetData_RefreshMenu();
			return true;
		} else {
			return false;
		}
	}

	private void SetData_Scanner() {
		Scanner newData = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the new value for " +
					DataType + "\n");
			double newValue = newData.nextDouble();
			if (SetData(newValue)) {
				break;
			}
		}
	}

	public void SetData_Input() {
		SetData_Scanner();
	}
}
