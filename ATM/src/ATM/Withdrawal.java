package ATM;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Withdrawal extends JFrame implements ActionListener{
	JButton withdraw,back;
	JTextField amount;
	String pinnumber;
	Withdrawal(String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("Images/atm.jpg");
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("Enter the amount that you want to withdraw");
		text.setBounds(180,300,700,35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,15));
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(180,350,320,25);
		image.add(amount);
	    withdraw=new JButton("Withdraw");
		withdraw.setBounds(365,480,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		back=new JButton("Back");
		back.setBounds(365,520,150,30);
		back.addActionListener(this);
		image.add(back);
	  
	  
	  
  setSize(900,900);
  setLocation(300,0);
  setUndecorated(true);
  setVisible(true);

	}
	
	
	
	public static void main(String[] args) {
	new Withdrawal("");
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
   	if(e.getSource()==withdraw) {
   		String number=amount.getText();
   		Date date=new Date();
   		if(number.equals(" ")) {
   			JOptionPane.showMessageDialog(null,"Please enter the amount that you need to withdraw");
   		}
   		else {
   			try {
   			Conn conn=new Conn();
   			String query="insert into bank values('"+pinnumber+"','"+date+"','Withdarwal','"+number+"')";
   		    conn.s.executeUpdate(query);
   		    JOptionPane.showMessageDialog(null,"Withdrawal successful !: "+"Rs "+number);
            setVisible(false);   		
   			new Transactions(pinnumber).setVisible(true);
   			}catch(Exception g) {
   			System.out.println(g);
   		}
   	}
   	}else if(e.getSource()==back) {
   		setVisible(false);
   		new Transactions(pinnumber).setVisible(true);
   	}
		
	}
}
