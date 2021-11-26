package inheritance.ex2;

public class Car extends Vehicle{
	private String name;
	
	public void input(String color, String model,String name) {
		this.setColor(color);
		this.setModel(model);
		this.name = name;
	}
	
	public void carDetails() {
		printDetails();
		System.out.println("Car Name : "+name);
	}
	
	public String getName() {
		return name;
	}

}