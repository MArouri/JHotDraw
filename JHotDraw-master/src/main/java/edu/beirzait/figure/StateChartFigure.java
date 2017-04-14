/**
 * 
 */
package edu.beirzait.figure;

import java.util.LinkedList;

import org.jhotdraw.draw.ListFigure;
import org.jhotdraw.draw.layouter.VerticalLayouter;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import edu.beirzait.statechart.NextStateChartItem;
import edu.beirzait.statechart.StateChart;
import edu.beirzait.statechart.StateChartStepItem;
import edu.beirzait.statechart.StateLineItem;

/**
 * @author AnjadBad5:47:46 PM
 *
 */
public  class StateChartFigure extends ListFigure{

	private StateChart stateChart;
	private NextStateChartItem nextItem;
	
	private static final long serialVersionUID = 1L;

	
	
	public StateChartFigure() {
		//Auto-generated constructor stub
		stateChart = new StateChart();
		stateChart.addStepItem(nextItem = new NextStateChartItem("next"));
		stateChart.addStepItem(nextItem = new NextStateChartItem("next"));
	    stateChart.addStepItem(nextItem = new NextStateChartItem("End State"));
		
		drawFlow();
	}
	/**
	 * @param drawStateChart
	 */
	public StateChartFigure(StateChart stateChart) {
		//Auto-generated constructor stub
		assert stateChart != null:"Null stateChart not supported";
		this.stateChart = stateChart;
		drawFlow();
	}

	

	public void addNewFlowChartItem(StateChartStepItem item){
	    stateChart.removeStepItem(nextItem);
		stateChart.addStepItem(item);
		stateChart.addStepItem(nextItem);
		willChange();
		removeAllChildren();
		drawFlow();
		changed();		
	}
	
	
	private void drawFlow() {
		setLayouter(new VerticalLayouter());
		add(stateChart.getStepItem(0).getNameStepItem());
		
		for(int i = 1; i < stateChart.getStepItemsSize(); i++){
			add(new StateLineItem().getShapeRepresentation());
			add(stateChart.getStepItem(i).getNameStepItem());
		}
	}
}

