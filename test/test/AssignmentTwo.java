package com.samplepratice.cts;
import java.util.*;
public class AssignmentTwo {
	public static void integerSorting(int[] arr)
	{
		
		for(byte i=0;i<arr.length;i++)
		{
			for(byte j=(byte) (i+1);j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("the sorted integer array is ");
		for(byte i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void floatSorting()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the float values count");
		float count=sc.nextFloat();
		float a[]=new float[(int) count];
		System.out.println("enter the float values");
		for(byte i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();
		}
		for(byte i=0;i<a.length;i++)
		{
			for(byte j=(byte) (i+1);j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					float temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the sorted float array is ");
		for(byte i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void minNumber(int arr1[])
	{
		int min=arr1[0];
		for(byte i=0;i<arr1.length;i++)
		{
			if(arr1[i]<min)
				min=arr1[i];
		}
		System.out.println("the minimum element in the Integer array is "+min);
	}
	public static void maxNumber(int arr2[])
	{
		int max=arr2[0];
		for(byte i=0;i<arr2.length;i++)
		{
			if(arr2[i]>max)
				max=arr2[i];
		}
		System.out.println("the Maximum element in the Integer array is "+max);
	}
	public static void removeNumber(int[] arr3)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a position to remove element from the array");
		int pos=sc.nextInt();
		if(pos>arr3.length)
		{
			System.out.println("'Error' no element is found in that position");
		}
		else
		{
			for(int i=pos-1;i<arr3.length-1;i++)
			{
				arr3[i]=arr3[i+1];
			}
			System.out.println("array elements after removing the element");
			for(byte i=0;i<arr3.length-1;i++)
			{
				System.out.println(arr3[i]);
			}
		}
		
	}
	
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integers count");
		byte count=sc.nextByte();
		int a[]=new int[count];
		System.out.println("enter the values");
		for(byte i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		integerSorting(a);
		floatSorting();
		minNumber(a);
		maxNumber(a);
		removeNumber(a);
	}

}
