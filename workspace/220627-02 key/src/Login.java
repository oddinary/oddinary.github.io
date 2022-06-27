import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;

import javax.swing.*;

// 가입을 해서 로그인이 가능하게 만들자 (아이디, 비밀번호, 비밀번호 확인)
// 로그인 해서 확인 결과가 나오게 해보자
// ---------------------------------------------------------
// 아이디와 비밀번호 입력길이를 지정해서 만들게 해보자 
// 이미 등록된 아이디는 등록이 안되게 만들어 보자
public class Login extends JFrame {

	public Login() {
		super("퀴즈퀴즈 로그인");
		Info i = new Info("aaaa", "1q2w3e4r");
		HashMap<String, Info> map = new HashMap<>();
		map.put("aaaa", i);
		
		JPanel pnl = new JPanel();
		JPanel pnlall = new JPanel();
		JPanel pnltf = new JPanel();
		JPanel pnlbtn = new JPanel();
		JLabel lblID = new JLabel("아이디 (기본 아이디 : aaaa)");
		JTextField tf = new JTextField(10);
		JLabel lblPassword = new JLabel("비밀번호 (기본 비밀번호 : 1q2w3e4r)");
		JPasswordField pf = new JPasswordField(10);
		JButton btnIn = new JButton("로그인");
		JButton btnUp = new JButton("회원가입");

		BoxLayout boxpnl = new BoxLayout(pnlall, BoxLayout.Y_AXIS);
		BoxLayout boxtf = new BoxLayout(pnltf, BoxLayout.Y_AXIS);
		BoxLayout boxbtn = new BoxLayout(pnlbtn, BoxLayout.X_AXIS);

		pnltf.setLayout(boxtf);
		pnlbtn.setLayout(boxbtn);
		pnlall.setLayout(boxpnl);

		btnIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (!pf.getText().equals(map.get(tf.getText()).getPassword()))
						JOptionPane.showMessageDialog(Login.this, "비밀번호가 다릅니다.");
					else if (!tf.getText().equals(map.get(tf.getText()).getID()))
						JOptionPane.showMessageDialog(Login.this, "없는 ID입니다.");
					else if (tf.getText().equals(map.get(tf.getText()).getID()) && pf.getText().equals(map.get(tf.getText()).getPassword())) {
						JOptionPane.showMessageDialog(Login.this, "환영합니다.");
						dispose();
						new Main8_1().setVisible(true);
					}
				} catch (NullPointerException e1){
					JOptionPane.showMessageDialog(Login.this, "빈칸을 입력하세요");
				};
			}
		});

		btnUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUp(map).setVisible(true);
			}
		});

		pnltf.add(lblID);
		pnltf.add(tf);
		pnltf.add(lblPassword);
		pnltf.add(pf);
		pnlbtn.add(btnIn);
		pnlbtn.add(btnUp);

		pnlall.add(pnltf);
		pnlall.add(pnlbtn);
		pnl.add(pnlall);
		add(pnl);

		setSize(370, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Login().setVisible(true);
	}
}
