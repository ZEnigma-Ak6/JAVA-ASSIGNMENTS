//2021PGCACA062 Assignment 10 Question 3 
//Write a java program using swing to create three buttons. On clicking the first button it displays “Good Morning”, clicking the second button displays “Hello” and clicking the third button displays “Welcome”.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment10_Q2 extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    Assignment10_Q2()
    {
        b1=new JButton("Good Morning");
        b1.setBounds(50,50,200,30);
        b2=new JButton("Hello");
        b2.setBounds(50,100,200,30);
        b3=new JButton("Welcome");
        b3.setBounds(50,150,200,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            JOptionPane.showMessageDialog(this,"Good Morning");
        }
        if(e.getSource()==b2)
        {
            JOptionPane.showMessageDialog(this,"Hello");
        }
        if(e.getSource()==b3)
        {
            JOptionPane.showMessageDialog(this,"Welcome");
        }
    }
    public static void main(String args[])
    {
        new Assignment10_Q2();
    }
}
