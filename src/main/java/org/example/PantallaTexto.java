package org.example;
import javax.swing.*;

class PantallaTexto extends JFrame{
    public PantallaTexto(){
        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("Introduce algo");
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);

        this.add(panel);

        this.setTitle("Ejemplo de JTextField en JFrame");
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> {
            new PantallaTexto();
        });
    }
}
