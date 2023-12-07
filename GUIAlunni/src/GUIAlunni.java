import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class GUIAlunni extends JFrame {



    private JComboBox classeComboBox;

    private JTextArea output;

    private int contatore;



    public GUIAlunni() {

        setTitle("Lista degli Studenti per Classe");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Creare un JComboBox con le classi

        classeComboBox = new JComboBox();

        classeComboBox.addItem("5AI");

        classeComboBox.addItem("5BI");

        classeComboBox.addItem("5CI");

        classeComboBox.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                // Chiamare il metodo caricaAlunni senza passare direttamente il parametro

                caricaAlunni();

            }

        });



        // Creare un'area di testo per mostrare gli studenti

        output = new JTextArea();

        output.setEditable(false);



        // Aggiungere i componenti al contenitore

        Container container = getContentPane();

        container.setLayout(new BorderLayout());

        container.add(classeComboBox, BorderLayout.NORTH);

        container.add(new JScrollPane(output), BorderLayout.CENTER);

    }



    private void caricaAlunni() {

        // Svuotare l'area di testo prima di caricare nuovi dati

        output.setText("");

        contatore = 0;



        // Connessione al database e recupero degli studenti della classe selezionata

        String classeSelezionata = (String) classeComboBox.getSelectedItem();

        try (Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src/Database1.accdb")) {

            String query = "SELECT Nome, Cognome FROM studenti WHERE Classe = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, classeSelezionata);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {

                    while (resultSet.next()) {

                        // Aggiungere gli studenti all'area di testo

                      //  int id = resultSet.getInt("ID");

                        String nome = resultSet.getString("Nome");

                        String cognome = resultSet.getString("Cognome");

                        output.append("____________________________________________________\n");

                        //output.append("ID: " + id + "\n");

                        output.append("Cognome: " + cognome + "\n");

                        output.append("Nome: " + nome + "\n");

                        output.append("____________________________________________________\n\n");



                        contatore++;

                    }

                }

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



    
    }  