/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundryapp;

/**
 *
 * @author Nitor 5 GK
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private User user;

    public LoginForm() {
        setTitle("Login - Laundry Sepatu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama dengan background biru muda
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(173, 216, 230)); // Warna biru muda

        // Komponen Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 20, 80, 25);
        usernameLabel.setForeground(Color.WHITE); // Warna teks putih
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        // Komponen Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        passwordLabel.setForeground(Color.WHITE); // Warna teks putih
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        // Tombol Login dengan warna hijau muda
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 80, 25);
        loginButton.setBackground(new Color(144, 238, 144)); // Warna hijau muda
        loginButton.setForeground(Color.BLACK);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Verifikasi username dan password
                if (username.equals("admin") && password.equals("1234")) {
                    user = new User(username, password);
                    dispose(); // Menutup jendela setelah login berhasil
                    new InputForm(); // Masuk ke form input
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal! Username atau password salah.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public User getUser() {
        return user;
    }
}
