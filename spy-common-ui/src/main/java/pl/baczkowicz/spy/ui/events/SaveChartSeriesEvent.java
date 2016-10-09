/***********************************************************************************
 * 
 * Copyright (c) 2015 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 * The Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */

package pl.baczkowicz.spy.ui.events;

import pl.baczkowicz.spy.ui.properties.ChartSeriesProperties;

public class SaveChartSeriesEvent
{
	private ChartSeriesProperties editedProperties;
	
	private boolean isNew;

	public SaveChartSeriesEvent(final ChartSeriesProperties editedProperties, final boolean isNew)
	{
		this.editedProperties = editedProperties;
		this.isNew = isNew;
	}

	/**
	 * @return the editedProperties
	 */
	public ChartSeriesProperties getEditedProperties()
	{
		return editedProperties;
	}

	public boolean isNew()
	{
		return isNew;
	}
}
