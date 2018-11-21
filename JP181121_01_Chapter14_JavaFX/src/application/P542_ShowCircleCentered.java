package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// 나중에 import java scene만 해보기

public class P542_ShowCircleCentered extends Application {
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {

		// Create a pane to hold the circle
		Pane painful = new Pane();


		// Create a circle and set its properties
		Circle melon = new Circle();
		melon.centerXProperty().bind(painful.widthProperty().divide(2));
		melon.centerYProperty().bind(painful.widthProperty().divide(2));
		/*
		circle.setCenterX(300);
		circle.setCenterY(200);
		 */
		melon.setRadius(50);
		melon.setStroke(Color.BLUE);
		melon.setFill(Color.YELLOW);

		// Add circle to the pane
		painful.getChildren().add(melon);



		// Create a scene and place it in the stage
		Scene scenery = new Scene(painful, 800, 300);
		primaryStage.setTitle("ShowCircleCentered");	// Set the stage Title
		primaryStage.setScene(scenery);					// Place the scene in the stage
		primaryStage.show();							// Display the stage


	}


	/**
	 * The main method is only need for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */

	public static void main(String[] args) {
		Application.launch(args);
	}
}
