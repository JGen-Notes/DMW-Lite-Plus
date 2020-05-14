/**
 * [The "BSD license"]
 * Copyright (c) 2016, JGen Notes
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions 
 *    and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, 
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS 
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package eu.jgen.notes.dmw.lite.base.tests

import com.google.inject.Inject

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import eu.jgen.notes.dmw.lite.base.lang.YWidget
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex

@RunWith(XtextRunner)
@InjectWith(LangInjectorProvider)
class Index {
	@Inject extension ParseHelper<YWidget>
	@Inject extension LangIndex

	@Test def void testExportedEObjectDescriptions() {
		'''
		package eu.jgen.bee.misc;
		import eu.jgen.notes.lib.dmw.*;  
		
		
		enum Db : XError {  	

			 case Duplicate(msg : String) 
   
		}
		
		class CreateProduct : XWidget {           			
			
			func start() throws {
				do {
			      
				} catch Db.Duplicate  { 
					 
				}
				 
			
			}					
		}
		'''.parse.assertExportedEObjectDescriptions("eu.jgen.bee.misc, eu.jgen.bee.misc.Db, eu.jgen.bee.misc.Db.Duplicate, eu.jgen.bee.misc.Db.Duplicate.msg, eu.jgen.bee.misc.CreateProduct, eu.jgen.bee.misc.CreateProduct.start")

	}



	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(
			o.getExportedEObjectDescriptions.map[qualifiedName].join(", ")
		)
	}

	def private assertClassesInIndex(EObject o, String expected) {
		val visibleClassesDescriptions = o.getVisibleClassesDescriptions
		expected.assertEquals(visibleClassesDescriptions.
			map[it.qualifiedName].join(", "))
	}

	def private assertExternalClassesInIndex(EObject o, String expected) {
		val visibleExternalClassesDescriptions = o.getVisibleExternalClassesDescriptions
		expected.assertEquals(visibleExternalClassesDescriptions.values.
			map[it.qualifiedName].join(", "))
	}

}
