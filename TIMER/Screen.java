package timer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Screen extends JFrame implements ActionListener {
	
	private JPanel panel1;
	private Timer timer;
	int counter=0;
	
	public Screen(){
				
		setLayout(new GridLayout(1,1));
		setResizable(false);
		setSize(300,300);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color change");
		setVisible(true);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.black);
		add(panel1);
		//questo timer inizia a genreare eventi dopo che è stato avviato
		timer = new Timer(1000,(ActionListener) this);		
		timer.start();
		
		}
	
		
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter ++;
				if(counter <= 5){
					
					panel1.setBackground(Color.black);
				}else if(counter > 5 && counter <= 10){
					panel1.setBackground(Color.blue);
					
				}else {
					panel1.setBackground(Color.green);
					timer.stop();
					counter = 1;
					timer.start();
				}
				
			}
			
		
		

	
	
	public static void main(String args[]){
		
		Screen GUI = new Screen();
		
		
	}

	
}