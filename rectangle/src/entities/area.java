package entities;

public class area {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + width + height + height;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return String.format("Area = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", area(), perimeter(), diagonal());
		
	}

}
