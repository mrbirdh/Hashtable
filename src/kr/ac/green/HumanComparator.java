package kr.ac.green;

import java.util.Comparator;
//Comparator�� h1�� h2�ʹ� ���� ������� ��ü�� �̿��ؼ� ���ϰ�
//Comparable�� Human�� h1�� ���ϴ� ����  
public class HumanComparator implements Comparator<Human>{
	public int compare (Human h1, Human h2) {
		
		return h1.getName().compareTo(h2.getName());
	}
}
