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
import com.tools20022.repository.msg.Count1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AmendmentRejection message is sent by the party requested to accept or
 * reject an amendment to the matching application.<br>
 * This message is used to reject an amendment request.<br>
 * <b>Usage</b><br>
 * The AmendmentRejection message can be sent by the party requested to accept
 * or reject an amendment to inform that it rejects the requested amendment.<br>
 * The message can be sent in response to a FullPushThroughReport and
 * DeltaReport message conveying the details of a BaselineAmendmentRequest
 * message.<br>
 * The acceptance of an amendment request can be achieved by sending an
 * AmendmentAcceptance message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectionIdentification
 * AmendmentRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmTransactionIdentification
 * AmendmentRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmSubmitterTransactionReference
 * AmendmentRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmDeltaReportReference
 * AmendmentRejectionV02.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectedAmendmentNumber
 * AmendmentRejectionV02.mmRejectedAmendmentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectionReason
 * AmendmentRejectionV02.mmRejectionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AmdmntRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.007.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmendmentRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AmendmentRejection message is sent by the party requested to accept or reject an amendment to the matching application.\r\nThis message is used to reject an amendment request.\r\nUsage\r\nThe AmendmentRejection message can be sent by the party requested to accept or reject an amendment to inform that it rejects the requested amendment.\r\nThe message can be sent in response to a FullPushThroughReport and DeltaReport message conveying the details of a BaselineAmendmentRequest message.\r\nThe acceptance of an amendment request can be achieved by sending an AmendmentAcceptance message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendmentRejectionV02", propOrder = {"rejectionIdentification", "transactionIdentification", "submitterTransactionReference", "deltaReportReference", "rejectedAmendmentNumber", "rejectionReason"})
public class AmendmentRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctnId", required = true)
	protected MessageIdentification1 rejectionIdentification;
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
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, MessageIdentification1> mmRejectionIdentification = new MMMessageBuildingBlock<AmendmentRejectionV02, MessageIdentification1>() {
		{
			xmlTag = "RjctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionIdentification";
			definition = "Identifies the rejection message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AmendmentRejectionV02 obj) {
			return obj.getRejectionIdentification();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, MessageIdentification1 value) {
			obj.setRejectionIdentification(value);
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<AmendmentRejectionV02, SimpleIdentificationInformation>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(AmendmentRejectionV02 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, SimpleIdentificationInformation value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SubmitrTxRef")
	protected SimpleIdentificationInformation submitterTransactionReference;
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
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, Optional<SimpleIdentificationInformation>> mmSubmitterTransactionReference = new MMMessageBuildingBlock<AmendmentRejectionV02, Optional<SimpleIdentificationInformation>>() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public Optional<SimpleIdentificationInformation> getValue(AmendmentRejectionV02 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, Optional<SimpleIdentificationInformation> value) {
			obj.setSubmitterTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DltaRptRef", required = true)
	protected MessageIdentification1 deltaReportReference;
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
	 * xmlTag} = "DltaRptRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeltaReportReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the delta report that contained the amendment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, MessageIdentification1> mmDeltaReportReference = new MMMessageBuildingBlock<AmendmentRejectionV02, MessageIdentification1>() {
		{
			xmlTag = "DltaRptRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeltaReportReference";
			definition = "Reference to the identification of the delta report that contained the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AmendmentRejectionV02 obj) {
			return obj.getDeltaReportReference();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, MessageIdentification1 value) {
			obj.setDeltaReportReference(value);
		}
	};
	@XmlElement(name = "RjctdAmdmntNb", required = true)
	protected Count1 rejectedAmendmentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Count1 Count1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdAmdmntNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmendmentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number of the rejected baseline amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, Count1> mmRejectedAmendmentNumber = new MMMessageBuildingBlock<AmendmentRejectionV02, Count1>() {
		{
			xmlTag = "RjctdAmdmntNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmendmentNumber";
			definition = "Sequence number of the rejected baseline amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Count1.mmObject();
		}

		@Override
		public Count1 getValue(AmendmentRejectionV02 obj) {
			return obj.getRejectedAmendmentNumber();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, Count1 value) {
			obj.setRejectedAmendmentNumber(value);
		}
	};
	@XmlElement(name = "RjctnRsn", required = true)
	protected RejectionReason1Choice rejectionReason;
	/**
	 * 
	 <p>
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
	 * definition} = "Specifies the reaons for rejecting the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionV02, RejectionReason1Choice> mmRejectionReason = new MMMessageBuildingBlock<AmendmentRejectionV02, RejectionReason1Choice>() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reaons for rejecting the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason1Choice.mmObject();
		}

		@Override
		public RejectionReason1Choice getValue(AmendmentRejectionV02 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(AmendmentRejectionV02 obj, RejectionReason1Choice value) {
			obj.setRejectionReason(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentRejectionV02";
				definition = "Scope\r\nThe AmendmentRejection message is sent by the party requested to accept or reject an amendment to the matching application.\r\nThis message is used to reject an amendment request.\r\nUsage\r\nThe AmendmentRejection message can be sent by the party requested to accept or reject an amendment to inform that it rejects the requested amendment.\r\nThe message can be sent in response to a FullPushThroughReport and DeltaReport message conveying the details of a BaselineAmendmentRequest message.\r\nThe acceptance of an amendment request can be achieved by sending an AmendmentAcceptance message.";
				rootElement = "Document";
				xmlTag = "AmdmntRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmRejectionIdentification, com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmDeltaReportReference,
						com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmRejectedAmendmentNumber, com.tools20022.repository.area.tsmt.AmendmentRejectionV02.mmRejectionReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "007";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmendmentRejectionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRejectionIdentification() {
		return rejectionIdentification;
	}

	public AmendmentRejectionV02 setRejectionIdentification(MessageIdentification1 rejectionIdentification) {
		this.rejectionIdentification = Objects.requireNonNull(rejectionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public AmendmentRejectionV02 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? Optional.empty() : Optional.of(submitterTransactionReference);
	}

	public AmendmentRejectionV02 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
		return this;
	}

	public MessageIdentification1 getDeltaReportReference() {
		return deltaReportReference;
	}

	public AmendmentRejectionV02 setDeltaReportReference(MessageIdentification1 deltaReportReference) {
		this.deltaReportReference = Objects.requireNonNull(deltaReportReference);
		return this;
	}

	public Count1 getRejectedAmendmentNumber() {
		return rejectedAmendmentNumber;
	}

	public AmendmentRejectionV02 setRejectedAmendmentNumber(Count1 rejectedAmendmentNumber) {
		this.rejectedAmendmentNumber = Objects.requireNonNull(rejectedAmendmentNumber);
		return this;
	}

	public RejectionReason1Choice getRejectionReason() {
		return rejectionReason;
	}

	public AmendmentRejectionV02 setRejectionReason(RejectionReason1Choice rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.007.001.02")
	static public class Document {
		@XmlElement(name = "AmdmntRjctn", required = true)
		public AmendmentRejectionV02 messageBody;
	}
}