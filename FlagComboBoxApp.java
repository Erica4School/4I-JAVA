import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;
//uso delle API API, acronimo di Application Programming Interface (interfaccia di programmazione delle applicazioni), indica un insieme di definizioni e protocolli per la creazione e l'integrazione di applicazioni software.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class FlagComboBoxApp extends JFrame {

    private JComboBox<String> countryComboBox;
    private JLabel flagLabel;
    private Color color;
    
   
    public FlagComboBoxApp() {
        setTitle("Flag ComboBox App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aggiungi JComboBox con i paesi desiderati
        countryComboBox = new JComboBox<>();
        countryComboBox.addItem("IT");
        countryComboBox.addItem("DE");
        // Aggiungi altri paesi secondo necessità
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String selectedCountry = (String) countryComboBox.getSelectedItem();
                    String flagUrl = "https://flagsapi.com/" + selectedCountry + "/flat/64.png";
                    ImageIcon flagIcon = new ImageIcon(new URL(flagUrl));
                    flagLabel.setIcon(flagIcon);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        add(countryComboBox);

        flagLabel = new JLabel();
        add(flagLabel);

        // Utilizzo di FlowLayout per una gestione più flessibile della GUI
        setLayout(new FlowLayout());

        // Crea un timer che eseguirà l'azione dopo 1 secondo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();

                if ("IT".equals(selectedCountry)) {
                    color = Color.RED;
                } else if ("DE".equals(selectedCountry)) {
                    color = Color.BLUE;
                }

                // Richiama il metodo per ridisegnare la bandiera
                repaint();
            }
        });

        // Avvia il timer
        timer.start();
        
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);g.setColor(color);
        g.drawString("This is my country!", 50, 50);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlagComboBoxApp();
            }
        });
    }
}

   