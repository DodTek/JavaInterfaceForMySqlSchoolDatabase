package Lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import subClasses.Teacher;

public class TeacherList {
	private ArrayList <Teacher> teachers  ;
	
	public TeacherList (){
		teachers = new ArrayList <Teacher> ();
	 }
	
	 public ArrayList <Teacher> getList (){
	     return teachers;
	 }
	 
	public void addTeacher(Teacher c){
	teachers.add(c);
	}
	
	public void remTeacher(int i){
		if ((i>-1) && (i < teachers.size())) {
			teachers.remove(i);
		}
	}
	
	public void remTeacherByName(String name){
		for (int i = 0 ; i< teachers.size(); i++) {
			if ( getTeacher(i).get_firstName().equals(name)) {
				teachers.remove(i);
			}
		}
	}
	
	public Teacher getTeacher(int i){
		if ((i>-1) && (i < teachers.size())) {
			return teachers.get (i);
		}
		return null;
	}
	
	public String getTeacher2(int i){
		if ((i>-1) && (i < teachers.size())) {
			return teachers.get(i).get_firstName() + " "+  teachers.get(i).get_middleName() + " " +  teachers.get(i).get_secondName() +"\n";
		}
		return null;
	}
	
	public int getSize (){
		return teachers.size();
	}
	
	//public void sortN(){Collections.sort(students);}
	
	public void deserilaise(){
		try{
			FileInputStream fis = new FileInputStream("teacher.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			teachers = (ArrayList<Teacher>) ois.readObject();
			ois.close();
		}
		
		catch (FileNotFoundException e){
			System.out.println("file not found");
		}
		
		catch (IOException e){
		    System.out.println("file not found");
		}
		
		catch (ClassNotFoundException e){
		    System.out.println("file not found");
		}
	}
	public void serilaise(){
		try{
			
			FileOutputStream fos = new FileOutputStream("teacher.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			        oos.writeObject(teachers);
			        oos.close();
		}
		
		catch (FileNotFoundException e){
				System.out.println("file not found");
		}
		
		catch (IOException e){
		    	System.out.println("file not found");
		}
	}
}