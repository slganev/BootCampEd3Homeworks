package com.util;

import java.util.Random;

import com.accounts.Account;
import com.accounts.AccountType;

public class RandomGenerator {
	
	private static Random r = new Random();
	
	public static String generateNumber(int digits) {
		StringBuilder number = new StringBuilder();
		for (int i = 0; i < digits; i++) {
			number.append(r.nextInt(10));
		}
		return number.toString();
	}
	
	public static String generateDAN(Account account) {
		StringBuilder dan = new StringBuilder();
		
		if(account.getAccountType().equals(AccountType.SAVING)) {
			dan.append(1);
		}else {
			dan.append(2);
		}
		dan.append(account.getSSN().substring(account.getSSN().length() - 3));
		dan.append(account.getUniqueNumber());
		dan.append(generateNumber(3));
		
		return dan.toString();
	}

}
