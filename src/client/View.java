package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JPanel panel1;
    public JButton skickaButton;
    public JTextField textField1;
    public JTextArea textArea1;


    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getSkickaButton() {return skickaButton;}

    public JTextArea getTextArea1() {return textArea1;}
}
