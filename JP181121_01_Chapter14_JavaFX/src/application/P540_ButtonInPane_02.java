package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class P540_ButtonInPane_02 extends Application {
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("OK");
		StackPane pane = new StackPane();
		pane.getChildren().add(btOK);
		Scene scene = new Scene(pane, 1000, 500);
		
		primaryStage.setTitle("Button in a pane");	// Set the stage title
		primaryStage.setScene(scene);	// Place the scene in the stage
		primaryStage.show();	// Display the stage
		
		Stage stage = new Stage();	// Create a new stage
		Button btNewStage = new Button("New Stage");
		StackPane pain = new StackPane();
		pain.getChildren().add(btNewStage);
		Scene seen = new Scene(pain, 500, 250);
		
		stage.setTitle("Second Stage");	// Set the stage title
		stage.setScene(seen);	// Set a scene with a button in the stage
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
