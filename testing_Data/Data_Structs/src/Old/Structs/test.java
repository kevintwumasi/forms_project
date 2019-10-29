public class test
{
	public static void main(String[] args) {
		UserData z = new UserData();
		Data_Tools x = new Data_Tools(z);
		x.SetData_Entry(0, 10);
		System.out.println(x.GetData_Entry(0));
	}

}
