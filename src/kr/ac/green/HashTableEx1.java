package kr.ac.green;

import java.util.Hashtable;

public class HashTableEx1 {
	
	public static void make (Hashtable table) {
		for (int i = 1; i <= 10; i++) {
			table.put(i, "No."+i);
		}
	}
	
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		make(table);
		System.out.println("table�� ���̴� " + table.size());
		
		System.out.println(table); 

		System.out.println(table.contains("No."));	
	
		System.out.println(table.containsValue("No."));
		System.out.println(table.containsKey(5));
		
		System.out.println(table.elements());
		System.out.println(table.hashCode()); 

		
		String a = "No.10";
		for (int i = 1; i <= 10; i++) {
			if (table.get(i).equals(a)) {
				System.out.println(i + "��°�� " + a +"�Դϴ�.");
			} else {
				System.out.println(i + "��°�� �ƴմϴ�.");
			}
		}
		
		table.clear();
		System.out.println(table.isEmpty() ? true : false);		
		
	}
}
