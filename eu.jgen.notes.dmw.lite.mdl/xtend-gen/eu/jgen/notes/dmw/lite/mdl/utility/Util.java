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
package eu.jgen.notes.dmw.lite.mdl.utility;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Util {
  private final String SOURCE_SUBFOLDER_NAME = "src";
  
  private final String FOLDER_SEPARATION_CHARACTER = "/";
  
  public String guessPackageName(final String folderName) {
    final String[] membersArray = folderName.split(this.FOLDER_SEPARATION_CHARACTER);
    int index = 0;
    for (final String member : membersArray) {
      {
        boolean _equals = Objects.equal(member, this.SOURCE_SUBFOLDER_NAME);
        if (_equals) {
          final List<String> packageMembers = ((List<String>)Conversions.doWrapArray(membersArray)).subList((index + 1), ((List<String>)Conversions.doWrapArray(membersArray)).size());
          int _size = packageMembers.size();
          boolean _equals_1 = (_size == 0);
          if (_equals_1) {
            return null;
          }
          StringConcatenation _builder = new StringConcatenation();
          {
            boolean _hasElements = false;
            for(final String packageMember : packageMembers) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(".", "");
              }
              _builder.append(packageMember);
            }
          }
          return _builder.toString();
        }
        index++;
      }
    }
    return null;
  }
}
