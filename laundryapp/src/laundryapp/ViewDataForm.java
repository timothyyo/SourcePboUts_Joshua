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

public class ViewDataForm extends JFrame {

    public ViewDataForm(LaundryItem laundryItem) {
        setTitle("Lihat Data Laundry Sepatu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama dengan background biru muda
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.setBackground(new Color(173, 216, 230)); // Warna biru muda

        // Teks dengan warna hitam
        JLabel customerLabel = new JLabel("Nama Pelanggan:");
        customerLabel.setForeground(Color.BLACK);
        panel.add(customerLabel);
        JLabel customerData = new JLabel(laundryItem.getCustomerName());
        customerData.setForeground(Color.BLACK);
        panel.add(customerData);

        JLabel shoeTypeLabel = new JLabel("Jenis Sepatu:");
        shoeTypeLabel.setForeground(Color.BLACK);
        panel.add(shoeTypeLabel);
        JLabel shoeTypeData = new JLabel(laundryItem.getShoeType());
        shoeTypeData.setForeground(Color.BLACK);
        panel.add(shoeTypeData);

        JLabel serviceTypeLabel = new JLabel("Jenis Layanan:");
        serviceTypeLabel.setForeground(Color.BLACK);
        panel.add(serviceTypeLabel);
        JLabel serviceTypeData = new JLabel(laundryItem.getServiceType());
        serviceTypeData.setForeground(Color.BLACK);
        panel.add(serviceTypeData);

        JLabel additionalServiceLabel = new JLabel("Layanan Tambahan:");
        additionalServiceLabel.setForeground(Color.BLACK);
        panel.add(additionalServiceLabel);
        JLabel additionalServiceData = new JLabel(laundryItem.isAdditionalService() ? "Ya" : "Tidak");
        additionalServiceData.setForeground(Color.BLACK);
        panel.add(additionalServiceData);

        JLabel notesLabel = new JLabel("Catatan:");
        notesLabel.setForeground(Color.BLACK);
        panel.add(notesLabel);
        JLabel notesData = new JLabel(laundryItem.getNotes());
        notesData.setForeground(Color.BLACK);
        panel.add(notesData);

        add(panel);
        setVisible(true);
    }
}
