package kr.ac.green;

import java.util.Hashtable;
public class HashtableEx3 {
	public static void main(String[] args) {
		Hashtable<Human, String> table = new Hashtable<Human, String>();
		
		Human h1 = new Human(47,"김호용");
		Human h2 = new Human(27,"서호용");
		Human h3 = new Human(33,"장호용");
		
		table.put(h1 , "2");
		table.put(h2, "3");
		table.put(h3 , "7");
		System.out.println(table);
		
		
		Integer arr[] = new Integer[3];
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 2;
		

		
		Hashtable <Integer, Integer> table2 = new Hashtable<Integer, Integer>();

		for (int i = 0; i <= 2; i++) {
			table2.put(i +1 , arr[i]); 
		}
		String conversion = String.valueOf(table2);

		System.out.println(conversion.substring(
				1 
				, conversion.lastIndexOf("}")
		));
		

		String split = conversion.substring(1, conversion.lastIndexOf("}"));
		System.out.println(split);
		String[] splitArr = split.split(",");
		for (int i = 0; i < 3; i++) {
			System.out.println(splitArr[i].trim());
		}
		

		
	}
}
