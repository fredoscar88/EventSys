package com.farr.Events;

public class Event {

	public enum Type {
		MOUSE_MOVED,
		MOUSE_PRESSED,
		MOUSE_RELEASED,
		KEY_PRESSED,
		KEY_RELEASED, 
		UPDATE, 
		FOCUS_LOST,
		FOCUS_GAINED
	}
	
	private Type type;
	boolean handled;	//note well that EventDispatcher is in the same package. This is the package visibility modifier- that is to say, unspecified
	
	public Event(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean getHandled() {
		return handled;
	}
	
}
