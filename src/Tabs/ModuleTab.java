package Tabs;

import java.util.Random;

import Controllers.StudentListController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import subClasses.Student;

public class ModuleTab extends Tab{

	 //-----------------------------------------------------------------
	   //  Sets up this panel with some buttons to show how grid
	   //  layout affects their position, shape, and size.
	   //-----------------------------------------------------------------
		private Stage window;


		private Scene scene, scene1;

		private TextField t1,t2,t3, t5,t6;
		private Button b1,b2,b3,b4,b5,b6;
		private Button back;
		private Button quit;
		private Button reset;
		private Label l1;
		private StudentListController Slc = StudentTab.displayList();

	   public ModuleTab()
	   {
		   setText("Student");
		  GridPane  gp = new GridPane();
		  
			//Inputs
		 	t1 = new TextField();
		  	t2 = new TextField();
		  	t3 = new TextField();
		  	t5 = new TextField();
		  	t6 = new TextField();
		  	
		  	t1.setPromptText("First Name");
		  	t2.setPromptText("Middle Name");
		  	t3.setPromptText("Second Name");
		  	t5.setPromptText("Grade");
		  	t6.setPromptText("Module Name");

		  	b1 = new Button("Add Module");
		  	b2 = new Button("List Students Info and Modules");
			back = new Button("Back");
			quit = new Button("Quit");
			reset = new Button("reset");
			
			l1 = new Label("Add Module");
			//button actions
			
			b1.setOnAction( e -> AddModuleToStudent(t1,t2,t3,t5, t6, t5.getText()));
			b2.setOnAction(e -> listx());
			quit.setOnAction( e -> closeButtonAction() );
			//reset.setOnAction( e ->  );
			
		
			//Layout
			gp.add(t1,1,0);
			gp.add(t2,1,1);
			gp.add(t3,1,2);
			gp.add(l1,1,4);
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

	private boolean AddModuleToStudent(TextField input,TextField input2,TextField input3,TextField input5,TextField input6,String message){
		try{
			String Fname = input.getText();
			String Mname = input2.getText();
			String Sname = input3.getText();
			int grade = Integer.parseInt(input5.getText());
			String name = input6.getText();
			
			Student c = Slc.getStudentByName(Fname, Sname, Mname);
			c.addToArray(1, name, grade);
			//Slc.addStudentToList(tnum, dob);
				
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
}
