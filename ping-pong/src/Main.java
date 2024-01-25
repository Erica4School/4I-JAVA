

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

public class Main extends JPanel implements ActionListener, KeyListener{
// timer per animare le nostre figure
// aspetta 10 secondi prima dell'esecuzione
	
	Timer timer = new Timer(10, this);
	
	
	// istanzio i miei oggetti grafici
	
	Ball b; 
	Racket r1, r2;
	
	public Main() {
		
		b = new Ball();
		r1 = new Racket (1);
		r2 = new Racket (2);
		timer.start();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		Main game = new Main();
		jf.add(game);
		jf.setSize(720, 550);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setTitle("Ping Pong Game");
		jf.addKeyListener(game);

	}

	
	public void paint(Graphics g) {
		super.paint(g);
		//devo richiamare il paint per disegnare le istanze delle classi ball e racket
		b.paint(g);
		r1.paint(g);
		r2.paint(g);
		g.setColor(Color.black);
		g.drawRect(35, 0, 634, 450); //linee nere per il tavolo di gioco
		
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// muovere i tasti su e giù
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			r2.setAccel(-1); //cambio la direzione col segno
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			r2.setAccel(1);
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//si muove la palla
		b.move();
                //devo ridiseganrlo ogni qualvolta il mio oggetto grafico si muove
		repaint();
		r1.cpuParte(b);
		isCollided();
		Vinto();
			
	}


	public void Vinto() {
		// TODO Auto-generated method stub
		// uscita dalla parte di sx
		if (b.getX()< 30) {
			b = new Ball();
			r2.punteggio++;
		}
		
		// uscita dalla parte di dx
		if (b.getX()> 675) {
			b = new Ball(); //richiamo una nuova ball nelle sue x e y iniziali dichiarate nella classe
			r1.punteggio++; //incremento il punteggio all'interno della racchetta
		}
		
	}


	public void isCollided() {
		
		if (b.getX () < 45  && (r1.y < b.getY()) && (r1.y + 80 > b.getY())){
			 
			b.yVel = b.yVel;
			b.xVel = - b.xVel; 		//rimbalza	e cambia direzione
			
		}
		
		if (b.getX() > 660) {
			
			if ((r2.y < b.getY()) && (r2.y + 80 > b.getY())){
				b.yVel = b.yVel;
				b.xVel = - b.xVel; 
			}
		}
		
	}

}
