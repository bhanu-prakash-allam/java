package com.samplepratice.cts;
import java.util.*;
public class NameOrAge {
	
	public static void name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122))
			{
				if(i==str.length()-1)
				   System.out.println("Hello my name is "+str);
				
			}
			else
			{
				System.out.println("Name should contain only alphabets");
				name();
				break;
			}
		}
	}
	public static void age()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		String age=sc.nextLine();
		try
		{
			Integer.parseInt(age);
			System.out.println("My age is "+age);
			
		}
		catch(NumberFormatException e)
		{	
			System.out.println("age should contain only numbers");
			age();
		}
	}
	public static void main(String[] args)
	{
		name();
		age();
	}
}


