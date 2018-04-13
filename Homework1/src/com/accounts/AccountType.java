package com.accounts;

public enum AccountType {
	
	SAVING(0.25), CHECKING(0);

	private double interestRate;
	
	private AccountType(double interestRate) {
		this.interestRate = IBaseInterest.BASE_INTEREST - interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
	
	
	
}
