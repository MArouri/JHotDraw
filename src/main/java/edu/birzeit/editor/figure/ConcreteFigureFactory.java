/**
 * 
 */
package edu.birzeit.editor.figure;

/**
 * @author AnjadBad10:20:09 PM
 *
 */
public class ConcreteFigureFactory implements FigureFactoryMethode {
	
	 
	

	 	/**
	 	 * @seem org.simpleeditor.figure.FigureFactory#getFigure(org.simpleeditor.figure.FigureType)
	 	 */
	 	@Override
	 	public String getClassName(FigureProductsType type) {
	 		try {
	 			return (String) type.getClassName().newInstance();
	 		} catch (Exception e2) {
	 			System.err.println("Unknown exception creating class return default class name");
	 		}
	 		return null;
	 		
	 	}

	 	

}