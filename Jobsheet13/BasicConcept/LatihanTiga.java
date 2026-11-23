package Jobsheet13.BasicConcept;

import javax.swing.*;
import java.awt.event.*;

public class LatihanTiga {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Input TextField");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 120, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 120, 25);
        frame.add(input2);

        JButton button = new JButton("Show");
        button.setBounds(20, 100, 120, 30);
        frame.add(button);

        JTextField output = new JTextField();
        output.setBounds(150, 100, 180, 30);
        output.setEditable(false);
        frame.add(output);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number1 = input1.getText();
                String number2 = input2.getText();
                output.setText("Input 1: " + number1 + " | Input 2: " + number2);
            }
        });

        frame.setVisible(true);
    }
}
