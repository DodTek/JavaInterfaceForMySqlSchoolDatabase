package School;

public class Module_Grade {
	private String moduleName;
	private int grade;
	
	public Module_Grade(String name, int grde) {
		moduleName = name;
		grade = grde;
	}
	
	//setters
	public void setgrade(int grde) {
		grade = grde;
	}
	public void setModuleName(String name) {
		moduleName = name;
	}
	
	//getters
		public int getgrade() {
			return grade;
		}
		public String getModuleName() {
			return moduleName;
		}
}
