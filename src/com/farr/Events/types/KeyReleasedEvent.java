package com.farr.Events.types;

import com.farr.Events.Event;

public class KeyReleasedEvent extends KeyActionEvent {

	public KeyReleasedEvent(int keyCode) {
		super(Event.Type.KEY_RELEASED, keyCode);
	}

}
