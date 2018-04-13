package com.util;

public class StringValidator {
	
	public static boolean isStringValid(String string) {
		if(string != null && !string.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
