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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation established primarily to provide financial services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialInstitution" src="doc-files/FinancialInstitution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#mmIdentificationIssuer
 * DocumentIdentification5.mmIdentificationIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#mmSubmitter
 * DocumentIdentification1.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmSubmitter
 * RequiredSubmission3.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmSubmitter
 * RequiredSubmission4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#mmSubmitter
 * DocumentIdentification4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmObligorBank
 * PaymentObligation2.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmRecipientBank
 * PaymentObligation2.mmRecipientBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBuyerBank
 * Baseline5.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSellerBank
 * Baseline5.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission6#mmSubmitter
 * RequiredSubmission6.mmSubmitter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1
 * BICIdentification1}</li>
 * </ul>
 * </li>
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
 * "FinancialInstitution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation established primarily to provide financial services."</li>
 * </ul>
 */
public class FinancialInstitution extends Organisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitution";
				definition = "Organisation established primarily to provide financial services.";
				derivationElement_lazy = () -> Arrays.asList(DocumentIdentification5.mmIdentificationIssuer, DocumentIdentification1.mmSubmitter, RequiredSubmission3.mmSubmitter, RequiredSubmission4.mmSubmitter,
						DocumentIdentification4.mmSubmitter, PaymentObligation2.mmObligorBank, PaymentObligation2.mmRecipientBank, Baseline5.mmBuyerBank, Baseline5.mmSellerBank, RequiredSubmission6.mmSubmitter);
				superType_lazy = () -> Organisation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(BICIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitution.class;
			}
		});
		return mmObject_lazy.get();
	}
}