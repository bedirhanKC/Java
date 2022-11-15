package lab6_static;

public class Main {

	public static void main(String[] args) {

		Circle c = new Circle(5);
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(15);

		Circle[] circle = { c, c1, c2 };

		for (Circle circle2 : circle) {

			circle2.computeArea();
			
		}

	}
}
