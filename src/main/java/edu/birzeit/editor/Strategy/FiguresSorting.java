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
public class FiguresSorting {

	private SortFigures sortFigures;

	/**
	 * @return the sortFigures
	 */
	public SortFigures getSortFigures() {
		return sortFigures;
	}

	/**
	 * @param sortFigures the sortFigures to set
	 */
	public void setSortFigures(SortFigures sortFigures) {
		this.sortFigures = sortFigures;
	}

	
	public void sort(List<Figure> figures){
		this.sortFigures.sortAllFigures(figures);
	}
}
