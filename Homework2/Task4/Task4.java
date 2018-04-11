package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task4 {
	
	public static void main(String[] args) {
		
		 int[] arr1 = {4,7,3,9,2};
		 int[] arr2 = {3,2,12,9,40,32,4};
		
		System.out.println(Arrays.toString(findEqualNumbers(arr1, arr2)));
		
	}
	
	private static Integer[] findEqualNumbers(int[] arr1, int[] arr2) {
		//ordered and only unique numbers:
		LinkedHashSet<Integer> result = new LinkedHashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					result.add(arr1[i]);
				}
			}
		}
		
		Integer[] arr3 = result.toArray(new Integer[result.size()]);
		return arr3;
	}

}
