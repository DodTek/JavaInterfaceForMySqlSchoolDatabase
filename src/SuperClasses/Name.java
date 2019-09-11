package SuperClasses;

public class Name {
	String firstName;
	String secondName;
	String middleName;
	
	//constructor
	public Name(String fname,String mname,String sname) {
		firstName = fname;
		middleName = mname;
		secondName = sname;
	}
	
	//getters
	public String get_firstName() {
		return firstName;
	}
	
	public String get_middleName() {
		return middleName;
	}
	public String get_secondName() {
		return secondName;
	}
	
	
	
	//setters
	public void set_firstName(String fname) {
		firstName = fname ;
	}
	
	public void set_middleName(String mname) {
		middleName = mname ;
	}
	public void set_secondName(String sname) {
		secondName = sname;
	}
	
	
	
	public String toString() {
		String string = firstName + " ," + middleName + " ," + secondName ;
		return string;
	}
}
