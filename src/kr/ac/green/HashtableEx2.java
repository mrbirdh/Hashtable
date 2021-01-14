package kr.ac.green;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

/*
 * Hashtable은 원소들이 정렬이 안 된 상태로 마구잡이로 들어가있는건가?
 * 그러면 compareTo가 의미가 있을까  
 */

public class HashtableEx2 {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		HashTableEx1.make(table);
		
		System.out.println(table.keySet()); 
		
		Set <Integer> keys = table.keySet();
		
		Iterator<Integer> itr = keys.iterator();  
		while(itr.hasNext()) { 
			int key = itr.next();
			System.out.println(key + " : " + table.get(key));			
						

		}
	}
}
