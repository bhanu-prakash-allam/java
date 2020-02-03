package com.client;
import java.util.*;
import cts.com.*;
public class ArrayAver {

	public static void main(String []args)
	{
		ArrayIn ar=new ArrayIn();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many values to claculate");
		int n=sc.nextInt();
		ar.average(n);
		ar.minPos();
		
	}

}
