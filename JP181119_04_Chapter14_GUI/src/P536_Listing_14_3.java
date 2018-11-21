import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class P536_Listing_14_3 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("P536_Listing_14_3");	// Set stage title
		primaryStage.setScene(scene);				// Place the scene in the stage
		
		
	}

	
	public static void main(String[] args) {
		
	}

}
