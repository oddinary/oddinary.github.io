import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);

		JTextArea ta = new JTextArea(20, 20);
		JScrollPane scrl = new JScrollPane(ta); // 스크롤 할 수 있는 창에 넣어야 스크롤을 할 수 있다.

		pnl.add(tf);
		pnl.add(pf);

		add(pnl);
		add(scrl, "South");

		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터누름");// 텍스트 필드는 엔터를 눌러도 액션을 인식한다.
				
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
			}

		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
