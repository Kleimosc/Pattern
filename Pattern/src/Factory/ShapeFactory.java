package Factory;

import Factory.Color.Color;

public class ShapeFactory extends AbstractShapeFactrory {
	
	@Override
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle")){
			return new Circle();
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
