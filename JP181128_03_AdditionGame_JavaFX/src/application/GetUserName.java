package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class GetUserName extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("GetUserName.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Calculation Game");
		primaryStage.setResizable(false);	// 크기 조절 설정 막기
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
