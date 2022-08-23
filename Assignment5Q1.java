
import java.util.*;

class UserVerySmallNumException extends Exception
{
    double p;
    UserVerySmallNumException(double a)
    {
        p = a;
    }
    public String toString()
    {
        return "UserVerySmallNumException[" + p + "]";
    }
}
class Aa
{
    void setmethod() throws IllegalAccessException
    {
        throw new IllegalAccessException("IllegalAccessException");
    }
    void getmethod() throws InterruptedException
    {
        throw new InterruptedException("InterruptedException");
    }
}

public class ASS_5 {

    public static void arrayfyit(Scanner sc)
    {
        System.out.println("Perform some array operations");
        try
        {
            System.out.print("Enter The  size of array  : ");
            int arr = sc.nextInt();
            if (arr <0)
                throw new NegativeArraySizeException(Integer.toString(arr ));
            int[] a1=new int[arr];
            System.out.print("Enter index between 0 to " + ( arr -1) + " and the value on that index : ");
            int k = sc.nextInt();
            if(k>= arr )
                throw new ArrayIndexOutOfBoundsException(Integer.toString(k));
            int val = sc.nextInt();
            a1[k] = val;
            System.out.println("Given value inserted at given index.");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array cannot be of negative size \n Size you entered : " +e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index not in range."+e.getMessage());
        }
        catch (IndexOutOfBoundsException e){

        }
    }

    static void compute(double r,double s)
            throws UserVerySmallNumException{
        double m = r/s;
        if(m<0.00001)
            throw new UserVerySmallNumException(m);
        else
            System.out.println("Division of two numbers is : "+m);
    }


    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        try{
            div1(sc);
        }
        catch(Exception e)
        {
            System.out.println("An UnknownError occured.");
        }
        finally{
            System.out.println("You have finished first and examined third exceptions");
            System.out.println("1.InputMismatchException \n"
                    + "2.ArithmeticException \n"
                    + "3.IllegalArgumentException");
        }


        try{
            arrayfyit(sc);
        }
        catch(Exception e){
            System.out.println("An UnknownError occured.");
        }
        finally{
            System.out.println("You have finished second and examined third exceptions");
            System.out.println("1.NegativeArraySizeException \n2.ArrayIndexOutOfBoundsException \n3.IndexOutOfBoundsException");
        }



        String myStr = null;
        try
        {
            System.out.println(myStr.length());
        }
        catch(NullPointerException e){
            System.out.println("Demonstrating NullPointerException.");
            System.out.println("String is not containing anything.");
        }
        finally{
            System.out.println("You have finished third & examined first exception");
            System.out.println("NullPointerException");
        }
        Aa a1 = new Aa();
        try
        {
            a1.setmethod();
            a1.getmethod();
        }
        catch(IllegalAccessException ex){
            System.out.println("Main:" + ex);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main"+e);
            finally
            {

                System.out.println("You have finished fourth & examined second exception");
                System.out.println("IllegealAccessExxception");
                System.out.println(InterruptedException);
            }
        }
        }
    }
