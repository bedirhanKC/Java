package lab6_static;

public class Circle {

	static double pi = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	public void computeArea() {

		System.out.println("Result : " + radius * radius * pi);
	}
}
