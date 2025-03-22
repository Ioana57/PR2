package IB2.Vorlesung7vom1610;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiDemoLoesung implements ActionListener {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Toller Titel");

        jf.add(new JLabel("Hallo Welt!"), BorderLayout.NORTH);
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

        GuiDemoLoesung obj = new GuiDemoLoesung();
        jb1.addActionListener(obj);
        jb2.addActionListener(obj);

        System.out.println("Ende Gelände...");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        System.out.println("Button geklickt: " + src.getText());
    }

}