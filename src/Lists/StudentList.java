package Lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import subClasses.Student;

public class StudentList {
	private ArrayList <Student> students  ;
	
	public StudentList (){
		students = new ArrayList <Student> ();
	 }
	
	 public ArrayList <Student> getList (){
	     return students;
	 }
	 
	public void addStudent(Student c){
	students.add(c);
	}
	
	public void remStudent(int i){
		if ((i>-1) && (i < students.size())) {
			students.remove(i);
		}
	}
	
	public void remStudentByName(String name){
		for (int i = 0 ; i< students.size(); i++) {
			if ( getStudent(i).get_firstName().equals(name)) {
				students.remove(i);
			}
		}
	}
	
	public Student getStudent(int i){
		if ((i>-1) && (i < students.size())) {
			return students.get (i);
		}
		return null;
	}
	
	public Student getStudentByName(String name, String Sname, String Mname){
		Student x = new Student(null,null,null,null,0,null);
		for (int i = 0 ; i< students.size(); i++) {
			if ( getStudent(i).get_firstName().equals(name) &&  getStudent(i).get_secondName().equals(Sname) && getStudent(i).get_secondName().equals(Mname)) {
				x = students.get(i);
			}
		}
		return x;
	}
	
	public String getStudent2(int i){
		if ((i>-1) && (i < students.size())) {
			return students.get(i).get_firstName() + " "+  students.get(i).get_middleName() + " " +  students.get(i).get_secondName() +"\n";
		}
		return null;
	}
	
	public int getSize (){
		return students.size();
	}
	
	//public void sortN(){Collections.sort(students);}
	
	public void deserilaise(){
		try{
			FileInputStream fis = new FileInputStream("test.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			students = (ArrayList<Student>) ois.readObject();
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
			
			FileOutputStream fos = new FileOutputStream("test.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			        oos.writeObject(students);
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