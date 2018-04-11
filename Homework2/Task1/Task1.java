package Task1;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int currentlyLast = list.size() - 1;
		
		for (int i = 0; i < list.size() / 2; i++) {
			Integer temp = list.get(currentlyLast);
			list.set(currentlyLast, list.get(i));
			list.set(i, temp);
			currentlyLast--;
		}
		
		System.out.println(list.toString());
		
	}
	
}
