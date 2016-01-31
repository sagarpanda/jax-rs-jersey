package com.sagarpanda.demo.webapp.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserModel {
	
	private long id;
	private String name;
	private String company;
	private Date created;
	
	public UserModel(){
		
	}
	
	public UserModel(long id, String name, String company){
		this.setId(id);
		this.setName(name);
		this.setCompany(company);
		this.setCreated(new Date());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
