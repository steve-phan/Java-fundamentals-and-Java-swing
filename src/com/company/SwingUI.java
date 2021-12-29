package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingUI {


    public void createFrame() {
        JLabel label = createLabel();

        JFrame myFrame = new JFrame();
        ImageIcon logoIcon  = new ImageIcon("logo.png");


        myFrame.setSize(450, 450);
        myFrame.setResizable(false);
        myFrame.setTitle("Hello Java Swing");
        myFrame.setIconImage(logoIcon.getImage()); // require Image type.
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setBackground(Color.ORANGE);
        myFrame.getContentPane().setBackground(Color.lightGray);
        myFrame.add(label);
        myFrame.revalidate();
        myFrame.repaint();
//        myFrame.pack();

    }

    public JLabel createLabel() {

        JLabel myLabel = new JLabel();
//      Resize a ImageIcon
        ImageIcon logoIcon1  = new ImageIcon("logo.png");
        Image myImage = logoIcon1.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon logoIcon = new ImageIcon(myImage);

        Border labelBorder = BorderFactory.createLineBorder(Color.BLUE, 10);

        myLabel.setText("Wow Cooler Java Swing");
        myLabel.setIcon(logoIcon);
        myLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        myLabel.setBounds(0,0, 200, 200);
        myLabel.setHorizontalTextPosition(JLabel.CENTER);
        myLabel.setVerticalTextPosition(JLabel.TOP);
        myLabel.setIconTextGap(20);
//        myLabel.setHorizontalAlignment(JLabel.CENTER);
//        myLabel.setVerticalAlignment(JLabel.CENTER);
        myLabel.setBorder(labelBorder);



        return myLabel;


    }



}
