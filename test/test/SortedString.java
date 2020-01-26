package com.samplepratice.cts;
import java.util.*;
public class SortedString {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string count");
		int cnt=sc.nextInt();
		String str[]=new String[cnt+1];
		System.out.println("enter strings into array");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		for (int i = 0; i <str.length; i++) 
	     {
	         for (int j = i + 1; j <str.length; j++) 
	          {
	             if (str[i].compareTo(str[j])>0) 
	              {
	                   String temp = str[i];
	                   str[i] = str[j];
	                   str[j] = temp;
	              }
	          }
	     }
		System.out.println("the sorted string array is");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
}
