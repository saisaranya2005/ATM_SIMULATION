package ATM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class webtrack extends JFrame implements ActionListener {
	JButton search;
	 private String filePath = "D:\\22BEC1059\\ATM\\src\\ATM\\budgetTracker.html";
	webtrack() {
		setTitle("Find your nearest Banking service");
		setLayout(null);
		ImageIcon i4 = new ImageIcon("D:\\22BEC1059\\ATM\\Images\\bank.jpg");
		Image i5 = i4.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel bg = new JLabel(i6);
		bg.setBounds(0,0,800,480);
		add(bg);
		
		JLabel text = new JLabel("Need to track the budget? then track it");
		text.setFont(new Font("Osward", Font.BOLD, 20));
		text.setForeground(Color.WHITE);
		text.setBounds(220, 40, 400, 40);
		getContentPane().setBackground(Color.WHITE);
		bg.add(text);
		
		search = new JButton("Enter to track expenses");
		search.setBounds(300, 350, 200, 50);
		search.setBackground(Color.BLACK);
		search.setForeground(Color.WHITE);
		bg.add(search);
		search.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           openFile();
	       }
	    });
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	private void openFile() {
        try {
            File file = new File(filePath);
            Desktop.getDesktop().browse(file.toURI());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        new webtrack();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
}

	