package ATM;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
	String pinnumber;
MiniStatement(String pinnumber){
	this.pinnumber=pinnumber;
	setLayout(null);
setTitle("Mini Statement");

JLabel bank=new JLabel("State Bank Of India");
bank.setFont(new Font("Raleway",Font.ITALIC,20));
bank.setForeground(Color.black);
bank.setBounds(110,20,500,20);
add(bank);
ImageIcon i1 = new ImageIcon("Images/sbi.jpeg");
Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel label = new JLabel(i3);
label.setBounds(140, 0, 100, 200);
add(label);

JLabel mini=new JLabel();
add(mini);

JLabel card=new JLabel();
card.setBounds(30,200,400,50);
card.setFont(new Font("Raleway",Font.BOLD,15));
add(card);

JLabel balance=new JLabel();
balance.setBounds(10,380,500,200);
add(balance);

	try {
		Conn conn=new Conn();
		ResultSet rs=conn.s.executeQuery("select * from login where PIN_Number='"+pinnumber+"'");
		while(rs.next()) {
			String cardNumber = rs.getString("Card_Number");
			String maskedCardNumber = cardNumber.substring(0, 4) + "XXXXXXXX"+rs.getString("Card_Number").substring(8);

			card.setText("Card number: " + maskedCardNumber);
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}
	try {
		Conn conn=new Conn();
		int currentbalance=0;
		ResultSet rs=conn.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
		while(rs.next()) {
			mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
		
			if(rs.getString("type").equals("Deposit")){
				currentbalance+=Integer.parseInt(rs.getString("amount"));
			}else {
				currentbalance-=Integer.parseInt(rs.getString("amount"));
			}balance.setText("Your current balance is Rs "+currentbalance);
		}
		
	}catch(Exception d) {
		System.out.println(d);
	}
	mini.setBounds(10,300,1000,200);
	
	
	
	
	
setSize(400,600);
setLocation(700,200);
getContentPane().setBackground(Color.white);	
setVisible(true);
	
}





	public static void main(String[] args) {
		new MiniStatement("");
	}
	
}
