import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setBackground(new Color(250,232,162));
		
		JButton button = new JButton("버튼");
		JButton button2 = new JButton("버튼2");

		
		setLayout(new FlowLayout());
		add(button);
		add(button2);
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
