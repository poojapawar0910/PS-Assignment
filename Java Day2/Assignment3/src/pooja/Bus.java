package pooja;

public class Bus extends Vehicle{
	public Bus(String vehicleColor,int vehicleNoOfWheels,String vehicleModel) {
		super(vehicleColor,vehicleNoOfWheels,vehicleModel);
	}
	
	public void Details() {
	
		System.out.println("Vehicle Color : "+ color +", Number of Wheels : "+noOfWheels+", Model : "+model);
		}

}
