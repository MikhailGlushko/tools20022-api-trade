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
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Reason2;
import com.tools20022.repository.msg.SimpleIdentificationInformation;
import com.tools20022.repository.msg.TransactionStatus4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusExtensionRequestRejection message is sent by the party requested to
 * accept or reject a request to extend the status of a transaction to the
 * matching application.<br>
 * This message is used to inform about the rejection of a request to extend the
 * status of a transaction.<br>
 * <b>Usage</b><br>
 * The StatusExtensionRequestRejection message can be sent by the party
 * requested to accept or reject the request to extend the status of a
 * transaction to inform that it rejects the request.<br>
 * The message can be sent in response to a StatusExtensionRequestNotification
 * message.<br>
 * The acceptance of a request to extend the status of a transaction can be
 * achieved by sending a StatusExtensionRequestAcceptance message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmRejectionIdentification
 * StatusExtensionRequestRejectionV03.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmTransactionIdentification
 * StatusExtensionRequestRejectionV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmSubmitterTransactionReference
 * StatusExtensionRequestRejectionV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmStatusNotToBeExtended
 * StatusExtensionRequestRejectionV03.mmStatusNotToBeExtended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmRejectionReason
 * StatusExtensionRequestRejectionV03.mmRejectionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StsXtnsnReqRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.033.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusExtensionRequestRejectionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusExtensionRequestRejection message is sent by the party requested to accept or reject a request to extend the status of a transaction to the matching application.\r\nThis message is used to inform about the rejection of a request to extend the status of a transaction.\r\nUsage\r\nThe StatusExtensionRequestRejection message can be sent by the party requested to accept or reject the request to extend the status of a transaction to inform that it rejects the request.\r\nThe message can be sent in response to a StatusExtensionRequestNotification message.\r\nThe acceptance of a request to extend the status of a transaction can be achieved by sending a StatusExtensionRequestAcceptance message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusExtensionRequestRejectionV03", propOrder = {"rejectionIdentification", "transactionIdentification", "submitterTransactionReference", "statusNotToBeExtended", "rejectionReason"})
public class StatusExtensionRequestRejectionV03 {

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
	public static final MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, MessageIdentification1> mmRejectionIdentification = new MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(StatusExtensionRequestRejectionV03 obj) {
			return obj.getRejectionIdentification();
		}

		@Override
		public void setValue(StatusExtensionRequestRejectionV03 obj, MessageIdentification1 value) {
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, SimpleIdentificationInformation>() {
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
		public SimpleIdentificationInformation getValue(StatusExtensionRequestRejectionV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(StatusExtensionRequestRejectionV03 obj, SimpleIdentificationInformation value) {
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
	public static final MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, Optional<SimpleIdentificationInformation>> mmSubmitterTransactionReference = new MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, Optional<SimpleIdentificationInformation>>() {
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
		public Optional<SimpleIdentificationInformation> getValue(StatusExtensionRequestRejectionV03 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(StatusExtensionRequestRejectionV03 obj, Optional<SimpleIdentificationInformation> value) {
			obj.setSubmitterTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsNotToBeXtnded", required = true)
	protected TransactionStatus4 statusNotToBeExtended;
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
	 * xmlTag} = "StsNotToBeXtnded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusNotToBeExtended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status that the submitter does not want to be extended."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, TransactionStatus4> mmStatusNotToBeExtended = new MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, TransactionStatus4>() {
		{
			xmlTag = "StsNotToBeXtnded";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusNotToBeExtended";
			definition = "Identifies the status that the submitter does not want to be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}

		@Override
		public TransactionStatus4 getValue(StatusExtensionRequestRejectionV03 obj) {
			return obj.getStatusNotToBeExtended();
		}

		@Override
		public void setValue(StatusExtensionRequestRejectionV03 obj, TransactionStatus4 value) {
			obj.setStatusNotToBeExtended(value);
		}
	};
	@XmlElement(name = "RjctnRsn", required = true)
	protected Reason2 rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Reason2 Reason2}
	 * </li>
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
	public static final MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, Reason2> mmRejectionReason = new MMMessageBuildingBlock<StatusExtensionRequestRejectionV03, Reason2>() {
		{
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason why the user cannot accept the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Reason2.mmObject();
		}

		@Override
		public Reason2 getValue(StatusExtensionRequestRejectionV03 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(StatusExtensionRequestRejectionV03 obj, Reason2 value) {
			obj.setRejectionReason(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusExtensionRequestRejectionV03";
				definition = "Scope\r\nThe StatusExtensionRequestRejection message is sent by the party requested to accept or reject a request to extend the status of a transaction to the matching application.\r\nThis message is used to inform about the rejection of a request to extend the status of a transaction.\r\nUsage\r\nThe StatusExtensionRequestRejection message can be sent by the party requested to accept or reject the request to extend the status of a transaction to inform that it rejects the request.\r\nThe message can be sent in response to a StatusExtensionRequestNotification message.\r\nThe acceptance of a request to extend the status of a transaction can be achieved by sending a StatusExtensionRequestAcceptance message.";
				rootElement = "Document";
				xmlTag = "StsXtnsnReqRjctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.mmRejectionIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.mmTransactionIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.mmStatusNotToBeExtended, com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.mmRejectionReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "033";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusExtensionRequestRejectionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRejectionIdentification() {
		return rejectionIdentification;
	}

	public StatusExtensionRequestRejectionV03 setRejectionIdentification(MessageIdentification1 rejectionIdentification) {
		this.rejectionIdentification = Objects.requireNonNull(rejectionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public StatusExtensionRequestRejectionV03 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? Optional.empty() : Optional.of(submitterTransactionReference);
	}

	public StatusExtensionRequestRejectionV03 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
		return this;
	}

	public TransactionStatus4 getStatusNotToBeExtended() {
		return statusNotToBeExtended;
	}

	public StatusExtensionRequestRejectionV03 setStatusNotToBeExtended(TransactionStatus4 statusNotToBeExtended) {
		this.statusNotToBeExtended = Objects.requireNonNull(statusNotToBeExtended);
		return this;
	}

	public Reason2 getRejectionReason() {
		return rejectionReason;
	}

	public StatusExtensionRequestRejectionV03 setRejectionReason(Reason2 rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.033.001.03")
	static public class Document {
		@XmlElement(name = "StsXtnsnReqRjctn", required = true)
		public StatusExtensionRequestRejectionV03 messageBody;
	}
}