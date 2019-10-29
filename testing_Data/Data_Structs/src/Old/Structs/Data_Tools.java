import java.util.Scanner;
import java.util.ArrayList;
public class Data_Tools
{
	private UserData m;
	// constructor
	public Data_Tools(UserData m) { 
		this.m = m;
	}
	// data level get
	/*
	public Object GetData_Entry(int choice) {
		Data temp = m.GetData_Entry(choice);
		switch (DetData_Type(temp)) {
			case 1:	Data_Int a = (Data_Int) temp;
				int ar = (int) a.GetData_Entry();
				return ar;
			case 2:	Data_Double b = (Data_Double) temp;
				double br = (double) b.GetData_Entry();
				return br;
			case 3:	Lifts c = (Lifts) temp;
				//
				return null;
			case 4:	Data_String d = (Data_String) temp;
				String dr = (String) d.GetData_Entry();
				return dr;
			default:	return null;
		}
	}
	*/
	public Object GetData_Entry(int choice) {
		Data temp = m.GetData_Entry(choice);
		if (BelongData_Type(temp)) {
			Object entry = temp.GetData_Entry();
			return Cast_Type(entry);
		} else {
			return null;
		}
	}


	public String GetData_Units(int choice) {
		Data temp = m.GetData_Entry(choice);
		return temp.GetData_Units();
	}

	public String GetData_Type(int choice) {
		Data temp = m.GetData_Entry(choice);
		return temp.GetData_Type();
	}

	/*
	int GetData_Entry(Data_Int data) {
		return data.GetData_Entry();
	}

	double GetData_Entry(Data_Double data) {
		return data.GetData_Entry();
	}

	String GetData_Entry(Data_String data) {
		return data.GetData_Entry();
	}
	*/
	// data level set
	/*
	void SetData_Entry(Data_Int o, int Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}
	void SetData_Entry(Data_Double o, double Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}
	void SetData_Entry(Data_String o, String Data_Entry) {
		o.SetData_Entry(Data_Entry);
	}
	*/
	public void SetData_Entry(int choice, Object Data_Entry) {
		Data temp = m.GetData_Entry(choice);
		switch (DetData_Type(temp)) {
			case 1:	int ae = (int) Data_Entry;
				Data_Int a = (Data_Int) temp;
				a.SetData_Entry(ae);
				break;
			case 2:	double be = (double) Data_Entry;
				Data_Double b = (Data_Double) temp;
				b.SetData_Entry(be);
				break;
			case 3:	Lifts c = (Lifts) temp;
				// need to implement some thing else...
				break;
			case 4:	String de = (String) Data_Entry;
				Data_String d = (Data_String) temp;
				d.SetData_Entry(de);
				break;
			default:	break;
		}

	}
	// not need to implement SetData_Type and SetData_Units because they're fixed...
	// type casting
	public Object CastData_Type(Object o) {
		if (o instanceof Data_Int) {
			return (Data_Int) o;
		} else if (o instanceof Data_Double) {
			return (Data_Double) o;
		} else if (o instanceof Lifts) {
			return (Lifts) o;
		} else if (o instanceof Data_String) {
			return (Data_String) o;
		} else {
			return (Data) null;
		}
	}

	public int DetData_Type(Object o) {
		if (o instanceof Data_Int) {
			return 1;
		} else if (o instanceof Data_Double) {
			return 2;
		} else if (o instanceof Lifts) {
			return 3;
		} else if (o instanceof Data_String) {
			return 4;
		} else {
			return 0;
		}
	}
	public boolean BelongData_Type(Object o) {
		if (o instanceof Data_Int ||
				o instanceof Data_Double ||
				o instanceof Lifts ||
				o instanceof Data_String ) {
			return true;
		} else {
			return false;
		}
	}

	public Object Cast_Type(Object o) {
		if (o instanceof Integer) {
			return (int) o;
		} else if (o instanceof Double) {
			return (double) o;
		} else if (o instanceof String) {
			return (String) o;
		} else {
			return null;
		}
	}
	// scanner methods
	public Object Scan_Input() {
		Scanner temp = new Scanner(System.in);
		Object indata = temp.next("\n");
		Object redata = CastData_Type(indata);
		if ((Data) redata != null) {
			return redata;
		} else {
			return null;
		}
	}

	
}
