package trackplan.model.track;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import trackplan.model.Component;
import trackplan.model.ComponentGroup;
import trackplan.view.ViewTrack;

public class Track extends Component {

	private List<Connector> connectors;
	private ComponentGroup<Track> feedback;
	TrackType type;
	
	public Track(TrackType tt) {
		connectors = new ArrayList<Connector>();
		feedback = null;
		type = tt;
		view = new ViewTrack(this);
	}
	
	public void addFeedback(ComponentGroup<Track> fb) {
		feedback = fb;
		fb.addMember(this);
	}
	
	public void removeFeedback() {
		feedback.removeMember(this);
		feedback = null;
	}
	
	public boolean hasFeedback() {
		if (feedback == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public List<Connector> getConnectors() {
		return connectors;
	}

	public TrackType getType() {
		return type;
	}
	
	public Dimension getDimension() {
		return new Dimension(100, 20);
	}
	
	@Override
	public void paint() {
		// TODO Auto-generated method stub

	}

}
