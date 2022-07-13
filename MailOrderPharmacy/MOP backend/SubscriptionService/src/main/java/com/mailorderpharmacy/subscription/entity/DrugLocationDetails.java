package com.mailorderpharmacy.subscription.entity;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
/** class drug location details */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugLocationDetails {
	
	// Location Serial Id 
	@Id 
	private String serialId;
	
	// Location Name 
	private String location;
	
	// Quantity per Location 
	private int quantity;
	
	
	/* Object of drug class 
	 * containing drug details */
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "drugId")
	private DrugDetails drugDetails;


	
}