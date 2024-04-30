package ATM;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class intro extends JFrame implements ActionListener{
     JButton b1,b2,b3,b4,b5;
    intro(){
     
        ImageIcon i4 = new ImageIcon("D:\\22BEC1059\\ATM\\Images\\back.jpg");
		Image i5 = i4.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel bg = new JLabel(i6);
		bg.setBounds(0,0,800,800);
		add(bg);

        JLabel text = new JLabel("Welcome to E-banking services");
		text.setFont(new Font("Osward", Font.BOLD, 32));
		text.setForeground(Color.BLACK);
        text.setBackground(Color.WHITE);
		text.setBounds(180, 40, 500, 40);
		bg.add(text);
        JLabel textdes = new JLabel("One stop for all banking services");
		textdes.setFont(new Font("Osward", Font.ITALIC, 25));
		textdes.setForeground(Color.BLACK);
		textdes.setBounds(200, 40, 400, 120);
		getContentPane().setBackground(Color.WHITE);
		bg.add(textdes);

        b1=new JButton("Chatbot");
		b1.setBounds(200,350,200,50);
		b1.setFont(new Font("Raleway",Font.BOLD,15));
		bg.add(b1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
		b1.addActionListener(this);

		b2=new JButton("ATM services");
		b2.setBounds(450,350,200,50);
		b2.setFont(new Font("Raleway",Font.BOLD,15));
		bg.add(b2);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
		b2.addActionListener(this);

		b3=new JButton("Budget tracker");
		b3.setBounds(200,430,200,50);
		b3.setFont(new Font("Raleway",Font.BOLD,15));
		bg.add(b3);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
		b3.addActionListener(this);

		b4=new JButton("Goal tracker");
		b4.setBounds(450,430,200,50);
		b4.setFont(new Font("Raleway",Font.BOLD,15));
		b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        bg.add(b4);

        b5=new JButton("Bank services near me");
		b5.setBounds(300,500,200,50);
		b5.setFont(new Font("Raleway",Font.BOLD,15));
		bg.add(b5);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
		b5.addActionListener(this);

        setTitle("Banking services");
        setLayout(null);

        setSize(800,800);
        setVisible(true);
        setLocation(550,150);
    }
   
    

@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource() == b1) {
        setVisible(false);
        new chatbot().setVisible(true);
        }
       else if (e.getSource() == b5) {
           setVisible(false);
           new webs().setVisible(true);
      }
      else if (e.getSource() == b2) {
        setVisible(false);
        new Login().setVisible(true);
   }
   else if (e.getSource() == b4) {
    setVisible(false);
    new Webgoal().setVisible(true);
}
else if (e.getSource() == b3) {
    setVisible(false);
    new webtrack().setVisible(true);
}
    
}

public static void main(String [] args){
    new intro();
}
}