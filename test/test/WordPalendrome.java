package com.samplepratice.cts;
import java.util.*;
public class WordPalendrome {
	public static void stringPalendrome(String str1)
	{
		String rev="";
		for(int i= str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		if(str1.equals(rev))
		{
			System.out.println("string is a palendrome");
		}
		else
			System.out.println("string is not palendrome");
	}
	public static void numberPalendrome(int number)
	{
		int temp=number,sum=0;
		while(temp!=0)
		{
			int r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(sum==number)
		{
			System.out.println("number is a palendrome");
		}
		else
			System.out.println("number NOT  is a palendrome");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to check palendrome or not");
		String str=sc.nextLine();
		stringPalendrome(str);
		System.out.println("enter a number to check palendrome or not");
		int number=sc.nextInt();
		numberPalendrome(number);
			
	}
}
