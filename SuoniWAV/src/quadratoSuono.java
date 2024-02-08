import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class quadratoSuono extends JFrame implements Runnable {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int SQUARE_SIZE = 50;
    private static final int MOVE_SPEED = 5;

    private int squareX = 0;
    private int squareY = 0;
    private int dx = MOVE_SPEED;
    private int dy = MOVE_SPEED;
    private JPanel panel;

    public  quadratoSuono() {
        setTitle("muoviti con suono");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(squareX, squareY, SQUARE_SIZE, SQUARE_SIZE);
            }
        };
      
        add(panel);
        
    }

    @Override
    public void run() {
        try {
            while (true) {
                moveSquare();
                panel.repaint();
                Thread.sleep(50); /
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void moveSquare() {
        squareX += dx;
        squareY += dy;

        if (squareX <= 0 || squareX >= WIDTH - SQUARE_SIZE) {
            dx = -dx;
            playSound();
        }
        if (squareY <= 0 || squareY >= HEIGHT - SQUARE_SIZE) {
            dy = -dy;
            playSound();
        }
    }
    
    private void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("ball.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	 quadratoSuono a = new  quadratoSuono();
    	 a.setVisible(true);
         Thread moveThread = new Thread(a);
         moveThread.start(); }
}
