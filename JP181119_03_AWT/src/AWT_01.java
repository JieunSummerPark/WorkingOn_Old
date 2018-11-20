import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.util.Random;

@SuppressWarnings("serial")
class MyFrame extends Frame{
	
	Label lbl_01 = new Label();
	Label lbl_02 = new Label("a label with nothing");
	Label lbl_03 = new Label("today is gonna be a good day");
	
	
	public MyFrame() {
		setTitle("Hey Window");
		setBounds(100,100,300,300);
		
		Random ran = new Random();
		
		int r = ran.nextInt(256);
		int g = ran.nextInt(256);
		int b = ran.nextInt(256);
		
		setBackground(Color.black);
		setBackground(new Color(r,g,b));
		
		//라벨 추가. add label
		
		add(lbl_02);
		add(lbl_03);
		
		setVisible(true);
	}
}


public class AWT_01 {
	public static void main(String[] args) {
		new MyFrame();	// 1회용 객체를 생성할 때. GUI에서는 1회용 객체를 주로 생성함.
						// MyFrame f1 = new MyFrame();
	}
}






/*
public class Plinko_AWT_01 {

	public static void main(String[] args) {
		
			

	}

}
*/