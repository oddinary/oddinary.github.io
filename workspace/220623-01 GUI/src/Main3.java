import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		
		setSize(500,500); // 상속 받았으니까 this는 생략해도 됨
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Main3 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);
	}
}
