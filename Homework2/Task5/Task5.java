package Task5;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task5 {
	
	public static void main(String[] args) {
		
		Integer[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		
		System.out.println(Arrays.toString(removeDuplicates(input1)));
		
	}

	private static Integer[] removeDuplicates(Integer[] input1) {
		
		LinkedHashSet<Integer> removeDuplicates = new LinkedHashSet<>(Arrays.asList(input1));
		Integer[] result = removeDuplicates.toArray(new Integer[removeDuplicates.size()]);		
		return result;
	}

}
