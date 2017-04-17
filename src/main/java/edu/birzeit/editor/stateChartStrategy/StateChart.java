/**
 * 
 */
package edu.birzeit.editor.stateChartStrategy;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

import org.jhotdraw.draw.Figure;

/**
 * @author Rawan Khader
 *
 */

/**
 * StateChart is a concrete strategy 
 */
public class StateChart extends StateChartStepItem implements Iterator<StateChartStepItem> {
	private int index = 0;
	
	/**
	 * Figure representation
	 */
	private Figure figure;
	
	/**
	 * Composition relation Child List
	 */
	private List<StateChartStepItem> stepItems = new LinkedList<StateChartStepItem>();
	private Iterator<StateChartStepItem> stepItemsIterator = stepItems.listIterator();
	
	
	/* 
	 * Used to return iterator object for StateChartStepItem objects.
	 */
	public Iterator<StateChartStepItem> interator() {
		return stepItems.listIterator();
	}
	
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

	/* 
	 * Returns true if the iteration has more elements.
	 */
	@Override
	public boolean hasNext() {
		return stepItemsIterator.hasNext();
		
		
		// OR we can implement it again as shown below:
		/*
		boolean hasNextState = false;
		
		try {
			if (stepItems.get(index) != null) hasNextState = true;
		} catch (IndexOutOfBoundsException e) {
			hasNextState = false;
		}
		
		return hasNextState;*/
	}

	/* 
	 * Returns the next element in the iteration.
	 */
	@Override
	public StateChartStepItem next() {
		return stepItemsIterator.next();
		
		
		// OR we can implement it again as shown below:
		/*
		StateChartStepItem stateChartStepItem = null;
		
		try {
			stateChartStepItem = stepItems.get(index);
			index = index + 1;
		} catch (IndexOutOfBoundsException e) {
			stateChartStepItem = null;
		}
		
		return stateChartStepItem;*/
	}

	/* 
	 * Removes from the underlying Collection the last element returned by the Iterator (optional operation).
	 */
	@Override
	public void remove() {
		stepItemsIterator.remove();

		
		// OR we can implement it again as shown below:
		/*
		try {
			stepItems.remove(index);
			index = index - 1;
		} catch (IndexOutOfBoundsException e) {
			// to log.
		}	*/
	}

}
