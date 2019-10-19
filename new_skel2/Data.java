import java.util.ArrayList;
import java.util.Scanner;

public class Data
{
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
		Data_Input_Legend.add("(Cancel)");
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
	}

	// get methods
	public void GetData_Input_Legend() {
		String TempString = "";
		for (String i : Data_Input_Legend) {
			TempString += i + "\n";
		}
		System.out.println(TempString);
	}

	public double GetData_Input() {
		Scanner selection = new Scanner(System.in);
		while (true) {
			int choice = selection.nextInt();
			if ( choice >= 0 && choice <= Data_Input_Legend.size() ) {
				//System.out.println("You chose " + choice);
				return Data_Input.get(choice);
			} else {
				System.out.println("Invalid selection. Try again.");
			}

		}
	}
}
