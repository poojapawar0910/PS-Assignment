package org.animals;

public class Tiger {
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
		System.out.println("Can Climb");
	}
	
	public void sound() {
		System.out.println("Roar");
	}

	public void Details() {
		color="Orange with Black";
		weight=50;
		age=20;
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		vegetarian();
		canclimb();
		sound();
	}
	

}
