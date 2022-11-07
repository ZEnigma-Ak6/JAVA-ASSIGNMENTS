//2021PGCACA062 Assignment 11 Question 2

//2) Using the employee table with the following schema, write a jdbc based program in java
//to retrieve and display the average salary of each department.

import java.sql.*;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment11_Q2
{
    public static void main(String []args)
    {
        Connection con;
        PreparedStatement ps;
        ResultSet reslt;
        HashSet<String> h1=new HashSet<String>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("DRIVER LOADED");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db5","root","GIGACHAD4638");
            System.out.println("CONNECTION ESTABLISHED");
            String Myquary="SELECT * FROM EMPLOYEE";
            ps=con.prepareStatement(Myquary);
            reslt=ps.executeQuery();
            while(reslt.next())
            {
                h1.add(reslt.getString("DEPARTMENT"));
            }
            Iterator it=h1.iterator();
            while(it.hasNext())
            {
                Myquary="SELECT AVG SALARY FROM EMPLOYEE WHERE DEPARTMENT='";
                Myquary=Myquary+it.next();
                Myquary=Myquary+"'";
                ps=con.prepareStatement(Myquary);
                reslt=ps.executeQuery();
                while(reslt.next())
                {
                    System.out.println(reslt.getFloat("AVG(SALARY)"));
                }
            }con.close();ps.close();reslt.close();
        } catch (ClassNotFoundException e)
        {
            System.out.println("DRIVER IS NOT LOADED"+e.getMessage());
        }
        catch(SQLException E)
        {
            System.out.println("SQL EXCEPTION"+E.getMessage());
        }

    }
}
