package structural.bridge;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();

		Color red = new Red();



		Shape circle = new Circle(red);

		Shape req = new Rectangle(blue);


		circle.applyColor();
		req.applyColor();
	}

}
