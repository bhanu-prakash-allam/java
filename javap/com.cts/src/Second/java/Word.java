package Second.java;
import java.util.*;
public class Word {
	public static void main(String[] args)
	{
		int sum=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		while(sum!=0)
		{
			int r=sum%10;
			switch(r)
			{
			case 0:System.out.println("zero");
					break;
			
			case 1:System.out.println("one");
					break;
			case 2:System.out.println("two");
					break;
			case 3:System.out.println("three");
			        break;
			case 4:System.out.println("four");
			        break;
			case 5:System.out.println("five");
			        break;
			case 6:System.out.println("six");
					break;
			case 7:System.out.println("seven");
					break;
			case 8:System.out.println("eight");
					break;
			case 9:System.out.println("nine");
					break;
			}
			sum=sum/10;
		}
		
	}

}
