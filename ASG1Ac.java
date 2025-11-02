// Volume Factorials and Armstrong Using Java
import java.io.*;
public class ASG1Ac
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        while(true)
        {
          
        System.out.println("\n1. Volume of Cylinder");              //user input
        System.out.println("2. Factorial");
        System.out.println("3. Armstrong");
        System.out.println("4. Exit");
 
        System.out.println("enter your choice:");       //choice reading
        int a= Integer.parseInt(br.readLine());
        
      switch (a)                      //actions based on choice
        {
            case 1:
 
                System.out.println("Enter Radius:");
                Float r= Float.parseFloat(br.readLine());
                System.out.println("Enter Height:");
                Float h= Float.parseFloat(br.readLine());
                                
                System.out.println("Volume of Cylinder= " + (22/7*r*r*h));
                break;
 
            case 2:
                System.out.println("Enter a number:");
                int num = Integer.parseInt(br.readLine()); //It is the number to calculate factorial 
                int i,fact=1;  
                   
                for(i=1;i<=num;i++){    
                    fact=fact*i;    
                }    
                System.out.println("Factorial of "+num+" is: "+fact);    
                break;
                
            case 3:
            	System.out.println("Enter a number: ");
                int nm = Integer.parseInt(br.readLine()); //It is the number to check armstrong factorial 
                int no, remainder, result = 0;

                no = nm;

                while (no != 0)
                {
                    remainder = no % 10;
                    result += Math.pow(remainder, 3);
                    no /= 10;
                }

                if(result == nm)
                    System.out.println(nm + " is an Armstrong number.");
                else
                    System.out.println(nm + " is not an Armstrong number.");
             break;
 
            case 4:
                System.exit(0);
 
            default:
                System.out.println("Invalid Entry!");
        }
 }

    }
}
 // Coded By Me
