abstract class Lifts extends Data_Int
{
	private Weight weight = new Weight(0.0);
	public Lifts(String Type, int entry, double weight) {
		super(Type, "reps.");
		SetData_Entry(entry);
		SetLifts_Weight(weight);
	}
	// get methods
	public double GetLifts_Weight() {
		return weight.GetData_Entry();
	}
	// set methods
	public void SetLifts_Weight(double weight) {
		this.weight.SetData_Entry(weight);
	}
}
