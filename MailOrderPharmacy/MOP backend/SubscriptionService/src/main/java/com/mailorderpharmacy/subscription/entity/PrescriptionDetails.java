package com.mailorderpharmacy.subscription.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
/** Class for prescription details */
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionDetails {
	
	// prescription id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prescriptionId;
	
	//member id
	private String memberId;
	
	//member location
	private String memberLocation;
	
	//policy number
	private String policyNumber;
	
	//insurance provider name
	private String insuranceProvider;
	
	//prescription date
	private LocalDate prescriptionDate;
	
	// drug name
	private String drugName;
	
	// dosage status
	private String dosageDefinition;
	
	// drug quantity
	private int quantity;
	
	//course duration
	private int courseDuration; 
	
	// doctor name
	private String doctorName;


}
