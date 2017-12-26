package model;

public abstract class Component implements IComponent {

	private double posX, posY, posZ, angle;
	private View view;
	
	public void setPosition(double x, double y, double z, long angle) {
		posX = x;
		posY = y;
		posZ = z;
		this.angle = Math.floorMod(angle, 360);
	}

}
