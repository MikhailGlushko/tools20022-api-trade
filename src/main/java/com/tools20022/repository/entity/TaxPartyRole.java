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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxParty1;
import com.tools20022.repository.msg.TaxParty3;
import com.tools20022.repository.msg.TradeParty1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of a tax due.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxPartyRole" src="doc-files/TaxPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
 * TaxPartyRole.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmVATRegistrationNumber
 * TaxPartyRole.mmVATRegistrationNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
 * Tax.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty1#mmTaxParty
 * TradeParty1.mmTaxParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPayer TaxPayer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty1 TaxParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3 TaxParty3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in the context of a tax due."</li>
 * </ul>
 */
public class TaxPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Tax> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
	 * Tax.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the taxfor which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxPartyRole, List<Tax>> mmTax = new MMBusinessAssociationEnd<TaxPartyRole, List<Tax>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Identifies the taxfor which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}

		@Override
		public List<Tax> getValue(TaxPartyRole obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(TaxPartyRole obj, List<Tax> value) {
			obj.setTax(value);
		}
	};
	protected Max35Text vATRegistrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VATRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value added tax (VAT) registration number."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxPartyRole, Optional<Max35Text>> mmVATRegistrationNumber = new MMBusinessAttribute<TaxPartyRole, Optional<Max35Text>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VATRegistrationNumber";
			definition = "Value added tax (VAT) registration number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxPartyRole obj) {
			return obj.getVATRegistrationNumber();
		}

		@Override
		public void setValue(TaxPartyRole obj, Optional<Max35Text> value) {
			obj.setVATRegistrationNumber(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxPartyRole";
				definition = "Role played by a party in the context of a tax due.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmPartyRole);
				derivationElement_lazy = () -> Arrays.asList(TradeParty1.mmTaxParty);
				subType_lazy = () -> Arrays.asList(TaxPayer.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxPartyRole.mmTax, com.tools20022.repository.entity.TaxPartyRole.mmVATRegistrationNumber);
				derivationComponent_lazy = () -> Arrays.asList(TaxParty1.mmObject(), TaxParty3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Tax> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public TaxPartyRole setTax(List<com.tools20022.repository.entity.Tax> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public Optional<Max35Text> getVATRegistrationNumber() {
		return vATRegistrationNumber == null ? Optional.empty() : Optional.of(vATRegistrationNumber);
	}

	public TaxPartyRole setVATRegistrationNumber(Max35Text vATRegistrationNumber) {
		this.vATRegistrationNumber = vATRegistrationNumber;
		return this;
	}
}