package abstractex1.shape;

public class Cube extends Shape{
	private int s;
	public Cube(int s) {
		this.s=s;
	}
	
	@Override
	public double calc_area() {
		return (6*(s*s));
	}

	@Override
	public double calc_volume() {
		// TODO Auto-generated method stub
		return (s*s*s);
	}

}
