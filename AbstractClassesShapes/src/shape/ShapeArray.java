package shape;

import java.util.ArrayList;

public class ShapeArray {
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();

	public static void main(String[] args) {

		System.out.println("Shape Program Started");

		Shape shapeArray[] = new Shape[3];

		shapeArray[0] = new Triangle(70, 80, 20);
		shapeArray[1] = new Circle(50);
		shapeArray[2] = new Rectangle(140, 160);

		for (int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}

	}

}
