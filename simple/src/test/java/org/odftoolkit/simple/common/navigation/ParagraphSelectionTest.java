/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/

package org.odftoolkit.simple.common.navigation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.odftoolkit.simple.Document;
import org.odftoolkit.simple.TextDocument;
import org.odftoolkit.simple.text.Paragraph;
import org.odftoolkit.simple.utils.ResourceUtilities;

/**
 * Test the method of class
 * org.odftoolkit.simple.common.navigation.ParagraphSelection
 */
public class ParagraphSelectionTest {

	private static final String TEXT_FILE = "TestTextSelection.odt";
	TextDocument doc,sourcedoc;
	TextNavigation search;

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		try {
			doc = (TextDocument) Document.loadDocument(ResourceUtilities.getAbsolutePath(TEXT_FILE));
			sourcedoc=TextDocument.newTextDocument();
			sourcedoc.addParagraph("Hello1 from SIMPLE source document!");
			sourcedoc.addParagraph("Hello2 from source document!");
			sourcedoc.addParagraph("Hello3 from source document!");
		} catch (Exception e) {
			Logger.getLogger(ParagraphSelectionTest.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			Assert.fail("Failed with " + e.getClass().getName() + ": '" + e.getMessage() + "'");
		}
	}

	@After
	public void tearDown() {
	}
	/**
	 * Test ReplaceWithParagraph method of
	 * org.odftoolkit.simple.common.navigation.ParagraphSelection replace "SIMPLE","Task1","Container" to different Paragraph
	 */
	@Test
	public void testReplaceWithParagraph() {
		search = null;
		//6 Simple, at the middle of original Paragraph, split original Paragraph, insert before the second Paragraph.
		search = new TextNavigation("SIMPLE", doc);
		int i = 0;
		while (search.hasNext()) {
				TextSelection item = (TextSelection) search.nextSelection();
				ParagraphSelection nextParagraphSelection=new ParagraphSelection(item);
				Paragraph paragraph=sourcedoc.getParagraphByIndex(0, true);
				nextParagraphSelection.replaceWithParagraph(paragraph);
			i++;
		}
		search = new TextNavigation("Hello1 from SIMPLE source document!", doc);
		int j = 0;
		while (search.hasNext()) {
			search.nextSelection();
			j++;
		}
		Assert.assertTrue(i == j);

		//2 Task1, #1 at the start of original Paragraph, #2 replace original Paragraph
				search = new TextNavigation("Task1", doc);
				 i = 0;
				while (search.hasNext()) {
						TextSelection item = (TextSelection) search.nextSelection();
						ParagraphSelection nextParagraphSelection=new ParagraphSelection(item);
						Paragraph paragraph=sourcedoc.getParagraphByIndex(1, true);
						nextParagraphSelection.replaceWithParagraph(paragraph);
					i++;
				}
				search = new TextNavigation("Hello2 from source document!", doc);
				 j = 0;
				while (search.hasNext()) {
					search.nextSelection();
					j++;
				}
				Assert.assertTrue(i == j);

				//1 Container, #1 at the end of original Paragraph,
				search = new TextNavigation("Container", doc);
				 i = 0;
				while (search.hasNext()) {
						TextSelection item = (TextSelection) search.nextSelection();
						ParagraphSelection nextParagraphSelection=new ParagraphSelection(item);
						Paragraph paragraph=sourcedoc.getParagraphByIndex(2, true);
						nextParagraphSelection.replaceWithParagraph(paragraph);
					i++;
				}
				search = new TextNavigation("Hello3 from source document!", doc);
				 j = 0;
				while (search.hasNext()) {
					search.nextSelection();
					j++;
				}
				Assert.assertTrue(i == j);


		try {
			doc.save(ResourceUtilities.newTestOutputFile("TestParagraphSelectionResult.odt"));
		} catch (Exception e) {
			Logger.getLogger(ParagraphSelectionTest.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			Assert.fail("Failed with " + e.getClass().getName() + ": '" + e.getMessage() + "'");
		}
	}
}
