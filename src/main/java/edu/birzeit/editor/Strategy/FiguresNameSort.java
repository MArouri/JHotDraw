/**
 * 
 */
package edu.birzeit.editor.Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jhotdraw.draw.Figure;


/**
 * @author Rawan Khader
 *
 */

/**
 * FiguresNameSort class is a ConcreteStrategy 
 * each concrete strategy implements an algorithm.
 */
public class FiguresNameSort implements SortFigures {

	/**
	 * 
	 */
	public FiguresNameSort() {
		super();
		//Auto-generated constructor stub
	}

	public static Comparator<Figure> sortByFiguresName = new Comparator<Figure>() {

		public int compare(Figure figure1, Figure figure2) {
			String figure1Name = figure1.getClass().getSimpleName().toUpperCase();
			String figure2Name = figure2.getClass().getSimpleName().toUpperCase();
			System.out.println("CALL? "+figure1Name+" fig "+figure2Name);
			// ascending order
			return figure1Name.compareTo(figure2Name);

		}
	};
	
	/*
	 * @see edu.birzeit.editor.Strategy.SortFigures#sortAllFigures(java.util.List)
	 */
	@Override
	public void sortAllFigures(List<Figure> figureSorting) {
		//Auto-generated method stub
		Collections.sort(figureSorting, sortByFiguresName);
	}

}



	

