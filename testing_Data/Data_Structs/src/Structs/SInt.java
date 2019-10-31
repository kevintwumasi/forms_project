abstract class SInt extends Struct
{
	public SInt(String Type, String Units) {
		super(Type, Units);
	}
	public SInt(int o, String Type, String Units) {
		super(o, Type, Units);
	}
	protected boolean CC(Object o) { // class check
		if (o instanceof Integer) {
			super.SetEntry(o);
			return true;
		} else {
			return false;
		}
	}
}
