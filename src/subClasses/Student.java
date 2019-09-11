package subClasses;
import School.Module_Grade;
import SuperClasses.Person;


public class Student extends Person{
	String dob;
	Module_Grade[] modules;
	
	public Student(String fname,String sname,String mname,String email, int Tnumber, String dobz) {
		super(fname, mname, sname, email, Tnumber);
		dob = dobz;
		modules = new Module_Grade[6];
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
	public String get_dob() {
		return dob;
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
	public void set_dob(String db) {
		dob = db;
	}
	
	//add
	public void addToArray(int i, String name,int grade) {
		modules[i] = new Module_Grade(name, grade);
	}
	
	public String toString() {
		String string = super.toString() +  dob + " ,";
		for(int i = 0; i<modules.length;i++) {
			string += modules[i];
		}
		return string;
	}
}

