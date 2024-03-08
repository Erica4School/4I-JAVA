import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Connect extends JFrame implements ActionListener {
JMenuBar mb;
JMenu disegna, chiudi;
JMenuItem rettangolo, ovale, linea, chiudi_tutto;
Connect(){
	mb= new JMenuBar();
	disegna = new JMenu("disegna");
	mb.add(disegna);
	disegna.setMnemonic(KeyEvent.VK_D);
	chiudi = new JMenu("chiudi");
	mb.add(chiudi);
	chiudi.setMnemonic(KeyEvent.VK_C);
	setJMenuBar(mb);
	rettangolo = new JMenuItem("rettangolo");
	disegna.add(rettangolo);
	rettangolo.setMnemonic(KeyEvent.VK_R);
	rettangolo.addActionListener(this);
	linea = new JMenuItem("linea");
	disegna.add(linea);
	linea.setMnemonic(KeyEvent.VK_L);
	linea.addActionListener(this);
	ovale = new JMenuItem("ovale");
	disegna.add(ovale);
	ovale.setMnemonic(KeyEvent.VK_O);
	ovale.addActionListener(this);
	chiudi_tutto = new JMenuItem("esci per sempre");
	chiudi.add(chiudi_tutto);
	chiudi_tutto.setMnemonic(KeyEvent.VK_E);
	chiudi_tutto.addActionListener(this);
}	
	
	
	public static void main(String[] args) {
		Connect pippo = new Connect();
		pippo.setVisible(true);
        pippo.setSize(500, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str= e.getActionCommand();
		Graphics g = getGraphics();
		if (str.equals("rettangolo")) {
			g.drawRect(100, 100,60, 50);
		}
		if (str.equals("linea")) {
			g.drawLine (300, 50,400, 350);
		}
		if (str.equals("ovale")) {
			g.drawOval(400, 50,50, 50);
		}
		if (str.equals("esci per sempre")) {
			g.drawString("game over", 300, 300);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ea) {}
			System.exit(0);
		}
	}

}
