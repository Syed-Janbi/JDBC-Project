package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjun25","root","Janbi@14");
		
		PreparedStatement st = con.prepareStatement("update student set course= ? where id= ? ");
        st.setString(1,"Hibernate");
        st.setInt(2, 102);
        int rowsUpdated = st.executeUpdate();
        System.out.println("No of rows updated :" + rowsUpdated);
        
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
