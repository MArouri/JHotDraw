/**
 * 
 */
package edu.birzeit.editor.shapeFactory;

import org.jhotdraw.draw.EllipseFigure;
import org.jhotdraw.draw.Figure;

/**
 * @author AnjadBad12:20:28 AM
 *
 */
public class EllipseComponent implements ChartComponent {
	
	@Override
	public Figure getShapeRepresentation() {

		return new EllipseFigure(10,5,100,50);
	}
}
