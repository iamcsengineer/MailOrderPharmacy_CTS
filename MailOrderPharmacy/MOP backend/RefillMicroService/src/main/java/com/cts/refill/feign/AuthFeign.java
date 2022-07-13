package com.cts.refill.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.refill.model.TokenValid;



/**Interface to connect with authentication service*/
@FeignClient(name = "AUTH", url = "http://localhost:8090/authapp")
public interface AuthFeign {

	/**
	 * @param token
	 * @return
	 */
	@GetMapping(value = "/validate")
	public TokenValid getValidity(@RequestHeader("Authorization") final String token);
}
