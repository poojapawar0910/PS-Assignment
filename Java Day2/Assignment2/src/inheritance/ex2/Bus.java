package inheritance.ex2;

public class Bus extends Vehicle{
	private int number;
	
	public void input(String color, String model,int number) {
		this.setColor(color);
		this.setModel(model);
		this.number = number;
	}
	
	public void busDetails() {
		printDetails();
		System.out.println("Number: "+number);
	}
	
	public int getNumber() {
		return number;
	}

}
