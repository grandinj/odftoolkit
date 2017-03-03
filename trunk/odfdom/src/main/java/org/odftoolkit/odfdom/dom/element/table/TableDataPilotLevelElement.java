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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.table.TableShowEmptyAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-level}.
 *
 */
public class TableDataPilotLevelElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-level");

	/**
	 * Create the instance of <code>TableDataPilotLevelElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotLevelElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-level}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableShowEmptyAttribute</code> , See {@odf.attribute table:show-empty}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableShowEmptyAttribute() {
		TableShowEmptyAttribute attr = (TableShowEmptyAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "show-empty");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableShowEmptyAttribute</code> , See {@odf.attribute table:show-empty}
	 *
	 * @param tableShowEmptyValue   The type is <code>Boolean</code>
	 */
	public void setTableShowEmptyAttribute(Boolean tableShowEmptyValue) {
		TableShowEmptyAttribute attr = new TableShowEmptyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableShowEmptyValue.booleanValue());
	}

	/**
	 * Create child element {@odf.element table:data-pilot-display-info}.
	 *
	 * @param tableDataFieldValue  the <code>String</code> value of <code>TableDataFieldAttribute</code>, see {@odf.attribute  table:data-field} at specification
	 * @param tableDisplayMemberModeValue  the <code>String</code> value of <code>TableDisplayMemberModeAttribute</code>, see {@odf.attribute  table:display-member-mode} at specification
	 * @param tableEnabledValue  the <code>Boolean</code> value of <code>TableEnabledAttribute</code>, see {@odf.attribute  table:enabled} at specification
	 * @param tableMemberCountValue  the <code>Integer</code> value of <code>TableMemberCountAttribute</code>, see {@odf.attribute  table:member-count} at specification
	 * @return the element {@odf.element table:data-pilot-display-info}
	 */
	 public TableDataPilotDisplayInfoElement newTableDataPilotDisplayInfoElement(String tableDataFieldValue, String tableDisplayMemberModeValue, boolean tableEnabledValue, int tableMemberCountValue) {
		TableDataPilotDisplayInfoElement tableDataPilotDisplayInfo = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotDisplayInfoElement.class);
		tableDataPilotDisplayInfo.setTableDataFieldAttribute(tableDataFieldValue);
		tableDataPilotDisplayInfo.setTableDisplayMemberModeAttribute(tableDisplayMemberModeValue);
		tableDataPilotDisplayInfo.setTableEnabledAttribute(tableEnabledValue);
		tableDataPilotDisplayInfo.setTableMemberCountAttribute(tableMemberCountValue);
		this.appendChild(tableDataPilotDisplayInfo);
		return tableDataPilotDisplayInfo;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-layout-info}.
	 *
	 * @param tableAddEmptyLinesValue  the <code>Boolean</code> value of <code>TableAddEmptyLinesAttribute</code>, see {@odf.attribute  table:add-empty-lines} at specification
	 * @param tableLayoutModeValue  the <code>String</code> value of <code>TableLayoutModeAttribute</code>, see {@odf.attribute  table:layout-mode} at specification
	 * @return the element {@odf.element table:data-pilot-layout-info}
	 */
	 public TableDataPilotLayoutInfoElement newTableDataPilotLayoutInfoElement(boolean tableAddEmptyLinesValue, String tableLayoutModeValue) {
		TableDataPilotLayoutInfoElement tableDataPilotLayoutInfo = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotLayoutInfoElement.class);
		tableDataPilotLayoutInfo.setTableAddEmptyLinesAttribute(tableAddEmptyLinesValue);
		tableDataPilotLayoutInfo.setTableLayoutModeAttribute(tableLayoutModeValue);
		this.appendChild(tableDataPilotLayoutInfo);
		return tableDataPilotLayoutInfo;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-members}.
	 *
	 * @return the element {@odf.element table:data-pilot-members}
	 */
	public TableDataPilotMembersElement newTableDataPilotMembersElement() {
		TableDataPilotMembersElement tableDataPilotMembers = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotMembersElement.class);
		this.appendChild(tableDataPilotMembers);
		return tableDataPilotMembers;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-sort-info}.
	 *
	 * @param tableOrderValue  the <code>String</code> value of <code>TableOrderAttribute</code>, see {@odf.attribute  table:order} at specification
	 * @param tableSortModeValue  the <code>String</code> value of <code>TableSortModeAttribute</code>, see {@odf.attribute  table:sort-mode} at specification
	 * @return the element {@odf.element table:data-pilot-sort-info}
	 */
	 public TableDataPilotSortInfoElement newTableDataPilotSortInfoElement(String tableOrderValue, String tableSortModeValue) {
		TableDataPilotSortInfoElement tableDataPilotSortInfo = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotSortInfoElement.class);
		tableDataPilotSortInfo.setTableOrderAttribute(tableOrderValue);
		tableDataPilotSortInfo.setTableSortModeAttribute(tableSortModeValue);
		this.appendChild(tableDataPilotSortInfo);
		return tableDataPilotSortInfo;
	}

	/**
	 * Create child element {@odf.element table:data-pilot-subtotals}.
	 *
	 * @return the element {@odf.element table:data-pilot-subtotals}
	 */
	public TableDataPilotSubtotalsElement newTableDataPilotSubtotalsElement() {
		TableDataPilotSubtotalsElement tableDataPilotSubtotals = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotSubtotalsElement.class);
		this.appendChild(tableDataPilotSubtotals);
		return tableDataPilotSubtotals;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
