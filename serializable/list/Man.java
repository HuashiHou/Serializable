package p0119.serializable.list;

import java.io.Serializable;

public class Man implements Serializable{
	private String name;
	private int age;
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
