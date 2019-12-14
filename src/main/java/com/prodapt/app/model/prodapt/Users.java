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
	private Integer employeeID;
	@Column(name = "EmpProject")
	private String employeeProject;
	@Column(name = "EmpFirstName")
	private String employeeFirstName;
	@Column(name = "EmpLastName")
	private String employeeLastName;
	@Column(name = "EmpDesignation")
	private String employeeDesignation;
	@Column(name = "EmpMail")
	private String employeeMail;
	@Column(name = "EmpManagerId")
	private Integer employeeManagerId;
	@Column(name = "EmpDirectorId")
	private Integer employeeDirectorId;
	
}
