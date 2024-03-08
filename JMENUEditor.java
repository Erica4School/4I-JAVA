import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

import javax.swing.*;

public class Editor extends JFrame implements ActionListener{

	JPanel p;
	JScrollPane contenuto;
	JMenuBar barra;
	JFileChooser file = new JFileChooser(); 
	JTextArea testo;
	JMenu menu, modifica;
	JMenuItem nuovo, apri, salva, esci, taglia, copia, incolla;
	Editor(){
		p= new JPanel();
		contenuto = new JScrollPane();
		barra= new JMenuBar();
		menu= new JMenu("file");
		modifica= new JMenu("modifica");
		barra.add(menu);
		barra.add(modifica);
		menu.setMnemonic(KeyEvent.VK_F);
		setJMenuBar(barra);
		//voci jmenuitem
		nuovo = new JMenuItem("nuovo",KeyEvent.VK_N);
		menu.add(nuovo);
		nuovo.addActionListener(this);
		apri = new JMenuItem("apri",KeyEvent.VK_A);
		menu.add(apri);
		apri.addActionListener(this);
		salva = new JMenuItem("salva",KeyEvent.VK_S);
		menu.add(salva);
		salva.addActionListener(this);
		esci = new JMenuItem("esci",KeyEvent.VK_E);
		menu.add(esci);
		esci.addActionListener(this);
		testo= new JTextArea(25, 60);
		testo.setEditable(true);
		contenuto= new JScrollPane(testo);
		p = new JPanel();
		p.add(contenuto);
		this.getContentPane().add(p, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		taglia = new JMenuItem("taglia",KeyEvent.VK_S);
		modifica.add(taglia);
	    taglia.addActionListener(this);
	    copia = new JMenuItem("copia",KeyEvent.VK_S);
		modifica.add(copia);
	    copia.addActionListener(this);
	    incolla = new JMenuItem("incolla",KeyEvent.VK_S);
		modifica.add(incolla);
	    incolla.addActionListener(this);
	}
	public static void main(String[] args) {
		Editor pippo = new Editor();
		pippo.setVisible(true);
        pippo.setSize(500, 500);

	}

	//APRI TESTO 
	public void apriTesto() {
		int status = file.showOpenDialog(this);
		if (status == JFileChooser.APPROVE_OPTION)
		{
			try {
			File f = file.getSelectedFile();	
			Reader fin = new FileReader(f);	
			testo.read(fin, null);	
			}
			catch(Exception e) {}
		}
	}
	
	//salva tESTO
	public void salvaTesto() {
		int status = file.showOpenDialog(this);
		if (status == JFileChooser.APPROVE_OPTION) {
			try {
				File f = file.getSelectedFile();
				FileWriter out = new FileWriter(f);
				testo.write(out);
				setTitle(f.getName());
				}
				catch(Exception e) {}
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem) e.getSource();
		String s = source.getText();
		if (s.equals("apri")) {apriTesto();}
		if (s.equals("salva")) {salvaTesto();}
		if (s.equals("esci")) {System.exit(0);}
		if (s.equals("taglia")) {testo.cut();}
		if (s.equals("copia")) {testo.copy();}
		if (s.equals("incolla")) {testo.paste();}
		
	}

}
