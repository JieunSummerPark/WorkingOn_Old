package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// 나중에 import java scene만 해보기

public class P540_ShowCircle extends Application {
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(300);
		circle.setCenterY(200);
		circle.setRadius(50);
		circle.setStroke(Color.PURPLE);
		circle.setFill(Color.YELLOW);

		// Create a pane to hole the circle
		Pane pane = new Pane();
		pane.getChildren().add(circle);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setTitle("ShowCircle");	// Set the stage Title
		primaryStage.setScene(scene);			// Place the scene in the stage
		primaryStage.show();					// Display the stage


	}

	/**
	 * The main method is only need for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */

	public static void main(String[] args) {
		Application.launch(args);
	}
}
