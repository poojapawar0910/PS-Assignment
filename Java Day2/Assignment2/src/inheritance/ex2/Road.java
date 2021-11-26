package inheritance.ex2;

public class Road {

	public static void main(String[] args) {
		Car c = new Car();
		Bus b = new Bus();
		Truck t = new Truck();
		
		c.input("Black","ABC","BMW");
		c.carDetails();
		
		b.input("Red","XYZ",4566);
		b.busDetails();
		
		t.input("Black","PQR",5642);
		t.truckDetails();

	}

}
