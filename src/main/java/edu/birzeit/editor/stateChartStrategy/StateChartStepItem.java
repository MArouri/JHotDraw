/**
 * 
 */
package edu.birzeit.editor.stateChartStrategy;

import java.awt.geom.AffineTransform;
import java.util.List;

import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.TextFigure;

/**
 * @author Rawan Khader
 *
 */

/**
 * StateChartStepItem is an abstract class, and this class is a strategy 
 * that defines an interface common to all supported algorithms
 */
public abstract class StateChartStepItem {

	private GraphicalCompositeFigure graphicalCompositeFigure;
	private String text;
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the graphicalCompositeFigure
	 */
	public GraphicalCompositeFigure getGraphicalCompositeFigure() {
		return graphicalCompositeFigure;
	}

	/**
	 * @param graphicalCompositeFigure the graphicalCompositeFigure to set
	 */
	public void setGraphicalCompositeFigure(GraphicalCompositeFigure graphicalCompositeFigure) {
		this.graphicalCompositeFigure = graphicalCompositeFigure;
	}

	public StateChartStepItem() {
		this("");
	}

	public StateChartStepItem(String text) {
		this.text = text;
	}

	public Figure getNameStepItem() {
		if (graphicalCompositeFigure == null) {
			graphicalCompositeFigure = new GraphicalCompositeFigure(getShapeRepresentation());
			TextFigure label = new TextFigure(getText());
			label.transform(getTransform());
			graphicalCompositeFigure.add(label);
		}
		return graphicalCompositeFigure;
	}

	public AffineTransform getTransform() {
		return new AffineTransform(0, 0, 0, 0, 35, 55);
	}

	public abstract Figure getShapeRepresentation();

	public void addStepItem(StateChartStepItem stepItem) {
		throw new UnsupportedOperationException(
				"add the operation not supported here");
	}

	public void removeStepItem(StateChartStepItem stepItem) {
		throw new UnsupportedOperationException(
				"remove the operation not supported here");
	}

	public StateChartStepItem getStepItem(int index) {
		throw new UnsupportedOperationException(
				"the stateChart item operation not supported here");
	}

	public int getStepItemsSize() {
		throw new UnsupportedOperationException(
				"the stateChart items size operation not supported here");
	}

	public List<StateChartStepItem> getStepItems() {
		throw new UnsupportedOperationException(
				"the stateChart items operation not supported here");
	}

}
