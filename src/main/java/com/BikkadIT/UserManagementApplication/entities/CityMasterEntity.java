package com.BikkadIT.UserManagementApplication.entities;



@Entity
@Table(name= "CITY_MASTER")
@Data
public class CityMasterEntity {
@Id
@Column(name= "CITY_ID")
private Integer cityid;
@Column(name= "CITY_Name")
private String cityname;
@Column(name= "STATE_ID")
private Integer stateid;
}
