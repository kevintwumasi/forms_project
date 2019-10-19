import java.util.ArrayList;
import java.util.Scanner;

public class Data extends Menu
{
	final static private String MenuTitle = "This is the Data Input Area";
	private double nullVal = -1.0;
	// double values only
	private ArrayList<Double> Data_Input = new ArrayList<Double>();
	private ArrayList<String> Data_Input_Legend = new ArrayList<String>();

	// initialize data
	public Data() {
		Data_Input_Legend.add("Height");
		Data_Input_Legend.add("Weight");
		Data_Input_Legend.add("BF %");
		Data_Input_Legend.add("Activity");
		Data_Input_Legend.add("Steps");
		Data_Input_Legend.add("Resting BPM");
		Data_Input_Legend.add("Lifts");
		Data_Input_Legend.add("Bench");
		Data_Input_Legend.add("Deadlift");
		Data_Input_Legend.add("Squat");	
		SetMenuAll(MenuTitle, Data_Input_Legend);
		int i;
		for (i = 0; i < GetMenuRange() ; i++) {
			Data_Input.add(i, nullVal);
		}
	}

	// get data methods
	public double GetData_Input() {
		int choice = SelectMenu();
		if (SelectMenu_0(choice)) {
			System.out.println(Data_Input.get(choice) + " was extracted from " + choice);
			return Data_Input.get(choice);
		} else {
			return nullVal;
		}
	}

	public String GetAllData_Input() {
		String ArrayStringed = "";
		int i;
		for (i = 1; i < GetMenuRange(); i++) {
			ArrayStringed += "(" + i + ") " +
				this.Data_Input_Legend.get(i) +
				"\t" +
				this.Data_Input.get(i) + "\n";
		}
		System.out.println(ArrayStringed);
		return ArrayStringed;
	}
		
	// set data methods
	private boolean SetData_Signed(double newValue) {
		if (newValue > 0.0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean SetData(double newValue, int choice) {
		if (SetData_Signed(newValue)) {
			Data_Input.set(choice, newValue);
			System.out.println("You put " +
				newValue + " in " +
				Data_Input_Legend.get(choice));
			return true;
		} else {
			return MessageInvalidChoice();
		}
	}

	private void SetData_Scanner(int choice) {
		Scanner newData = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the new value for " +
				Data_Input_Legend.get(choice) + 
				" which currently has a value of " + 
				Data_Input.get(choice) + ".");
			double newValue = newData.nextDouble();
			if (SetData(newValue, choice)) {
				break;
			}
		}
	}

	public void SetData_Input() {
		int choice = SelectMenu();
		if (SelectMenu_0(choice)) {
			SetData_Scanner(choice);
		}
	}
}
