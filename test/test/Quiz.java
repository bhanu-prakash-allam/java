package com.samplepratice.cts;
import java.util.*;
public class Quiz {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to play quiz Y/N");
		char c=sc.next().charAt(0);
		if(c=='y')
		{
			System.out.println("ok here it comes");
			System.out.println("What is the Captial of India");
			System.out.println("1 Delhi");
			System.out.println("2 Mumbai");
			System.out.println("3 Chennai");
			byte choice=sc.nextByte();
			switch(choice)
			{
			case 1:System.out.println("thats Right..!!");
				   count++;
				   break;
			default :System.out.println("'wrong' the Capital of india is Delhi");
			}
			System.out.println("Can you store the value \"dog\" in a variable of type int?");
			System.out.println("1 yes");
			System.out.println("2 no");
			byte choice1=sc.nextByte();
			switch(choice1)
			{
			case 2:System.out.println("thats Right..!!");
				   count++;
				   break;
			default :System.out.println("Sorry, \"dog\" is a string. int can only store numbers");
			}
			System.out.println("What is the result of 9+9/3? ");
			System.out.println("1 5");
			System.out.println("2 12");
			System.out.println("2 15/3");
			byte choice2=sc.nextByte();
			switch(choice2)
			{
			case 2:System.out.println("thats Right..!!");
				   count++;
				   break;
			default :System.out.println("'Wrong' the result is 12");
			}
		 System.out.println("your score is "+count+" out of 3");
		}
		else
			System.out.println("ok");
	}
}
