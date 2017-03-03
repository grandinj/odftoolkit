/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.attribute.table;

import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute table:track-changes}.
 *
 */
public class TableTrackChangesAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "track-changes");
	public static final String DEFAULT_VALUE = "false";

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute table:track-changes}.
	 *
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public TableTrackChangesAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}

	/**
	 * Returns the attribute name.
	 *
	 * @return the <code>OdfName</code> for {@odf.attribute table:track-changes}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}

	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param value The <code>boolean</code> value of the attribute.
	 */
	public void setBooleanValue(boolean value) {
		super.setValue(String.valueOf(value));
	}

	/**
	 * @return Returns the <code>boolean</code> value of the attribute
	 */
	public boolean booleanValue() {
		String val = super.getValue();
		try {
			return Boolean.parseBoolean(val);
		} catch (NumberFormatException e) {
			// TODO: validation handling/logging
			throw (e);
		}
	}

	/**
	 * Returns the default value of {@odf.attribute table:track-changes}.
	 *
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		String defaultValue = null;
		if (parentElement != null) {
			defaultValue=DEFAULT_VALUE;
		}
		return defaultValue;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 *
	 * @return <code>true</code> if {@odf.attribute table:track-changes} has an element parent
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return getOwnerElement() == null ? false : true;
	}

	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
	}
}
