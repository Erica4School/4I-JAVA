package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerApp extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton startButton;
    private Timer timer;
    private int countdown;

    public TimerApp() {
        setTitle("Conto alla rovescia");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione dei componenti
        label = new JLabel("Inserisci il tempo:");
        textField = new JTextField(10);
        startButton = new JButton("Avvia conto alla rovescia");

        // Aggiunta degli action listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                    countdown = Integer.parseInt(textField.getText());
                    if (countdown > 0) {
                        timer.start();
                        startButton.setEnabled(false);
                    } else {
                      JOptionPane.showMessageDialog(TimerApp.this, "numero non valido");  }
                }     
            
        });

        // Layout della GUI
        setLayout(new GridLayout(3, 1));
        add(label);
        add(textField);
        add(startButton);

        // Inizializzazione del timer
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countdown--;
                label.setText("Tempo rimanente: " + countdown + " secondi");

                if (countdown == 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(TimerApp.this, "Conto alla rovescia terminato!");
                }
            }
        });

        setVisible(true);
    }

  


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimerApp();
            }
        });
    }
}
