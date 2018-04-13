package com.accounts;

import java.math.BigDecimal;

import com.additionalproperties.DebitCard;
import com.additionalproperties.IProperty;
import com.additionalproperties.SafetyDepositBox;
import com.util.RandomGenerator;
import com.util.StringValidator;

public class Account implements IBaseInterest {

	private static int UNIQUE_NUM_COUNTER = 10000;
	
	private int uniqueNumber;
	private String names;
	private String SSN; //Social Security Numbers
	private AccountType accountType;
	private String DAN; //Digit Account Number
	private double initialDeposit;
	private IProperty iProperty;
	
	public Account(String names, String SSN, AccountType accountType, double initialDeposit) {
		Account.UNIQUE_NUM_COUNTER++;
		this.uniqueNumber = Account.UNIQUE_NUM_COUNTER;
		if(StringValidator.isStringValid(names) && names.indexOf(" ") > 0) {
			this.names = names.trim();
		}
		if(StringValidator.isStringValid(SSN) && SSN.length() >= 5) {
			this.SSN = SSN.trim();
		}
		this.accountType = accountType;
		if(StringValidator.isStringValid(DAN) && DAN.length() == 11 && (DAN.charAt(0) == '1' || DAN.charAt(0) == '2')) {
			this.DAN = DAN.trim();
		}
		if(initialDeposit >= 0) {
			this.initialDeposit = initialDeposit;
		}
		createIProperty();
		this.DAN = RandomGenerator.generateDAN(this);
	}
	
	public void deposit(double sumDeposited) {
		this.initialDeposit += sumDeposited;
	}
	
	public void withdraw(double sumWithdrawed) {
		this.initialDeposit -= sumWithdrawed;
	}
	
	public void transfer(Account account, double sum) {
		account.deposit(sum);
	}

	public void showInfo() {
		StringBuilder message = new StringBuilder();
		message.append("This Account is of type " + this.accountType.toString());
		message.append(", of user " + this.names + ", SSN: " + this.SSN + ", DAN: " + this.DAN + ", with initial deposit = " + this.initialDeposit);
		System.out.println();
	}
	
	private void createIProperty() {
		if(this.accountType.equals(AccountType.SAVING)) {
			this.iProperty = new SafetyDepositBox();
		}else {
			this.iProperty = new DebitCard();
		}
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public int getUniqueNumber() {
		return uniqueNumber;
	}

	public String getSSN() {
		return SSN;
	}
	
	
	
}
