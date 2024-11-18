package Minuten_in_Sekunden;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minuten_in_Sekunden {
    public static void main(String[] args) {
        // Hauptfenster erstellen
        JFrame frame = new JFrame("Minuten in Sekunden");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // GUI-Komponenten erstellen
        JLabel eingabeLabel = new JLabel("Gib die Anzahl der Minuten ein:");
        JTextField eingabeFeld = new JTextField();
        JButton berechneButton = new JButton("Berechnen");
        JLabel ergebnisLabel = new JLabel("Ergebnis: ");
        JLabel anzeigeLabel = new JLabel("");

        // ActionListener für den Button
        berechneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Eingabe lesen und umrechnen
                    int minuten = Integer.parseInt(eingabeFeld.getText());
                    int sekunden = minuten * 60;

                    // Ergebnis anzeigen
                    anzeigeLabel.setText(minuten + " Minuten sind " + sekunden + " Sekunden.");
                } catch (NumberFormatException ex) {
                    anzeigeLabel.setText("Bitte eine gültige Zahl eingeben!");
                }
            }
        });

        // Komponenten zum Fenster hinzufügen
        frame.add(eingabeLabel);
        frame.add(eingabeFeld);
        frame.add(berechneButton);
        frame.add(ergebnisLabel);
        frame.add(anzeigeLabel);

        // Fenster sichtbar machen
        frame.setVisible(true);
    }
}

