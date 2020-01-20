package com.cts.hwork;

public class Client {

	public static void main(String[] args)
	{
		Matrix m=new Matrix();
		m.initMatrix();
		System.out.println("the elements in the matrix is");
		m.display();
		//System.out.println("is the matrix is unit? "+m.isUnit());
		System.out.println("the row addition of the matrix is");
		m.rowAddition();
	}

}
