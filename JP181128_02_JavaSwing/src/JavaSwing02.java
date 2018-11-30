/**
 * https://www.javatpoint.com/java-swing
 * 
 * Example of Swing by Association inside constructor
 * 
 * We can also write all the codes of creating JFrame, JButton and method call
 * inside the java constructor.
 */

import javax.swing.*;

public class JavaSwing02 extends JFrame {
	
	JFrame fungi;
	JavaSwing02(){
		JButton boston = new JButton("Click");
		boston.setBounds(130, 100, 100, 40);
		
		add(boston);
		setSize(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		new JavaSwing02();

	}

}
