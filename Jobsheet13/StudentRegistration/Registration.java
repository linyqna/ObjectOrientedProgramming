package Jobsheet13.StudentRegistration;

import javax.swing.*;
import java.awt.event.*;

public class Registration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(420, 460);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 120, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 20, 210, 25);
        frame.add(txtName);

        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 120, 25);
        frame.add(lblNim);

        JTextField txtNim = new JTextField();
        txtNim.setBounds(150, 60, 210, 25);
        frame.add(txtNim);

        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 120, 25);
        frame.add(lblProdi);

        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(150, 100, 210, 25);
        frame.add(txtProdi);

        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(20, 140, 120, 25);
        frame.add(lblAddress);

        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(150, 140, 210, 25);
        frame.add(txtAddress);

        JLabel lblSchool = new JLabel("Origin of School:");
        lblSchool.setBounds(20, 180, 120, 25);
        frame.add(lblSchool);

        JTextField txtSchool = new JTextField();
        txtSchool.setBounds(150, 180, 210, 25);
        frame.add(txtSchool);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(20, 230, 160, 30);
        frame.add(btnSave);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(200, 230, 160, 30);
        frame.add(btnReset);

        JTextArea areaResult = new JTextArea();
        areaResult.setBounds(20, 280, 340, 120);
        areaResult.setEditable(false);
        frame.add(areaResult);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();
                String address = txtAddress.getText().trim();
                String school = txtSchool.getText().trim();

                if (name.isEmpty() || nim.isEmpty() || prodi.isEmpty() || address.isEmpty() || school.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "All fields must be filled in!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                areaResult.setText("Data Successfully Saved:\n");
                areaResult.append("Name: " + name + "\n");
                areaResult.append("NIM: " + nim + "\n");
                areaResult.append("Study Program: " + prodi + "\n");
                areaResult.append("Address: " + address + "\n");
                areaResult.append("Origin of School: " + school + "\n");

                JOptionPane.showMessageDialog(frame,
                        "Data saved successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                txtAddress.setText("");
                txtSchool.setText("");
                areaResult.setText("");
            }
        });

        frame.setVisible(true);
    }
}
