package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
 
 
class ConnectionDB1{
	 private Connection connect=null;
	 public Connection connectTo()  {
		 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/MiniProject", "root", "ShubhM@05");}
	 catch(Exception e) {
		 System.out.println(e);
	 }
		 return connect;
	 }	 
}
	
	
	

