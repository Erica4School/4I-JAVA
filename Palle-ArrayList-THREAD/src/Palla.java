import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;

class Palla {
    int x, y;
    int diametro;
    int velX, velY;

    public Palla(int x, int y, int diametro, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
        this.velX = velX;
        this.velY = velY;
    }

    public void muovi(int width, int height) {
        x += velX;
        y += velY;

        if (x < 0 || x + diametro > width) velX = -velX; // Inverte la direzione se tocca i bordi orizzontali
        if (y < 0 || y + diametro > height) velY = -velY; // Inverte la direzione se tocca i bordi verticali
    }

    public void disegna(Graphics2D g) {
        g.fillOval(x, y, diametro, diametro);
    }
}

