/**
 * 
 */
package edu.birzeit.editor.figure;
import org.jhotdraw.draw.Figure;

/**
 * Factory method interface its implementations is responsible of providing the 
 * right instance of the requested figure by the client.
 * 
 * @author AnjadBad4:29:52 PM
 *
 */
public interface FigureFactory {
	
	
	/**
	 * Return a default figure instance according to the passed figure type.
	 * @param type
	 * @return
	 */
	
	String getClassName(FigureType type);

	/**
	 * @return
	 */
	
	
	
	

}
