public class trackfitness
{
	// class variable instances
	private person targetperson = new person();
	private int test;
	private double stringtest;

	// class constructors
	public trackfitness() {
		;
	}
	// message functions
	public static void messageSM() {
		System.out.println("Test Track Fitness Menu the world " + getvalue1());
	}

	// sub menu loop
	public static int Msub() {
		messageSM();
		return -1;
	}

	// get methods
	public static int getvalue1() {
		return 1;
	}
	// set methods	
}
