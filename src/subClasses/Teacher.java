package subClasses;
import SuperClasses.Person;

public class Teacher extends Person {
	String degree;
	
	public Teacher(String fname,String sname,String mname,String email, int Tnumber, String dgree) {
		super(fname, mname, sname, email, Tnumber);
		degree = dgree;
	}
	
	public String get_firstName() {
		return super.get_firstName();
	}
	
	public String get_middleName() {
		return super.get_middleName();
	}
	public String get_secondName() {
		return super.get_secondName();
	}
	public String get_email() {
		return super.get_email();
	}
	public int get_number() {
		return super.get_number();
	}
	public String get_degree() {
		return degree;
	}
	
	
	//setters
	public void set_firstName(String fname) {
		super.set_firstName(fname);
	}
	
	public void set_middleName(String mname) {
		super.set_middleName(mname);
	}
	public void set_secondName(String sname) {
		super.set_secondName(sname);
	}
	public void set_email(String Email) {
		super.set_email(Email);
	}
	public void set_number(int Tnumber) {
		super.set_number(Tnumber);
	}
	public void set_degree(String dgree) {
		degree = dgree;
	}
}
