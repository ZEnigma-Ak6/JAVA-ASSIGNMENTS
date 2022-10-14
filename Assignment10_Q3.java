//2021PGCACA062 Assignment 10 Question 3 
//Write a program in java for dress item purchasing and billing using checkbox in swing.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment10_Q3 extends JFrame implements ActionListener

{
    JLabel l;
    JCheckBox c1,c2,c3,c4;
    JButton b;
    Assignment10_Q3()
    {
        l=new JLabel("Select your dress");
        l.setBounds(50,50,100,30);
        c1=new JCheckBox("Shirt @ 100");
        c1.setBounds(50,100,100,30);
        c2=new JCheckBox("Pant @ 200");
        c2.setBounds(50,150,100,30);
        c3=new JCheckBox("T-Shirt @ 300");
        c3.setBounds(50,200,300,30);
        c4=new JCheckBox("Jeans @ 400");
        c4.setBounds(50,250,100,30);
        b=new JButton("Bill");
        b.setBounds(50,300,100,30);
        b.addActionListener(this);
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        float amount=0;
        String msg="";
        if(c1.isSelected())
        {
            amount+=100;
            msg=" Shirt: 100 \n ";
}
        if(c2.isSelected())
        {
            amount+=200;
            msg=msg+" Pant: 200 \n ";
        }
        if(c3.isSelected())
        {
            amount+=300;
            msg=msg+" T-Shirt: 300 \n ";
        }
        if(c4.isSelected())
        {
            amount+=400;
            msg=msg+" Jeans: 400 \n ";
        }
        msg=msg+"-----------------------------\n"+" Total:" +amount;
        JOptionPane.showMessageDialog(this,msg);
    }
    public static void main(String args[])
    {
        new Assignment10_Q3();
    }
}
