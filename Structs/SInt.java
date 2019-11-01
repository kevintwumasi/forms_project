abstract class SInt extends Struct
{
	protected int heap;
	public SInt(String Type, String Units) {
		super(Type, Units);
	}
	public SInt(int o, String Type, String Units) {
		super(o, Type, Units);
	}
	protected boolean SE(Object o) { // class check
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	protected boolean CC(Object o) { // condition check
		return (IsPositive(heap));
	}
	protected boolean CT(Object o) { // type check
		try {
			this.heap = Integer.parseInt((String) o);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
