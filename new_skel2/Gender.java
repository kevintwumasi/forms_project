import java.util.Scanner;

public class Gender extends Menu {
	private int Gender = 0;
	// 1 Male	2 Female
	// data mutator
	public int DetIsGender(String newGender) {
		switch (newGender) {
			case "M":
			case "m":	return 1;
			case "F":
			case "f":	return 2;
			default:	return 0;
		}
	}
	// set Gender
	private void SetGender(Scanner GenderScan, String TempString) {
		while (true) {
			TempString = GenderScan.nextLine();
			if (DetIsGender(TempString) != 0) {
				MessageInvalidEntry();
			} else {
				break;
			}
		}
	}
	public void SetGender_Input() {
		Scanner GenderScan = new Scanner(System.in);
		String TempString = "";
		SetGender(GenderScan, TempString);
	}
	// get Gender
	public String GetGender() {
		if (Gender == 1) {
			return "Male";
		} else if (Gender == 2) {
			return "Female";
		} else {
			return "NONE";
		}
	}
}
