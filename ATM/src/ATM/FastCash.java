package ATM;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7;
    String pinnumber;
    int currentbalance;
	FastCash(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("Images/atm.jpg");
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		 
		JLabel text=new JLabel("Select withdrawal amount");
		text.setBounds(200,300,700,35);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,18));
		image.add(text);
		
		b1=new JButton("Rs 100");
		b1.setBounds(180,350,140,30);
		b1.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b1);
		b1.addActionListener(this);

		b2=new JButton("Rs 500");
		b2.setBounds(350,350,140,30);
		b2.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Rs 1000");
		b3.setBounds(180,400,140,30);
		b3.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b3);
		b3.addActionListener(this);

		b4=new JButton("Rs 2000");
		b4.setBounds(350,400,140,30);
		b4.setFont(new Font("Raleway",Font.BOLD,12));
		b4.addActionListener(this);

		image.add(b4);
		b5=new JButton("Rs 5000");
		b5.setBounds(180,450,140,30);
		b5.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b5);
		b5.addActionListener(this);

		b6=new JButton("Rs 10000");
		b6.setBounds(350,450,140,30);
		b6.setFont(new Font("Raleway",Font.BOLD,12));
		image.add(b6);
		b6.addActionListener(this);
		b7=new JButton("Back");
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
		new FastCash(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b7) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		else {
			String amount=((JButton)e.getSource()).getText().substring(3);
			Conn c=new Conn();
			try {
				ResultSet rs=c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
				currentbalance=0;
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")){
						currentbalance+=Integer.parseInt(rs.getString("amount"));
					}else {
						currentbalance-=Integer.parseInt(rs.getString("amount"));
					}
				}
				if(e.getSource()!= b7 && currentbalance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				Date date=new Date();
				int remainingBalance = currentbalance - Integer.parseInt(amount);
				String query="insert into bank values('"+pinnumber+"','"+date+"','"+remainingBalance+"','"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null," Rs "+amount+" debited Successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				
			}catch(Exception k) {
				System.out.println(k);
			}
		}
		
	}
}
