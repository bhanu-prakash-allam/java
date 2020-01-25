package com.samplepratice.cts;
import java.util.*;
public class NameAndGraduation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter year of Graduation");
		int age=sc.nextInt();
		System.out.println("my name is "+name+" my Graduation year is "+age);
		sc.close();
	}
}
