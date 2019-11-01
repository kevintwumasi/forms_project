public class UserData_Tools {
	private UserData z;
	public UserData_Tools(UserData z) {
		this.z = z;
	}
	// get methods direct 
	public Object Get(String target) {
		Object obj = new Object();
		int i = SearchData_Type(target);
		if (BoolData_Type(i)) {
			obj = z.GetData_Entry(i);
		}
		return obj;
	}
	public String GetType(String target) {
		String type = "";
		int i = SearchData_Type(target);
		if (BoolData_Type(i)) {
			type = z.GetData_Type(i);
		}
		return type;
	}

	public String GetUnits(String target) {
		String units = "";
		int i = SearchData_Type(target);
		if (BoolData_Type(i)) {
			units = z.GetData_Units(i);
		}
		return units;
	}
	// get methods interactive
	public Object Get_Interactive(String target) {
		return Get(target);
	}	
	public String GetType_Interactive(int i) {
		String type = "";
		if (BoolData_Type(i)) {
			type = z.GetData_Type(i);
		}
		return type;
	}
	public String GetUnits_Interactive(String target) {
		return GetUnits(target);
	}

	// set methods
	public void Set(String target, Object value) {
		int i = SearchData_Type(target);
		String temp = value.toString();
		if (z.SetEntry_Direct(i, temp)) {
			System.out.println("Task succeeded, the value of " +
					target + " is " +
					Get(target));
		} else {
			System.out.println("Unable to set " + target + " with " +
					temp + ".");
		}
	}
	
	public void Set_Interactive(String target) {
		int i = SearchData_Type(target);
		z.SetEntry(i);
	}

	// search function
	private int SearchData_Type(String target) {
		int value = -1;
		int i;
		for (i = 0; i < z.GetData().size(); i++) {
			String compare;
			compare = z.GetData_Type(i);
			if (compare.equals(target)) {
				value = i;
				break;
			}
		}
		return value;
	}
	private boolean BoolData_Type(int i) {
		if (i >= 0 && i <= z.GetData().size()) {
			return true;
		} else {
			return false;
		}
	}
}
