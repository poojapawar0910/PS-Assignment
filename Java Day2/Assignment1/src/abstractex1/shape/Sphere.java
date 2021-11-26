package abstractex1.shape;

public class Sphere extends Shape{
	private int r;
	
	public Sphere(int r) {
		this.r=r;
	}
	
	@Override
	public double calc_area() {
		return (4 * Math.PI * r * r);
	}

	@Override
	public double calc_volume() {
		return ((4.0 / 3) * Math.PI * r * r * r);
	}

}
