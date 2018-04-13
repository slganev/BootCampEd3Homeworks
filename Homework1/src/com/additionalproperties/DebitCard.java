package com.additionalproperties;

import com.util.RandomGenerator;

public class DebitCard implements IProperty {
	
	private String number;
	private String PIN;
	
	public DebitCard() {
		this.number = RandomGenerator.generateNumber(12);
		this.PIN = RandomGenerator.generateNumber(4);
	}

}
