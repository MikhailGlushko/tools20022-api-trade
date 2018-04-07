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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.FinancingAgreementList1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The message PartyManagementPaymentAcknowledgement is sent from a trade
 * partner to any partner requested through a
 * PartyManagementPaymentAcknowledgemenNotification message to acknowledge the
 * notified factoring service agreement. Depending on legal contexts, the
 * acknowledgement may be required in order for the financial service agreement
 * to become effective.<br>
 * The message references related messages and may include referenced data.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmHeader
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmAcknowledgementList
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmAcknowledgementCount
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmItemCount
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmControlSum
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PtyRegnAndGrntAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.012.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyRegistrationAndGuaranteeAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The message PartyManagementPaymentAcknowledgement is sent from a trade partner to any partner requested through a PartyManagementPaymentAcknowledgemenNotification message to acknowledge the notified factoring service agreement. Depending on legal contexts, the acknowledgement may be required in order for the financial service agreement to become effective.\r\nThe message references related messages and may include referenced data.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyRegistrationAndGuaranteeAcknowledgementV01", propOrder = {"header", "acknowledgementList", "acknowledgementCount", "itemCount", "controlSum", "attachedMessage"})
public class PartyRegistrationAndGuaranteeAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected BusinessLetter1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the acknowlegement, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, BusinessLetter1> mmHeader = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, BusinessLetter1>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the acknowlegement, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		@Override
		public BusinessLetter1 getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, BusinessLetter1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AckList", required = true)
	protected List<FinancingAgreementList1> acknowledgementList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of party management acknowledgements."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, List<FinancingAgreementList1>> mmAcknowledgementList = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, List<FinancingAgreementList1>>() {
		{
			xmlTag = "AckList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementList";
			definition = "List of party management acknowledgements.";
			minOccurs = 1;
			complexType_lazy = () -> FinancingAgreementList1.mmObject();
		}

		@Override
		public List<FinancingAgreementList1> getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getAcknowledgementList();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, List<FinancingAgreementList1> value) {
			obj.setAcknowledgementList(value);
		}
	};
	@XmlElement(name = "AckCnt", required = true)
	protected Max15NumericText acknowledgementCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of acknowledgement lists as control value."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Max15NumericText> mmAcknowledgementCount = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Max15NumericText>() {
		{
			xmlTag = "AckCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementCount";
			definition = "Number of acknowledgement lists as control value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getAcknowledgementCount();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, Max15NumericText value) {
			obj.setAcknowledgementCount(value);
		}
	};
	@XmlElement(name = "ItmCnt")
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of individual items in all lists."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Optional<Max15NumericText>> mmItemCount = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Optional<Max15NumericText>>() {
		{
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Total number of individual items in all lists.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, Optional<Max15NumericText> value) {
			obj.setItemCount(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in all lists, irrespective of currencies or direction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Optional<DecimalNumber>> mmControlSum = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, Optional<DecimalNumber>>() {
		{
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in all lists, irrespective of currencies or direction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "AttchdMsg")
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, List<EncapsulatedBusinessMessage1>> mmAttachedMessage = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeAcknowledgementV01, List<EncapsulatedBusinessMessage1>>() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		@Override
		public List<EncapsulatedBusinessMessage1> getValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj) {
			return obj.getAttachedMessage();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeAcknowledgementV01 obj, List<EncapsulatedBusinessMessage1> value) {
			obj.setAttachedMessage(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyRegistrationAndGuaranteeAcknowledgementV01";
				definition = "The message PartyManagementPaymentAcknowledgement is sent from a trade partner to any partner requested through a PartyManagementPaymentAcknowledgemenNotification message to acknowledge the notified factoring service agreement. Depending on legal contexts, the acknowledgement may be required in order for the financial service agreement to become effective.\r\nThe message references related messages and may include referenced data.\r\nThe message can carry digital signatures if required by context.";
				rootElement = "Document";
				xmlTag = "PtyRegnAndGrntAck";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmHeader,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementList, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementCount,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmItemCount, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmControlSum,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "012";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyRegistrationAndGuaranteeAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessLetter1 getHeader() {
		return header;
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setHeader(BusinessLetter1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<FinancingAgreementList1> getAcknowledgementList() {
		return acknowledgementList == null ? acknowledgementList = new ArrayList<>() : acknowledgementList;
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setAcknowledgementList(List<FinancingAgreementList1> acknowledgementList) {
		this.acknowledgementList = Objects.requireNonNull(acknowledgementList);
		return this;
	}

	public Max15NumericText getAcknowledgementCount() {
		return acknowledgementCount;
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setAcknowledgementCount(Max15NumericText acknowledgementCount) {
		this.acknowledgementCount = Objects.requireNonNull(acknowledgementCount);
		return this;
	}

	public Optional<Max15NumericText> getItemCount() {
		return itemCount == null ? Optional.empty() : Optional.of(itemCount);
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage == null ? attachedMessage = new ArrayList<>() : attachedMessage;
	}

	public PartyRegistrationAndGuaranteeAcknowledgementV01 setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = Objects.requireNonNull(attachedMessage);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01")
	static public class Document {
		@XmlElement(name = "PtyRegnAndGrntAck", required = true)
		public PartyRegistrationAndGuaranteeAcknowledgementV01 messageBody;
	}
}