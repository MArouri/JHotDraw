/**
 * 
 */
package edu.birzeit.editor.stateChart;

import java.awt.geom.AffineTransform;

import org.jhotdraw.draw.EllipseFigure;
import org.jhotdraw.draw.Figure;

/**
 * @author Rawan Khader
 *
 */

/**
 * NextStateChartItem is a concrete strategy 
 */
public class NextStateChartItem extends StateChartStepItem{

	/**
	 * 
	 */
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
