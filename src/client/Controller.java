package client;

import javax.swing.*;

public class Controller {
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;

        JFrame frame = new JFrame("View");
        frame.setContentPane(v.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}