package model.track;

import java.util.ArrayList;
import java.util.List;

import model.Component;
import model.ComponentGroup;

public class Track extends Component {

	private List<Connector> connectors;
	private ComponentGroup<Track> feedback;
	
	public Track() {
		connectors = new ArrayList<Connector>();
		feedback = null;
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
	
	@Override
	public void paint() {
		// TODO Auto-generated method stub

	}

}
