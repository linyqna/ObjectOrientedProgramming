package Jobsheet13.Gym;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormRegistrationGym {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gym Member Registration Form");
        frame.setSize(420, 380);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Member Name:");
        lblName.setBounds(20, 20, 120, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 20, 230, 25);
        frame.add(txtName);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(20, 60, 120, 25);
        frame.add(lblAge);

        JTextField txtAge = new JTextField();
        txtAge.setBounds(150, 60, 230, 25);
        frame.add(txtAge);

        JLabel lblPackage = new JLabel("Gym Package:");
        lblPackage.setBounds(20, 100, 120, 25);
        frame.add(lblPackage);

        String[] packageGym = {"Monthly", "3 Months", "Yearly"};
        JComboBox<String> cbPackage = new JComboBox<>(packageGym);
        cbPackage.setBounds(150, 100, 230, 25);
        frame.add(cbPackage);

        JButton btnSave = new JButton("Member List");
        btnSave.setBounds(20, 150, 170, 30);
        frame.add(btnSave);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(210, 150, 170, 30);
        frame.add(btnReset);

        JTextArea areaResult = new JTextArea();
        areaResult.setBounds(20, 200, 360, 120);
        areaResult.setEditable(false);
        frame.add(areaResult);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText().trim();
                String ageStr = txtAge.getText().trim();
                String paket = cbPackage.getSelectedItem().toString();

                if (name.isEmpty() || ageStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Name and age required!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int age;
                try {
                    age = Integer.parseInt(ageStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Age must be a number!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5433/db_gym",
                        "postgres",
                        "12345678"
                    );

                    String sql = "INSERT INTO member_gym (nama, usia, paket) VALUES (?, ?, ?)";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setString(1, name);
                    stmt.setInt(2, age);
                    stmt.setString(3, paket);
                    stmt.executeUpdate();
                    conn.close();

                    areaResult.setText("SUCCESSFUL REGISTRATION:\n");
                    areaResult.append("Name: " + name + "\n");
                    areaResult.append("Age: " + age + "\n");
                    areaResult.append("Package: " + paket + "\n");

                    JOptionPane.showMessageDialog(frame,
                            "Gym member successfully registered!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Failed to save to database!\n" + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtAge.setText("");
                cbPackage.setSelectedIndex(0);
                areaResult.setText("");
            }
        });

        frame.setVisible(true);
    }
}
