public class Gender extends SString
{
	public Gender() {
		super("Gender", "");
	}
	public Gender(String o) {
		super(o, "Gender", "");
	}
	// main body check
	protected boolean COT(Object o) {
		return G1(o);
	}
	// additional body check
	private boolean G1(Object o) {
		if (heap.equals("M") ||
				heap.equals("F") ||
				heap.equals("m") ||
				heap.equals("f") 
		   ) {
			return true;
		   } else {
			   return false;
		   }
	}

}
