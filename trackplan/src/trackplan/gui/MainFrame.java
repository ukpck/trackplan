package trackplan.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;

import trackplan.conrol.action.KeyboardAction;
import trackplan.conrol.listener.ComponentListener;
import trackplan.model.track.Track;
import trackplan.model.track.TrackType;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel canvas;
	public MainFrame() {
		super();
		setSize(500, 500);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel canvas = new JPanel();
		canvas.setLayout(new BorderLayout());
		canvas.setPreferredSize(new Dimension(1000, 1000));
		canvas.setBounds(0,  0,  1000, 1000);
		canvas.setBackground(Color.WHITE);
		
		canvas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ctrl"), "pressCTRL");
		canvas.getActionMap().put("pressCTRL", new KeyboardAction());
		
		Track t1 = new Track(TrackType.STRAIGHT);
		t1.setPosition(200, 200, 0, 270);
		Track t2 = new Track(TrackType.STRAIGHT);
		t2.setPosition(40, 60, 0, 0);
		canvas.add(t1.getComponentView());
		canvas.add(t2.getComponentView());
		JScrollPane scrollCanvas = new JScrollPane(canvas, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(scrollCanvas);
		
		setVisible(true);
		
		
	}

}
