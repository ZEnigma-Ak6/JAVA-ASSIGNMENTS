//2021PGCACA062 Assignment 10 Question 1
//Write a java program using swing to find factorial of a number. User is allowed to enter a number into the text field whose factorial is to be determined and displayed on a JLabel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment10_Q1 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    Assignment10_Q1()
    {
        l1=new JLabel("Enter a number");
        l1.setBounds(50,50,100,30);
        l2=new JLabel("Factorial");
        l2.setBounds(50,100,300,30);
        t1=new JTextField();
        t1.setBounds(150,50,100,30);
        b1=new JButton("Find Factorial");
        b1.setBounds(50,150,200,30);
        b1.addActionListener(this);
        add(l1);
        add(l2);
        add(t1);
        add(b1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int n=Integer.parseInt(t1.getText());
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        l2.setText("Factorial of "+n+" is "+fact);
    }
    public static void main(String args[])
    {
        new Assignment10_Q1();
    }
}

