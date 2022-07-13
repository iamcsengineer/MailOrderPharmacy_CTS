package com.cts.refill.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**Model class for the business details*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TokenValid {
	
	private String uid;
	private String name;
	private boolean isValid;
}
