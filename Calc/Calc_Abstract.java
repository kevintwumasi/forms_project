abstract class Calc_Abstract extends Struct
{
	private UserData_Tools x;
	protected Object heap;
	public Calc_Abstract(UserData z, String type, String units) {
		super(type, units);
		this.x = new UserData_Tools(z);
	}

	public Object Result() {
		return GetEntry();
	}

	abstract Object Method(UserData_Tools use);

	private void Calc() {
		UserData_Tools use = this.x;
		SE(Method(use));
	}

	public boolean SE(Object o) {
		if (CT(o) && CC(o) && COT(o)) {
			super.SetEntry(this.heap);
			return true;
		} else {
			return false;
		}
	}
	protected boolean CC(Object o) {
		return true;
	}

	protected boolean CT(Object o) {
		try {
			this.heap = o;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
