package ATM;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
	String pinnumber;
	JButton back;
	BalanceEnquiry (String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon("Images/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		  
		back=new JButton("BACK");
		back.setBounds(360,500,120,30);
		back.setFont(new Font("Raleway",Font.BOLD,12));
		back.addActionListener(this);
		image.add(back);
		
		Conn c=new Conn();
		
		ResultSet rs;
		int currentbalance = 0;

		try {
		  rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
		  
		  while(rs.next()) {
		    if(rs.getString("type").equals("Deposit")){
		      currentbalance+=Integer.parseInt(rs.getString("amount"));
		    }else {
		      currentbalance-=Integer.parseInt(rs.getString("amount"));
		    }
		  }
		}catch(Exception s) {
		  System.out.println(s);
		}
		
		JLabel text=new JLabel("Your current balance is Rs "+currentbalance);
		text.setFont(new Font("Raleway",Font.BOLD,20));
		text.setBounds(200,300,500,100);
		text.setForeground(Color.white);
		image.add(text);
		
		setLocation(300,0);
		setSize(900,900);
		setUndecorated(true);
		setVisible(true);
		
	}
	
public static void main(String[] args) {
	new BalanceEnquiry(" ");
}

@Override
public void actionPerformed(ActionEvent e) {
	setVisible(false);
	new Transactions(pinnumber).setVisible(true);
}
}
