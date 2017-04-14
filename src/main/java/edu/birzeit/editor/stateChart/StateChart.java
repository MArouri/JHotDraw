/**
 * 
 */
package edu.birzeit.editor.stateChart;

import java.util.LinkedList;
import java.util.List;

import org.jhotdraw.draw.Figure;

/**
 * @author Rawan Khader
 *
 */
public class StateChart extends StateChartStepItem {

	/**
	 * Figure representation
	 */
	private Figure figure;
	
	/**
	 * Composition relation Child List
	 */
	private List<StateChartStepItem> stepItems = new LinkedList<StateChartStepItem>();
	
	/**
	 * 
	 */
	public StateChart() {
		super("Start State");
		//Auto-generated constructor stub
	}

	/**
	 * @param text
	 */
	public StateChart(String text) {
		super(text);
		addStepItem(new NextStateChartItem(getText()));

		//Auto-generated constructor stub
	}
	
	/* 
	 * @see edu.birzeit.stateChart.StateChartStepItem#getShapeRepresentation()
	 */
	@Override
	public Figure getShapeRepresentation() {
		//Auto-generated method stub
		return figure;
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#addStepItem(edu.birzeit.stateChart.StateChartStepItem)
	 */
	@Override
	public void addStepItem(StateChartStepItem stepItem) {
		//Auto-generated method stub
		stepItems.add(stepItem);
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#removeStepItem(edu.birzeit.stateChart.StateChartStepItem)
	 */
	@Override
	public void removeStepItem(StateChartStepItem stepItem) {
		//Auto-generated method stub
		stepItems.remove(stepItem);
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#getStepItem(int)
	 */
	@Override
	public StateChartStepItem getStepItem(int index) {
		//Auto-generated method stub
		return stepItems.get(index);
	}

	/*
	 * @see edu.birzeit.stateChart.StateChartStepItem#getStepItemsSize()
	 */
	@Override
	public int getStepItemsSize() {
		//Auto-generated method stub
		return stepItems.size();
	}

	/* 
	 * @see edu.birzeit.stateChart.StateChartStepItem#getStepItems()
	 */
	@Override
	public List<StateChartStepItem> getStepItems() {
		//Auto-generated method stub
		return stepItems;
	}

}
