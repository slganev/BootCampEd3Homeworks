package Task2;

public class Task2 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {2,3,7,1,2,2};
		int index = returnTheIndex(arr1);
		
		if(index != 0) {
			System.out.println(index);
		}else {
			System.out.println("No such element.");
		}
	}
	
	private static int returnTheIndex(int[] arr1) {
		if(arr1.length < 3) {
			return 0;
		}
		int index = 0;
		int pivotIndex = 1;
		int lastPossibleIndex = arr1.length - 2;
		
		for (int i = 0; i < arr1.length; i++) {
			int sum1 = 0;
			for (int left = 0; left < pivotIndex; left++) {
				sum1 += arr1[left];
			}
			int sum2 = 0;
			for (int right = arr1.length - 1; right > pivotIndex; right--) {
				sum2 += arr1[right];
			}
			if(sum1 == sum2) {
				return pivotIndex;
			}else {
				pivotIndex++;
			}
			if(pivotIndex >= lastPossibleIndex) {
				return 0;
			}
		}
		
		return index;
	}
	
}
