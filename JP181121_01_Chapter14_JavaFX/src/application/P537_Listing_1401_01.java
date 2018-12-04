package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class P537_Listing_1401_01 extends Application {
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("what is " + additionGame.number1 +
				" + " + additionGame.number2 + "?");
		Scene scene = new Scene(btOK, 200, 200);
		primaryStage.setTitle("Listing_14.1");	// Set the stage title
		primaryStage.setScene(scene);	// Place the scene in the stage
		primaryStage.show();	// Display the stage
	}
	
	/**
	 * The main method is only need for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
