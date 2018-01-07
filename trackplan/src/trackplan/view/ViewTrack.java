package trackplan.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

import trackplan.model.track.Track;

public class ViewTrack extends ComponentView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Track track;

	public ViewTrack(Track model) {
		super(model);
		track = model;
		
	}

	@Override
	public void paintComponent(Graphics g) {
		  //super.paintComponent(g);

		  Graphics2D g2d = (Graphics2D) g.create();
		  
		  float thickness = 2;
		  Stroke oldStroke = g2d.getStroke();
		  AffineTransform old = g2d.getTransform();
		  BasicStroke border = new BasicStroke(thickness);
		  g2d.setStroke(border);
		  switch (track.getType()) {
		  case STRAIGHT:
			  g2d.setColor(Color.GRAY);
			  g2d.fillRect(track.getPosX(), track.getPosY() - 10, 100, 20);
			  break;
		  case CURVE:
			  
			  break;
		  case SWITCH:
			  
			  break;
		  }
		  g2d.rotate(Math.toRadians(track.getAngle()));
		  g2d.setStroke(oldStroke);
		  g2d.setTransform(old);
		  
	}

}
