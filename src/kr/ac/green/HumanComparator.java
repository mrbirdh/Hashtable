package kr.ac.green;

import java.util.Comparator;
//Comparator는 h1과 h2와는 전혀 상관없는 객체를 이용해서 비교하고
//Comparable은 Human과 h1을 비교하는 것임  
public class HumanComparator implements Comparator<Human>{
	public int compare (Human h1, Human h2) {
		
		return h1.getName().compareTo(h2.getName());
	}
}
