/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMSchemaType;
import com.tools20022.metamodel.MMSchemaTypeKind;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * W3C XML Schema Built-in datatype "positiveInteger".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMSchemaType#getKind kind} =
 * com.tools20022.metamodel.MMSchemaTypeKind.positiveInteger</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "positiveInteger"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "W3C XML Schema Built-in datatype \"positiveInteger\"."</li>
 * </ul>
 */
public class positiveInteger {

	final static private AtomicReference<MMSchemaType> mmObject_lazy = new AtomicReference<>();

	final static public MMSchemaType mmObject() {
		mmObject_lazy.compareAndSet(null, new MMSchemaType() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "positiveInteger";
				definition = "W3C XML Schema Built-in datatype \"positiveInteger\".";
				kind = MMSchemaTypeKind.positiveInteger;
			}
		});
		return mmObject_lazy.get();
	}
}