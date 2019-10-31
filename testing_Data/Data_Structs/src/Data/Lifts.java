abstract class Lifts extends SInt
{
	Weight weight;
	public Lifts(String Type) {
		super(Type, "reps.");
		weight = new Weight();
	}
	public Lifts(int o, String Type) {
		super(o, Type, "reps.");
		weight = new Weight();
	}
	public Lifts(int o, double p, String Type) {
		super(o, Type, "reps.");
		weight = new Weight(p);
	}
	// get weight
	public double GetWeight() {
		return (double) weight.GetEntry();
	}
	public String GetWeightUnits() {
		return (String) weight.GetUnits();
	}
	// set weight
	protected void SetWeight(Object o) {
		weight.SetEntry(o);
	}
}
