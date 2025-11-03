// Reverse an array using BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASG1Ad 
{  
	public static void main(String[] args) throws IOException 
    {
        int n, res, i,j=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.print("Enter number of elements in the array:");
        n= Integer.parseInt(br.readLine());
        
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Reverse of an array is :");
        for( i=n;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }
    }
}  
// Coded By Me...!
