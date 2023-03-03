package client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;

        v.getSkickaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textField = v.textField1.getText();
                m.out.println(textField);
            }
        });

        JFrame frame = new JFrame("View");
        frame.setContentPane(v.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}