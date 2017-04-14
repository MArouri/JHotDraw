package edu.birzeit.editor.composite;

import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.layouter.HorizontalLayouter;
import org.jhotdraw.draw.layouter.Layouter;

/**
 * @author arouri
 * This class is the composite client, it uses GraphicalCompositeFigure to construct an example of composite usage
 *
 */
public class CompositeRectangleClient {

	private GraphicalCompositeFigure container;

	public CompositeRectangleClient() {
		container = new GraphicalCompositeFigure();
		Layouter layouter = new HorizontalLayouter();
		container.setLayouter(layouter);
	}

	public GraphicalCompositeFigure getContainer() throws Exception {
		
		this.container.add(new BasicRectangle(0,0,50,50).getFigure());
		this.container.add(new BasicRectangle(0,0,50,50).getFigure());
		
		RectangleComponent firstComponent = new RectangleGroup();
		firstComponent.addComponent(new BasicRectangle(0,0,50,50));
		this.container.add(firstComponent.getFigure());
		
		RectangleComponent secondComponent = new RectangleGroup();
		secondComponent.addComponent(new BasicRectangle(0,0,25,25));
		secondComponent.addComponent(new BasicRectangle(25,0,25,25));
		firstComponent.addComponent(secondComponent);
		
		RectangleComponent thirdComponent = new RectangleGroup();
		thirdComponent.addComponent(new BasicRectangle(0,25,25,25));
		thirdComponent.addComponent(new BasicRectangle(25,25,25,25));
		firstComponent.addComponent(thirdComponent);
		
		System.out.println(firstComponent.getArea());
		
		return container;
	}
	
}