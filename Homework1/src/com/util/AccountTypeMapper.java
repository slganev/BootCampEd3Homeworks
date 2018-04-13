package com.util;

import com.accounts.AccountType;

public class AccountTypeMapper {
	
	public static final String SAVING_TYPE = "SAVING";
	
	public static AccountType map(String type) {
		if(type.equals("SAVING_TYPE")) {
			return AccountType.SAVING;
		}else {
			return AccountType.CHECKING;
		}
	}
	

}
