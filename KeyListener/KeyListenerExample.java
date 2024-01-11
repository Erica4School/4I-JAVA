import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import java.awt.*; 
import java.awt.event.*; 

public class KeyListenerExample extends Frame implements KeyListener { 

 private TextField textField; 
 private Label displayLabel; 

 // Costruttore per capire il keylistener
 public KeyListenerExample() { 
     
     setTitle("prova il keylistener"); 
     setSize(400, 200); 
     setLayout(new FlowLayout()); 

      
     textField = new TextField(20); 
     textField.addKeyListener(this); 
     add(textField); 

     
     displayLabel = new Label("scrivi: "); 
     add(displayLabel); 

    
       
     
     setVisible(true); 
 } 

 
 @Override
 public void keyPressed(KeyEvent e) { 
	 System.out.println("premo un tasto"); 
 } 

 
 @Override
 public void keyReleased(KeyEvent e) { 
     System.out.println("rilascio"); 
 } 

 
 @Override
 public void keyTyped(KeyEvent e) { 
     char keyChar = e.getKeyChar(); 
     System.out.println("scrivo "); 
     displayLabel.setText("Testo: " + textField.getText() + keyChar); 
 } 

 public static void main(String[] args) { 
     new KeyListenerExample(); 
 } 
}