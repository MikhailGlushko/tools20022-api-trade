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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentNotificationV01;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UndertakingAmendmentMessage1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment6#mmUndertakingAmendmentMessage
 * Amendment6.mmUndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment6#mmApplicantReferenceNumber
 * Amendment6.mmApplicantReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment6#mmAdditionalInformation
 * Amendment6.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentNotificationV01#mmUndertakingAmendmentNotificationDetails
 * UndertakingAmendmentNotificationV01.mmUndertakingAmendmentNotificationDetails
 * }</li>
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
 * "Amendment6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amendment6", propOrder = {"undertakingAmendmentMessage", "applicantReferenceNumber", "additionalInformation"})
public class Amendment6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgAmdmntMsg", required = true)
	protected UndertakingAmendmentMessage1 undertakingAmendmentMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1
	 * UndertakingAmendmentMessage1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment6
	 * Amendment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contents of the related proposed Undertaking Amendment message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment6, UndertakingAmendmentMessage1> mmUndertakingAmendmentMessage = new MMMessageAssociationEnd<Amendment6, UndertakingAmendmentMessage1>() {
		{
			businessComponentTrace_lazy = () -> AmendmentOfUndertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment6.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmdmntMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentMessage";
			definition = "Contents of the related proposed Undertaking Amendment message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmendmentMessage1.mmObject();
		}

		@Override
		public UndertakingAmendmentMessage1 getValue(Amendment6 obj) {
			return obj.getUndertakingAmendmentMessage();
		}

		@Override
		public void setValue(Amendment6 obj, UndertakingAmendmentMessage1 value) {
			obj.setUndertakingAmendmentMessage(value);
		}
	};
	@XmlElement(name = "ApplcntRefNb")
	protected Max35Text applicantReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment6
	 * Amendment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment6, Optional<Max35Text>> mmApplicantReferenceNumber = new MMMessageAttribute<Amendment6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment6.mmObject();
			isDerived = false;
			xmlTag = "ApplcntRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Amendment6 obj) {
			return obj.getApplicantReferenceNumber();
		}

		@Override
		public void setValue(Amendment6 obj, Optional<Max35Text> value) {
			obj.setApplicantReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment6
	 * Amendment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment6, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Amendment6, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment6.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the notification.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Amendment6 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Amendment6 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment6.mmUndertakingAmendmentMessage, com.tools20022.repository.msg.Amendment6.mmApplicantReferenceNumber,
						com.tools20022.repository.msg.Amendment6.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentNotificationV01.mmUndertakingAmendmentNotificationDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment6";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingAmendmentMessage1 getUndertakingAmendmentMessage() {
		return undertakingAmendmentMessage;
	}

	public Amendment6 setUndertakingAmendmentMessage(UndertakingAmendmentMessage1 undertakingAmendmentMessage) {
		this.undertakingAmendmentMessage = Objects.requireNonNull(undertakingAmendmentMessage);
		return this;
	}

	public Optional<Max35Text> getApplicantReferenceNumber() {
		return applicantReferenceNumber == null ? Optional.empty() : Optional.of(applicantReferenceNumber);
	}

	public Amendment6 setApplicantReferenceNumber(Max35Text applicantReferenceNumber) {
		this.applicantReferenceNumber = applicantReferenceNumber;
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Amendment6 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}