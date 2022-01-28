/**
 * 
 */
package com.flipkart.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author HP
 *
 */
public class StreamWithLambdaDemo {
	
	static List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	/**
	 * @param args
	 */
	private static void beforeJava8() {
		List<Integer> evenList = new ArrayList<>();
		for (int i : intList) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("beforeJava8 evenList : " + evenList);
	}

	private static void fromJava8() {
		System.out.println(
				"fromJava8 evenList : " + intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fromJava8();
		beforeJava8();
	}

}
