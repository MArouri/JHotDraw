/**
 * 
 */
package edu.birzeit.editor.shapeFactory;


import static org.jhotdraw.draw.AttributeKeys.STROKE_COLOR;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.jhotdraw.draw.CompositeFigure;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.ImageFigure;
import org.jhotdraw.draw.ListFigure;
import org.jhotdraw.geom.Insets2D;

/**
 * @author AnjadBad1:12:07 AM
 *
 */
public class LineComponent implements ChartComponent {
	
	@Override
	public Figure getShapeRepresentation() {
		
		Icon flowImageIcon = new ImageIcon(getClass().getResource("/edu/birzeit/statechart/flowLine.png"));
        BufferedImage bufferedImg = new BufferedImage(flowImageIcon.getIconWidth(), flowImageIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bufferedImg.createGraphics();
        flowImageIcon.paintIcon(null, g, 0, 0);
        g.dispose();
        ImageFigure imageFigure = new ImageFigure(20,40,flowImageIcon.getIconHeight(), 150);
        imageFigure.setBufferedImage(bufferedImg);
        imageFigure.set(STROKE_COLOR, null);
        imageFigure.setBounds(new Point2D.Double(20, 30), new Point2D.Double(flowImageIcon.getIconWidth(), flowImageIcon.getIconHeight() - 40));
        
       ListFigure fig = new ListFigure();
       fig.set(CompositeFigure.LAYOUT_INSETS, new Insets2D.Double(1.0D, 1.0D, 1.0D, 2.0D));
       fig.add(imageFigure);
		return fig;
	}

	}
		
		 

