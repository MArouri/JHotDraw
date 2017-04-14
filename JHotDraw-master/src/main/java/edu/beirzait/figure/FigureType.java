/**
 * 
 */
package edu.beirzait.figure;

import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.draw.RoundRectangleFigure;
import org.jhotdraw.draw.TextFigure;
import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.util.ResourceBundleUtil;



/**
 * @author AnjadBad4:38:11 PM
 *
 */
public enum FigureType {
	ROUNDED_RECTANGLE("edit.createRoundRectangle", RoundRectangleFigure.class),
	TEXT("edit.createText", TextFigure.class),
	STATECHARTDIAGRAM("edit.createComposite", StateChartFigure.class)
;
	
	/**
	 * Default jhotdraw framework ResourceBundleutil
	 */
	private static ResourceBundleUtil jhotdrawLabels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");

	/**
	 * Design patterns demo custom resource bundle.
	 */
    private static ResourceBundleUtil simpleEditorLabels = ResourceBundleUtil.getBundle("org.simpleeditor.Labels");
    
    /**
     * Label text of the given figure, to be used for its creation icon and tooltip
     */
	private String figureLabel;
	
	/**
	 * Figure class to support reflection in the factory.
	 */
	@SuppressWarnings("rawtypes")
	private Class figureClass;
	
	/**
	 * Construct a figure type.
	 * @param figureLabel
	 * @param figureClass
	 */
	@SuppressWarnings("rawtypes")
	private FigureType(String figureLabel,Class figureClass) {
		this.figureLabel = figureLabel;
		this.figureClass = figureClass;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFigureLabel() {
		return figureLabel;
	}
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Class getFigureClass() {
		return figureClass;
	}
	
	/**
	 * Get the resource bundle util according to the figure type.
	 * @return
	 */
	
	
	@Override
	public String toString() {
		return name()+" Used label "+getFigureLabel();
	}
	
	
	
	
}
