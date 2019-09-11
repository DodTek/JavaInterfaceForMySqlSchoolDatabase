package application;
	
import Tabs.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane mainPane = new BorderPane();
			Group root = new Group();
			Scene scene = new Scene(root,455,500);
			
		      TabPane tp = new TabPane();
		      tp.getTabs().add (new TeacherInfoTab());
		      tp.getTabs().add ( new StudentTab());
		    //  tp.getTabs().add ( new ClassGroupTab());
		      tp.getTabs().add(new ModuleTab());

		      tp.setStyle("-fx-border-color:gold");
		      
		      //tp.getGraphic().setStyle("-fx-text-fill: #c4d8de;");
			  mainPane.setCenter(tp);
			  
		      mainPane.prefHeightProperty().bind(scene.heightProperty());
		      mainPane.prefWidthProperty().bind(scene.widthProperty());
		      
		    root.getChildren().add(mainPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}