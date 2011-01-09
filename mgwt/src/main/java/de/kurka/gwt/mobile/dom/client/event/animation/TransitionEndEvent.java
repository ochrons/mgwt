/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.gwt.mobile.dom.client.event.animation;

import com.google.gwt.event.dom.client.DomEvent;

public class TransitionEndEvent extends DomEvent<TransitionEndHandler> {

	private static final Type<TransitionEndHandler> TYPE = new Type<TransitionEndHandler>("webkittransitionend", new TransitionEndEvent());

	/**
	   * Gets the event type associated with mouse down events.
	   * 
	   * @return the handler type
	   */
	public static Type<TransitionEndHandler> getType() {
		return TYPE;
	}

	@Override
	public com.google.gwt.event.dom.client.DomEvent.Type<TransitionEndHandler> getAssociatedType() {
		return TYPE;
	}

	/**
	   * Protected constructor, use
	   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	   * to fire mouse down events.
	   */
	protected TransitionEndEvent() {

	}

	@Override
	protected void dispatch(TransitionEndHandler handler) {
		handler.onTransitionEnd(this);

	}

}