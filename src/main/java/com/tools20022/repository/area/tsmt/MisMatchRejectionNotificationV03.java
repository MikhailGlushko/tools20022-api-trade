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
import com.tools20022.repository.choice.RejectionReason1Choice;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MisMatchRejectionNotification message is sent by the matching application
 * to the parties involved in the transaction.<br>
 * This message is used to notify the rejection of mis-matched data sets.<br>
 * <b>Usage</b><br>
 * The MisMatchRejectionNotification message can be sent by the matching
 * application to pass on the information about the rejection of mis-matched
 * data sets that it has obtained through the receipt of an MisMatchRejection
 * message.<br>
 * In order to pass on information about the acceptance of mis-matched data sets
 * the matching application sends an MisMatchAcceptanceNotification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmNotificationIdentification
 * MisMatchRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmTransactionIdentification
 * MisMatchRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmEstablishedBaselineIdentification
 * MisMatchRejectionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmTransactionStatus
 * MisMatchRejectionNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmUserTransactionReference
 * MisMatchRejectionNotificationV03.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmDataSetMatchReportReference
 * MisMatchRejectionNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmRejectionReason
 * MisMatchRejectionNotificationV03.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmRequestForAction
 * MisMatchRejectionNotificationV03.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MisMtchRjctnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.023.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchRejectionNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MisMatchRejectionNotification message is sent by the matching application to the parties involved in the transaction.\r\nThis message is used to notify the rejection of mis-matched data sets.\r\nUsage\r\nThe MisMatchRejectionNotification message can be sent by the matching application to pass on the information about the rejection of mis-matched data sets that it has obtained through the receipt of an MisMatchRejection message.\r\nIn order to pass on information about the acceptance of mis-matched data sets the matching application sends an MisMatchAcceptanceNotification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MisMatchRejectionNotificationV03", propOrder = {"notificationIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference",
		"dataSetMatchReportReference", "rejectionReason", "requestForAction"})
public class MisMatchRejectionNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 notificationIdentification;
	/**
	 * Identifies the notification message.
	 * <p>
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
	public static final MMMessageBuildingBlock mmNotificationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identifies the notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getNotificationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
	 * <p>
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification3 establishedBaselineIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * baseline when it is established.
	 * <p>
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
	 * "Unique identification assigned by the matching application to the baseline when it is established. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstablishedBaselineIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getEstablishedBaselineIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionStatus4 transactionStatus;
	/**
	 * Identifies the status of the transaction by means of a code.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTransactionStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * Reference to the transaction for each financial institution which is a
	 * party to the transaction.
	 * <p>
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
	public static final MMMessageBuildingBlock mmUserTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getUserTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MessageIdentification1 dataSetMatchReportReference;
	/**
	 * Reference to the identification of the report that contained the
	 * difference.
	 * <p>
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
	 * "Reference to the identification of the report that contained the difference. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDataSetMatchReportReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "DataSetMtchRptRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetMatchReportReference";
			definition = "Reference to the identification of the report that contained the difference. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getDataSetMatchReportReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RejectionReason1Choice rejectionReason;
	/**
	 * Specifies the reaons for rejecting the mismatch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice
	 * RejectionReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reaons for rejecting the mismatch.                                                    "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectionReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reaons for rejecting the mismatch.                                                    ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingActivity2 requestForAction;
	/**
	 * Information on the next processing step required.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Information on the next processing step required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionNotificationV03.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MisMatchRejectionNotificationV03";
				definition = "Scope\r\nThe MisMatchRejectionNotification message is sent by the matching application to the parties involved in the transaction.\r\nThis message is used to notify the rejection of mis-matched data sets.\r\nUsage\r\nThe MisMatchRejectionNotification message can be sent by the matching application to pass on the information about the rejection of mis-matched data sets that it has obtained through the receipt of an MisMatchRejection message.\r\nIn order to pass on information about the acceptance of mis-matched data sets the matching application sends an MisMatchAcceptanceNotification message.";
				rootElement = "Document";
				xmlTag = "MisMtchRjctnNtfctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmNotificationIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmTransactionIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmEstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmTransactionStatus, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmUserTransactionReference,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmDataSetMatchReportReference, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmRejectionReason,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "023";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MisMatchRejectionNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NtfctnId", required = true)
	public MessageIdentification1 getNotificationIdentification() {
		return notificationIdentification;
	}

	public void setNotificationIdentification(MessageIdentification1 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
	}

	@XmlElement(name = "TxId", required = true)
	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "EstblishdBaselnId", required = true)
	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = establishedBaselineIdentification;
	}

	@XmlElement(name = "TxSts", required = true)
	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@XmlElement(name = "UsrTxRef")
	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference;
	}

	public void setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = userTransactionReference;
	}

	@XmlElement(name = "DataSetMtchRptRef", required = true)
	public MessageIdentification1 getDataSetMatchReportReference() {
		return dataSetMatchReportReference;
	}

	public void setDataSetMatchReportReference(MessageIdentification1 dataSetMatchReportReference) {
		this.dataSetMatchReportReference = dataSetMatchReportReference;
	}

	@XmlElement(name = "RjctnRsn", required = true)
	public RejectionReason1Choice getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(RejectionReason1Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlElement(name = "ReqForActn")
	public PendingActivity2 getRequestForAction() {
		return requestForAction;
	}

	public void setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.023.03.03")
	static public class Document {
		@XmlElement(name = "MisMtchRjctnNtfctn", required = true)
		public MisMatchRejectionNotificationV03 messageBody;
	}
}