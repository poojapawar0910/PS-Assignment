package pooja;

public class Vehicle {
	protected String color;
	protected int noOfWheels;
	protected String model;
	
	public Vehicle(String vehicleColor,int vehicleNoOfWheels,String vehicleModel) {
		color = vehicleColor;
		noOfWheels = vehicleNoOfWheels;
		model = vehicleModel;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
