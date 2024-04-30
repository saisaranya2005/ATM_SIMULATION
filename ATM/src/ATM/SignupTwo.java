package ATM;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {
	JTextField  panTextField,AadTextField;
	JButton next;
	JRadioButton yes, no;
	JComboBox religion,category,occupation,education,incom;
    String formno1;
    
	SignupTwo(String formno1) {
	    this.formno1=formno1;	
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additional = new JLabel("Page 2: Additional Details");
		additional.setFont(new Font("Raieway", Font.BOLD, 22));
		additional.setBounds(290, 80, 400, 30);
		add(additional);
		
		JLabel name = new JLabel("Religion : ");
		name.setFont(new Font("Raieway", Font.BOLD, 22));
		name.setBounds(100, 140, 150, 25);
		add(name);
		String valReligion[]= {"Hindu","Muslim","Christian","Sikh","Jain","Others"};
		religion=new JComboBox(valReligion);
		religion.setBounds(300, 130, 360, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		JLabel cname = new JLabel("Category : ");
		cname.setFont(new Font("Raieway", Font.BOLD, 22));
		cname.setBounds(100, 190, 200, 25);
		add(cname);
		String valcat[]= {"GEN","OBC","EWS","SC","ST"};
		category=new JComboBox(valcat);
		category.setBounds(300, 190, 360, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel inc = new JLabel("Income : ");
		inc.setFont(new Font("Raieway", Font.BOLD, 22));
		inc.setBounds(100, 240, 300, 25);
		add(inc);
		String valincome[]= {"Poor - Annual income less than 150000 pa",
				 "Lower Class - Annual income between 2 lac pa - 6 lac.",
				"Lower middle class - 9 lacs to 20 lacs",
				"Upper middle class - 25 lacs to 90 lacs",
				"Rich  - 1cr or above"};
		incom=new JComboBox(valincome);
		incom.setBounds(300, 240, 360, 30);
		incom.setBackground(Color.WHITE);
		add(incom);
		
		JLabel edu = new JLabel("Education Details : ");
		edu.setFont(new Font("Raieway", Font.BOLD, 22));
		edu.setBounds(100, 300, 300, 25);
		add(edu);
		String valedu[]= {
				  "Primary Education",
				  "Secondary Education",
				  "Higher Secondary Education",
				  "Undergraduate Degree",
				  "Postgraduate Degree",
				  "Doctorate Degree",
				  "Diploma",
				  "Certificate",
				  "Bachelor of Arts (BA)",
				  "Bachelor of Science (BS)",
				  "Bachelor of Commerce (BCom)",
				  "Bachelor of Engineering (BE)",
				  "Bachelor of Technology (BTech)",
				  "Bachelor of Agriculture (BAgri)",
				  "Bachelor of Medicine (MBBS)",
				  "Bachelor of Dental Surgery (BDS)",
				  "Bachelor of Ayurvedic Medicine and Surgery (BAMS)",
				  "Bachelor of Homeopathic Medicine and Surgery (BHMS)",
				  "Bachelor of Nursing (B.Sc. Nursing)",
				  "Bachelor of Pharmacy (B.Pharm)",
				  "Bachelor of Architecture (BArch)",
				  "Bachelor of Fine Arts (BFA)",
				  "Bachelor of Mass Communication (BMM)",
				  "Bachelor of Business Administration (BBA)",
				  "Bachelor of Management Studies (BMS)",
				  "Bachelor of Hotel Management (BHM)",
				  "Bachelor of Computer Applications (BCA)",
				  "Bachelor of Law (LLB)",
				  "Master of Arts (MA)",
				  "Master of Science (MS)",
				  "Master of Commerce (MCom)",
				  "Master of Engineering (ME)",
				  "Master of Technology (MTech)",
				  "Master of Business Administration (MBA)",
				  "Master of Public Administration (MPA)",
				  "Master of Laws (LLM)",
				  "Doctor of Philosophy (PhD)",
				  "Doctor of Medicine (MD)",
				  "Doctor of Dental Surgery (DDS)",
				  "Doctor of Ayurvedic Medicine and Surgery (MD, BAMS)",
				  "Doctor of Homeopathic Medicine and Surgery (MD, BHMS)",
				  "Illiterate"
				};
		education=new JComboBox(valedu);
		education.setBounds(300, 300, 360, 30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel occup = new JLabel("Occupation : ");
		occup.setFont(new Font("Raieway", Font.BOLD, 22));
		occup.setBounds(100, 390, 360, 25);
		add(occup);
        String[] valoccup={
        		  "Govt employee",
        		  "Entrepeneur",
        		  "Student",
        		  "Retired",
        		  "Software Engineer",
        		  "Doctor",
        		  "Lawyer",
        		  "Engineer",
        		  "Teacher",
        		  "Businessman",
        		  "Banker",
        		  "Nurse",
        		  "Salesman",
        		  "Accountant",
        		  "Other"
        		};
		occupation=new JComboBox(valoccup);
		occupation.setBounds(300, 390, 360, 30);
		add(occupation);
		occupation.setBackground(Color.WHITE);
		
		
		JLabel pan = new JLabel("PAN number : ");
		pan.setFont(new Font("Raieway", Font.BOLD, 22));
		pan.setBounds(100, 440, 300, 25);
		add(pan);
		panTextField = new JTextField();
		panTextField.setFont(new Font("Raeiway", Font.BOLD, 14));
		panTextField.setBounds(300, 440, 360, 30);
		add(panTextField);
		
		JLabel aad = new JLabel("Aadhar number : ");
		aad.setFont(new Font("Raieway", Font.BOLD, 22));
		aad.setBounds(100, 490, 300, 25);
		add(aad);
		AadTextField = new JTextField();
		AadTextField.setFont(new Font("Raeiway", Font.BOLD, 14));
		AadTextField.setBounds(300, 490, 360, 30);
		add(AadTextField);
		
		JLabel cit = new JLabel("Senior citizen: ");
		cit.setFont(new Font("Raieway", Font.BOLD, 22));
		cit.setBounds(100, 540, 300, 25);
		add(cit);
		yes = new JRadioButton("yes");
		yes.setBounds(300, 540, 100, 30);
		yes.setBackground(Color.WHITE);
		add(yes);
		no = new JRadioButton("no");
		no.setBounds(450, 540, 120, 30);
		no.setBackground(Color.WHITE);
		add(no);
		ButtonGroup options = new ButtonGroup();
		options.add(yes);
		options.add(no);
		
		JLabel exists = new JLabel("Existing Account: ");
		exists.setFont(new Font("Raieway", Font.BOLD, 22));
		exists.setBounds(100, 590, 300, 25);
		add(exists);
		yes = new JRadioButton("yes");
		yes.setBounds(300, 590, 100, 30);
		yes.setBackground(Color.WHITE);
		add(yes);
		no = new JRadioButton("no");
		no.setBounds(450, 590, 120, 30);
		no.setBackground(Color.WHITE);
		add(no);
		ButtonGroup option = new ButtonGroup();
		option.add(yes);
		option.add(no);

		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raieway", Font.BOLD, 15));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		getContentPane().setBackground(Color.WHITE);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignupTwo("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)education.getSelectedItem();
		String sEducation = (String)occupation.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		String Seniorcitizen = (yes.isSelected() ? "Yes" : (no.isSelected() ? "No":""));
		String pannumber = panTextField.getText();
		String Existing = (yes.isSelected() ? "Yes" : (no.isSelected() ? "No" : ""));
		String aadharnumber = AadTextField.getText();
		try {
			if (sreligion.equals("")) {
				JOptionPane.showMessageDialog(null, "Religion is required");
			} 

			if (scategory.equals("")) {
				JOptionPane.showMessageDialog(null, "Category is required");
			}
			if (sincome.equals("")) {
				JOptionPane.showMessageDialog(null, "Income is required");
			}
			if (sEducation.equals("")) {
				JOptionPane.showMessageDialog(null, "Education details is required");
			}
			if (soccupation.equals("")) {
				JOptionPane.showMessageDialog(null, "Occupation is required");
			}
			if (Seniorcitizen.equals("")) {
				JOptionPane.showMessageDialog(null, "Citizen type is required");
			}
			if (pannumber.equals("")) {
				JOptionPane.showMessageDialog(null, "Pan number is required");
			}
			if (Existing.equals("")) {
				JOptionPane.showMessageDialog(null, "Account type is required");
			}
			if (aadharnumber.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar number is required");
			}
			 else {
					Conn c = new Conn();
					String query = "insert into signuptwo (Religion, Category, Income, Education, Occupation, Citizen, Pan_number, Aadhar_number, Account_Type) values ('" + sreligion + "','" + scategory + "','" + sincome + "','" + sEducation + "','" + soccupation + "','" + Seniorcitizen + "','" + pannumber + "','" + aadharnumber + "','" + Existing + "')";

					c.s.executeUpdate(query);
					setVisible(false);
					new SignupThree(formno1).setVisible(true);
				}
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}

