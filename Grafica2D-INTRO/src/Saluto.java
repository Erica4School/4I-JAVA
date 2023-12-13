import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Saluto  extends JFrame {
	private JTextField text;
	private String saluto="";
Saluto(){
	setVisible(true);
	setTitle("saluto");
	setSize(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	text = new JTextField();
	text.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		saluto= text.getText();
		repaint();
	}}	
			);
	add(text, BorderLayout.NORTH);
}
public void paint(Graphics g) {
	super.paint(g);
	g.drawString("saluto   "+ saluto, 20, 100);
}
}
