import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class Finestra extends JFrame implements ActionListener {
private JPanel panel;
private JButton loginButton;
private JLabel user, psw;
private JTextField userField;
private JPasswordField passwordField;
	
Finestra(){
	setLayout(new BorderLayout());
	panel = new JPanel();
	getContentPane().add(panel, BorderLayout.CENTER);
	setSize(300,150);
	setTitle("login form");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	user = new JLabel("Username");
	userField = new JTextField(20);
	psw = new JLabel("Password");
	passwordField = new JPasswordField(20);
	panel.add(user);
	panel.add(userField);
	panel.add(psw);
	panel.add(passwordField);
	loginButton = new JButton("invia");
	panel.add(loginButton);
	loginButton.addActionListener(this);pack();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String username = 	userField.getText();
String password = 	passwordField.getText();
		
try {
Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src/db.accdb");
System.out.println("connessione avvenuto");
String query = "SELECT * FROM login WHERE username=? AND password=?";
PreparedStatement pre = connection.prepareStatement(query);
pre.setString(1, username);
pre.setString(2, password);
ResultSet result = pre.executeQuery();
if(result.next()) {
	JOptionPane.showMessageDialog(this, "accesso consentito");
}
else 
	{JOptionPane.showMessageDialog(this, "psw o user non corretti");}
	
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();

			
			
		}
		
	}

}
