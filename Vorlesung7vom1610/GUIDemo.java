package Vorlesung7vom1610;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo implements ActionListener {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Titel");

        jf.add(new JLabel("Hello"), BorderLayout.NORTH);
        jf.add(new JTextField(10), BorderLayout.CENTER);

        JButton jb1 = new JButton("Cancel");
        JButton jb2 = new JButton("OK");

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout());
        jp.add(jb1);
        jp.add(jb2);

        jf.add(jp, BorderLayout.SOUTH);

        jf.pack();
        jf.setVisible(true);

        GUIDemo obj = new GUIDemo();
        jb2.addActionListener(obj);
        jb1.addActionListener(obj);

        System.out.println("blah");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        System.out.println("Button geklickt: " + src.getText());
    }
}
