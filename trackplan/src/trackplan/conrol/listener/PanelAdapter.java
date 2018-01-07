package trackplan.conrol.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import trackplan.conrol.ComponentController;

public class PanelAdapter extends MouseAdapter {
	
	private ComponentController controller;
	private int startX, startY;
	
	public PanelAdapter() {
		controller = ComponentController.getInstance();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getXOnScreen() - startX;
		int y = e.getYOnScreen() - startY;
		System.out.println("drag " + x + " " + y);
		if(x != 0 || y != 0) {
			controller.updateViewPosition(x, y);
		}
	}

}
