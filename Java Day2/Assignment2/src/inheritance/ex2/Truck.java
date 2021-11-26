package inheritance.ex2;

public class Truck extends Vehicle{
	private int number;
	
	public void input(String color, String model,int number) {
		this.setColor(color);
		this.setModel(model);
		this.number = number;
	}
	
	public void truckDetails() {
		printDetails();
		System.out.println("Number : "+number);
	}
	
	public int getName() {
		return number;
	}

}
