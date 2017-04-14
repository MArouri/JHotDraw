/**
 * 
 */
package edu.beirzait.figure;
import org.jhotdraw.draw.Figure;

/**
 * Factory method interface its implementations is responsible of providing the 
 * right instance of the requested figure by the client.
 * @author AnjadBad4:29:52 PM
 *
 */
public interface FigureFactory {
	
	Figure getFigure(FigureType type);
	
	
	Figure getDecoratedFigure(FigureType type);
	

}
