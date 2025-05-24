package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to run GUI creation on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Minimal Swing App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
            frame.add(label);

            frame.setLocationRelativeTo(null); // center window
            frame.setVisible(true);
        });
    }
}

