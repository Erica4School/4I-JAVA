import java.awt.*;
import javax.swing.*;
public class Finestra extends JFrame {
Finestra(){
	setVisible(true);
	setTitle("la mia prima grafica 2d");
	setSize(600,500);
	JPanel panel = new JPanel() {
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.fillRect(50, 70, 80, 40);
	Font font = new Font("arial", Font.BOLD, 16);
	g.setFont(font);
	g.setColor(Color.BLUE);
	g.drawString("bye bye", 200, 100);
	//disegno triangolo
	int[]xPoint= {150, 50, 250};
	int[]yPoint= {50, 250, 250};
	g.setColor(Color.GREEN);
	g.fillPolygon(xPoint, yPoint, 3);
}};
add(panel);
}}
