// Employee Information 
import java.util.*;
class ASG2Aa
{
      static int cnt;
      int id, sal;
      String nm,dept;
      
      ASG2Aa() {}
      
      ASG2Aa(int eid,String name, String dpt, int sl)
      {
            id=eid;
            nm=name;
            dept=dpt;
            sal=sl;
            cnt++;
            System.out.println("object "+cnt+ " created ");
      }


      public String toString()
      {
            return "Employee Id = "+id+"\nnm = "+nm+"\nDeartment = "+dept+"\nSalary = "+sal;
      }
     
      public static void main(String a[])
      {
            int n,i,id,sal;
            String name, dept;
            System.out.println("How many objects you want to create ?");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            ASG2Aa ob[]=new  ASG2Aa[n];
            for(i=0;i<n;i++)
            {
                  System.out.println("Enter ID ");
                  id=sc.nextInt();
                  System.out.println("Enter Name");
                  name=sc.next();
                  System.out.println("Enter Department ");
                  dept=sc.next();
                  System.out.println("Enter Salary");
                  sal=sc.nextInt();
                  ob[i] = new  ASG2Aa(id,name,dept,sal);
            }

            System.out.println("\n\nEmployee's details as follows: ");
            for(i=0;i<n;i++)
            {
                  System.out.println(ob[i]);
            }
      }
}
