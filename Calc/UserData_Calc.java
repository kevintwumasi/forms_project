import java.util.ArrayList;
public class UserData_Calc
{
	private Display_Caloric DC;
	private Basal_Metabolic BM;
	private FFMI FFMI;
	private VO2_Max VO2_Max;
	private BMI BMI;
	private Lifting_Stats LS;
	private Calc_Abstract[] List_Calc = {DC, BM, FFMI, BMI, VO2_Max, LS};
	private ArrayList<Calc_Abstract> ArrayCalc = new ArrayList<Calc_Abstract>();
	public UserData_Calc(UserData z) {
		DC = new Display_Caloric(z);
		BM = new Basal_Metabolic(z);
		FFMI = new FFMI(z);
		VO2_Max = new VO2_Max(z);
		BMI = new BMI(z);
		LS = new Lifting_Stats(z);
		//
		Init_Data();
	}
	// get methods
	public Object GetDC() {
		return DC.Result();
	}

	public Object GetBM() {
		return BM.Result();
	}

	public Object GetFFMI() {
		return FFMI.Result();
	}
	
	public Object GetVO2_Max() {
		return VO2_Max.Result();
	}

	public Object GetBMI() {
		return BMI.Result();
	}

	public Object GetLS() {
		return LS.Result();
	}

	private void Init_Data() {
		for (Calc_Abstract o : List_Calc) {
			this.ArrayCalc.add(o);
		}
	}
}
