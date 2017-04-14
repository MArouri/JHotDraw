package edu.birzeit.editor.composite;

import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.GroupFigure;
import org.jhotdraw.draw.RectangleFigure;

/**
 * @author arouri
 * This class represents the Composite class in the composite design pattern
 * it holds a group of basic rectangle figures
 */
public class RectangleGroup extends RectangleComponent {

	private GroupFigure groupFigure;
	
	public RectangleGroup() {
		super();
		this.groupFigure = new  GroupFigure();
	}
	
	@Override
	public double getArea() throws Exception {
		double totalSize = 0.0;
		for (Figure figure : this.groupFigure.getChildren()) {
			if(figure instanceof RectangleFigure){
				totalSize += ((RectangleFigure)figure).getBounds().getWidth() * ((RectangleFigure)figure).getBounds().getHeight();
			}
		}
		return totalSize;
	}
	
	@Override
	public void addComponent(RectangleComponent component) {
		this.groupFigure.add(component.getFigure());
	}
	
	@Override
	public Figure getFigure() {
		return this.groupFigure;
	}
	
}
