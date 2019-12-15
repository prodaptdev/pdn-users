package com.prodapt.app.model.prodapt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description="All details about the users. ")
@Entity
@Table(name = "users")
@Data
public class Users {
	@Id	
	@Column(name = "EmpID")	
	private Integer id;
	@Column(name = "EmpProject")
	private String project;
	@Column(name = "EmpFirstName")
	private String firstName;
	@Column(name = "EmpLastName")
	private String lastName;
	@Column(name = "EmpDesignation")
	private String designation;
	@Column(name = "EmpMail")
	private String email;
	@Column(name = "EmpManagerId")
	private Integer managerId;
	@Column(name = "EmpDirectorId")
	private Integer directorId;
	
}
