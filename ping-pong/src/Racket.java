


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Racket {

int x, y;
//contatore per i punti
int punteggio=0;
Random rand = new Random();
int giocatore;

Racket(int giocatore){
	this.giocatore = giocatore;
	// devo posizione le mie racchette una a dx e una a sx lungo asse delle x
	
	if (giocatore ==1) {

		x= 15;
	}
	
	else {
		x = 670;
	}
	
	//entrambe alla stessa altezza
	y = 250;
}

	public void paint (Graphics g) {
		//racchetta
		g.setColor(Color.pink);
		g.fillRect(x, y, 20, 80);
		//setto il punteggio dentro la racchetta
		g.setColor(Color.white);
		g.drawString(punteggio + "", x+2, y+45);
		//come in ball, anche qui uso +2 e +45 per centrare la stringa dentro al rettangolo rosa ovvero la mai raccchetta

	}
	
public void setAccel(int direction) {
//setto il limite per la mia racchetta 
	// non può andare oltre il margine inferiore del mio campo di gioco
if (y + (direction*40) > 375) {
	y = 371;	
}
//non può andare oltre il margine superiore del mio campo di gioco 
else if (y + (direction*40) < 10) {
	y = 0;
}
else {
// se è entro i limiti prestabiliti, incremento la y della racchetta 
// in questo modo la racchetta si muove a seconda della direction che vorrò  io (su o giù lungo l'asse y)
	y += (direction*40);
	
}
	
}

//la y della racchetta mossa dal computer si trova (quasi) esattamente dove si trova la y dell'istanza b di classe Ball
//in questo modo la racchetta del computer colpisce sempre la palla
public void cpuParte(Ball b) {
	y = b.getY()-40;
	
}}