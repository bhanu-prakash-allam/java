package com.jdbcconection.cts;
import java.util.*;
import java.sql.*;
public class MyApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");

			
			Statement stmt = conn.createStatement();
            System.out.println("enter name to update in empolye table");
			String str=sc.nextLine();
			System.out.println("enter ID to update in employe table");
			int id=sc.nextInt();
			System.out.println("enter age to update in employe table");
			int ag=sc.nextInt();
			String  query = "insert into employe set ID="+id +", name='"+str+ "', age=" +ag;
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);


			ResultSet rs =  stmt.executeQuery("select * from employe");

			while(rs.next()) {
				System.out.println(rs.getInt("ID") + " | " + rs.getString("name") + " | " + rs.getString("age"));
			}

			rs.close();
			conn.close();
			
		}
		catch(Exception ex) {
			System.out.println("exception occured");

		}
	}

}

	

