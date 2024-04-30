package ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chatbot  extends JFrame {

    private JTextArea chatArea;
    private JTextField userInputField;

    public chatbot() {
        setTitle("Financial Chatbot");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        userInputField = new JTextField();
        userInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userMessage = userInputField.getText();
                displayMessage("You: " + userMessage);
                processUserInput(userMessage);
                userInputField.setText("");
            }
        });

        JScrollPane scrollPane = new JScrollPane(chatArea);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(userInputField, BorderLayout.SOUTH);
    }

    private void processUserInput(String userMessage) {
        // Simple logic to generate a financial tip based on user input
        String tip = generateFinancialTip(userMessage);
        displayMessage("Chatbot: " + tip);
    }

    private String generateFinancialTip(String userMessage) {
        if (userMessage.contains("hi")) {
        return "Hi how can I help you?";
        }
        if (userMessage.contains("Hi")) {
            return "Hi how can I help you?";
            }
        if (userMessage.contains("Hello")) {
            return "Hi how can I help you?";
            }
        else if (userMessage.contains("save more money")) {
            return "Consider creating a monthly budget to track your expenses and identify areas where you can cut back. Setting savings goals can also help you stay on track.";
        } else if (userMessage.contains("start investing")) {
            return "Great! Before investing, make sure to build an emergency fund. Consider diversifying your investments and start with low-risk options. Research and educate yourself on different investment opportunities.";
        } else if (userMessage.contains("improve my credit score")) {
            return "To boost your credit score, pay your bills on time, reduce credit card balances, and avoid opening too many new accounts. Regularly check your credit report for errors and dispute any inaccuracies.";
        } else if (userMessage.contains("in debt")) {
            return "Create a debt repayment plan by prioritizing high-interest debts. Consider negotiating with creditors for lower interest rates. Cut unnecessary expenses and explore additional sources of income to accelerate debt repayment.";
        } else if (userMessage.contains("retirement planning")) {
            return "Start saving for retirement early. Take advantage of employer-sponsored retirement plans and contribute regularly. Diversify your investments and periodically review your retirement goals and strategy.";
        } else if (userMessage.contains("cut down on unnecessary expenses")) {
            return "Track your spending to identify non-essential expenses. Create a budget and allocate a specific amount for discretionary spending. Look for opportunities to save on everyday items, such as groceries and entertainment.";
        } 
        if (userMessage.contains("primary functions of a bank")) {
            return "The primary functions of a bank include accepting deposits from customers, providing loans and credit, facilitating payment and transfer of funds, offering investment services, and providing financial advice.";
        } else if (userMessage.contains("generate revenue")) {
            return  "Banks generate revenue through various means such as interest earned on loans and investments, fees charged for banking services, commissions on transactions, and income from other financial services like wealth management and insurance.";
        } else if (userMessage.contains("role of central banks")) {
            return  "Central banks oversee the monetary system, regulate and supervise banks, control monetary policy, manage the country's currency and money supply, and act as a lender of last resort during financial crises.";
        } else if (userMessage.contains("fractional reserve banking")) {
            return "Fractional reserve banking is a banking system in which banks are required to hold only a fraction of customer deposits as reserves, allowing banks to create money through the process of lending.";
        } else if (userMessage.contains("types of bank accounts")) {
            return "Common types of bank accounts include checking accounts, savings accounts, money market accounts, and certificates of deposit (CDs), each with its own features and benefits.";
        } else if (userMessage.contains("assess creditworthiness")) {
            return "Banks assess creditworthiness by considering factors such as credit history, income, employment status, debt-to-income ratio, and collateral when evaluating loan applications.";
        } else if (userMessage.contains("importance of interest rates")) {
            return "Interest rates determine the cost of borrowing and the return on savings and investments, influencing consumer spending, business investment, and overall economic activity.";
        }
    else if (userMessage.contains("protect customer information")) {
        return "Banks protect customer information through encryption, multi-factor authentication, fraud monitoring systems, and customer education to prevent unauthorized access and fraudulent activities.";
    } else if (userMessage.contains("purpose of the FDIC")) {
        return "The FDIC (Federal Deposit Insurance Corporation) provides deposit insurance to protect depositors' funds in case a bank fails, ensuring the stability and confidence in the banking system.";
    } else if (userMessage.contains("process of opening a bank account")) {
        return "The process of opening a bank account typically involves visiting a bank branch or applying online, providing identification and personal information, selecting the type of account, and making an initial deposit.";
    } else if (userMessage.contains("online banking advantages")) {
        return "Online banking allows 24/7 access to account information, ability to transfer funds, pay bills, access electronic statements, and offers convenience for managing finances anytime, anywhere.";
    } else if (userMessage.contains("facilitate international money transfers")) {
        return "Banks facilitate international money transfers through wire transfers, SWIFT network, and international payment systems like PayPal and Western Union, allowing customers to send and receive money globally.";
    } else if (userMessage.contains("overdraft protection")) {
        return "Overdraft protection is a service offered by banks that covers transactions exceeding the account balance, temporarily allowing customers to make transactions with a fee, preventing declined transactions and overdraft fees.";
    } else if (userMessage.contains("bank statement importance")) {
        return "A bank statement is important for monitoring account activity, reconciling transactions, and managing finances by providing a record of transactions and balances over a specific period.";
    } else if (userMessage.contains("ATMs work")) {
        return "ATMs allow customers to perform various banking transactions such as withdrawing cash, depositing funds, transferring money between accounts, checking balances, and paying bills, providing convenience and accessibility to banking services.";
    } else if (userMessage.contains("security measures for ATM users")) {
        return "Security measures for ATM users include PIN authentication, card skimming prevention technology, surveillance cameras, physical security features, and regular maintenance and monitoring by banks to ensure customer safety.";
    } else if (userMessage.contains("mobile banking differ")) {
        return "Mobile banking allows accessing banking services and managing accounts through smartphones and tablets, while online banking typically refers to using a computer or laptop, providing flexibility and convenience for banking on-the-go.";
    }

        else {
            return "I'm sorry, I didn't understand that. Please ask another question or seek financial advice.";
        }
    }

    private void displayMessage(String message) {
        chatArea.append(message + "\n");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new chatbot().setVisible(true);
            }
        });
    }
}
