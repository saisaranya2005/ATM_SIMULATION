package ATM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {
	JButton Login, Clear, signup;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login() {
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon i1 = new ImageIcon("Images/atm.jpeg");
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		getContentPane().setBackground(Color.WHITE);
		add(text);
		JLabel cno = new JLabel("Card no: ");
		cno.setFont(new Font("C", Font.BOLD, 28));
		cno.setBounds(120, 150, 150, 30);
		add(cno);
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);
		JLabel pin = new JLabel("PIN  : ");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);
		Login = new JButton("SIGN IN");
		Login.setBounds(300, 300, 100, 30);
		Login.setBackground(Color.BLACK);
		Login.setForeground(Color.WHITE);
		add(Login);
		Login.addActionListener(this);
		Clear = new JButton("CLEAR");
		Clear.setBounds(430, 300, 100, 30);
		Clear.setBackground(Color.BLACK);
		Clear.setForeground(Color.WHITE);
		add(Clear);
		Clear.addActionListener(this);
		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		add(signup);
		signup.addActionListener(this);
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Login) {
          Conn conn=new Conn();
          String cardnumber=cardTextField.getText();
          String pinnumber=pinTextField.getText();
          String query="select * from login";
          setVisible(false);
          new Transactions(pinnumber).setVisible(true);
          } else if (e.getSource() == Clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		} else if (e.getSource() == signup) {
             setVisible(false);
             new SignupOne().setVisible(true);
		}

	}

	public static void main(String[] args) {
		new Login();
	}

}
	