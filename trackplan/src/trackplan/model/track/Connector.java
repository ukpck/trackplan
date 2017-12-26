package trackplan.model.track;

class Connector {
	
	private Connector neighbour;
	double offX, offY, offZ,angle;
	
	public Connector(double x, double y, double z, double angle) {
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
}
