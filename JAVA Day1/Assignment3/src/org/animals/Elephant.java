package org.animals;

public class Elephant {
	private String color;
	private int weight;
	private int age;
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void vegetarian() {
		System.out.println("Vegetarian");
	}
	public void canclimb() {
		System.out.println("Can not Climb");
	}
	
	public void sound() {
		System.out.println("Trumpet");
	}

	public void Details() {
		color="Black";
		weight=3000;
		age=15;
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		vegetarian();
		canclimb();
		sound();
	}

}
