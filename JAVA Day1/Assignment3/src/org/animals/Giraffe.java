package org.animals;

public class Giraffe {
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
		System.out.println("Burst");
	}

	public void Details() {
		color="Dark Brown";
		weight=765;
		age=25;
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		vegetarian();
		canclimb();
		sound();
	}

}
