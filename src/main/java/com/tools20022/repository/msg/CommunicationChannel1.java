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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyType1Choice;
import com.tools20022.repository.codeset.ExternalChannel1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.UndertakingDeliveryToParty;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Communication channel information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmMethod
 * CommunicationChannel1.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToPartyType
 * CommunicationChannel1.mmDeliverToPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToName
 * CommunicationChannel1.mmDeliverToName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToAddress
 * CommunicationChannel1.mmDeliverToAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Presentation
 * Presentation}</li>
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
 * "CommunicationChannel1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication channel information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CommunicationChannel1", propOrder = {"method", "deliverToPartyType", "deliverToName", "deliverToAddress"})
public class CommunicationChannel1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ExternalChannel1Code method;
	/**
	 * Method by which the original undertaking or proposed amendment is to be
	 * made available.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalChannel1Code
	 * ExternalChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the original undertaking or proposed amendment is to be made available.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> CommunicationChannel1.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method by which the original undertaking or proposed amendment is to be made available.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalChannel1Code.mmObject();
		}
	};
	protected PartyType1Choice deliverToPartyType;
	/**
	 * Type of party to whom the original undertaking or proposed amendment is
	 * intended to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyType1Choice
	 * PartyType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDeliveryToParty
	 * UndertakingDeliveryToParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrToPtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverToPartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party to whom the original undertaking or proposed amendment is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliverToPartyType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> UndertakingDeliveryToParty.mmObject();
			componentContext_lazy = () -> CommunicationChannel1.mmObject();
			isDerived = false;
			xmlTag = "DlvrToPtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverToPartyType";
			definition = "Type of party to whom the original undertaking or proposed amendment is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyType1Choice.mmObject();
		}
	};
	protected Max140Text deliverToName;
	/**
	 * Name of party to whom the original undertaking or proposed amendment is
	 * intended to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrToNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverToName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of party to whom the original undertaking or proposed amendment is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliverToName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> CommunicationChannel1.mmObject();
			isDerived = false;
			xmlTag = "DlvrToNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverToName";
			definition = "Name of party to whom the original undertaking or proposed amendment is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PostalAddress6 deliverToAddress;
	/**
	 * Address of party to whom the original undertaking or proposed amendment
	 * is intended to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrToAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverToAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address of party to whom the original undertaking or proposed amendment is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverToAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> CommunicationChannel1.mmObject();
			isDerived = false;
			xmlTag = "DlvrToAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverToAddress";
			definition = "Address of party to whom the original undertaking or proposed amendment is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CommunicationChannel1.mmMethod, CommunicationChannel1.mmDeliverToPartyType, CommunicationChannel1.mmDeliverToName, CommunicationChannel1.mmDeliverToAddress);
				trace_lazy = () -> Presentation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationChannel1";
				definition = "Communication channel information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Mtd", required = true)
	public ExternalChannel1Code getMethod() {
		return method;
	}

	public void setMethod(ExternalChannel1Code method) {
		this.method = method;
	}

	@XmlElement(name = "DlvrToPtyTp", required = true)
	public PartyType1Choice getDeliverToPartyType() {
		return deliverToPartyType;
	}

	public void setDeliverToPartyType(PartyType1Choice deliverToPartyType) {
		this.deliverToPartyType = deliverToPartyType;
	}

	@XmlElement(name = "DlvrToNm")
	public Max140Text getDeliverToName() {
		return deliverToName;
	}

	public void setDeliverToName(Max140Text deliverToName) {
		this.deliverToName = deliverToName;
	}

	@XmlElement(name = "DlvrToAdr")
	public PostalAddress6 getDeliverToAddress() {
		return deliverToAddress;
	}

	public void setDeliverToAddress(com.tools20022.repository.msg.PostalAddress6 deliverToAddress) {
		this.deliverToAddress = deliverToAddress;
	}
}