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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to uniquely and unambiguously identify a financial
 * institution or a branch of a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4#mmFinancialInstitutionIdentification
 * BranchAndFinancialInstitutionIdentification4.
 * mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4#mmBranchIdentification
 * BranchAndFinancialInstitutionIdentification4.mmBranchIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
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
 * "BranchAndFinancialInstitutionIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BranchAndFinancialInstitutionIdentification4", propOrder = {"financialInstitutionIdentification", "branchIdentification"})
public class BranchAndFinancialInstitutionIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstitutionIdentification7 financialInstitutionIdentification;
	/**
	 * Unique and unambiguous identification of a financial institution, as
	 * assigned under an internationally recognised or proprietary
	 * identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7
	 * FinancialInstitutionIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstitutionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
			isDerived = false;
			xmlTag = "FinInstnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionIdentification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification7.mmObject();
		}
	};
	protected BranchData2 branchIdentification;
	/**
	 * Identifies a specific branch of a financial institution.
	 * 
	 * Usage: This component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBranchIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchData2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BranchAndFinancialInstitutionIdentification4.mmFinancialInstitutionIdentification, BranchAndFinancialInstitutionIdentification4.mmBranchIdentification);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BranchAndFinancialInstitutionIdentification4";
				definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstnId", required = true)
	public FinancialInstitutionIdentification7 getFinancialInstitutionIdentification() {
		return financialInstitutionIdentification;
	}

	public void setFinancialInstitutionIdentification(com.tools20022.repository.msg.FinancialInstitutionIdentification7 financialInstitutionIdentification) {
		this.financialInstitutionIdentification = financialInstitutionIdentification;
	}

	@XmlElement(name = "BrnchId")
	public BranchData2 getBranchIdentification() {
		return branchIdentification;
	}

	public void setBranchIdentification(com.tools20022.repository.msg.BranchData2 branchIdentification) {
		this.branchIdentification = branchIdentification;
	}
}