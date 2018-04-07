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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MisMatchAcceptanceNotification message is sent by the matching
 * application to the parties involved in the transaction.<br>
 * This message is used to notify the acceptance of mis-matched data sets.<br>
 * <b>Usage</b><br>
 * The MisMatchAcceptanceNotification message can be sent by the matching
 * application to pass on information about the acceptance of mis-matched data
 * sets that it has obtained through the receipt of an MisMatchAcceptance
 * message.<br>
 * In order to pass on information about the rejection of mis-matched data sets
 * the matching application sends a MisMatchRejectionNotification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmNotificationIdentification
 * MisMatchAcceptanceNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmTransactionIdentification
 * MisMatchAcceptanceNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmEstablishedBaselineIdentification
 * MisMatchAcceptanceNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmTransactionStatus
 * MisMatchAcceptanceNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmUserTransactionReference
 * MisMatchAcceptanceNotificationV03.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmDataSetMatchReportReference
 * MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmRequestForAction
 * MisMatchAcceptanceNotificationV03.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MisMtchAccptncNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.021.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchAcceptanceNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MisMatchAcceptanceNotification message is sent by the matching application to the parties involved in the transaction.\r\nThis message is used to notify the acceptance of mis-matched data sets.\r\nUsage\r\nThe MisMatchAcceptanceNotification message can be sent by the matching application to pass on information about the acceptance of mis-matched data sets that it has obtained through the receipt of an MisMatchAcceptance message.\r\nIn order to pass on information about the rejection of mis-matched data sets the matching application sends a MisMatchRejectionNotification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MisMatchAcceptanceNotificationV03", propOrder = {"notificationIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference",
		"dataSetMatchReportReference", "requestForAction"})
public class MisMatchAcceptanceNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnId", required = true)
	protected MessageIdentification1 notificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the notification message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, MessageIdentification1> mmNotificationIdentification = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, MessageIdentification1>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identifies the notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, MessageIdentification1 value) {
			obj.setNotificationIdentification(value);
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, SimpleIdentificationInformation>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, SimpleIdentificationInformation value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "EstblishdBaselnId", required = true)
	protected DocumentIdentification3 establishedBaselineIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3
	 * DocumentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstblishdBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishedBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the baseline when it is established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, DocumentIdentification3> mmEstablishedBaselineIdentification = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, DocumentIdentification3>() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification3.mmObject();
		}

		@Override
		public DocumentIdentification3 getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getEstablishedBaselineIdentification();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, DocumentIdentification3 value) {
			obj.setEstablishedBaselineIdentification(value);
		}
	};
	@XmlElement(name = "TxSts", required = true)
	protected TransactionStatus4 transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus4
	 * TransactionStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, TransactionStatus4> mmTransactionStatus = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, TransactionStatus4>() {
		{
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}

		@Override
		public TransactionStatus4 getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, TransactionStatus4 value) {
			obj.setTransactionStatus(value);
		}
	};
	@XmlElement(name = "UsrTxRef")
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for each financial institution which is a party to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, List<DocumentIdentification5>> mmUserTransactionReference = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, List<DocumentIdentification5>>() {
		{
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification5.mmObject();
		}

		@Override
		public List<DocumentIdentification5> getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getUserTransactionReference();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, List<DocumentIdentification5> value) {
			obj.setUserTransactionReference(value);
		}
	};
	@XmlElement(name = "DataSetMtchRptRef", required = true)
	protected MessageIdentification1 dataSetMatchReportReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetMtchRptRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetMatchReportReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the report that contained the difference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, MessageIdentification1> mmDataSetMatchReportReference = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, MessageIdentification1>() {
		{
			xmlTag = "DataSetMtchRptRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetMatchReportReference";
			definition = "Reference to the identification of the report that contained the difference.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getDataSetMatchReportReference();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, MessageIdentification1 value) {
			obj.setDataSetMatchReportReference(value);
		}
	};
	@XmlElement(name = "ReqForActn")
	protected PendingActivity2 requestForAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqForActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the next processing step required."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, Optional<PendingActivity2>> mmRequestForAction = new MMMessageBuildingBlock<MisMatchAcceptanceNotificationV03, Optional<PendingActivity2>>() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Information on the next processing step required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		@Override
		public Optional<PendingActivity2> getValue(MisMatchAcceptanceNotificationV03 obj) {
			return obj.getRequestForAction();
		}

		@Override
		public void setValue(MisMatchAcceptanceNotificationV03 obj, Optional<PendingActivity2> value) {
			obj.setRequestForAction(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MisMatchAcceptanceNotificationV03";
				definition = "Scope\r\nThe MisMatchAcceptanceNotification message is sent by the matching application to the parties involved in the transaction.\r\nThis message is used to notify the acceptance of mis-matched data sets.\r\nUsage\r\nThe MisMatchAcceptanceNotification message can be sent by the matching application to pass on information about the acceptance of mis-matched data sets that it has obtained through the receipt of an MisMatchAcceptance message.\r\nIn order to pass on information about the rejection of mis-matched data sets the matching application sends a MisMatchRejectionNotification message.";
				rootElement = "Document";
				xmlTag = "MisMtchAccptncNtfctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmNotificationIdentification,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmTransactionIdentification, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmEstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmTransactionStatus, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmUserTransactionReference,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "021";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MisMatchAcceptanceNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getNotificationIdentification() {
		return notificationIdentification;
	}

	public MisMatchAcceptanceNotificationV03 setNotificationIdentification(MessageIdentification1 notificationIdentification) {
		this.notificationIdentification = Objects.requireNonNull(notificationIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public MisMatchAcceptanceNotificationV03 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public MisMatchAcceptanceNotificationV03 setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = Objects.requireNonNull(establishedBaselineIdentification);
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public MisMatchAcceptanceNotificationV03 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public MisMatchAcceptanceNotificationV03 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public MessageIdentification1 getDataSetMatchReportReference() {
		return dataSetMatchReportReference;
	}

	public MisMatchAcceptanceNotificationV03 setDataSetMatchReportReference(MessageIdentification1 dataSetMatchReportReference) {
		this.dataSetMatchReportReference = Objects.requireNonNull(dataSetMatchReportReference);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public MisMatchAcceptanceNotificationV03 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.021.001.03")
	static public class Document {
		@XmlElement(name = "MisMtchAccptncNtfctn", required = true)
		public MisMatchAcceptanceNotificationV03 messageBody;
	}
}