import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameMenu extends JFrame implements KeyListener {
     JPanel gamePanel;
     int squareX = 50;
     int squareY = 50;
     static final int SQUARE_SIZE = 50;

    public GameMenu() {
        setTitle("Game Menu");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creazione del menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem playItem = new JMenuItem("Play");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem creditsItem = new JMenuItem("Credits");
        menu.add(playItem);
        menu.add(exitItem);
        menu.add(creditsItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        creditsItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "credits: \n filippo ha fatto xml \n francesco ha realizzato afb..");		
			}});
        exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
            System.exit(0);	
			}});
        playItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Avvio del gioco
                gamePanel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.RED);
                        g.fillRect(squareX, squareY, SQUARE_SIZE, SQUARE_SIZE);
                    }
                };
                add(gamePanel);
                gamePanel.setFocusable(true);
                gamePanel.requestFocus();
                gamePanel.addKeyListener(GameMenu.this);
                setVisible(true);
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Uscita dal programma
                System.exit(0);
            }
        });

        creditsItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Visualizzazione dei credits
                JOptionPane.showMessageDialog(null, "Credits:\nfatto da me", "Credits", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        menu.add(playItem);
        menu.add(exitItem);
        menu.add(creditsItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
       
                new GameMenu().setVisible(true);
          
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            if (squareX > 0)
                squareX -= 5;
        } else if (key == KeyEvent.VK_RIGHT) {
            if (squareX + SQUARE_SIZE < getWidth())
                squareX += 5;
        } else if (key == KeyEvent.VK_UP) {
            if (squareY > 0)
                squareY -= 5;
        } else if (key == KeyEvent.VK_DOWN) {
            if (squareY + SQUARE_SIZE < getHeight())
                squareY += 5;
        }
        repaint();
    }

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}}