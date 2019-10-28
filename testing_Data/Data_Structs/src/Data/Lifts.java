abstract class Lifts extends Data_Int
{
	Weight weight;
	public Lifts(String Type, int entry, double weight) {
		super(Type, "reps.");
		SetData_Entry(entry);
		this.weight = new Weight(weight);
	}
}
