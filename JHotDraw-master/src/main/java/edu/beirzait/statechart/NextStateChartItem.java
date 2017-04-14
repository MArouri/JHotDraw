/**
 * 
 */
package edu.beirzait.statechart;

import java.awt.geom.AffineTransform;
import java.util.List;

import org.jhotdraw.draw.EllipseFigure;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.TextFigure;

/**
 * @author AnjadBad5:56:26 PM
 *
 */
public class NextStateChartItem  extends StateChartStepItem {

	private String stepText;
	private GraphicalCompositeFigure comm;

	/**
	 * 
	public NextStateChartItem() {
		super("next");
		//Auto-generated constructor stub
	}

	/**
	 * @param text
	 */
	public NextStateChartItem(String text) {
		super(text);
		//Auto-generated constructor stub
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#getTransform()
	 */
	@Override
	public AffineTransform getTransform() {
		//Auto-generated method stub
		return new AffineTransform(0, 0, 0, 0, 35, 18);
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#getShapeRepresentation()
	 */
	@Override
	public Figure getShapeRepresentation() {
		//Auto-generated method stub
		return new EllipseFigure(10,5,100,50);
	}

}
	
