package pooja;

public class Shape {
	double l;
    double w;
    
    public void area(int s) {
		int area=(s*s);
		System.out.println("Area of Square : "+area);
	}
    
    public void perimeter(int s) {
		double perimeter;
        perimeter = (4 * (s));
        System.out.println("Perimeter of Square is : "+ perimeter);
	}
  
    public void area(int l,int b) {
		int area=l*b;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void perimeter(int l,int b) {
		double perimeter;
        perimeter = (2 * (l + w));
        System.out.println("Perimeter of rectangle is : "+ perimeter);
	}	

}
