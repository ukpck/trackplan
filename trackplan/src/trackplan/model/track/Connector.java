package trackplan.model.track;

public class Connector {
	
	private Connector neighbour;
	int offX, offY, offZ;
	double angle;
	
	public Connector(int x, int y, int z, double angle) {
		offX = x;
		offY = y;
		offZ = z;
		this.angle = angle;
		neighbour = null;
	}
	
	public void setNeigbour(Connector n) {
		neighbour = n;
	}
	
	public boolean isFree() {
		if(neighbour == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Connector getNeighbour() {
		return neighbour;
	}

	public int getOffX() {
		return offX;
	}

	public int getOffY() {
		return offY;
	}

	public int getOffZ() {
		return offZ;
	}
}
