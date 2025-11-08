//This Java program takes command-line arguments, displays them, sorts them in ascending order, and then prints the sorted result.
import java.io.*;
import java.util.Arrays;

public class ASG2Ac
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < a.length; i++) 
        {
            System.out.println("Command Line arugement [" + i + "] : "+a[i]);
        }
        
        Arrays.sort(a);   
        
        System.out.println("Elements of array sorted in ascending order: ");
        
        for(int i=0 ; i <a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }         
}
