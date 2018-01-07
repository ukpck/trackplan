package trackplan.model;

import trackplan.view.ComponentView;

public abstract class Component implements IComponent {

	private int posX, posY, posZ;
	private double angle;
	protected ComponentView view;
	
	public void setPosition(int x, int y, int z, long angle) {
		posX = x;
		posY = y;
		posZ = z;
		this.angle = Math.floorMod(angle, 360);
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getPosZ() {
		return posZ;
	}
	
	public ComponentView getComponentView() {
		return view;
	}
	
	public void move(int offX, int offY) {
		posX += offX;
		posY += offY;
	}
	
	

}
