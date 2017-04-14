/**
 * 
 */
package edu.beirzait.statechart;




import static org.jhotdraw.draw.AttributeKeys.STROKE_COLOR;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import org.jhotdraw.draw.CompositeFigure;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.ImageFigure;
import org.jhotdraw.geom.Insets2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jhotdraw.draw.ListFigure;

/**
 * @author AnjadBad5:59:02 PM
 *
 */
public class StateLineItem extends StateChartStepItem{



		public StateLineItem() {
			super(null);
			//Auto-generated constructor stub
		}

		/**
		 * @param text
		 */
		public StateLineItem(String text) {
			super(text);
			//Auto-generated constructor stub
		}

		/*
		 * @see edu.birzeit.stateChart.StateChartStepItem#getShapeRepresentation()
		 */
		@Override
		public Figure getShapeRepresentation() {
			//Auto-generated method stub

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
