/**
 * 
 */
package edu.beirzait.figure;

import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.draw.RectangleFigure;

/**
 * @author AnjadBad6:21:48 PM
 *
 */
public class DefaultFigureFactory implements FigureFactory {
	
	@Override
	public Figure getFigure(FigureType type) {
		try {
			return (Figure) type.getFigureClass().newInstance();
		} catch (Exception e2) {
			System.err
					.println("Unknown exception creating class return default Figure, rectangle figure");
		}
		return new RectangleFigure();
	}
	
	@Override
	public Figure getDecoratedFigure(FigureType type) {
		// We implemented only line figure as an example of the decorator design
		// pattern.
		LineFigure decoratedArrow = (LineFigure) new LineFigure();
		decoratedArrow.set(AttributeKeys.START_DECORATION,
				new org.jhotdraw.draw.decoration.ArrowTip(0.35, 12, 11.3));
		// decoratedArrow.set(AttributeKeys.END_DECORATION, new
		// org.jhotdraw.draw.decoration.ArrowTip(0.35, 12, 11.3));
		return decoratedArrow;
	}
	

}
