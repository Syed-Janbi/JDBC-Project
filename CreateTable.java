
	package com.vc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class CreateTable {

		public static void main(String[] args) {
		
			try {
				// step-1 : load driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				// step-2 : establish connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25", "root", "Janbi@14");
				//step-3 :prepare statement
				Statement st = con.createStatement();
				//step-4 : execute query
				st.executeUpdate("create table student(id int,name varchar(50),course varchar(50))");
				// step-5 : close connection
				st.close();
				con.close();
				System.out.println("Table is created successfully!,check in Db");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}



