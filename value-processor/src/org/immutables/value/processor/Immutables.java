/*
   Copyright 2014 Immutables Authors and Contributors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.value.processor;

import org.immutables.generator.Templates;
import org.immutables.generator.Generator;

@Generator.Template
abstract class Immutables extends ValuesTemplate {
  abstract org.immutables.generator.Templates.Invokable arrayAsList();

  abstract Templates.Invokable arrayAsListSecondary();

  abstract Templates.Invokable objectsUtilRef();

  abstract Templates.Invokable objectsUtility();

  abstract Templates.Invokable collectionUtility();

  abstract Templates.Invokable equalsAttribute();

  abstract Templates.Invokable primitiveHashCode();
}
