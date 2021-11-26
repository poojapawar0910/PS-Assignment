package abstractex1.shape;

public class MainShape3D {

	public static void main(String[] args) {
		Sphere s=new Sphere(15);
		Cylinder c=new Cylinder(15,20);
		Cube cb=new Cube(20);
	
		
		System.out.println("Area of Cylinder = " + Math.round(c.calc_area()));
		System.out.println("Volume of Cylinder = " + Math.round(c.calc_volume()));
		System.out.println("Area of Sphere = " + Math.round(s.calc_area()));
		System.out.println("Volume of Sphere = " + Math.round(s.calc_volume()));
		System.out.println("Area of Cube = " + Math.round(cb.calc_area()));
		System.out.println("Volume of Cube = " + Math.round(cb.calc_volume()));
	}

}
