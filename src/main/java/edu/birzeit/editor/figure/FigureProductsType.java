/**
 * 
 */
package edu.birzeit.editor.figure;

/**
 * @author AnjadBad9:12:37 PM
 *
 */
public enum FigureProductsType {
	 
	 STATE_CHART_DIAGRAM(StateChartFigure.class);
	 
	 
	 @SuppressWarnings("rawtypes")
	 private Class className;
	 
	 /**
	  *
	  * Construct a figure type.
	  * @param figureLabel
	  * @param figureClass
	  * 
	  */
	 @SuppressWarnings("rawtypes")
	 private FigureProductsType(Class className) {
	  this.className = className;
	 }
	 

	 @SuppressWarnings("rawtypes")
	 public Class getClassName() {
	  return className;
	 } 
	 
	 
	
	 
	}