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
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MisMatchRejection message is sent by the party requested to accept or
 * reject data set mis-matches to the matching application.<br>
 * This message is used to reject mis-matches between data sets and the related
 * baseline.<br>
 * <b>Usage</b><br>
 * The MisMatchRejection message can be sent by the party requested to accept or
 * reject data set mis-match to inform that it rejects the data set(s).<br>
 * The message can be sent in response to a DataSetMatchReport message conveying
 * mis-matches.<br>
 * The information about the rejection of the mis-matched data sets will be
 * forwarded by the matching application to the submitter of the data sets by a
 * MisMatchRejectionNotification message.<br>
 * The acceptance of mis-matched data sets can be achieved by sending a
 * MisMatchAcceptance message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmRejectionIdentification
 * MisMatchRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmTransactionIdentification
 * MisMatchRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmSubmitterTransactionReference
 * MisMatchRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmDataSetMatchReportReference
 * MisMatchRejectionV02.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmRejectionReason
 * MisMatchRejectionV02.mmRejectionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MisMtchRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.022.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MisMatchRejection message is sent by the party requested to accept or reject data set mis-matches to the matching application.\r\nThis message is used to reject mis-matches between data sets and the related baseline.\r\nUsage\r\nThe MisMatchRejection message can be sent by the party requested to accept or reject data set mis-match to inform that it rejects the data set(s).\r\nThe message can be sent in response to a DataSetMatchReport message conveying mis-matches.\r\nThe information about the rejection of the mis-matched data sets will be forwarded by the matching application to the submitter of the data sets by a MisMatchRejectionNotification message.\r\nThe acceptance of mis-matched data sets can be achieved by sending a MisMatchAcceptance message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MisMatchRejectionV02", propOrder = {"rejectionIdentification", "transactionIdentification", "submitterTransactionReference", "dataSetMatchReportReference", "rejectionReason"})
public class MisMatchRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 rejectionIdentification;
	/**
	 * Identifies the rejection message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the rejection message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionIdentification";
			definition = "Identifies the rejection message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionV02.class.getMethod("getRejectionIdentification", new Class[]{});
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionV02.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * Reference to the transaction for the requesting financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionV02.class.getMethod("getSubmitterTransactionReference", new Class[]{});
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
				return MisMatchRejectionV02.class.getMethod("getDataSetMatchReportReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RejectionReason1Choice rejectionReason;
	/**
	 * Reason why the user cannot accept the request.
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
	 * definition} = "Reason why the user cannot accept the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRejectionReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason why the user cannot accept the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MisMatchRejectionV02.class.getMethod("getRejectionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MisMatchRejectionV02";
				definition = "Scope\r\nThe MisMatchRejection message is sent by the party requested to accept or reject data set mis-matches to the matching application.\r\nThis message is used to reject mis-matches between data sets and the related baseline.\r\nUsage\r\nThe MisMatchRejection message can be sent by the party requested to accept or reject data set mis-match to inform that it rejects the data set(s).\r\nThe message can be sent in response to a DataSetMatchReport message conveying mis-matches.\r\nThe information about the rejection of the mis-matched data sets will be forwarded by the matching application to the submitter of the data sets by a MisMatchRejectionNotification message.\r\nThe acceptance of mis-matched data sets can be achieved by sending a MisMatchAcceptance message.";
				rootElement = "Document";
				xmlTag = "MisMtchRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.MisMatchRejectionV02.mmRejectionIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.mmDataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.mmRejectionReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "022";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MisMatchRejectionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RjctnId", required = true)
	public MessageIdentification1 getRejectionIdentification() {
		return rejectionIdentification;
	}

	public void setRejectionIdentification(MessageIdentification1 rejectionIdentification) {
		this.rejectionIdentification = rejectionIdentification;
	}

	@XmlElement(name = "TxId", required = true)
	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "SubmitrTxRef")
	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public void setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
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

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.022.02.02")
	static public class Document {
		@XmlElement(name = "MisMtchRjctn", required = true)
		public MisMatchRejectionV02 messageBody;
	}
}