package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame laba = new JFrame("");

        JTextField ax1 = new JTextField();
        JTextField ax2 = new JTextField();
        JTextField ax3 = new JTextField();
        JTextField ay1 = new JTextField();
        JTextField ay2 = new JTextField();
        JTextField ay3 = new JTextField();

        JTextField bx1 = new JTextField();
        JTextField bx2 = new JTextField();
        JTextField bx3 = new JTextField();
        JTextField by1 = new JTextField();
        JTextField by2 = new JTextField();
        JTextField by3 = new JTextField();

        JLabel name = new JLabel("Enter the coordinates of the first and second triangles (x; y).");

        JButton button = new JButton("Find out the answer");
        button.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int ax11 = Integer.parseInt(ax1.getText());
                int ax22 = Integer.parseInt(ax2.getText());
                int ax33 = Integer.parseInt(ax3.getText());
                int ay11 = Integer.parseInt(ay1.getText());
                int ay22 = Integer.parseInt(ay2.getText());
                int ay33 = Integer.parseInt(ay3.getText());

                int bx11 = Integer.parseInt(bx1.getText());
                int bx22 = Integer.parseInt(bx2.getText());
                int bx33 = Integer.parseInt(bx3.getText());
                int by11 = Integer.parseInt(by1.getText());
                int by22 = Integer.parseInt(by2.getText());
                int by33 = Integer.parseInt(by3.getText());

                int s1 = ((ax22 - ax11) * (ay33 - ay11) - (ax33 - ax11) * (ay22 - ay11)) / 2;
                int s2 = ((bx22 - bx11) * (by33 - by11) - (bx33 - bx11) * (by22 - by11)) / 2;

                if (s1 > s2){
                    JOptionPane.showConfirmDialog(null, "The area of the first triangle is larger than the area of the second.", "Result", JOptionPane.DEFAULT_OPTION);
                } else if (s2 > s1) {
                    JOptionPane.showConfirmDialog(null, "The area of the second triangle is larger than the area of the first.", "Result", JOptionPane.DEFAULT_OPTION);
                } else{
                    JOptionPane.showConfirmDialog(null, "The areas of the triangles are equal.", "Result", JOptionPane.DEFAULT_OPTION);
                }

            }
        });

        laba.add(name);

        laba.add(ax1);
        laba.add(ay1);
        laba.add(ax2);
        laba.add(ay2);
        laba.add(ax3);
        laba.add(ay3);

        laba.add(bx1);
        laba.add(by1);
        laba.add(bx2);
        laba.add(by2);
        laba.add(bx3);
        laba.add(by3);

        laba.add(button);

        laba.getContentPane().setLayout(new GridLayout(14, 1, 5, 5));

        laba.setBounds(40, 40, 440, 540); //хз как объяснить на русском
        laba.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        laba.setVisible(true);

    }
}
