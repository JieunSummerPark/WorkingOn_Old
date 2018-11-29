import javax.swing.*;


public class AdditionGameSwing_01 {

	public static void main(String[] args) {

		JFrame fungi = new JFrame();
		
		JButton boston = new JButton("Click");
		boston.setBounds(100, 100, 100, 40);

		fungi.add(boston);
		fungi.setSize(400,500);
		fungi.setLayout(null);	// Using no layout managers
		fungi.setVisible(true);	// Making the frame visible
	}

}
