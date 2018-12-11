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
package eu.jgen.notes.dmw.lite.tests.generators

import com.google.inject.Inject
 
import eu.jgen.notes.dmw.lite.utility.LangLib
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import eu.jgen.notes.dmw.lite.base.tests.LangInjectorProvider

@RunWith(XtextRunner)
@InjectWith(LangInjectorProvider)
class TestLiteLangGeneratorSwitchStatement {

	//@Inject extension ParseHelper<YWidget>
	//@Inject extension ValidationTestHelper
	@Inject extension CompilationTestHelper
	@Inject extension LangLib
	//@Inject Provider<ResourceSet> resourceSetProvider;

	//@Test
	def void testGenerateSwitchStatement1() {
		val body = '''
		package sample.project;						
		@java 
		class B : Widget {	
			class C : Object {
				
				public var x : Int;
				public var t : String;
		
			}
			var c : C;	
			var z : C;		
			public func start() {
				 switch self.c.x {
				 	case 1 : {
				 		// do 1    
				 	}
				 	case 2 : {
				 		// do 2
				 	}
				 	default : {
				 		// do 99
				 	}
				 }
				  
				 switch self.c.t {
				 	case "Joe" : {
				 		// do 1    
				 	}
				 	case "John" : {
				 		// do 2
				 	}
				 	default : {
				 		// do 99
				 	}
				 }
			}
						  
			public func add(a : Int, b : Int) -> Int {  
				if(true) {
						return a + b;
				} else {
						return 0; 	
				}    
			}
		}
		'''
	   
		newArrayList(loadLibSource, body).compile() [	
			println(it.getGeneratedCode("sample.project.B"))		
			Assert.assertFalse(checkIfIssues(it))			
		]
	}
	
		@Test
	def void testGenerateSwitchStatement2() {
		val body = '''
		package dmw.test.statements;
		
		@java
		
		/**
		 * This widget tests generation of the switch statement
		 */
		class B : Widget {
			
			public func getReturnOnInt(value : Int) -> String {	
		
				switch	value {
					case 1 : {
						return "case 1";
					}
					case 2 : {
						return "case 2";
					}
					default : {
						return "default";
					}
				}
				return ""; 
				}
		}
		'''
	   
		newArrayList(loadLibSource, body).compile() [	
			println(it.getGeneratedCode("dmw.test.statements.B"))		
			Assert.assertFalse(checkIfIssues(it))			
		]
	}
	
	def boolean checkIfIssues(Result result) {
		if (result.errorsAndWarnings.size > 0) {
			result.errorsAndWarnings.forEach[println(it)]			
			return true;
		}
 		result.compiledClass
		return false
	}

}
