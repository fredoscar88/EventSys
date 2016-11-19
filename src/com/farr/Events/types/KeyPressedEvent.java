package com.farr.Events.types;

import com.farr.Events.Event;

//Note that we could have done this in the style of the Mice, i.e have a KeyAction event and KeyPress and KeyRelease just extend that. In fact..
public class KeyPressedEvent extends KeyActionEvent {

	public KeyPressedEvent(int keyCode) {
		super(Event.Type.KEY_PRESSED, keyCode);

	}

}
