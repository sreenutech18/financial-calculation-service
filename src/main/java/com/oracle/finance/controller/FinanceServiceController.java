/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.oracle.finance.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.finance.model.FinanceRequest;
import com.oracle.finance.model.FinanceResponse;

/**
 * @author sreenu,15-May-2022
 * Description :
 */
@RestController
@RequestMapping(value="/v1")
public class FinanceServiceController {
	
	@RequestMapping(value="/finservice", method=RequestMethod.POST, 
					produces="application/json", consumes="application/json")
	public FinanceResponse doPayments(@RequestBody FinanceRequest request,
									  @RequestHeader("client_id") String clientId,
									  @RequestHeader("message_ts") String messageTs,
									  @RequestHeader("version") String version,
									  @RequestHeader("correlationId") String correlationId) {
		
		//1. validating the request
		//2. call service layer and get the response
		//3. prpare the FinanceService response
		
		FinanceResponse finresponse = new FinanceResponse();
		finresponse.setAckNum("ref12121");
		finresponse.setDescrition("payment transaction done successfully");
		finresponse.setRespCode("0");
		finresponse.setRespMsg("success");
		
		
		return finresponse;
	}

}
