package com.cts.test;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for the Multiplication");
		int n=sc.nextInt();
		for(int i=1;i<10;i++)
		{
			int k=n*i;
			System.out.println(n+"*"+i+"="+k);
		}
	}
}


