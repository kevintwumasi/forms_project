import java.util.ArrayList;
import java.util.Scanner;

public class Data extends Menu
{
	final static private String MenuTitle = "This is the Data Input Area";
	private double nullVal = -1.0;
	// double values only
	private ArrayList<Double> Data_Input = new ArrayList<Double>();
	//private ArrayList<Data_Struct> Data_Output = new ArrayList<Data_Struct>();

	// legend
	// input:	0 Gender	1 Height
	// 2 Weight	3 BF %		4 Activity
	private ArrayList<String> Data_Input_Legend = new ArrayList<String>();
	// output:	5 Steps		6 Resting BPM
	// 7 Lifts	8 Bench		9 Deadlift

	// initialize data
	public Data() {
		Data_Input_Legend.add("Gender");
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
		/*
		String TempString = "";
		for (String i : Data_Input_Legend) {
			TempString += i + "\n";
		}
		System.out.println(TempString);
		*/
		int i;
		for (i = 0; i < Data_Input_Legend.size(); i++) {
			Data_Input.add(i, nullVal);
			//System.out.println("Added " + Data_Input_Legend.get(i) +
			//		" with " + Data_Input.get(i));
		}
		SetMenuAll(MenuTitle, Data_Input_Legend);
	}

	// wrapper methods
	private boolean Data_Input_DetSize(int choice) {
		if ( choice >= 0 && choice < Data_Input_Legend.size()
				&& Data_Input_Legend.size() == 
				Data_Input.size() ) {
			return true;
		} else if (Data_Input_Legend.size() != Data_Input.size()) {
			System.out.println("System error! Check the code for" + 
					" any bugs!");
			return false; // add break out of the program entirely
		} else {
			return false;
		}
	}
	private boolean Data_Input_Signed(double testvalue) {
		if (testvalue >= 0) {
			return true;
		} else {
			System.out.println("This system only accepts values in doubles.");
			return false;
		}
	}

	// get methods
	public void GetData_Input_Legend() {
		GetMenu();
	}

	public double GetData_Input() {
		Scanner selection = new Scanner(System.in);
		while (true) {
			int choice = selection.nextInt();
			if ( Data_Input_DetSize(choice) ) {
				//System.out.println("You chose " + choice);
				return Data_Input.get(choice);
			} else {
				System.out.println("Invalid selection. Try again.");
			}

		}
	}

	// set methods
	public void SetData_Input() {
		Scanner selection = new Scanner(System.in);
		Scanner newData = new Scanner(System.in);
		while (true) {
			System.out.println("Enter an option to set");
			int choice = selection.nextInt();
			if (Data_Input_DetSize(choice)) {
				double newValue = newData.nextDouble();
				if (Data_Input_Signed(newValue)) {
					Data_Input.set(choice, newValue);
					System.out.println("You put " +
							newValue + " in " +
							Data_Input_Legend.get(choice)
							);
					break;
				}
			} else {
				System.out.println("Invalid selection. Try again.");
			}
		}
	}
}
