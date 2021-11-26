package pooja;

public class City {

	public static void main(String[] args) {
		Car c = new Car("BMW","XYZ","Black");
		Bus b = new Bus("Red_Bus","ABC","Red");
		Truck t = new Truck("Truck","PQR","Black");
		
		c.Details();
		b.Details();
		t.Details();

	}

}
