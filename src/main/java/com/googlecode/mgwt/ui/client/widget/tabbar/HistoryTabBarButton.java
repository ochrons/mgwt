/*
 * Copyright 2011 Daniel Kurka
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
package com.googlecode.mgwt.ui.client.widget.tabbar;

import com.google.gwt.dom.client.Style.Unit;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTStyle;
import com.googlecode.mgwt.ui.client.theme.base.TabBarCss;

/**
 * A simple history tab bar button
 * 
 * @author Daniel Kurka
 * 
 */
public class HistoryTabBarButton extends TabBarButton {

	public HistoryTabBarButton() {
		this(MGWTStyle.getTheme().getMGWTClientBundle().getTabBarCss());
	}

	public HistoryTabBarButton(TabBarCss css) {
		super(css, MGWT.getOsDetection().isIOs() || MGWT.getOsDetection().isDesktop() ? MGWTStyle.getTheme().getMGWTClientBundle().tabBarHistoryImage() : null);
		setText("History");

		text.getStyle().setPaddingTop(4, Unit.PX);
	}

}
