package abstractex1.shape;

public class Cylinder extends Shape{
	private int r,h;
	
	public Cylinder(int r,int h) {
		this.r=r;
		this.h=h;	
	}

	@Override
	public double calc_area() {
		return (2*Math.PI*r*h*2*Math.PI*(r*r));
	}

	@Override
	public double calc_volume() {
		return (Math.PI*3.14*(double)(r*r)*h);
	}
	

}
