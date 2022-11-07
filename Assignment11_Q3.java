//2021PGCACA062 Assignment 11 Question 3

//3) Use batch update to insert the details of new employees intot he employee table using a
//relevant jdbc program using java.

import java.sql.*;

public class Assignment11_Q3
{
    public static void main(String args[])
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("CONNECTION ESTABLISHED");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db5","root","Pas062");
            System.out.println("CONNECTION IS DONE");
            String ARM="INSERT INTO EMPLOYEE";
            PreparedStatement p=con.prepareStatement(ARM);
            p.setInt(1,125);
            p.setString(2,"NEWS");
            p.setString(3,"OXFORD");
            p.setString(4,"W");
            p.setDate(5, Date.valueOf("1997-09-13"));
            p.setString(6,"574");
            p.setInt(7,874);
            p.setInt(8,5);
            p.executeUpdate();
            System.out.println("INSERTED");
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("CLASS NOT FOUND"+e.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println("MANAGER"+e.getMessage());
        }

    }
}
