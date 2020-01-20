package Pattern.java;
public class Pattern {
	public static void main(String[] args)
	{
		int row=9;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{   
				System.out.print(" ");
			}
			row--;
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

