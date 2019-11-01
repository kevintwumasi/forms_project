//import java.util.Scanner;
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
	abstract boolean SE(Object o);
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
	// other
	abstract boolean CC(Object o);
	abstract boolean CT(Object o);
	protected boolean COT(Object o) {
		return true;
	}

	// large class condition types
	protected boolean IsPositive(double o) {
		if (o >= 0) {
			return true;
		} else {
			System.out.println("Value must be 0 or higher...");
			return false;
		}
	}
	protected boolean Is0_1(double o) {
		if (o >= 0 && o <= 1) {
			return true;
		} else {
			System.out.println("Value must be between 0 and 1...");
			return false;
		}
	}
	protected boolean IsNot0 (double o) {
		if (o != 0) {
			return true;
		} else {
			System.out.println("Value must not be 0...");
			return false;
		}
	}
}
