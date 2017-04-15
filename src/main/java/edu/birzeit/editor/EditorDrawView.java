package edu.birzeit.editor;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.net.URI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jhotdraw.app.AbstractView;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.ImageFigure;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.TextAreaFigure;
import org.jhotdraw.draw.TextFigure;
import org.jhotdraw.draw.action.ButtonFactory;
import org.jhotdraw.draw.io.DOMStorableInputOutputFormat;
import org.jhotdraw.draw.io.ImageInputFormat;
import org.jhotdraw.draw.io.ImageOutputFormat;
import org.jhotdraw.draw.io.TextInputFormat;
import org.jhotdraw.gui.PlacardScrollPaneLayout;
import org.jhotdraw.gui.URIChooser;
import org.jhotdraw.samples.draw.DrawFigureFactory;
import org.jhotdraw.util.ResourceBundleUtil;

/**
 * @author arouri
 *
 */
public class EditorDrawView extends AbstractView {
 
	private static final long serialVersionUID = -1720741840941179742L;

	private DefaultDrawingView view;

	private JScrollPane scrollPane;

	private DrawingEditor editor;

	
	public EditorDrawView() {

		initComponents();

		this.scrollPane.setLayout(new PlacardScrollPaneLayout());
		this.scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setEditor(new DefaultDrawingEditor());
		this.view.setDrawing(createDrawing());

		ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");

		JPanel placardPanel = new JPanel(new BorderLayout());
		javax.swing.AbstractButton pButton;
		pButton = ButtonFactory.createZoomButton(view);
		pButton.putClientProperty("Quaqua.Button.style", "placard");
		pButton.putClientProperty("Quaqua.Component.visualMargin", new Insets(0, 0, 0, 0));
		pButton.setFont(UIManager.getFont("SmallSystemFont"));
		placardPanel.add(pButton, BorderLayout.WEST);
		pButton = ButtonFactory.createToggleGridButton(view);
		pButton.putClientProperty("Quaqua.Button.style", "placard");
		pButton.putClientProperty("Quaqua.Component.visualMargin", new Insets(0, 0, 0, 0));
		pButton.setFont(UIManager.getFont("SmallSystemFont"));
		labels.configureToolBarButton(pButton, "view.toggleGrid.placard");
		placardPanel.add(pButton, BorderLayout.EAST);
		this.scrollPane.add(placardPanel, JScrollPane.LOWER_LEFT_CORNER);
	}
	
	/**
	 * 
	 */
	private void initComponents() {

		this.scrollPane = new JScrollPane();
		this.view = new DefaultDrawingView();

		setLayout(new BorderLayout());

		this.scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.scrollPane.setViewportView(view);

		add(this.scrollPane, BorderLayout.CENTER);
	}

	/**
	 * 
	 */
	public void setEditor(DrawingEditor newValue) {
		
		if (this.editor != null) {
			this.editor.remove(view);
		}
		this.editor = newValue;
		if (this.editor != null) {
			this.editor.add(view);
		}
	}

	/**
	 * 
	 */
	protected Drawing createDrawing() {

		Drawing drawing = new QuadTreeDrawing();
		DOMStorableInputOutputFormat ioFormat = new DOMStorableInputOutputFormat(new DrawFigureFactory());
		drawing.addInputFormat(ioFormat);
		ImageFigure prototype = new ImageFigure();
		drawing.addInputFormat(new ImageInputFormat(prototype));
		drawing.addInputFormat(new TextInputFormat(new TextFigure()));
		TextAreaFigure taf = new TextAreaFigure();
		taf.setBounds(new Point2D.Double(10, 10), new Point2D.Double(60, 40));
		drawing.addInputFormat(new TextInputFormat(taf));

		drawing.addOutputFormat(ioFormat);
		drawing.addOutputFormat(new ImageOutputFormat());
		return drawing;
	}


	@Override
	public void clear() {

	}

	@Override
	public void write(URI uri, URIChooser chooser) throws IOException {

	}

	@Override
	public void read(URI uri, URIChooser chooser) throws IOException {

	}
}
