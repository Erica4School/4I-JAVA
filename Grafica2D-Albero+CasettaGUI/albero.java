package albertoGUI;

import javax.swing.*;
import java.awt.*;

public class albero extends JFrame{
	JPanel panel;
	
	albero(){
		setTitle("Albero");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel=new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponents(g);
				g.setColor(Color.green);
				g.fillOval(150, 50, 100, 100);
				g.setColor(new Color(139, 69, 19));
				g.fillRect(190, 150, 20, 50);
			}
				
				
		};
		add(panel);
		//pack();
		setVisible(true);
		
	}
}
