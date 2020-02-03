package cts.com;
import java.util.*;
public class ArrayIn
{
	int cnt=0;
	int b[]=new int[cnt];
	public void average(int n)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j=0;
			if(a[i]%5==0)
			{
				sum=sum+a[i];
				cnt++;
				b[j]=a[i];
			}
		}
		System.out.println("the average of multiples of 5 is "+sum);
		
	}
	public void minPos()
	{
		int min;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b.length);
		}
	    
		
	}

}

