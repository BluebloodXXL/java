import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login {
    public static void main(String[] args) {
        LoginPanel p = new LoginPanel("Welcome to Facebook");
        p.setVisible(true);
    }
}

class LoginPanel extends JFrame implements ActionListener {
    JTextField userName;
    JTextField userPass;

    LoginPanel(String title) {
        super(title);
        setLayout(new BorderLayout());
        setSize(500, 150);
        JLabel enterUserName = new JLabel("Username:");
        userName = new JTextField(30);
        JPanel topPanel = new JPanel();
        topPanel.add(enterUserName);
        topPanel.add(userName);
        JLabel enterUserPass = new JLabel("Password:");
        userPass = new JTextField(30);
        JPanel midPanel = new JPanel();
        midPanel.add(enterUserPass);
        midPanel.add(userPass);
        JButton loginButton = new JButton("Login");
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(loginButton);
        loginButton.addActionListener(this);
        add(topPanel, BorderLayout.NORTH);
        add(midPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame welcome = new JFrame();
        if (userPass.getText().equals("testpass")) {
            JOptionPane.showMessageDialog(welcome, "Welcome, " + userName.getText() + "!");
        } else {
            JOptionPane.showMessageDialog(welcome, "Incorrect Password!");
        }
    }
}


