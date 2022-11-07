//2021PGCACA062 Assignment 11 Question 1

//1) Using the employee table with the following schema, write a jdbc based program in java
//to retrieve and display the FNAME, MNIT, and LNAME of all the employee whose age is
//above 40.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment11_Q1
{
    public static void main(String arg[]){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root",
                    "Pass062");//logging to the database
            Statement state;
            state = connection.createStatement();
            ResultSet result;
            String myquery="SELECT * FROM EMPLOYEE WHERE>='40'";
            result = state.executeQuery(myquery);
            String first_name,last_name;
            int SAL;



            while (result.next())
            {
                first_name = result.getString("F_NAME");
                last_name = result.getString("L_NAME");
                SAL= result.getInt("SALARY");
                System.out.println("FNAME : " + first_name  + " LNAME : " + last_name  + " SALARY : " + SAL);
            }
            result.close();
            state.close();
            connection.close();
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
}
