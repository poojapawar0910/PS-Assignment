package inheritance.ex2;

public abstract class Vehicle {
	private String color;
	private String model;
	
	public void input(String color,String model) {
		this.setColor(color);
		this.setModel(model);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void printDetails() {
		System.out.println("Color : "+getColor());
		System.out.println("Model : "+getModel());
	}
}
