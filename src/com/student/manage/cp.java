package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;



public class cp {
	static Connection con;
	public static Connection createC()

	{
	
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection 
			String user="root";
			String password="amdocs";
			String url="jdbc:mysql://localhost:3306/student_manage";
			
			con=DriverManager.getConnection(user, password, url);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
