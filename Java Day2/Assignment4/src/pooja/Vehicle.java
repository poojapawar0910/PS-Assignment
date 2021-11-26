package pooja;

public class Vehicle {
	private String name;
	private String model;
	private String color;
	
	Vehicle(String vehicleName,String vehicleModel, String vehicleColor){
		this.name = vehicleName;
		this.model = vehicleModel;
		this.color = vehicleColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void Details() {
		System.out.println(getName()+" Model is : "+getModel()+" color is : "+getColor());
	}
}
