package org.animals;

public class Deer {
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
		System.out.println("Grunt");
	}

	public void Details() {
		color="Brown";
		weight=40;
		age=18;
		
		System.out.println("Color :"+color+" Weight :"+weight+" Age: "+age);
		vegetarian();
		canclimb();
		sound();
	}
	

}
