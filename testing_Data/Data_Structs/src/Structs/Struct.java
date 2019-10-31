import java.util.Scanner;
abstract class Struct
{
	private Object Struct_Entry = null;
	private String Struct_Type = "";
	private String Struct_Units = "";
	private boolean Struct_Lock = false;
	// constructor
	public Struct(String Type, String Units) {
		SetType(Type);
		SetUnits(Units);
		SetLock();
	}
	public Struct(Object o, String Type, String Units) {
		SetEntry(o);
		SetType(Type);
		SetUnits(Units);
	}
	// get methods
	public Object GetEntry() {
		return this.Struct_Entry;
	}
	public String GetType() {
		return this.Struct_Type;
	}
	public String GetUnits() {
		return this.Struct_Units;
	}
	private boolean GetLock() {
		return this.Struct_Lock;
	}
	// set methods
	abstract boolean CC(Object o);
	protected void SetEntry(Object o) {
		this.Struct_Entry = o;
	}
	private void SetType(String Type) {
		if (!(GetLock())) {
			this.Struct_Type = Type;
		}
	}
	private void SetUnits(String Units) {
		if (!(GetLock())) {
			this.Struct_Units = Units;
		}
	}
	private void SetLock() {
		this.Struct_Lock = true;
	}
	// scanner methods
	/*
	public Object Scan_Input() {
		Scanner temp = new Scanner(System.in);
		return (temp.next());
	}
	// type checking
	public boolean TCInt(Object o) {
		if (o instanceof Integer) {
			return true;
		} else {
			return false;
		}
	}

	public boolean TCDouble(Object o) {
		if (o instanceof Double) {
			return true;
		} else {
			return false;
		}
	}

	public boolean TCString(Object o) {
		if (o instanceof String) {
			return true;
		} else {
			return false;
		}
	}
	// struct checking
	public boolean SCInt(Object o) {
		if (o instanceof SInt) {
			return true;
		} else {
			return false;
		}
	}

	public boolean SCDouble(Object o) {
		if (o instanceof SDouble) {
			return true;
		} else {
			return false;
		}
	}

	public boolean SCString(Object o) {
		if (o instanceof SString) {
			return true;
		} else {
			return false;
		}
	}

	public boolean SCLifts(Object o) {
		if (o instanceof Lifts) {
			return true;
		} else {
			return false;
		}
	}
	*/
}
