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
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification72;
import com.tools20022.repository.msg.ReportSpecification4;
import com.tools20022.repository.msg.TaxReport1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that buys assets, good or services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BuyerRole" src="doc-files/BuyerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportSpecification4#mmBuyer
 * ReportSpecification4.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmBuyer
 * TaxReport1.mmBuyer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification72
 * PartyIdentification72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1 TaxReport1}</li>
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
 * "BuyerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that buys assets, good or services."</li>
 * </ul>
 */
public class BuyerRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyerRole";
				definition = "Party that buys assets, good or services.";
				derivationElement_lazy = () -> Arrays.asList(ReportSpecification4.mmBuyer, TaxReport1.mmBuyer);
				superType_lazy = () -> TradePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyIdentification72.mmObject(), TaxReport1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BuyerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}