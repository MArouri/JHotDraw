package edu.birzeit.editor.shapeFactory;

import org.jhotdraw.draw.Figure;

/**
 * @author AnjadBad1:12:07 AM
 *
 */
public class StateChartFactory implements ChartFactory{

	private ChartComponent ellipseComponent;
	private ChartComponent lineComponent;
	
	public StateChartFactory() {
		this.ellipseComponent = new EllipseComponent();
		this.lineComponent = new LineComponent();
	}
	
	@Override
	public Figure getEllipse() {
		return this.ellipseComponent.getShapeRepresentation();
	}

	@Override
	public Figure getLine() {
		return this.lineComponent.getShapeRepresentation();
	}
}

