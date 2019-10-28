public class test
{
	public static void main(String[] args) {
		// init data structs
		Data_DateDouble HeightTime = new Data_DateDouble("Height", "ft.");
		HeightTime.SetData_Entry(100);
		HeightTime.SetData_Entry(150);
		System.out.println(HeightTime.GetData());
	}
}
