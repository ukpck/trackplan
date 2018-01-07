package trackplan.conrol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import trackplan.model.ComponentGroup;
import trackplan.model.IComponent;
import trackplan.model.track.Track;

public class ComponentController {
	
	private Map<String, ComponentGroup<IComponent>> layers;
	private Map<String, ComponentGroup<Track>> feedbacks;
	private Set<IComponent> selected;
	private static ComponentController instance = null;
	
	private ComponentController() {
		layers = new HashMap<String, ComponentGroup<IComponent>>();
		feedbacks = new HashMap<String, ComponentGroup<Track>>();
		selected = new HashSet<IComponent>();
	}
	
	public static ComponentController getInstance() {
		if (instance == null) {
			return new ComponentController();
		} else {
			return instance;
		}
	}
	
	public void selectComponent(IComponent c) {
		selected.clear();
		addComponentToSelection(c);
	}
	
	public void addComponentToSelection(IComponent c) {
		selected.add(c);
	}
	
	public void updatePosition(int offX, int offY) {
		for(IComponent c : selected) {
			c.move(offX, offY);
		}
	}
	
	public void updateViewPosition(int offX, int offY) {
		for(IComponent c : selected) {
			c.getComponentView().setBounds(c.getPosX() + offX, c.getPosY() + offY, c.getDimension().width, c.getDimension().height);
			c.getComponentView().repaint();
			//c.move(offX, offY);
		}
	}
	
	

}
