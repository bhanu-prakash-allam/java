package com.cts.test;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check leapyear or not");
		int n=sc.nextInt();
		if (n % 4 == 0) {
	        if (n % 100 == 0) {
	            if (n%400 == 0)
	               System.out.println("is a leap year.");
	            else
	               System.out.println("is not a leap year.");
	        } else
	            System.out.println("is a leap year.");
	    } else
	       System.out.println("is not a leap year.");
	}

}
