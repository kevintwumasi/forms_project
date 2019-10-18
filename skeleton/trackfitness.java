public class trackfitness
{
	// class variable instances
	private person targetperson = new person();
	private int test;
	private double stringtest;

	// class constructors
	public trackfitness(person currentPerson) {
		targetperson = currentPerson;
	}
	// message functions
	public void messageSM() {
		System.out.println("Test Track Fitness Menu the world" + getvalue1());
	}

	// sub menu loop
	public static int Msub() {
		messageSM();
		return -1;
	}

	// get methods
	public int getvalue1() {
		return targetperson.getvalue1();
	}
	// set methods	
}
