package com.samplepratice.cts;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateDifference {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first date in dd MM yyyy format");
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		String date1=sc.nextLine();
		System.out.println("enter second date in dd MM yyyy format");
		String date2=sc.nextLine();

		 try {
		       Date dateBefore = myFormat.parse(date1);
		       Date dateAfter = myFormat.parse(date2);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		 } 
		 catch (Exception e) 
		 {
		       e.printStackTrace();
		 }

	}

}
