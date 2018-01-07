package trackplan.view;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JPanel;

import trackplan.conrol.listener.ComponentListener;
import trackplan.model.IComponent;

/**
 * @author ukpck
 * needed for the presentation in 2D and 3D
 * it's gonna be a long way^^
 */
public abstract class ComponentView extends JPanel{

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected IComponent model;
	
	protected ComponentView(IComponent model) {
		this.model = model;
		setPreferredSize(new Dimension(model.getDimension()));
		setBounds(model.getPosX(), model.getPosY(), model.getDimension().width, model.getDimension().height);		
		addMouseListener(new ComponentListener(model));
	}
	
	
	
	
}
