package com.sagarpanda.demo.webapp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sagarpanda.demo.webapp.model.UserModel;
import com.sagarpanda.demo.webapp.service.UserService;

@Path("users")
public class Users {
	
	UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserModel> getUserList(){
		return userService.getUserList();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel addUser(UserModel userModel){
		return userModel;
	}

	@PUT
	@Path("/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel updateUser(@PathParam("userId") long userId, UserModel userModel){
		userModel.setId(userId);
		return userModel;
	}
	
	@GET
	@Path("/{userId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUser(@PathParam("userId") String userId){
		return userId;
	}
	
}
