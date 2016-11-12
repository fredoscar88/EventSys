package com.farr.Events;

public interface EventHandler {

	public boolean onEvent(Event event);	//Implemented by layers. Layers can send events to parts of themselves without requiring them to be other layers.
	
}
