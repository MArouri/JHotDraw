/**
 * 
 */
package edu.birzeit.editor.Strategy;

import java.awt.geom.Rectangle2D;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jhotdraw.draw.Figure;

/**
 * @author Rawan Khader
 *
 */

/**
 * FiguresAreaHeightSort class is a ConcreteStrategy 
 * each concrete strategy implements an algorithm.
 */
public class FiguresAreaHeightSort implements SortFigures{

	/**
	 * 
	 */
	public FiguresAreaHeightSort() {
		super();
		//Auto-generated constructor stub
	}
	
	public static Comparator<Figure> sortByFiguresAreaHeight = new Comparator<Figure>() {

		public int compare(Figure figure1, Figure figure2) {
			Rectangle2D.Double figure1Area = figure1.getDrawingArea();
			Rectangle2D.Double figure2Area = figure2.getDrawingArea();
			
			if(figure1Area == null){
				return 1;
			}
			if(figure2Area == null){
				return -1;
			}
			
			return Double.compare(figure1Area.height, figure2Area.height); 

		}
	};

	/*
	 * @see edu.birzeit.editor.Strategy.SortFigures#sortAllFigures(java.util.List)
	 */
	@Override
	public void sortAllFigures(List<Figure> figureSorting) {
		//Auto-generated method stub
		Collections.sort(figureSorting, sortByFiguresAreaHeight);
	}
}
