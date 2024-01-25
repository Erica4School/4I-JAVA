

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
int x, y;
int xVel, yVel;

Ball(){
	// vado a settare il punto di partenza della mia palla nel mio pannello
	//la palla verrà creata al centro della mia area di gioco
	
	x = 350;
	y = 350;
	
	
	//setto la sua velocità iniziale
	xVel = 3;
	yVel = 3;
	
	
}
	//creo la palla
	public void paint (Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x-10, y-10, 20, 20);
//la ragione per cui ho sottotratto -10 è perchè
//quando disegno un cerchio, questo viene disegnato in angolo in alto a dx e io non lo voglio appiccicato
	}
	
	//
public void move() {
	// lo faccio muovere sull'asse delle x 
	x += xVel;
	// lo faccio muovere sull'asse delle y
	y+= yVel;
	//non esce dall'area di gioco e torna indietro sull'asse delle y
     if (y<10 || y >440) 	yVel = -yVel;
}

public int getX() {
	return (int) x;
	
}

public int getY() {
	return (int) y;
	
}
}
