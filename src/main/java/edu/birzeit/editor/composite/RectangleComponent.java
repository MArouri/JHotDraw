package edu.birzeit.editor.composite;

import org.jhotdraw.draw.Figure;

/**
 * @author arouri
 * This class represents the component in the composite design pattern
 *
 */
public abstract class RectangleComponent {

	public RectangleComponent() {

	}

	public void addComponent(RectangleComponent component) {
		throw new UnsupportedOperationException("not supported");
	}

	public abstract double getArea() throws Exception;

	public Figure getFigure() {
		System.out.println("CALLED !");
		throw new UnsupportedOperationException("not supported");
	}
}
