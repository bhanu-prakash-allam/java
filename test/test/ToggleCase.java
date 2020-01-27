package com.samplepratice.cts;
import java.util.*;
public class ToggleCase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String str2[]=str.split("\\s");
		String tog="";
		for(int i=0;i<str2.length;i++)
		{
			String letter1=str2[i].substring(0,1);
			String letter2=str2[i].substring(1);
			tog=tog+letter1.toLowerCase()+letter2.toUpperCase()+" ";
			
		}
		System.out.println(tog);
		
	}

}
