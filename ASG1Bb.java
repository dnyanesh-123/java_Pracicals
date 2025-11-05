// This is the command-line argument using java
public class ASG1Bb 
{
	private int x;
	public ASG1Bb()
	{
		x=0;
	}
	public ASG1Bb(int x)
	{
		this.x=x;
	}
	public boolean isNegative()
	{
		if(x<0)
			return true;
		else 
			return false;
	}
	public boolean isPositive()
	{
		if(x>0)
			return true;
		else 
			return false;
	}
	public boolean isZero()
	{
		if(x==0)
			return true;
		else 
			return false;
	}
	public boolean isOdd()
	{
		if(x%2!=0)
			return true;
		else 
			return false;
	}	
	public boolean isEven()
	{
		if(x%2==0)
			return true;
		else 
			return false;
	}
 
	public static void main(String [] args) 
	{
		int x=Integer.parseInt(args[0]);
		ASG1Bb m=new ASG1Bb(x);
		
		if(m.isNegative())
			System.out.println("Number is Negative");
		
		if(m.isPositive())
			System.out.println("Number is Positive");
  
		if(m.isEven())
			System.out.println("Number is Even");
  
		if(m.isOdd())
			System.out.println("Number is Odd");
  
		if(m.isZero())
			System.out.println("Number is Zero");
	}
}
