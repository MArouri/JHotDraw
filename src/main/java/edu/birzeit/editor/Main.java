package edu.birzeit.editor;

import org.jhotdraw.app.Application;
import org.jhotdraw.app.OSXApplication;
import org.jhotdraw.app.SDIApplication;

/**
 * @author arouri
 *
 */
public class Main {

	//java.lang.ClassCastException: edu.birzeit.editor.EditorDrawView cannot be cast to org.jhotdraw.samples.draw.DrawView
	
	private static final String MAC = "mac";
	private static final String OS_NAME = "os.name";

	public static void main(String[] args) {

		Application app;
		String os = System.getProperty(OS_NAME).toLowerCase();
		
		if (os.startsWith(MAC)) {
			app = new OSXApplication();
		} else {
			app = new SDIApplication();
		}

		EditorApplicationModel model = new EditorApplicationModel();
		model.setName("JHotDraw");
		model.setVersion(Main.class.getPackage().getImplementationVersion());
		model.setCopyright("SWEN 6304");
		model.setViewClassName("edu.birzeit.editor.EditorDrawView");
		app.setModel(model);
		app.launch(args);
	}

}