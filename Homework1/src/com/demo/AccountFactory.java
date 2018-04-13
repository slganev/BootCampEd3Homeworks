package com.demo;

import java.util.ArrayList;

import com.accounts.Account;
import com.util.AccountTypeMapper;
import com.util.CSVReader;

public class AccountFactory {
	
	public static ArrayList<Account> generate(){
		ArrayList<String[]> accountsData = CSVReader.read();
		ArrayList<Account> accounts = new ArrayList<>();
		
		for (int i = 0; i < accountsData.size(); i++) {
			accounts.add(new Account(accountsData.get(i)[0].trim(), accountsData.get(i)[1].trim(),
					AccountTypeMapper.map(accountsData.get(i)[2].trim()),
					Double.parseDouble(accountsData.get(i)[3].trim())));
		}
		
		return accounts;
		
	}
	

}
