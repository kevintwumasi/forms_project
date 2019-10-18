public class homescreen
{
	// init classes
	private person thisperson = new person();
	private trackfitness mainTrack = new trackfitness(thisperson);
	private viewinsights mainInsights = new viewinsights(thisperson);

	// message functions
	private static void messageWelcome() {
		System.out.println("Welcome to HEALTH AND FITNESS APP (HFA) V0.1\n");
	}

	private static void messageMenu() {
		System.out.println("Select an option\n" + "(1) Track Fitness\n" + "(2) View Insights\n" + " :");
	}

	// execute subclasses
	private static int toTrackFitness() {
		return mainTrack.Msub();
	}

	private static int toViewInsights() {
		return mainInsights.Msub();
	}
	
	// menu loop
	private static void Mmain() {
		;
	}

	public static void main(String[] args) {
		messageWelcome();
		toTrackFitness();
		//toViewInsights();
	}
}
