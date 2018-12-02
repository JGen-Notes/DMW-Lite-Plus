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
package eu.jgen.notes.dmw.lite.mdl.generator

import com.google.common.collect.Sets
import java.util.Set
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.IFileSystemAccess

class ModelOutputProvider implements IOutputConfigurationProvider {
	public static final String DEFAULT = "DEFAULT_OUTPUT"
	public static final String DDL = "DDL"
	public static final String SWIFT = "SWIFT"
	public static final String SRC = "SRC"

	override Set<OutputConfiguration> getOutputConfigurations() {

		val Set<OutputConfiguration> configurations = Sets.newHashSet()

		var originOutput = new OutputConfiguration(SRC);
		originOutput.setDescription("Original Folder");
		originOutput.setOutputDirectory("./src");
		originOutput.setOverrideExistingResources(true);
		originOutput.setCreateOutputDirectory(true);
		originOutput.setCleanUpDerivedResources(true);
		originOutput.setSetDerivedProperty(true);
		configurations.add(originOutput)

		var defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Default Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		configurations.add(defaultOutput)

		var OutputConfiguration otherOutput = new OutputConfiguration(DDL)
		otherOutput.setDescription("Data Definition Language")
		otherOutput.setOutputDirectory("./src-gen-ddl")
		otherOutput.setOverrideExistingResources(true)
		otherOutput.setCreateOutputDirectory(true)
		otherOutput.setCleanUpDerivedResources(true)
		otherOutput.setSetDerivedProperty(true)
		configurations.add(otherOutput)

		var OutputConfiguration swiftOutput = new OutputConfiguration(SWIFT)
		swiftOutput.setDescription("Swift Package Manager")
		swiftOutput.setOutputDirectory("./src-swift")
		swiftOutput.setOverrideExistingResources(true)
		swiftOutput.setCreateOutputDirectory(true)
		swiftOutput.setCleanUpDerivedResources(true)
		swiftOutput.setSetDerivedProperty(true)
		configurations.add(swiftOutput)

		return configurations

	}
}
