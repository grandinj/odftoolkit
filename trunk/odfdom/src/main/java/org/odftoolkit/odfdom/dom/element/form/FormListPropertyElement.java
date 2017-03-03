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
package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.form.FormPropertyNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:list-property}.
 *
 */
public class FormListPropertyElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.FORM, "list-property");

	/**
	 * Create the instance of <code>FormListPropertyElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormListPropertyElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:list-property}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormPropertyNameAttribute</code> , See {@odf.attribute form:property-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormPropertyNameAttribute() {
		FormPropertyNameAttribute attr = (FormPropertyNameAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "property-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>FormPropertyNameAttribute</code> , See {@odf.attribute form:property-name}
	 *
	 * @param formPropertyNameValue   The type is <code>String</code>
	 */
	public void setFormPropertyNameAttribute(String formPropertyNameValue) {
		FormPropertyNameAttribute attr = new FormPropertyNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(formPropertyNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeValueTypeAttribute() {
		OfficeValueTypeAttribute attr = (OfficeValueTypeAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @param officeValueTypeValue   The type is <code>String</code>
	 */
	public void setOfficeValueTypeAttribute(String officeValueTypeValue) {
		OfficeValueTypeAttribute attr = new OfficeValueTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeValueTypeValue);
	}

	/**
	 * Create child element {@odf.element form:list-value}.
	 *
	 * @param officeBooleanValueValue  the <code>Boolean</code> value of <code>OfficeBooleanValueAttribute</code>, see {@odf.attribute  office:boolean-value} at specification
	 * @param officeDateValueValue  the <code>String</code> value of <code>OfficeDateValueAttribute</code>, see {@odf.attribute  office:date-value} at specification
	 * @param officeStringValueValue  the <code>String</code> value of <code>OfficeStringValueAttribute</code>, see {@odf.attribute  office:string-value} at specification
	 * @param officeTimeValueValue  the <code>String</code> value of <code>OfficeTimeValueAttribute</code>, see {@odf.attribute  office:time-value} at specification
	 * @param officeValueValue  the <code>Double</code> value of <code>OfficeValueAttribute</code>, see {@odf.attribute  office:value} at specification
	 * @return the element {@odf.element form:list-value}
	 */
	 public FormListValueElement newFormListValueElement(boolean officeBooleanValueValue, String officeDateValueValue, String officeStringValueValue, String officeTimeValueValue, double officeValueValue) {
		FormListValueElement formListValue = ((OdfFileDom) this.ownerDocument).newOdfElement(FormListValueElement.class);
		formListValue.setOfficeBooleanValueAttribute(officeBooleanValueValue);
		formListValue.setOfficeDateValueAttribute(officeDateValueValue);
		formListValue.setOfficeStringValueAttribute(officeStringValueValue);
		formListValue.setOfficeTimeValueAttribute(officeTimeValueValue);
		formListValue.setOfficeValueAttribute(officeValueValue);
		this.appendChild(formListValue);
		return formListValue;
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
