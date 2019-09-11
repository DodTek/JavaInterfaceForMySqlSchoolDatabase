package Controllers;

import Lists.StudentList;
import Misc.AlertBoxStudent;
import subClasses.Student;

public class StudentListController {

	private StudentList sl;
	
	public StudentListController(){
		sl = new StudentList();
	}
	
	public void addStudentToList(String fname,String mname,String sname,String email, int Tnumber, String dobz){
		//int no = Integer.parseInt(id);
		Student p = new Student(fname,mname,sname,email,Tnumber,dobz);
		sl.addStudent(p);
	}
	
	public String getListPerson(){
		String allPeople="\0";
		
		for(int i = 0;i<sl.getSize();i++)
		{ 
		    allPeople = allPeople+sl.getStudent2(i);
		}
		return allPeople;
	}
	
	public Student getStudentByName(String name,String Sname,String Mname) {
		return sl.getStudentByName(name, Sname, Mname);
	}
	
	public void list() {
		AlertBoxStudent.display("StudentList", sl);
	}
	
	public void load(){
		sl.deserilaise();
	}
	
	public void save(){
		sl.serilaise();
	}
	
	
	//public void sort(){
		//pl.sortN();
	//}
}
