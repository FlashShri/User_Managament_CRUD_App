package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.user.model.User;

public class UserDao {
	
	String Db_URL = "jdbc:mysql://localhost:3306/advjava";
	String username = "flash";
	String pass = "flash";
	
	
	public boolean insertUser( User user )   {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection(Db_URL, username , pass);
			 String sql = "insert into usermanag (name , email , password , country) values(?, ?,?,?)";
			  PreparedStatement stmt = con.prepareStatement(sql);
			  
			  stmt.setString(1, user.getName());
			  stmt.setString(2, user.getEmail());
			  stmt.setString(3, user.getPassword());
			  stmt.setString(4, user.getCountry());
			  
			  int rs =  stmt.executeUpdate();
			  
			  if( rs > 0) {
				  System.out.println("user inserted");
				  return true;
			  }
		}catch(ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<User> fetchAllUser() {
		List<User> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection(Db_URL, username , pass);
			 String sql = "Select * from usermanag order by name asc ";
			 
			  PreparedStatement stmt = con.prepareStatement(sql);
			  
			   ResultSet rs = stmt.executeQuery();
			   
			   while( rs.next()) {
				   
				   User newUser  =new User(
						   rs.getInt(1),
						   rs.getString("name"),
						   rs.getString("email"),
						   rs.getString("password"),
						   rs.getString("country")
						   );
				   
				   list.add(newUser);
			   }
			
		}catch(ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
public boolean deleteUser( int id )   {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection(Db_URL, username , pass);
			 String sql = " delete from usermanag where id=?";
			  PreparedStatement stmt = con.prepareStatement(sql);
			  
			  stmt.setInt(1, id);
			 
			  int rs =  stmt.executeUpdate();
			  
			  if( rs > 0) {
				  System.out.println("user deleted");
				  return true;
			  }
		}catch(ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

public boolean updateUser( User user )   {
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection(Db_URL, username , pass);
		 String sql = "update usermanag set name=? , email=? , password=? , country=? where id=? ";
		  PreparedStatement stmt = con.prepareStatement(sql);
		  
		  stmt.setString(1, user.getName());
		  stmt.setString(2, user.getEmail());
		  stmt.setString(3, user.getPassword());
		  stmt.setString(4, user.getCountry());
		  stmt.setInt(5, user.getId());
		  
		  int rs =  stmt.executeUpdate();
		  
		  if( rs > 0) {
			  System.out.println("user updated");
			  return true;
		  }
	}catch(ClassNotFoundException| SQLException e) {
		e.printStackTrace();
	}
	return false;
}
	

}
