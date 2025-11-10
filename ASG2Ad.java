//This Java program takes command-line name inputs, prints them, and then displays the last name with its first letter converted to uppercase.
import java.util.*;

class ASG2Ad
{
    public static void main(String a[])
    {
        System.out.println("Entered Name is");
        
        for(int i=0; i<a.length; i++)
        {
            System.out.println(" "+a[i]);
        }
        
        String lname;
        lname=a[2];
        String f=lname.substring(0,1);
        f=f.toUpperCase();
        
        System.out.println("\nConverted Name is");
        
        for(int i=0; i<a.length-1; i++)
        {
            System.out.println(""+a[i]);
        } 
        System.out.println(" "+f);
    }
}
