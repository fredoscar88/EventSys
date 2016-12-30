package com.farr.Events.types;

import com.farr.Events.Event;

public class MouseScrollEvent extends Event {

	public int x, y, rotation;
	
	public MouseScrollEvent(int x, int y, int rotation) {
		super(Event.Type.MOUSE_SCROLLED);
		this.x = x;
		this.y = y;
		this.rotation = rotation;
		
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getRotation() {
		return rotation;
	}

}
