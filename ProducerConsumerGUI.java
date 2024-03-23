import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class ProducerConsumerGUI extends JFrame {
    private LinkedList<String> queue;
    private JTextArea producerTextArea;
    private JTextArea consumerTextArea;

    public ProducerConsumerGUI() {
        setTitle("Producer-Consumer GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        queue = new LinkedList<>();

        producerTextArea = new JTextArea(10, 20);
        producerTextArea.setEditable(false);
        producerTextArea.setBorder(BorderFactory.createTitledBorder("Producer"));

        consumerTextArea = new JTextArea(10, 20);
        consumerTextArea.setEditable(false);
        consumerTextArea.setBorder(BorderFactory.createTitledBorder("Consumer"));

        JPanel textPanel = new JPanel(new GridLayout(1, 2));
        textPanel.add(producerTextArea);
        textPanel.add(consumerTextArea);

        add(textPanel, BorderLayout.CENTER);

        JButton produceButton = new JButton("Produce");
        produceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                produce();
            }
        });

        JButton consumeButton = new JButton("Consume");
        consumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consume();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(produceButton);
        buttonPanel.add(consumeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private synchronized void produce() {
        String data = JOptionPane.showInputDialog(this, "Enter data to produce:");
        if (data != null && !data.trim().isEmpty()) {
            queue.add(data); // Aggiunge il dato alla LinkedList
            producerTextArea.append(data + "\n");
            notify(); // Notifica al consumatore che ci sono dati disponibili
        }
    }

    private synchronized void consume() {
        if (queue.isEmpty()) {
            JOptionPane.showMessageDialog(this, " è VUOTA", "VUOTA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String data = queue.remove(); // Rimuove il dato dalla LinkedList
            consumerTextArea.append(data + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProducerConsumerGUI();
            }
        });
    }
}
