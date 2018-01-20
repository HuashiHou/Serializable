package p0119.serializable.diffclass;

import java.io.Serializable;

public class Animal implements Serializable{
	private String name;
	private String sex;
	@Override
	public String toString() {
		return "Animal [name=" + name + ", sex=" + sex + "]";
	}
	public Animal(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	
}
