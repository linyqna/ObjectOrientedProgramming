package Jobsheet13.BasicConcept;

import javax.swing.*;
import java.awt.event.*;

public class LatihanLima {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Complete Calculator");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("CALCULATOR");
        title.setBounds(150, 10, 200, 25);
        frame.add(title);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 50, 100, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(120, 50, 150, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 90, 100, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(120, 90, 150, 25);
        frame.add(input2);

        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(20, 130, 100, 25);
        frame.add(labelResult);

        JTextField output = new JTextField();
        output.setBounds(120, 130, 150, 25);
        output.setEditable(false);
        frame.add(output);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(20, 180, 100, 30);
        frame.add(btnAdd);

        JButton btnLess = new JButton("Less");
        btnLess.setBounds(130, 180, 100, 30);
        frame.add(btnLess);

        JButton btnKali = new JButton("Kali");
        btnKali.setBounds(240, 180, 100, 30);
        frame.add(btnKali);

        JButton btnShare = new JButton("Share");
        btnShare.setBounds(20, 220, 100, 30);
        frame.add(btnShare);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(130, 220, 100, 30);
        frame.add(btnReset);

        JButton btnOut = new JButton("Out");
        btnOut.setBounds(240, 220, 100, 30);
        frame.add(btnOut);

        ActionListener operation = e -> {
            try {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double result = 0;

                if (e.getSource() == btnAdd) result = a + b;
                else if (e.getSource() == btnLess) result = a - b;
                else if (e.getSource() == btnKali) result = a * b;
                else if (e.getSource() == btnShare) result = a / b;

                output.setText(String.valueOf(result));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame,
                        "Input must be a number!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        };

        btnAdd.addActionListener(operation);
        btnLess.addActionListener(operation);
        btnKali.addActionListener(operation);
        btnShare.addActionListener(operation);

        btnReset.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
            output.setText("");
        });

        btnOut.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
