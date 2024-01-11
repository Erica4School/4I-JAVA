package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouncingBall extends JFrame {
    private int x = 50;
    private int y = 50;
    private int xSpeed = 2;
    private int ySpeed = 2;

    public BouncingBall() {
        setTitle("Palla rimbalzante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += xSpeed;
                y += ySpeed;

                if (x + 20 > getWidth() || x < 0) {
                    xSpeed = -xSpeed; // Cambia la direzione quando raggiunge il bordo orizzontale
                }

                if (y + 20 > getHeight() || y < 0) {
                    ySpeed = -ySpeed; // Cambia la direzione quando raggiunge il bordo verticale
                }
                repaint();
            }
        });

        timer.start();
        setVisible(true);
    }

  

    @Override
    public void paint(Graphics g) {
        super.paint(g);
       // Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20); // Disegna la palla
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BouncingBall();
            }
        });
    }
}
