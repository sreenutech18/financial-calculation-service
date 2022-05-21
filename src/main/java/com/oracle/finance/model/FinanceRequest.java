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
public class FinanceRequest {
	
	private String rountingnumber;
	private String accountnumber;
	private String swiftcode;
	private String bankName;
	
	private String amount;
	private String customerName;
	private String mobilenum;
	private String billingDate;
	private String paymentDate;
	
	
	

}
