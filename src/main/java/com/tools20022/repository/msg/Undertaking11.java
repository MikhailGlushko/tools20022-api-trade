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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details related to the local undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewUndertakingAmount
 * Undertaking11.mmNewUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewExpiryDetails
 * Undertaking11.mmNewExpiryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking11#mmNewBeneficiary
 * Undertaking11.mmNewBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewUndertakingTermsAndConditions
 * Undertaking11.mmNewUndertakingTermsAndConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmDeliveryChannel
 * Undertaking11.mmDeliveryChannel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
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
 * "Undertaking11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details related to the local undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Undertaking11", propOrder = {"newUndertakingAmount", "newExpiryDetails", "newBeneficiary", "newUndertakingTermsAndConditions", "deliveryChannel"})
public class Undertaking11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UndertakingAmount2 newUndertakingAmount;
	/**
	 * Details related to the requested new amount for the local undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmount2
	 * UndertakingAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new amount for the local undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewUndertakingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingAmount";
			definition = "Details related to the requested new amount for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UndertakingAmount2.mmObject();
		}
	};
	protected ExpiryDetails1 newExpiryDetails;
	/**
	 * Details related to the requested new expiry terms for the local
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ExpiryDetails1
	 * ExpiryDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewXpryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new expiry terms for the local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewExpiryDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Details related to the requested new expiry terms for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ExpiryDetails1.mmObject();
		}
	};
	protected PartyIdentification43 newBeneficiary;
	/**
	 * Details related to the requested new beneficiary for the local
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new beneficiary for the local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewBeneficiary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Details related to the requested new beneficiary for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected Narrative1 newUndertakingTermsAndConditions;
	/**
	 * Details related to the requested new terms and conditions for the local
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Narrative1
	 * Narrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgTermsAndConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new terms and conditions for the local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewUndertakingTermsAndConditions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingTermsAndConditions";
			definition = "Details related to the requested new terms and conditions for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Narrative1.mmObject();
		}
	};
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * Details related to the delivery channel for the amended local
	 * undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the delivery channel for the amended local undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details related to the delivery channel for the amended local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CommunicationChannel1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Undertaking11.mmNewUndertakingAmount, Undertaking11.mmNewExpiryDetails, Undertaking11.mmNewBeneficiary, Undertaking11.mmNewUndertakingTermsAndConditions,
						Undertaking11.mmDeliveryChannel);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking11";
				definition = "Details related to the local undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NewUdrtkgAmt")
	public UndertakingAmount2 getNewUndertakingAmount() {
		return newUndertakingAmount;
	}

	public void setNewUndertakingAmount(com.tools20022.repository.msg.UndertakingAmount2 newUndertakingAmount) {
		this.newUndertakingAmount = newUndertakingAmount;
	}

	@XmlElement(name = "NewXpryDtls")
	public ExpiryDetails1 getNewExpiryDetails() {
		return newExpiryDetails;
	}

	public void setNewExpiryDetails(com.tools20022.repository.msg.ExpiryDetails1 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
	}

	@XmlElement(name = "NewBnfcry")
	public PartyIdentification43 getNewBeneficiary() {
		return newBeneficiary;
	}

	public void setNewBeneficiary(com.tools20022.repository.msg.PartyIdentification43 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
	}

	@XmlElement(name = "NewUdrtkgTermsAndConds")
	public Narrative1 getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions;
	}

	public void setNewUndertakingTermsAndConditions(com.tools20022.repository.msg.Narrative1 newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = newUndertakingTermsAndConditions;
	}

	@XmlElement(name = "DlvryChanl")
	public CommunicationChannel1 getDeliveryChannel() {
		return deliveryChannel;
	}

	public void setDeliveryChannel(com.tools20022.repository.msg.CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
	}
}