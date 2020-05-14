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
 */
package eu.jgen.notes.dmw.lite.base.generator;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.generator.LangGlobalCommandsGenerator;
import eu.jgen.notes.dmw.lite.base.generator.LangGlobalExitStatesGenerator;
import eu.jgen.notes.dmw.lite.base.generator.LangWidgetGeneratorForJava;
import eu.jgen.notes.dmw.lite.base.generator.LangWidgetGeneratorForSwift;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class LangGenerator extends AbstractGenerator {
  public static String GENERATOR_NOTICE = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/* dmw-generator-version: 0.5");
      _builder.newLine();
      _builder.append("*\t\t\t\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("* Copyright © 2018 JGen. All rights reserved.");
      _builder.newLine();
      _builder.append("*/\t");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  @Inject
  private LangWidgetGeneratorForJava g2;
  
  @Inject
  private LangGlobalExitStatesGenerator g3;
  
  @Inject
  private LangGlobalCommandsGenerator g4;
  
  @Inject
  private LangWidgetGeneratorForSwift g5;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.g2.doGenerate(resource, fsa, context);
    this.g3.doGenerate(resource, fsa);
    this.g4.doGenerate(resource, fsa);
    this.g5.doGenerate(resource, fsa);
  }
}
