package verifiicaBizz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//al click del mouse la palla va su e giu: animazione gestita dal thread
public class PallaCheSalta extends JFrame {

    private int posY = 300; // Posizione iniziale della palla sull'asse Y

    public PallaCheSalta() {
        setTitle("Palla che Salta");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                disegnaPalla(g);
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	//posY -= 5; // Sposta la palla verso l'alto
               // repaint(); // Ridisegna il pannello
Salta();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void disegnaPalla(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(150, posY, 50, 50);
    }

   private void Salta() {
        Thread jumpThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    posY -= 5; // Sposta la palla verso l'alto
                    repaint(); // Ridisegna il pannello
                }
                for (int i = 0; i < 30; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    posY += 5; // Sposta la palla verso il basso
                    repaint(); // Ridisegna il pannello
                }
            }
        });

        jumpThread.start(); }
   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PallaCheSalta());
    }
}
