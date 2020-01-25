package com.cts.test;
import java.util.*;
public class Factorial {

	public static void main(String []args)
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for the factorial");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of the number is "+fact);
	}
}
