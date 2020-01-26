package com.samplepratice.cts;
import java.util.*;
public class AssignmentString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String[] str1=str.split("\\s");
		for(byte i=0;i<str1.length;i++)
		{
				System.out.println(str1[i]);
			
		}
	}


}
