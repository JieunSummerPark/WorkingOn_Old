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


public class LoanEvent_02 extends Application {

	
	private static TextField tfFirstName = new TextField();
	private static TextField tfLastName = new TextField();
	private static Button btCalculate = new Button("Calculate");

	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();

	public void start(Stage primaryStage) {

		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("First Name:"), 0, 0);
		gridPane.add(tfFirstName, 1, 0);
		gridPane.add(new Label("LastName:"), 0, 1);
		gridPane.add(tfLastName, 1, 1);
		gridPane.add(btCalculate, 2, 0);

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events
		btCalculate.setOnAction(e -> calculateLoanPayment());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoanCalculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	private void calculateLoanPayment() {
		// Get values from text fields
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		// Create a loan object. Loan defined in Listing 10.2

		/*
		Loan loan = new Loan(interest, year, loanAmount);

		// Display monthly payment and total payment
		tfMonthlyPayment.setText(String.format("$%.2f",
				loan.getMonthlyPayment()));
		tfTotalPayment.setText(String.format("$%.2f",
				loan.getTotalPayment()));
		 */
	}
}