package albertoGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class casa extends JFrame implements ActionListener{
	JPanel panelo;
	
	casa(){
		setTitle("Casa");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		panelo=new JPanel()
		{
			protected void paintComponent(Graphics g)  {
				super.paintComponent(g);
				/* int[]xpunti={50, 150, 250};
				int[]ypunti={150, 50, 150};
				g.setColor(Color.red);
				g.fillPolygon(xpunti, ypunti, 3);
				
				g.setColor(Color.yellow);
				g.fillRect(50, 150, 200, 200);
				g.setColor(Color.black);
				g.fillRect(120, 250, 60, 100); */
				g.setColor(Color.yellow); 
				g.fillOval(400, 50, 100, 100);
				g.fillRect(320, 100, 60, 5);
				g.fillRect(520, 100, 60, 5);
				g.fillRect(445, 170, 5, 60);
				g.fillRect(445, 0, 5, 30);
				g.drawLine(350, 190, 400, 150);
				g.drawLine(350, 10, 400, 50);
				g.drawLine(550, 10, 500, 50);
				g.drawLine(550, 190, 500, 150);
			}
		};
		JButton button = new JButton("colora");
		add(panelo);
		panelo.add(button, BorderLayout.NORTH);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int r=(int) (Math.random()*255);
		int g=(int) (Math.random()*255);
		int b=(int) (Math.random()*255);
		int r2=(int) (Math.random()*255);
		int g2=(int) (Math.random()*255);
		int b2=(int) (Math.random()*255);
		int r3=(int) (Math.random()*255);
		int g3=(int) (Math.random()*255);
		int b3=(int) (Math.random()*255);
		Color a = new Color(r, g, b);
		Color a2 = new Color(r2, g2, b2);
		Color a3 = new Color(r3, g3, b3);
		 Graphics s = getGraphics();
		s.setColor(a);
		s.fillRect(50, 150, 200, 200);
		s.setColor(a2);
		s.fillRect(120, 250, 60, 100);
		int[]xpunti={50, 150, 250};
		int[]ypunti={150, 50, 150};
		s.setColor(a3);
		s.fillPolygon(xpunti, ypunti, 3);
	}
}
