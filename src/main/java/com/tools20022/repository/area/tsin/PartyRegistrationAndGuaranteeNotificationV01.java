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
 * The PartyRegistrationAndGuaranteeNotification message is sent by a factoring
 * client or a financial service to a trade partner and, optionally, to an
 * interested party in order to notify the status of a requested financial
 * service agreement. The trade partner is given information to explain the
 * consequences of a financial service agreement, for instance, the trade
 * partner must pay the financial institution and must use the electronic
 * address to inform it and pay it using the bank account given.<br>
 * The message may reference related messages and may include referenced data.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmHeader
 * PartyRegistrationAndGuaranteeNotificationV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmNotificationList
 * PartyRegistrationAndGuaranteeNotificationV01.mmNotificationList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmNotificationCount
 * PartyRegistrationAndGuaranteeNotificationV01.mmNotificationCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmItemCount
 * PartyRegistrationAndGuaranteeNotificationV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmControlSum
 * PartyRegistrationAndGuaranteeNotificationV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeNotificationV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PtyRegnAndGrntNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyRegistrationAndGuaranteeNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The PartyRegistrationAndGuaranteeNotification message is sent by a factoring client or a financial service to a trade partner and, optionally, to an interested party in order to notify the status of a requested financial service agreement. The trade partner is given information to explain the consequences of a financial service agreement, for instance, the trade partner must pay the financial institution and must use the electronic address to inform it and pay it using the bank account given.\r\nThe message may reference related messages and may include referenced data.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyRegistrationAndGuaranteeNotificationV01", propOrder = {"header", "notificationList", "notificationCount", "itemCount", "controlSum", "attachedMessage"})
public class PartyRegistrationAndGuaranteeNotificationV01 {

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
	 * "Set of characteristics that unambiguously identify the notification, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, BusinessLetter1> mmHeader = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, BusinessLetter1>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the notification, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		@Override
		public BusinessLetter1 getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, BusinessLetter1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "NtfctnList", required = true)
	protected List<FinancingAgreementList1> notificationList;
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
	 * xmlTag} = "NtfctnList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of otifications."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, List<FinancingAgreementList1>> mmNotificationList = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, List<FinancingAgreementList1>>() {
		{
			xmlTag = "NtfctnList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationList";
			definition = "List of otifications.";
			minOccurs = 1;
			complexType_lazy = () -> FinancingAgreementList1.mmObject();
		}

		@Override
		public List<FinancingAgreementList1> getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getNotificationList();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, List<FinancingAgreementList1> value) {
			obj.setNotificationList(value);
		}
	};
	@XmlElement(name = "NtfctnCnt")
	protected Max15NumericText notificationCount;
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
	 * xmlTag} = "NtfctnCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of notification lists as control value."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<Max15NumericText>> mmNotificationCount = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<Max15NumericText>>() {
		{
			xmlTag = "NtfctnCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCount";
			definition = "Number of notification lists as control value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getNotificationCount();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, Optional<Max15NumericText> value) {
			obj.setNotificationCount(value.orElse(null));
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
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<Max15NumericText>> mmItemCount = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<Max15NumericText>>() {
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
		public Optional<Max15NumericText> getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, Optional<Max15NumericText> value) {
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
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<DecimalNumber>> mmControlSum = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, Optional<DecimalNumber>>() {
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
		public Optional<DecimalNumber> getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, Optional<DecimalNumber> value) {
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
	public static final MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, List<EncapsulatedBusinessMessage1>> mmAttachedMessage = new MMMessageBuildingBlock<PartyRegistrationAndGuaranteeNotificationV01, List<EncapsulatedBusinessMessage1>>() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		@Override
		public List<EncapsulatedBusinessMessage1> getValue(PartyRegistrationAndGuaranteeNotificationV01 obj) {
			return obj.getAttachedMessage();
		}

		@Override
		public void setValue(PartyRegistrationAndGuaranteeNotificationV01 obj, List<EncapsulatedBusinessMessage1> value) {
			obj.setAttachedMessage(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyRegistrationAndGuaranteeNotificationV01";
				definition = "The PartyRegistrationAndGuaranteeNotification message is sent by a factoring client or a financial service to a trade partner and, optionally, to an interested party in order to notify the status of a requested financial service agreement. The trade partner is given information to explain the consequences of a financial service agreement, for instance, the trade partner must pay the financial institution and must use the electronic address to inform it and pay it using the bank account given.\r\nThe message may reference related messages and may include referenced data.\r\nThe message can carry digital signatures if required by context.";
				rootElement = "Document";
				xmlTag = "PtyRegnAndGrntNtfctn";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmHeader,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmNotificationList, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmNotificationCount,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmItemCount, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmControlSum,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyRegistrationAndGuaranteeNotificationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessLetter1 getHeader() {
		return header;
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setHeader(BusinessLetter1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<FinancingAgreementList1> getNotificationList() {
		return notificationList == null ? notificationList = new ArrayList<>() : notificationList;
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setNotificationList(List<FinancingAgreementList1> notificationList) {
		this.notificationList = Objects.requireNonNull(notificationList);
		return this;
	}

	public Optional<Max15NumericText> getNotificationCount() {
		return notificationCount == null ? Optional.empty() : Optional.of(notificationCount);
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setNotificationCount(Max15NumericText notificationCount) {
		this.notificationCount = notificationCount;
		return this;
	}

	public Optional<Max15NumericText> getItemCount() {
		return itemCount == null ? Optional.empty() : Optional.of(itemCount);
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage == null ? attachedMessage = new ArrayList<>() : attachedMessage;
	}

	public PartyRegistrationAndGuaranteeNotificationV01 setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = Objects.requireNonNull(attachedMessage);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01")
	static public class Document {
		@XmlElement(name = "PtyRegnAndGrntNtfctn", required = true)
		public PartyRegistrationAndGuaranteeNotificationV01 messageBody;
	}
}