package ATM;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener{
	String pinnumber;
	JPasswordField pin,newpin;
	JButton change,back;
	PinChange(String pinnumber){
		this.pinnumber=pinnumber;
		ImageIcon i1=new ImageIcon("Images/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
	    JLabel image=new JLabel(i3);
	    image.setBounds(0,0,900,900);
	    add(image);
	    JLabel text=new JLabel("Change your pin number");
	    text.setBounds(240,290,300,30);
	    text.setFont(new Font("Raleway",Font.BOLD,15));
	    text.setForeground(Color.white);
	    image.add(text);
	    
	    JLabel pintext=new JLabel("New pin : ");
	    pintext.setBounds(160,330,300,30);
	    pintext.setFont(new Font("Raleway",Font.BOLD,15));
	    pintext.setForeground(Color.white);
	    image.add(pintext);

	    pin=new JPasswordField();
	    pin.setBounds(330,330,150,30);
	    pin.setFont(new Font("Raleway",Font.BOLD,15));
	    pin.setBackground(Color.white);
	    image.add(pin);
	    
	    JLabel repintext=new JLabel("Re-enter new PIN : ");
	    repintext.setBounds(160,360,300,30);
	    repintext.setFont(new Font("Raleway",Font.BOLD,15));
	    repintext.setForeground(Color.white);
	    image.add(repintext);

	    newpin=new JPasswordField();
	    newpin.setBounds(330,360,150,30);
	    newpin.setFont(new Font("Raleway",Font.BOLD,15));
	    newpin.setBackground(Color.white);
	    image.add(newpin);
	    
	    change=new JButton("CHANGE");
	    change.setBounds(360,450,120,30);
	    change.setFont(new Font("Raleway",Font.BOLD,15));
	    change.addActionListener(this);
	    image.add(change);
	    
	    back=new JButton("BACK");
	    back.setBounds(360,490,120,30);
	    back.setFont(new Font("Raleway",Font.BOLD,15));
	    back.addActionListener(this);
	    image.add(back);
	    
	    setSize(900,900);
	    setLocation(300,0);
	    setVisible(true);
	}
public static void main(String[] args) {
	new PinChange(" ").setVisible(true);
}
@Override
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==change) {
	try {
		 String npin=pin.getText();
		 String rpin=newpin.getText();
		 if(! rpin.equals(npin)) {
			 JOptionPane.showMessageDialog(null,"Entered PIN does not match");
			 pin.setText("");
			 newpin.setText("");
			 pin.requestFocus();
			 return;
		 }
		if (npin.equals("")) {
			JOptionPane.showMessageDialog(null,"Please enter PIN");
		     return;
		}
		if (rpin.equals("")) {
			JOptionPane.showMessageDialog(null,"Please re-enter PIN");
		     return;
		}
		 Conn conn=new Conn();
		 String query1="update bank set pin='"+npin+"' where pin='"+pinnumber+"'";
		 String query3="update login set PIN_Number='"+npin+"' where PIN_Number='"+pinnumber+"'";
		 String query4="update signupthree set Pin_number='"+npin+"' where Pin_number='"+pinnumber+"'"; 
	     conn.s.executeUpdate(query4);
	     conn.s.executeUpdate(query3);
	     conn.s.executeUpdate(query1);
	     JOptionPane.showMessageDialog(null,"PIN changed successfully");
	     setVisible(false);
	     new Transactions(pinnumber).setVisible(true);
	     
	     
	}catch(Exception e) {
		 System.out.println(e);
	 }
	}
	else {
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
	}
}
}
