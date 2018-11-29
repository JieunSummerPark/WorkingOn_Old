package application;

import java.awt.Label;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DBN_01_WithoutSB extends Application {
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.setPrefSize(500, 200);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(40);
		
		Label label = new Label("Two Methodology");
//		label.setFont(new Font("Calibri",40));
		
		Button btn = new Button("Close");
		btn.setPrefWidth(80);
		btn.setOnAction(event->Platform.exit());
		
//		root.getChildren().add(label);
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("Hagisiro");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {

		launch(args);

	}

}
