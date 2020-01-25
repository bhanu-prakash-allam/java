package com.cts.test;
import java.util.Scanner;
public class AsciValue {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string  to print in  ASCI values");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		System.out.println("the ASCI value of the charecter "+ch[i]+" is "+(int)ch[i]);
		}
	}

}
