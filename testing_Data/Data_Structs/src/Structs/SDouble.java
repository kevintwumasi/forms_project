abstract class SDouble extends Struct
{
	private double heap;
	public SDouble(String Type, String Units) {
		super(Type, Units);
	}
	public SDouble(double o, String Type, String Units) {
		super(o, Type, Units);
	}
	protected boolean SE(Object o) {
		if (CT(o) && CC(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	protected boolean CC(Object o) {
		return (CT(o) && IsPositive(heap));
	}
	protected boolean CT(Object o) {
		try {
			this.heap = Double.parseDouble((String) o);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
