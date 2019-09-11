package Tabs;

import java.util.Random;

import Controllers.StudentListController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import subClasses.Student;

public class StudentTab extends Tab{

	 //-----------------------------------------------------------------
	   //  Sets up this panel with some buttons to show how grid
	   //  layout affects their position, shape, and size.
	   //-----------------------------------------------------------------
		private Stage window;


		private Scene scene, scene1;

		private TextField t1,t2,t3,t4,t5,t6,t7;
		private Button b1,b2,b3,b4,b5,b6;
		private Button back;
		private Button quit;
		private Button reset;
		static StudentListController Slc = new StudentListController();

	   public StudentTab()
	   {
		   setText("Student");
		  GridPane  gp = new GridPane();
		  
			//Inputs
		  	t1 = new TextField();
		  	t2 = new TextField();
		  	t3 = new TextField();
		  	t4 = new TextField();
		  	t5 = new TextField();
		  	t6 = new TextField();
		  	
		  	t1.setPromptText("First Name");
		  	t2.setPromptText("Middle Nmae");
		  	t3.setPromptText("Second Name");
		  	t4.setPromptText("email");
		  	t5.setPromptText("Phone Number");
		  	t6.setPromptText("Date of Birth");

		  	b1 = new Button("Add Student");
		  	b2 = new Button("List Students");
			back = new Button("Back");
			quit = new Button("Quit");
			reset = new Button("reset");
			
			
			//button actions
			b1.setOnAction( e -> AddStudent(t1, t2, t3, t4, t5, t6, t5.getText()));
			b2.setOnAction(e -> listx());
			quit.setOnAction( e -> closeButtonAction() );
			//reset.setOnAction( e ->  );
			
		
			//Layout
			gp.add(t1,1,0);
			gp.add(t2,1,1);
			gp.add(t3,1,2);
			gp.add(t4,1,3);
			gp.add(t5,1,4);
			gp.add(t6,1,5);
		  
			gp.add (b1,1,6);
			gp.add (b2,1,7);
		    gp.add (reset,1,8);
		    gp.add (quit,1,9);
		    gp.setAlignment(Pos.CENTER);
		    setContent(gp);
		
	   }


	//Validate age
	private void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) quit.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}

	private boolean AddStudent(TextField input,TextField input2,TextField input3,TextField input4,TextField input5,TextField input6, String message){
		try{
			String Fname = input.getText();
			String Mname = input2.getText();
			String Sname = input3.getText();
			String email = input4.getText();
			int tnum = Integer.parseInt(input5.getText());
			String dob = input6.getText();
			
			Slc.addStudentToList(Fname,Mname, Sname, email, tnum, dob);
				
			return true;
		}
		
	
		catch(NumberFormatException e){
			System.out.println("Error: " + message + " is not a number");
			return false;
		}
	  }
	
	private void listx() {
		Slc.list();
	}
	
	private void removeStudent() {
		//Slc
	}
	
	public static StudentListController displayList() {
		return Slc;
	}
}
