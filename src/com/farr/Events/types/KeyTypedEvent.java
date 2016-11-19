package com.farr.Events.types;

import com.farr.Events.Event;

public class KeyTypedEvent extends Event {

	private char keyChar;

	//TODO improve to allow us to have more information about the typed char, like whether it's an action key, or some modifiers. Maybe just contain the whole KeyTypedEvent..
	public KeyTypedEvent(char keyChar) {
		super(Event.Type.KEY_TYPED);
		this.keyChar = keyChar;
	}
	
	public char getKeyChar() {
		return keyChar;
	}
}
