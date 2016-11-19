package com.farr.Events.types;

import com.farr.Events.Event;

public class KeyActionEvent extends Event {

	private int keyCode;
	
	public KeyActionEvent(Event.Type type, int keyCode) {
		super(type);
		this.keyCode = keyCode;
	}
	
	public int getKeyCode() {
		return keyCode;
	}
	
}
