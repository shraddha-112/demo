
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle myRectangle = new Rectangle(10, 20);
	    
		double area;
	    area = myRectangle.area();
	    System.out.println("Area is " + area);
	    
	    double perimeter;
	    perimeter = myRectangle.perimeter();
	    System.out.println("Perimeter is " + perimeter);
	}
}
