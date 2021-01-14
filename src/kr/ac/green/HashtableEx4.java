package kr.ac.green;

import java.util.Hashtable;

public class HashtableEx4 {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> table  = new Hashtable<Integer, Integer>();
		table.put(100 % 10, 1);
		table.put(1000 % 10 , 2);
		table.put(10 % 10, 8);
		table.put(1001 %10, 6);
		table.put(1002 % 10, 5);
		table.put(1003 % 10, 3);
		
		System.out.println(table);
	}
}
