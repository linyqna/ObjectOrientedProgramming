package Jobsheet13.BasicConcept;

import javax.swing.*;
import java.awt.event.*;

public class LatihanEmpat {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Variation");
        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 150, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 150, 25);
        frame.add(input2);

        JTextField output = new JTextField();
        output.setBounds(20, 100, 280, 30);
        output.setEditable(false);
        frame.add(output);

        JButton btnDisplay = new JButton("Show");
        btnDisplay.setBounds(20, 150, 120, 30);
        frame.add(btnDisplay);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(150, 150, 120, 30);
        frame.add(btnDelete);

        JButton btnEmpty = new JButton("Empty");
        btnEmpty.setBounds(20, 190, 120, 30);
        frame.add(btnEmpty);

        JButton btnOut = new JButton("Out");
        btnOut.setBounds(150, 190, 120, 30);
        frame.add(btnOut);

        btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1 = input1.getText();
                String a2 = input2.getText();
                output.setText("Input 1 = " + a1 + " | Input 2 = " + a2);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText("");
                input2.setText("");
                output.setText("Input has been deleted.");
            }
        });

        btnEmpty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
            }
        });

        btnOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
