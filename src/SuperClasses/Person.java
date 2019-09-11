package SuperClasses;

public class Person extends Name {
	private String email;
	private int phoneNumber;
	
	//constructor
	public Person(String firstName, String middleName, String secondName, String Email,int Tnumber) {
		super(firstName, middleName, secondName);
		email = Email;
		phoneNumber = Tnumber;
	}
	
	//getters
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
			return email;
		}
		public int get_number() {
			return phoneNumber;
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
			email = Email;
		}
		public void set_number(int Tnumber) {
			phoneNumber = Tnumber;
		}
	
		public String toString() {
			String string = super.toString() +  email + " ," + phoneNumber ;
			return string;
		}
}
