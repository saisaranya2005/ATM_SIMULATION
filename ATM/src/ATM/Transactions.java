package ATM;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7;
    String pinnumber;
	Transactions(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("Images/atm.jpg");
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		 
		JLabel text=new JLabel("Please select your transaction");
		text.setBounds(200,300,700,35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,18));
		image.add(text);
		
		b1=new JButton("Deposit");
		b1.setBounds(180,350,140,30);
		b1.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b1);
		b1.addActionListener(this);

		b2=new JButton("Cash WithDrawal");
		b2.setBounds(350,350,140,30);
		b2.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Fast Cash");
		b3.setBounds(180,400,140,30);
		b3.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b3);
		b3.addActionListener(this);

		b4=new JButton("Mini Statement");
		b4.setBounds(350,400,140,30);
		b4.setFont(new Font("Raleway",Font.BOLD,12));
		b4.addActionListener(this);

		image.add(b4);
		b5=new JButton("Pin Change");
		b5.setBounds(180,450,140,30);
		b5.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b5);
		b5.addActionListener(this);

		b6=new JButton("Balance Enquiry");
		b6.setBounds(350,450,140,30);
		b6.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b6);
		b6.addActionListener(this);
		b7=new JButton("Exit");
		b7.setBounds(260,500,140,30);
		b7.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b7);
		b7.addActionListener(this);
		
		setSize(900, 900);
		setLocation(300, 0);
		getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Transactions(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b7) {
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}
		else if(e.getSource()==b2) {
			setVisible(false);
			new Withdrawal(pinnumber).setVisible(true);
		}
		else if(e.getSource()==b3) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);
		}
		else if(e.getSource()==b4) {
			new MiniStatement(pinnumber).setVisible(true);
		}
		else if(e.getSource()==b5) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
		}
		else if(e.getSource()==b6) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}
		
	}
}
