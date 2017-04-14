/**
 * 
 */
package edu.birzeit.editor.composite;

import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.RectangleFigure;

/**
 * @author arouri
 * This class represents the leaf of the composite design pattern
 */
public class BasicRectangle extends RectangleComponent{

	private RectangleFigure rectangleFigure;

	public BasicRectangle(int x,int y,int width, int height) {
		super();
		this.rectangleFigure = new RectangleFigure(x,y,width,height);
	}

	@Override
	public double getArea() {
		return this.rectangleFigure.getBounds().getHeight() * this.rectangleFigure.getBounds().getWidth();
	}

	@Override
	public void addComponent(RectangleComponent component) {
		throw new UnsupportedOperationException("not supported");
	}
	
	@Override
	public Figure getFigure() {
		return this.rectangleFigure;
	}
}