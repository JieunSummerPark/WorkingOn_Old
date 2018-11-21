package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class P540_ButtonInPane_01 extends Application {
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));		
		Scene scene = new Scene(pane, 1000, 500);
		
		primaryStage.setTitle("Button in a pane");	// Set the stage title
		primaryStage.setScene(scene);	// Place the scene in the stage
		primaryStage.show();	// Display the stage
		
		Stage stage = new Stage();	// Create a new stage
		stage.setTitle("Second Stage");	// Set the stage title
		stage.setScene(new Scene(new Button("New Stage"), 500, 250));	// Set a scene with a button in the stage
		stage.show();	// Display the stage
		
		stage.setResizable(true);
	}
	
	/**
	 * The main method is only need for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
