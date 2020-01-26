package com.samplepratice.cts;
import java.util.*;
public class InsertElement {
	
	public static void main(String []args)
	{
		int len, pos,element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" all the elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        pos = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        element = sc.nextInt();
        for(int i = len-1; i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = element;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.print(arr[i]+",");
        }
       
	}

}
