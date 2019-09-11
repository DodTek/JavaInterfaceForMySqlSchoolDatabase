package Controllers;


import Lists.TeacherList;

import Misc.AlertBoxTeacherList;
import subClasses.Teacher;

public class TeacherListController {

	private TeacherList tl;
	
	public TeacherListController(){
		tl = new TeacherList();
	}
	
	public void addTeacherToList(String fname,String sname,String mname,String email, int Tnumber, String dgree){
		
		Teacher p = new Teacher(fname,sname,mname,email,Tnumber,dgree);
		tl.addTeacher(p);
	}
	
	public String getListPerson(){
		String allPeople="\0";
		
		for(int i = 0;i<tl.getSize();i++)
		{ 
		    allPeople = allPeople+tl.getTeacher2(i);
		}
		return allPeople;
	}
	
	public void list() {
		AlertBoxTeacherList.display("TeacherList", tl);
	}
	
	public void load(){
		tl.deserilaise();
	}
	
	public void save(){
		tl.serilaise();
	}
	
	//public void sort(){
		//pl.sortN();
	//}
}
