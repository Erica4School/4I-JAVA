package verifiicaBizz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StylizedGirlExample extends JFrame  {
    private int armAngle = 0;

    public StylizedGirlExample() {
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    armAngle += 5;
                    repaint();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    armAngle -= 5;
                    repaint();
                }
            }   
        });

        setFocusable(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        // Disegna la testa
        g2d.setColor(Color.PINK);
        g2d.fillOval(150, 50, 100, 100);

        // Disegna il corpo
        g2d.setColor(Color.BLUE);
        g2d.fillRect(190, 150, 20, 50);

        // Disegna il braccio sinistro
        g2d.setColor(Color.BLUE);
        g2d.fillRect(170, 160, 20, 5);

        // Disegna il braccio destro
        g2d.setColor(Color.BLUE);
        g2d.rotate(Math.toRadians(armAngle), 200, 160);
        g2d.fillRect(200, 160, 20, 5);
        g2d.rotate(-Math.toRadians(armAngle), 200, 160);

        // Disegna le gambe
        g2d.setColor(Color.RED);
        g2d.fillRect(190, 200, 20, 50);

        // Disegna gli occhi
        g2d.setColor(Color.BLACK);
        g2d.fillOval(170, 80, 20, 20);
        g2d.fillOval(210, 80, 20, 20);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StylizedGirlExample::new);
    }
}


