package com.BikkadIT.UserManagementApplication.entities;
@Entity
@Table(name= "STATE_MASTER")

public class StateMasterEntity {
	@Id
	#column(name= "STATE_ID")
	
private  Integer stateid;
	@column(name= "STATE_NAME")
private String stateName;
	@column(name= "COUNTRY_ID")
private Integer countryid;

}
