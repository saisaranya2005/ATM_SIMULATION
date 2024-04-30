package ATM;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
	long random;
	JTextField nameTextField, fnameTextField, eTextField, aTextField, cTextField, sTextField, pTextField;
	JButton next;
	JRadioButton male, female, o, yes, no;
	JDateChooser dateChooser;
	long ran;

	SignupOne() {
		Random ram = new Random();
	 ran = Math.abs((ram.nextLong() % 9000L) + 1000L);
		JLabel formno = new JLabel("APPLICATION FORM NO. " + ran);
		setLayout(null);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		JLabel personal = new JLabel("Page 1: Personal Details");
		personal.setFont(new Font("Raleway", Font.BOLD, 22));
		personal.setBounds(290, 80, 400, 30);
		add(personal);
		JLabel name = new JLabel("Name : ");
		name.setFont(new Font("Raleway", Font.BOLD, 22));
		name.setBounds(100, 140, 100, 25);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 360, 30);
		add(nameTextField);
		JLabel fname = new JLabel("Father's name : ");
		fname.setFont(new Font("Raleway", Font.BOLD, 22));
		fname.setBounds(100, 190, 200, 25);
		add(fname);

		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameTextField.setBounds(300, 190, 360, 30);
		add(fnameTextField);
		JLabel dno = new JLabel("Date of Birth : ");
		dno.setFont(new Font("Raleway", Font.BOLD, 22));
		dno.setBounds(100, 240, 300, 25);
		add(dno);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 360, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);
		JLabel gender = new JLabel("Gender : ");
		gender.setFont(new Font("Raleway", Font.BOLD, 22));
		gender.setBounds(100, 290, 300, 25);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.WHITE);
		add(female);

		o = new JRadioButton("Other");
		o.setBounds(600, 290, 60, 30);
		o.setBackground(Color.WHITE);
		add(o);
		ButtonGroup genders = new ButtonGroup();
		genders.add(male);
		genders.add(female);
		genders.add(o);
		JLabel email = new JLabel("Email : ");
		email.setFont(new Font("Raleway", Font.BOLD, 22));
		email.setBounds(100, 340, 300, 25);
		add(email);

		eTextField = new JTextField();
		eTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		eTextField.setBounds(300, 340, 360, 30);
		add(eTextField);
		JLabel marital = new JLabel("Marital Status : ");
		marital.setFont(new Font("Raleway", Font.BOLD, 22));
		marital.setBounds(100, 390, 300, 25);
		add(marital);

		yes = new JRadioButton("Married");
		yes.setBounds(300, 390, 100, 30);
		yes.setBackground(Color.WHITE);
		add(yes);
		no = new JRadioButton("Unmarried");
		no.setBounds(450, 390, 120, 30);
		no.setBackground(Color.WHITE);
		add(no);
		ButtonGroup options = new ButtonGroup();
		options.add(yes);
		options.add(no);
		JLabel address = new JLabel("Address : ");
		address.setFont(new Font("Raleway", Font.BOLD, 22));
		address.setBounds(100, 440, 300, 25);
		add(address);

		aTextField = new JTextField();
		aTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		aTextField.setBounds(300, 440, 360, 30);
		add(aTextField);
		JLabel city = new JLabel("City : ");
		city.setFont(new Font("Raleway", Font.BOLD, 22));
		city.setBounds(100, 490, 300, 25);
		add(city);

		cTextField = new JTextField();
		cTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cTextField.setBounds(300, 490, 360, 30);
		add(cTextField);
		JLabel State = new JLabel("State : ");
		State.setFont(new Font("Raleway", Font.BOLD, 22));
		State.setBounds(100, 540, 300, 25);
		add(State);

		sTextField = new JTextField();
		sTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		sTextField.setBounds(300, 540, 360, 30);
		add(sTextField);
		JLabel pin = new JLabel("PIN Code: ");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(100, 590, 300, 25);
		add(pin);

		pTextField = new JTextField();
		pTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pTextField.setBounds(300, 590, 360, 30);
		add(pTextField);

		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 15));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		getContentPane().setBackground(Color.WHITE);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignupOne();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formno1=String.valueOf(ran);
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = (male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Other"));
		String email = eTextField.getText();
		String marital = (yes.isSelected() ? "Married" : (no.isSelected() ? "Unmarried" : ""));
		String address = aTextField.getText();
		String city = cTextField.getText();
		String state = sTextField.getText();
		String pin = pTextField.getText();
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Kindly fill your name");
			} 
			if (fname.equals("")) {
				JOptionPane.showMessageDialog(null, "Father's name is required");
			}
			if (dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of birth is required");
			}
			if (address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			}
			if (city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			}
			if (state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is required");
			}
			if (email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required");
			}
			if (pin.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin number is required");
			}
			else {
				Conn c = new Conn();
				String query = "insert into signup (formno, My_Name, father_name, dob, address, city, state, email, pin, gender, marital) values ('" + formno1 + "','" + name + "','" + fname + "','" + dob + "','" + address + "','" + city + "','" + state + "','" + email + "','" + pin + "','" + gender + "','" + marital + "')";

				c.s.executeUpdate(query);
				setVisible(false);
				new SignupTwo(formno1).setVisible(true);
				//SignupThree signupThree = new SignupThree(formno1);
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
