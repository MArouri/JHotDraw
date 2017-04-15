package com.birzeit.editor.facade;

import org.jhotdraw.draw.Figure;

import edu.birzeit.editor.composite.CompositeRectangleClient;
import edu.birzeit.editor.figure.StateChartFigure;

/**
 * @author arouri
 *
 *         This class represents a facade class, that offers a set of figures to
 *         be added to the editor's tool bar
 */
public class EditorFigureMaker {

	private CompositeRectangleClient compositeRectangleClient;
	
	private StateChartFigure stateChartFigure;

	// TODO: add other figures of Rawan, Anjad and Salah here

	/**
	 * Constructor 
	 */
	public EditorFigureMaker() {
		this.compositeRectangleClient = new CompositeRectangleClient();
		this.stateChartFigure =  new StateChartFigure();
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public Figure getCompositeFigure() throws Exception {
		return this.compositeRectangleClient.getContainer();
	}

	/**
	 * @return
	 */
	public Figure getStateChartFigure() {
		return this.stateChartFigure;
	}
}
