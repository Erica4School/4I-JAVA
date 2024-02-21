import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class PannelloPalle extends JPanel {
    private ArrayList<Palla> palle = new ArrayList<>();

    public PannelloPalle() {
        setBackground(Color.BLACK);

        // Aggiungi un certo numero di palle all'ArrayList
        for (int i = 0; i < 10; i++) {
            palle.add(new Palla(50 + i * 20, 50 + i * 20, 20, 2, 2)); // Dimensioni e velocità aggiornate
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(20); // Aggiorna ogni 20 ms
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    for (Palla palla : palle) {
                    	
                        palla.muovi(getWidth(), getHeight());
                    }
                    repaint(); // Richiedi il ridisegno del pannello
                }
            }
        }).start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Palla palla : palle) {
            palla.disegna(g2);
        	
        }
    }
}

