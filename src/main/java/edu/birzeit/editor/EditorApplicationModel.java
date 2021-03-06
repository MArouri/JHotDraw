package edu.birzeit.editor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JToolBar;

import org.jhotdraw.app.AbstractApplicationModel;
import org.jhotdraw.app.Application;
import org.jhotdraw.app.EmptyMenuBuilder;
import org.jhotdraw.app.MenuBuilder;
import org.jhotdraw.app.View;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DiamondFigure;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.draw.RectangleFigure;
import org.jhotdraw.draw.RoundRectangleFigure;
import org.jhotdraw.draw.TriangleFigure;
import org.jhotdraw.draw.action.ButtonFactory;
import org.jhotdraw.draw.tool.CreationTool;
import org.jhotdraw.gui.URIChooser;
import org.jhotdraw.util.ResourceBundleUtil;

import edu.birzeit.editor.facade.EditorFigureMaker;
import edu.birzeit.editor.shapeFactory.ChartFactory;
import edu.birzeit.editor.shapeFactory.StateChartFactory;

/**
 * @author arouri
 *
 */
public class EditorApplicationModel extends AbstractApplicationModel {

	private static final long serialVersionUID = 7461858465774614624L;

	private DefaultDrawingEditor sharedEditor;

	private MenuBuilder menuBuilder;

	public EditorApplicationModel() {

	}

	public DefaultDrawingEditor getSharedEditor() {

		if (sharedEditor == null) {
			sharedEditor = new DefaultDrawingEditor();
		}
		return sharedEditor;
	}

	@Override
	public void initView(Application application, View view) {

		if (application.isSharingToolsAmongViews()) {
			((EditorDrawView) view).setEditor(getSharedEditor());
		}
	}

	@Override
	public List<JToolBar> createToolBars(Application a, View pr) {

		ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");
		// DrawView p = (DrawView) pr;

		// DrawingEditor editor;
		// if (p == null) {
		// editor = getSharedEditor();
		// } else {
		// editor = p.getEditor();
		// }

		System.out.println(sharedEditor);
		if (sharedEditor == null) {
			sharedEditor = new DefaultDrawingEditor();
		}

		JToolBar tb = new JToolBar();
		// Add creation buttons to the tool bar
		addCreationButtonsTo(tb, sharedEditor);
		tb.setName(labels.getString("window.drawToolBar.title"));

		LinkedList<JToolBar> list = new LinkedList<JToolBar>();
		list.add(tb);

		return list;
	}

	/**
	 * @param tb
	 * @param editor
	 */
	private void addCreationButtonsTo(JToolBar tb, DrawingEditor editor) {

		addDefaultCreationButtonsTo(tb, editor, ButtonFactory.createDrawingActions(editor),
				ButtonFactory.createSelectionActions(editor));
	}

	/**
	 * Add creation buttons of the figures to the tool bar TODO:// We need to
	 * add our custom figures here
	 * 
	 * @param tb
	 * @param editor
	 * @param drawingActions
	 * @param selectionActions
	 */
	private void addDefaultCreationButtonsTo(JToolBar tb, final DrawingEditor editor, Collection<Action> drawingActions,
			Collection<Action> selectionActions) {

		ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");

		ButtonFactory.addSelectionToolTo(tb, editor, drawingActions, selectionActions);
		tb.addSeparator();

		ButtonFactory.addToolTo(tb, editor, new CreationTool(new RectangleFigure()), "edit.createRectangle", labels);
		ButtonFactory.addToolTo(tb, editor, new CreationTool(new RoundRectangleFigure()), "edit.createRoundRectangle",
				labels);

		// Factory usage
		ChartFactory factory = new StateChartFactory();
		Figure ellipse = factory.getEllipse();
		Figure line = factory.getLine();

		ButtonFactory.addToolTo(tb, editor, new CreationTool(ellipse), "edit.createEllipse", labels);
		ButtonFactory.addToolTo(tb, editor, new CreationTool(new DiamondFigure()), "edit.createDiamond", labels);
		ButtonFactory.addToolTo(tb, editor, new CreationTool(new TriangleFigure()), "edit.createTriangle", labels);
		ButtonFactory.addToolTo(tb, editor, new CreationTool(new LineFigure()), "edit.createLine", labels);

		ButtonFactory.addToolTo(tb, editor, new CreationTool(line), "edit.createArrow", labels);

		ResourceBundleUtil mylabels = ResourceBundleUtil.getBundle("settings");
		ResourceBundleUtil.setVerbose(true);

		// Facade usage
		EditorFigureMaker maker = new EditorFigureMaker();

		try {
			ButtonFactory.addToolTo(tb, editor, new CreationTool(maker.getCompositeFigure()), "edit.createComposite",
					mylabels);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ButtonFactory.addToolTo(tb, editor, new CreationTool(maker.getStateChartFigure()), "edit.createComposite",
				mylabels);

	}

	@Override
	public URIChooser createOpenChooser(Application a, View v) {

		return null;
	}

	@Override
	public URIChooser createSaveChooser(Application a, View v) {

		return null;
	}

	@Override
	public ActionMap createActionMap(Application a, View v) {

		ActionMap m = new ActionMap();
		return m;
	}

	@Override
	public MenuBuilder getMenuBuilder() {
		if (menuBuilder == null) {
			menuBuilder = createMenuBuilder();
		}
		return menuBuilder;
	}

	protected MenuBuilder createMenuBuilder() {
		return new EmptyMenuBuilder();
	}

}