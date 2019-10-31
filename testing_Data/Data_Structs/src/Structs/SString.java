abstract class SString extends Struct
{
	public SString(String Type, String Units) {
		super(Type, Units);
	}
	public SString(String o, String Type, String Units) {
		super(o, Type, Units);
	}
	protected boolean CC(Object o) {
		if (o instanceof String) {
			super.SetEntry(o);
			return true;
		} else {
			return false;
		}
	}
}
