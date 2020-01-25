package com.cts.test;
import java.util.*;
public class AlphabetOrNot {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charecter to check Alphabet or Not");
		char ch=sc.next().charAt(0);
		
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			System.out.println("It is Alphebet");
		}
		else
			System.out.println("Not a Alphebet");
			
	}
	
}
