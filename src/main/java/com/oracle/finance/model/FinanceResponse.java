/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.oracle.finance.model;

import lombok.Data;

/**
 * @author sreenu,15-May-2022
 * Description :
 */

@Data
public class FinanceResponse {
	
	
	public  String respCode;
	private String respMsg;
	private String ackNum;
	private String descrition;

	

}
