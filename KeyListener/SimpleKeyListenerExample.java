import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKeyListenerExample extends JFrame implements KeyListener {
    private int x = 50;
    private int y = 50;

    public SimpleKeyListenerExample() {
        addKeyListener(this);  // Aggiunto il KeyListener direttamente alla finestra
        setPreferredSize(new Dimension(300, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setFocusable(true);
        setVisible(true);
    }

    
    
    @Override
    public void keyTyped(KeyEvent e) {
        // Non utilizzato in questo esempio
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
            y -= 10;
            break;
        case KeyEvent.VK_DOWN:
            y += 10;
            break;
        case KeyEvent.VK_LEFT:
            x -= 10;
            break;
        case KeyEvent.VK_RIGHT:
            x += 10;
            break;
    }

    repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Non utilizzato in questo esempio
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

      //  Graphics2D g2d = (Graphics2D) g;

        // Disegna il rettangolo che si muove con i tasti
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleKeyListenerExample::new);
    }
}
