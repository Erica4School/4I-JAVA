
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerExample extends JFrame {
    private JLabel timerLabel;
    private Timer timer;
    private int seconds = 0;

    public TimerExample() {
        timerLabel = new JLabel("Tempo: 0 secondi");
        

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timerLabel.setText("Tempo: " + seconds + " secondi");
            }
        });

        JButton startButton = new JButton("Avvia Timer");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	timer.start();
            }
        });

        JButton stopButton = new JButton("Arresta Timer");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	timer.stop();
               System.out.print("hai fermato e riparte da 0");
                seconds = 0;
                timerLabel.setText("Tempo: " + seconds + " secondi");
            }
        });

        setLayout(new FlowLayout());
        add(timerLabel);
        add(startButton);
        add(stopButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    

   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TimerExample());
    }
}
