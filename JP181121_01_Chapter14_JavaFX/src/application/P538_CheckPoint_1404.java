package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class P538_CheckPoint_1404 extends Application {
	public void Test() {
		System.out.println("The constructor is invoked");
	}
	@Override	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		System.out.println("start method is invoked");
	}
	
	public static void main(String[] args) {
		System.out.println("launch application");
		Application.launch(args);
	}
}
