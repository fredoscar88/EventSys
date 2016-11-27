package com.farr.Events;

import java.awt.Graphics;
import java.util.List;

public interface Layer {
	
	public void render(Graphics g);
	
	public void update();

	public void onEvent(Event e);
	
	//TODO change implementation of Layer and BlockingLayer to figure out how we really want init used
	public void init(List<BlockingLayer> l);
	
}
