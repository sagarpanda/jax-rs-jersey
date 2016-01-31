package com.sagarpanda.demo.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sagarpanda.demo.webapp.pojo.UserVo;

import java.sql.*;
import java.util.ArrayList;

@Path("db-connect")
public class DBConnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<UserVo> connect() throws Exception {
		ArrayList<UserVo> userList = new ArrayList<UserVo>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeapi", "root", "root");
			st = con.createStatement();
			
			String query = "select * from users";
			rs = st.executeQuery(query);
			while(rs.next()){
				
				//String name = rs.getString("email");
				//System.out.println("name: " + name);
				
				UserVo userVo = new UserVo();
				userVo.setEmail(rs.getString("email"));
				userList.add(userVo);
			}
			
		} catch (Exception e) {
			 System.out.println("Error: " + e);
		}
		return userList;
	}
	
}
