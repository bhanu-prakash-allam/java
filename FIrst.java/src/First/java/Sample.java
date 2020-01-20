package First.java;
import java.util.*;
public class Sample {
public static void main(String[] args)
{
	int sum=0,div=1,exp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	while(n!=0)
	{
		int r=n%10;
		exp=exp+r*div;
		n=n/10;
		div=div*10;
	}
	System.out.println("the expansion of the number is"+" "+exp);
}
}
