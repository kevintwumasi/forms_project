public class STools {
	private Struct s;
	// constructor
	public STools(Struct s) {
		this.s = s;
	}
	// id
	public String DetType() {
		if (this.s instanceof SInt) {
			return "This is an integer";
		} else {
			return "Unidentifiable";
		}
	}
}
