package Jobsheet13.BasicConcept;

import javax.swing.*;
import java.awt.event.*;

public class LatihanDua {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Number:");
        label.setBounds(20, 20, 120, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 120, 25);
        frame.add(textField);

        JButton btnDisplay = new JButton("Show");
        btnDisplay.setBounds(20, 60, 120, 30);
        frame.add(btnDisplay);

        JLabel lblResult = new JLabel("Result: -");
        lblResult.setBounds(150, 60, 150, 30);
        frame.add(lblResult);

        btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                lblResult.setText("Result: " + input);
            }
        });

        frame.setVisible(true);
    }
}
