package Factory;

import Factory.Color.Color;

public abstract class AbstractShapeFactrory {
	
	public abstract Shape getShape (String shape);
	
	public abstract Color getColor(String color);
}
