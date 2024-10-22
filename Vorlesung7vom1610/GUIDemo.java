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

        //GUIDemo obj = new GUIDemo();

        GUIDemo gd = new GUIDemo();
        ActionListener obj = gd.new MyActionListener();
        jb2.addActionListener(obj);
        jb1.addActionListener(obj);

        //obj.printSomething(); -> geht nicht, weil obj vom Typ ActionListener ist und sieht
        //nur die Methode actionPerformed, während GUIDemo obj die ganze Klasse sehen würde

        //GUIDemo gd = (GUIDemo) obj; //Downcast


        System.out.println("blah");
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        //this.printSomething();
        JButton src = (JButton) e.getSource();
        System.out.println("Button geklickt: " + src.getText());
    }*/


    public void printSomething(){
        System.out.println("Something!");
        MyActionListener mal = new MyActionListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // non-static member class
     class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //this.printSomething();
            JButton src = (JButton) e.getSource();
            System.out.println("Button geklickt: " + src.getText());
        }
    }

    public MyActionListener getAL(){
        return new GUIDemo().new MyActionListener();
    }
} // Ende GUIDemo

class NichtMemberClass {
    public NichtMemberClass(){
        GUIDemo.MyActionListener mal = new GUIDemo().getAL();
    }
}