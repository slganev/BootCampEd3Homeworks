package Task3;

public class Task3 {
	
	public static void main(String[] args) {
	
		String example = "YLEVISRUCER_DESREVER_ELPMAXE";
		
		System.out.println(recursiveReverse(example));
	}

	private static String recursiveReverse(String example) {
		if (example.length() <= 1) {
	        return example;
	    }
	    return recursiveReverse(example.substring(1)) + example.charAt(0);
	}

}
