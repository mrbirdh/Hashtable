package kr.ac.green;

public class Human implements Comparable<Human> {
	private int age;
	private String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo (Human h) {
		
		//오름차순 
//		return name.compareTo(h.getName()); 
		return age - h.getAge();
	}
	
	
}
