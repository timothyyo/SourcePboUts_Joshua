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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm extends JFrame {
    private LaundryItem laundryItem;

    public InputForm() {
        setTitle("Form Input Laundry Sepatu");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Nama Pelanggan
        JLabel nameLabel = new JLabel("Nama Pelanggan:");
        nameLabel.setBounds(10, 20, 120, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);
        panel.add(nameField);

        // Jenis Sepatu (ComboBox)
        JLabel shoeTypeLabel = new JLabel("Jenis Sepatu:");
        shoeTypeLabel.setBounds(10, 60, 120, 25);
        panel.add(shoeTypeLabel);

        String[] shoeTypes = {"Sneakers", "Boots", "Formal"};
        JComboBox<String> shoeTypeBox = new JComboBox<>(shoeTypes);
        shoeTypeBox.setBounds(150, 60, 200, 25);
        panel.add(shoeTypeBox);

        // Jenis Layanan (RadioButtons)
        JLabel serviceTypeLabel = new JLabel("Jenis Layanan:");
        serviceTypeLabel.setBounds(10, 100, 120, 25);
        panel.add(serviceTypeLabel);

        JRadioButton deepCleanRadio = new JRadioButton("Deep Clean");
        JRadioButton quickWashRadio = new JRadioButton("Quick Wash");
        ButtonGroup serviceGroup = new ButtonGroup();
        serviceGroup.add(deepCleanRadio);
        serviceGroup.add(quickWashRadio);
        deepCleanRadio.setBounds(150, 100, 200, 25);
        quickWashRadio.setBounds(150, 130, 200, 25);
        panel.add(deepCleanRadio);
        panel.add(quickWashRadio);

        // Layanan Tambahan (Checkboxes)
        JLabel additionalServiceLabel = new JLabel("Layanan Tambahan:");
        additionalServiceLabel.setBounds(10, 170, 120, 25);
        panel.add(additionalServiceLabel);

        JCheckBox waterproofCheckbox = new JCheckBox("Waterproof");
        waterproofCheckbox.setBounds(150, 170, 200, 25);
        JCheckBox deodorizeCheckbox = new JCheckBox("Deodorize");
        deodorizeCheckbox.setBounds(150, 200, 200, 25);
        panel.add(waterproofCheckbox);
        panel.add(deodorizeCheckbox);

        // Catatan (TextArea)
        JLabel notesLabel = new JLabel("Catatan:");
        notesLabel.setBounds(10, 240, 120, 25);
        panel.add(notesLabel);

        JTextArea notesArea = new JTextArea();
        notesArea.setBounds(150, 240, 200, 60);
        panel.add(notesArea);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 320, 100, 25);
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerName = nameField.getText();
                String shoeType = (String) shoeTypeBox.getSelectedItem();
                String serviceType = deepCleanRadio.isSelected() ? "Deep Clean" : "Quick Wash";
                boolean additionalService = waterproofCheckbox.isSelected() || deodorizeCheckbox.isSelected();
                String notes = notesArea.getText();

                laundryItem = new LaundryItem(customerName, shoeType, serviceType, additionalService, notes);
                dispose(); // Menutup jendela setelah submit
                new ViewDataForm(laundryItem);
            }
        });

        add(panel);
        setVisible(true);
    }

    public LaundryItem getLaundryItem() {
        return laundryItem;
    }
}
