package org.example;

import java.awt.event.*;

import javax.swing.*;

public class PantallaTextoReload extends JFrame{
    public PantallaTextoReload() {

        this.setTitle("Ingrese el nombre de usuario");
        this.setSize(500, 239);
        this.setVisible(true);
        JButton boton =  new JButton("Finalizar");
        getContentPane().add(boton);
        boton.setBounds(152, 127, 125, 23);
        JTextField textField = new JTextField(20);
        textField.setBounds(133, 62, 166, 20);
        getContentPane().add(textField);
        JLabel label = new JLabel("Introduce algo");
        label.setBounds(200, 200, 166, 14);
        getContentPane().add(label);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Adios usuario: " + textField.getText());
            }
        });
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> {
            new PantallaTextoReload();
        });
    }
}
