package ATM;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    Long randomNumber;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raieway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        l1.setBackground(Color.WHITE);
        add(l1);

        JLabel type = new JLabel("Account type: ");
        type.setFont(new Font("Raieway", Font.BOLD, 18));
        type.setBounds(100, 100, 400, 30);
        add(type);

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raieway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 150, 200, 30);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raieway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(360, 150, 200, 30);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raieway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 200, 30);
        add(r3);
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raieway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(360, 180, 200, 30);
        add(r4);
        ButtonGroup options1 = new ButtonGroup();
        options1.add(r1);
        options1.add(r2);
        options1.add(r3);
        options1.add(r4);

        JLabel card = new JLabel("Card number: ");
        card.setFont(new Font("Raieway", Font.BOLD, 18));
        card.setBounds(100, 230, 400, 30);
        add(card);

        JLabel number = new JLabel("XXXX XXXX XXXX XXXX");
        number.setFont(new Font("Raieway", Font.BOLD, 22));
        number.setBounds(350, 230, 440, 30);
        add(number);

        JLabel cdetail = new JLabel("Your 16 digit card number");
        cdetail.setFont(new Font("Raieway", Font.BOLD, 12));
        cdetail.setBounds(100, 260, 400, 12);
        add(cdetail);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raieway", Font.BOLD, 18));
        pin.setBounds(100, 300, 440, 28);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raieway", Font.BOLD, 22));
        pnumber.setBounds(350, 300, 440, 28);
        add(pnumber);

        JLabel pdetail = new JLabel("Your 4 digit pin number");
        pdetail.setFont(new Font("Raieway", Font.BOLD, 12));
        pdetail.setBounds(100, 320, 440, 28);
        add(pdetail);

        JLabel services = new JLabel("Services available: ");
        services.setFont(new Font("Raieway", Font.BOLD, 18));
        services.setBounds(100, 370, 440, 28);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c2 = new JCheckBox("Internet Banking");
        c3 = new JCheckBox("Mobile Banking");
        c4 = new JCheckBox("Cheque Book");
        c5 = new JCheckBox("Email & SMS Alerts");
        c6 = new JCheckBox("E-Statement");
        c7 = new JCheckBox("Hereby I declare that the above entered details are true to the best of my knowledge");

        // Set the font and background color of the check boxes
        Font font = new Font("Raieway", Font.BOLD, 15);
        Color background = Color.WHITE;
        c1.setFont(font);
        c1.setBackground(background);
        c2.setFont(font);
        c2.setBackground(background);
        c3.setFont(font);
        c3.setBackground(background);
        c4.setFont(font);
        c4.setBackground(background);
        c5.setFont(font);
        c5.setBackground(background);
        c6.setFont(font);
        c6.setBackground(background);
        c7.setFont(font);
        c7.setBackground(background);
        c1.setBounds(100, 400, 200, 30);
        c2.setBounds(350, 400, 200, 30);
        c3.setBounds(100, 450, 200, 30);
        c4.setBounds(350, 450, 200, 30);
        c5.setBounds(100, 500, 200, 30);
        c6.setBounds(350, 500, 200, 30);
        c7.setBounds(100, 580, 1000, 30);
        // Add the check boxes to the frame
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);

        submit = new JButton("Submit");
        cancel = new JButton("Cancel");
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        submit.setFont(new Font("Raieway", Font.ITALIC, 14));
        cancel.setFont(new Font("Raieway", Font.ITALIC, 14));
        submit.setBounds(100, 640, 200, 30);
        cancel.setBounds(350, 640, 200, 30);
        submit.addActionListener(this);
        cancel.addActionListener(this); // Add action listener to the cancel button
        add(submit);
        add(cancel);

        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String accountType = null;
            // String formno2 = null; // Commented out this line since it's already declared in the constructor parameter
            if (r1.isSelected()) {
                accountType = "Savings Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Account";
            }
            Random random = new Random();
            String cardnumber = String.valueOf(random.nextLong(900000000000L) + 100000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility = "";
            java.util.List<String> selectedFacilities = new java.util.ArrayList<>();

            if (c1.isSelected()) {
                selectedFacilities.add("ATM CARD");
            }
            if (c2.isSelected()) {
                selectedFacilities.add("Internet Banking");
            }
            if (c3.isSelected()) {
                selectedFacilities.add("Mobile Banking");
            }
            if (c4.isSelected()) {
                selectedFacilities.add("Cheque Book");
            }
            if (c5.isSelected()) {
                selectedFacilities.add("Email & SMS Alerts");
            }
            if (c6.isSelected()) {
                selectedFacilities.add("E-Statement");
            }

            // Convert the list of selected facilities to a comma-separated string
            facility = String.join(", ", selectedFacilities);

            try {
            	if (accountType == null) {
            	    JOptionPane.showMessageDialog(null, "Account Type is required");
            	} 
            	if (!c7.isSelected()) {
            	    JOptionPane.showMessageDialog(null, "Please declare that the entered details are true.");
            	}
            	else {
            	    Conn conn = new Conn();
            	    String query1 = "insert into signupthree(Formno,Account_Type,Card_Number,PIN_Number,Facility) values ('"+ formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility+ "')";
            	    String query2 = "insert into login(formno,Card_Number,PIN_Number) values ('"
            	            + formno + "','" + cardnumber + "','" + pinnumber + "')";
            	    conn.s.executeUpdate(query1);
            	    conn.s.executeUpdate(query2);
            	 // Display the card number and pin number in a JOptionPane
            	    JOptionPane.showMessageDialog(
            	        null,
            	        "Card Number: " + cardnumber + "\n" +
            	        "PIN: " + pinnumber,
            	        "Card Information",
            	        JOptionPane.INFORMATION_MESSAGE);
            	    
            	    setVisible(false);
            	}

            } catch (Exception h) {
                System.out.println(h);
            }
        } else if (e.getSource() == cancel) {
            setVisible(false); // Close the window when cancel button is clicked
        }
    }
}
