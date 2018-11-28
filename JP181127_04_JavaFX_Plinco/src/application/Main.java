package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Plinco_01_Intro.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Plinko");
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage = new Stage();	// Create a new stage
		stage.setTitle("Second Stage");	// Set the stage title
		stage.setScene(new Scene(new Button("New Stage"), 500, 250));	// Set a scene with a button in the stage
		stage.show();	// Display the stage
		
		stage.setResizable(true);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
