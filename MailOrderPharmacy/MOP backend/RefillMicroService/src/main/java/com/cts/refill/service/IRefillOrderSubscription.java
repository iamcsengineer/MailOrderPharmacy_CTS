/**
 * 
 */
package com.cts.refill.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.refill.exception.InvalidTokenException;
import com.cts.refill.model.RefillOrderLine;


@Service
public interface IRefillOrderSubscription {
	
	/**
	 * @param token
	 * @return
	 * @throws InvalidTokenException
	 */
	public List<RefillOrderLine> getAllSubscription(String token) throws InvalidTokenException;
	
	/**
	 * @param order
	 * @param token
	 * @return
	 * @throws InvalidTokenException
	 */
	//public RefillOrderLine updateRefillOrderLine(RefillOrderLine order,String token) throws InvalidTokenException;
	/**
	 * @param subId
	 * @param memberId
	 * @param quantity
	 * @param time
	 * @param token 
	 * @return
	 * @throws InvalidTokenException
	 */
	public RefillOrderLine updateRefillOrderSubscription(long subId, String memberId, int quantity, int time, String token) throws InvalidTokenException;

	
	
	/**
	 * @param subID
	 * @param token
	 * @throws InvalidTokenException
	 */
	public void deleteBySubscriptionId(long subID,String token) throws InvalidTokenException;
}
