/**
 * 
 */
package edu.birzeit.editor.Strategy;

import java.util.List;

import org.jhotdraw.draw.Figure;


/**
 * @author Rawan Khader
 *
 */

/**
 * SortFigures class is Strategy.
 * Used to define an interface common to all supported algorithms.
 */
public interface SortFigures {

	//the algorithm that have many implementation
	public void sortAllFigures(List<Figure> figureSorting);
}
