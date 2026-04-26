import java.util.Scanner;

public class Grading
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	float Mark1,Mark2,Mark3,Mark4,Average;
	String Grade;
	System.out.println("Please enter your marks for Chemistry");
	Mark1=obj.nextFloat();
	System.out.println("Please enter your marks for Physics");
	Mark2=obj.nextFloat();
	System.out.println("Please enter your marks for Compscience");
	Mark3=obj.nextFloat();
	System.out.println("Please enter your marks for Mathematics");
	Mark4=obj.nextFloat();
		
	Average=(Mark1+Mark2+Mark3+Mark4)/4;
	
	if(Average>=90)
	{
		Grade="A*";
	}
	else if(Average>=80)
	{
		Grade="A";
	}
	else if(Average>=70)
	{
		Grade="B";
	}
	else if(Average>=60)
	{
		Grade="C";
	}
	else if(Average>=50)
	{
		Grade="D";
	}
	else
	{
		Grade="F";
	}
	
	System.out.println(" Your average for the whole term is "+Average+" and your  grade for the whole term is "+Grade);
	}

}