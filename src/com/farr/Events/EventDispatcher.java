package com.farr.Events;

public class EventDispatcher {

	private Event event;
	
	public EventDispatcher(Event event) {
		this.event = event;
	}
	
	public void dispatch(Event.Type type, EventHandler handler) {
		
		//If a layer further up the stack has already handled the event, dont touch
		if (event.handled)
			return;
		
		//If the type we're trying to run matches, then handle the event
		if (event.getType() == type) {
			event.handled = handler.onEvent(event);	//If handled, no other event subscribers can handle this.
		}
	}
	
	public void dispatch(Event.Type type, EventListener listener) {
		
		//If a layer further up the stack has already handled the event, dont touch
		if (event.handled)
			return;
		
		//If the type we're trying to run matches, then handle the event
		if (event.getType() == type) {
			listener.onEvent(event);	//If handled, no other event subscribers can handle this.
		}
	}
	
	
	//Should a layer wish to block events that it isn't handling, it can do so.
	//Slight problem, there is redundancy in using the EventHandler with a return statement. TODO have an EventListener method
	public void blockEvent() {
		event.handled = true;
	}
	
}
