

package edu.beirzait.statechart;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jhotdraw.draw.CompositeFigure;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.ImageFigure;
import org.jhotdraw.draw.ListFigure;
import org.jhotdraw.draw.TextFigure;
import org.jhotdraw.geom.Insets2D;
import com.sun.javafx.geom.Point2D;

/**
 * @author AnjadBad5:22:10 PM
 *
 */
public abstract class StateChartStepItem {

	private GraphicalCompositeFigure graphicalCompositeFigure;
	private String text;
	
	
	
	public String getText() {
		return text;
	}



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