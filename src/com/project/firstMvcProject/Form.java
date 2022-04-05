package com.project.firstMvcProject;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonIgnoreProperties({"last_name", "username"})
@JsonPropertyOrder({"address","first_name"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Form {

	
	
	
	public String first_name;
	@Pattern(regexp="[^0-9]*")
	public String last_name;
	
	
	@UserNameConstraint(username = "plamsal", message = "hehehehhfahedeahdja")
	public String username;
	
	public String password;
	public String address;
	public String contact;
	
	@Past
	public Date DOB;
	public List<String> skills;
	public Attributes attributes;
	
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Form [first_name=" + first_name + ", last_name=" + last_name + ", username=" + username + ", password="
				+ password + ", address=" + address + ", contact=" + contact + ", DOB=" + DOB + ", skills=" + skills
				+ ", attributes=" + attributes + "]";
	}
	
	
	
}
