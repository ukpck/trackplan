package trackplan.conrol.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import trackplan.conrol.ComponentController;
import trackplan.model.IComponent;

public class ComponentListener extends MouseAdapter {

	
	private IComponent component;
	private ComponentController controller;
	private int startX, startY;
	public ComponentListener(IComponent c) {
		component = c;
		controller = ComponentController.getInstance();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		controller.selectComponent(component);
		System.out.println("click " + component.toString());
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		int x = arg0.getXOnScreen() - startX;
		int y = arg0.getYOnScreen() - startY;
		System.out.println("drag " + x + " " + y);
		if(x != 0 || y != 0) {
			controller.updateViewPosition(x, y);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("enter " + arg0.getXOnScreen() + " " + arg0.getYOnScreen());
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("press " + arg0.getXOnScreen() + " " + arg0.getYOnScreen());
		startX = arg0.getXOnScreen();
		startY = arg0.getYOnScreen();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		int x = arg0.getXOnScreen() - startX;
		int y = arg0.getYOnScreen() - startY;
		System.out.println("release " + x + " " + y);
		if(x != 0 || y != 0) {
			controller.updatePosition(x, y);
		}
		

	}

}
