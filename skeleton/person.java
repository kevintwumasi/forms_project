public class person
{
	private int value1;
	private int value2;

	private double dvalue1;
	private double dvalue2;

	// constructor
	public person() {
		;
	}
	// copy constructor
	public person(person oldperson) {
		;
	}
	// test message
	private static void messageTest(int choice) {
		System.out.println("Test message from beyond. This will alter " + choice);
	}
	// set methods
	public void setValue1(int newValue) {
		this.value1 = newValue;
	}

	// get methods
	public int getvalue1() {
		return 1;
	}
}
