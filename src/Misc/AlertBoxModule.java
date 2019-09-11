package Misc;

import java.util.List;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
/** * <h1>AlertBox</h1> 
The alert box class is used to display a list of cars for the gui 
*
* @author Donnchadh O'Donoghue
* @version 1.0
* @since 2019-03-26
*/
public class AlertBoxModule {

	/*
	* This constructor is used to make car objects  
	* @param title used to set the title
	* @param cars_array_list is used to set the values for the list view
    * @return Nothing. 
	*/
	public static void display(String title, StudentList sl ) {
	Stage window = new Stage();
	ListView<String> listView;
	
	//Block events to other windows
	window.initModality(Modality.APPLICATION_MODAL);
	window.setTitle(title);
	
	window.setMinWidth(350);
	//TextArea textArea = new TextArea();
	//textArea.setText(message);
	
	
	
	listView = new ListView<>();
	
	for (int i = 0; i < sl.getSize(); i++) {
		String message = "";
		message += (1+i)+": "+sl.getStudent(i);
		listView.getItems().addAll(message);
	}
	
	
	
	listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	
	Button closeButton = new Button("Close this window");
	closeButton.setOnAction(e -> window.close());
	
	VBox layout = new VBox(10);
	
	layout.getChildren().addAll(listView, closeButton);
	layout.setAlignment(Pos.CENTER);
	//Display window and wait for it to be closed before returning
	Scene scene = new Scene(layout);
	window.setScene(scene);
	window.showAndWait();
	}
}