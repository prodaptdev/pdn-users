package com.prodapt.app.model.prodapt;

import java.sql.Timestamp;

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
	@Column(name = "ID")	
	private String id;
	@Column(name = "Project")
	private String project;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "Mail")
	private String email;
	@Column(name = "ManagerId")
	private Integer managerId;
	@Column(name = "DirectorId")
	private Integer directorId;
	@Column(name = "LastModifiedDate")
	private Timestamp lastModifiedDate;
	
}
