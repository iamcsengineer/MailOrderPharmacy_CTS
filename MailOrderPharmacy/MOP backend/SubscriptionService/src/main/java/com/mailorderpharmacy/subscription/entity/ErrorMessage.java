package com.mailorderpharmacy.subscription.entity;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**Model class for the business details*/
/** Error message class */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage 
{
	// http status
	private HttpStatus status;
	
	//timestamp
	private LocalDateTime timestamp;
	
	//message
	private String message;


	
}