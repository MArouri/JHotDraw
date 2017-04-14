/**
 * 
 */
package edu.birzeit.editor.figure;

import org.jhotdraw.draw.ListFigure;
import org.jhotdraw.draw.layouter.VerticalLayouter;

import edu.birzeit.editor.stateChart.NextStateChartItem;
import edu.birzeit.editor.stateChart.StateChart;
import edu.birzeit.editor.stateChart.StateChartStepItem;
import edu.birzeit.editor.stateChart.StateLineItem;

/**
 * @author Rawan Khader
 *
 */
public class StateChartFigure extends ListFigure{

	private StateChart drawStateChart;
	private NextStateChartItem nextItem;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StateChartFigure() {
		//Auto-generated constructor stub
		drawStateChart = new StateChart();
		drawStateChart.addStepItem(nextItem = new NextStateChartItem("next"));
		drawStateChart.addStepItem(nextItem = new NextStateChartItem("next"));
		drawStateChart.addStepItem(nextItem = new NextStateChartItem("End State"));
		
		drawFlow();
	}
	/**
	 * @param drawStateChart
	 */
	public StateChartFigure(StateChart drawStateChart) {
		//Auto-generated constructor stub
		assert drawStateChart != null:"Null stateChart not supported";
		this.drawStateChart = drawStateChart;
		drawFlow();
	}


	public void addNewFlowChartItem(StateChartStepItem item){
		drawStateChart.removeStepItem(nextItem);
		drawStateChart.addStepItem(item);
		drawStateChart.addStepItem(nextItem);
		willChange();
		removeAllChildren();
		drawFlow();
		changed();		
	}
	
	
	private void drawFlow() {
		setLayouter(new VerticalLayouter());
		add(drawStateChart.getStepItem(0).getNameStepItem());
		
		for(int i = 1; i < drawStateChart.getStepItemsSize(); i++){
			add(new StateLineItem().getShapeRepresentation());
			add(drawStateChart.getStepItem(i).getNameStepItem());
		}
	}
	
}
