package com.farr.Events;

import java.awt.Graphics;
import java.util.List;

public interface BlockingLayer {
	
	public void render(Graphics g);
	
	public boolean update();

	public void onEvent(Event e);
	
	public void init(List<BlockingLayer> l);
		
}
