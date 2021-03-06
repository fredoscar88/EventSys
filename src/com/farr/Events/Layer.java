package com.farr.Events;

import java.awt.Graphics;
import java.util.List;

public interface Layer {
		
	public void render(Graphics g);
	
	public void update();

	public void onEvent(Event e);
	
	public void init(List<Layer> l);
	
}
