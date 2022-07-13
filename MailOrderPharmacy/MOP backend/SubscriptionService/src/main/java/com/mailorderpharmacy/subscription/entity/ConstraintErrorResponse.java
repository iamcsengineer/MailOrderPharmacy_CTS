package com.mailorderpharmacy.subscription.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Constraint error response class */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConstraintErrorResponse 
{
	// http status
	private HttpStatus httpStatus;
	
	//date attribute
	private LocalDateTime localDateTime;
	
	//message
	private List<String> message;

	
}