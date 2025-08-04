package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root","Janbi@14");
			PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
			st.setInt(1, 102);
			st.setString(2, "priya");
			st.setString(3,"Java");
			
			int noOfRows=st.executeUpdate();
			
			System.out.println("No of rows inserted " + noOfRows);
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
