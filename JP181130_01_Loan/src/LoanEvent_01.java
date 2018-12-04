import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanEvent_01 extends Application {

	private static TextField tfFirstName = new TextField();
	private static TextField tfLastName = new TextField();
	private static Button btCalculate = new Button("OK");

	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(tfName, 1, 0);

		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoanCalculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void calculateLoadPayment() {
		
		double interest = Double.parseDouble(tfUserName.getText());
		Labeled tfNumberOfYears;
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmount =
		Double.parseDouble(tfLoanAmount.getText());

	}
	
	public static void main(String[] args) {

	}

}