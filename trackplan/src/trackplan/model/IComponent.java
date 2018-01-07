package trackplan.model;

import java.awt.Dimension;

import trackplan.view.ComponentView;

public interface IComponent{
	
	public void paint();
	
	public ComponentView getComponentView();
	
	public void move(int x, int y);
	
	public void setPosition(int x, int y, int z, long angle);
	
	public Dimension getDimension();
	
	public int getPosX();
	
	public int getPosY();
	
	public int getPosZ();
}
