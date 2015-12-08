import java.lang.Math;

// Main Application
public class ShapeApplication {
	private static ShapeThreeDimensional[] shapes = new ShapeThreeDimensional[4];
	public static void main(String[] args) {
		shapes[0] = new SquarePyramidShape(10.0, 10.0, 15.0);
		shapes[1] = new SphereShape(5.0);
		shapes[2] = new ShapeRectangularPrism(6.0, 8.0, 10.0);
		shapes[3] = new Cylinder(5.0, 10.0);

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].printShapeInformation();
			System.out.println();
		}
	}
}

// ShapeThreeDimension Interface
interface ShapeThreeDimensional {
	public double getShapeArea();
	public double getShapeVolume();
	public void printShapeInformation();
}

// All Shape Classes
class SquarePyramidShape implements ShapeThreeDimensional {
	private double length;
	private double width;
	private double height;

	public SquarePyramidShape() {}
	public SquarePyramidShape(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getShapeArea() {
		double squareBaseArea = length * width;
		double pyramidArea = 2.0*(length)*(Math.sqrt(((Math.pow(length,2))/4.0)+Math.pow(height,2)));
		return squareBaseArea + pyramidArea;
	}

	public double getShapeVolume() {
		return (Math.pow(length,2))*(height/3.0);
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Square Pyramid");
	}
}

class SphereShape implements ShapeThreeDimensional {
	private double radius;
	private final double pi = Math.PI;

	public SphereShape() {}
	public SphereShape(double radius) {
		this.radius = radius;
	}

	public double getShapeArea() {
		return 4*Math.pow(radius,2)*pi;
	}

	public double getShapeVolume() {
		return (4.0/3.0)*pi*Math.pow(radius,3);
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Sphere");
	}
}

class ShapeRectangle implements ShapeThreeDimensional {
	protected double length;
	protected double width;

	public ShapeRectangle() {}
	public ShapeRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getShapeArea() {
		return length*width;
	}

	public double getShapeVolume() {
		return length*width;
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Rectangle");
	}
}


class ShapeRectangularPrism extends ShapeRectangle {
	private double height;

	public ShapeRectangularPrism(){
		super();
	}

	public ShapeRectangularPrism(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	public double getShapeArea() {
		return 2.0*(length*width + height*length + height*width);
	}

	public double getShapeVolume() {
		return width * length * height;
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Rectangular Prism");
	}
}

class Circle implements ShapeThreeDimensional {
	protected double radius;
	protected final double pi = Math.PI;

	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getShapeArea() {
		return pi*(Math.pow(radius,2));
	}

	public double getShapeVolume() {
		return pi*(Math.pow(radius,2));
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Circle");
	}

}

class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getShapeArea() {
		return (2*pi*radius*height) + (2*pi*Math.pow(radius,2));
	}

	public double getShapeVolume() {
		return pi*Math.pow(radius,2)*height;
	}

	public void printShapeInformation() {
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
		System.out.println("Shape type: Cylinder");
	}
}
