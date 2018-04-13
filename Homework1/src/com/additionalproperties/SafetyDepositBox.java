package com.additionalproperties;

import com.util.RandomGenerator;

public class SafetyDepositBox implements IProperty {

	private String number;
	private String code;
	
	public SafetyDepositBox() {
		this.number = RandomGenerator.generateNumber(3);
		this.code = RandomGenerator.generateNumber(4);
	}
}
