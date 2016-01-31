package com.sagarpanda.demo.webapp.service;

import java.util.ArrayList;
import java.util.List;

import com.sagarpanda.demo.webapp.model.UserModel;

public class UserService {
	
	public List<UserModel> getUserList(){
		UserModel u1 = new UserModel(1, "Sagar Panda", "HCL");
		UserModel u2 = new UserModel(2, "Alex Lopez", "Google");
		UserModel u3 = new UserModel(3, "Derrick Carson", "Yahoo");
		
		List<UserModel> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		return list;
	}

}
