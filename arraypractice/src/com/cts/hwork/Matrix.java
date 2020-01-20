package com.cts.hwork;
import java.util.*;
public class Matrix {

	Scanner sc=new Scanner(System.in);
	private int mat[][];
		public void initMatrix()
		{
			System.out.println("enter number of rows");
			byte r=sc.nextByte();
			System.out.println("enter number of coloumns");
			byte c=sc.nextByte();
			mat=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.println("enter the element of "+(i+1)+" row "+"and "+(j+1)+" coloumn");
					mat[i][j]=sc.nextInt();
				}
			}
		}

		public void display()
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{

					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
		public void rowAddition()
		{
			int sum=0;
			
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{  
					sum=sum+mat[i][j];
				}
				System.out.println("the sum of the row "+(i+1)+" "+"row is "+sum);
				sum=0;
			}
		
		}
		/*public boolean isUnit()
		{
			int cnt=0;
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					if(mat[i][j]==1)
					{
						cnt++;
					}
				}
			}
			if(cnt==)
			return true;
		}*/

	}

