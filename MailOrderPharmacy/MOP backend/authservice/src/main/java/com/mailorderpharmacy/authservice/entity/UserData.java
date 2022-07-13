package com.mailorderpharmacy.authservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Model class for the business details
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@Table
public class UserData {

	// Id for user 
	@Id
	@Column(name = "userid", length = 20)
	private String userid;
	// Password for user
	@Column(name = "upassword", length = 20)
	private String upassword;
	/**
	 *Name for user 
	 */
	@Column(name = "uname", length = 20)
	private String uname;
	// Generated authentication token for the user
	private String authToken;
	
	
	
	
	
}

