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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AmendmentRejectionNotification message is sent by the matching
 * application to the requester of an amendment.<br>
 * This message is used to notify the rejection of an amendment request.<br>
 * <b>Usage</b><br>
 * The AmendmentRejectionNotification message can be sent by the matching
 * application to pass on information about the rejection of an amendment
 * request that it has obtained through the receipt of an AmendmentRejection
 * message.<br>
 * In order to pass on information about the acceptance of an amendment request
 * the matching application sends an AmendmentAcceptanceNotification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmNotificationIdentification
 * AmendmentRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmTransactionIdentification
 * AmendmentRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmEstablishedBaselineIdentification
 * AmendmentRejectionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmTransactionStatus
 * AmendmentRejectionNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmUserTransactionReference
 * AmendmentRejectionNotificationV03.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmDeltaReportReference
 * AmendmentRejectionNotificationV03.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmRejectedAmendmentNumber
 * AmendmentRejectionNotificationV03.mmRejectedAmendmentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmInitiator
 * AmendmentRejectionNotificationV03.mmInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmRejectionReason
 * AmendmentRejectionNotificationV03.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmRequestForAction
 * AmendmentRejectionNotificationV03.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AmdmntRjctnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.008.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmendmentRejectionNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AmendmentRejectionNotification message is sent by the matching application to the requester of an amendment.\r\nThis message is used to notify the rejection of an amendment request.\r\nUsage\r\nThe AmendmentRejectionNotification message can be sent by the matching application to pass on information about the rejection of an amendment request that it has obtained through the receipt of an AmendmentRejection message.\r\nIn order to pass on information about the acceptance of an amendment request the matching application sends an AmendmentAcceptanceNotification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendmentRejectionNotificationV03", propOrder = {"notificationIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference", "deltaReportReference",
		"rejectedAmendmentNumber", "initiator", "rejectionReason", "requestForAction"})
public class AmendmentRejectionNotificationV03 {

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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, MessageIdentification1> mmNotificationIdentification = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, MessageIdentification1 value) {
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
	 * "Unique Identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, SimpleIdentificationInformation>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique Identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, SimpleIdentificationInformation value) {
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, DocumentIdentification3> mmEstablishedBaselineIdentification = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, DocumentIdentification3>() {
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
		public DocumentIdentification3 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getEstablishedBaselineIdentification();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, DocumentIdentification3 value) {
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, TransactionStatus4> mmTransactionStatus = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, TransactionStatus4>() {
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
		public TransactionStatus4 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, TransactionStatus4 value) {
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, List<DocumentIdentification5>> mmUserTransactionReference = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, List<DocumentIdentification5>>() {
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
		public List<DocumentIdentification5> getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getUserTransactionReference();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, List<DocumentIdentification5> value) {
			obj.setUserTransactionReference(value);
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, MessageIdentification1> mmDeltaReportReference = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getDeltaReportReference();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, MessageIdentification1 value) {
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, Count1> mmRejectedAmendmentNumber = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, Count1>() {
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
		public Count1 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getRejectedAmendmentNumber();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, Count1 value) {
			obj.setRejectedAmendmentNumber(value);
		}
	};
	@XmlElement(name = "Initr", required = true)
	protected BICIdentification1 initiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that has rejected the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, BICIdentification1> mmInitiator = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, BICIdentification1>() {
		{
			xmlTag = "Initr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiator";
			definition = "Party that has rejected the amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getInitiator();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, BICIdentification1 value) {
			obj.setInitiator(value);
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, RejectionReason1Choice> mmRejectionReason = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, RejectionReason1Choice>() {
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
		public RejectionReason1Choice getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, RejectionReason1Choice value) {
			obj.setRejectionReason(value);
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
	public static final MMMessageBuildingBlock<AmendmentRejectionNotificationV03, Optional<PendingActivity2>> mmRequestForAction = new MMMessageBuildingBlock<AmendmentRejectionNotificationV03, Optional<PendingActivity2>>() {
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
		public Optional<PendingActivity2> getValue(AmendmentRejectionNotificationV03 obj) {
			return obj.getRequestForAction();
		}

		@Override
		public void setValue(AmendmentRejectionNotificationV03 obj, Optional<PendingActivity2> value) {
			obj.setRequestForAction(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentRejectionNotificationV03";
				definition = "Scope\r\nThe AmendmentRejectionNotification message is sent by the matching application to the requester of an amendment.\r\nThis message is used to notify the rejection of an amendment request.\r\nUsage\r\nThe AmendmentRejectionNotification message can be sent by the matching application to pass on information about the rejection of an amendment request that it has obtained through the receipt of an AmendmentRejection message.\r\nIn order to pass on information about the acceptance of an amendment request the matching application sends an AmendmentAcceptanceNotification message.";
				rootElement = "Document";
				xmlTag = "AmdmntRjctnNtfctn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmNotificationIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmTransactionIdentification, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmEstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmTransactionStatus, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmUserTransactionReference,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmDeltaReportReference, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmRejectedAmendmentNumber,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmInitiator, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmRejectionReason,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "008";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmendmentRejectionNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getNotificationIdentification() {
		return notificationIdentification;
	}

	public AmendmentRejectionNotificationV03 setNotificationIdentification(MessageIdentification1 notificationIdentification) {
		this.notificationIdentification = Objects.requireNonNull(notificationIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public AmendmentRejectionNotificationV03 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public AmendmentRejectionNotificationV03 setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = Objects.requireNonNull(establishedBaselineIdentification);
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public AmendmentRejectionNotificationV03 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public AmendmentRejectionNotificationV03 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public MessageIdentification1 getDeltaReportReference() {
		return deltaReportReference;
	}

	public AmendmentRejectionNotificationV03 setDeltaReportReference(MessageIdentification1 deltaReportReference) {
		this.deltaReportReference = Objects.requireNonNull(deltaReportReference);
		return this;
	}

	public Count1 getRejectedAmendmentNumber() {
		return rejectedAmendmentNumber;
	}

	public AmendmentRejectionNotificationV03 setRejectedAmendmentNumber(Count1 rejectedAmendmentNumber) {
		this.rejectedAmendmentNumber = Objects.requireNonNull(rejectedAmendmentNumber);
		return this;
	}

	public BICIdentification1 getInitiator() {
		return initiator;
	}

	public AmendmentRejectionNotificationV03 setInitiator(BICIdentification1 initiator) {
		this.initiator = Objects.requireNonNull(initiator);
		return this;
	}

	public RejectionReason1Choice getRejectionReason() {
		return rejectionReason;
	}

	public AmendmentRejectionNotificationV03 setRejectionReason(RejectionReason1Choice rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public AmendmentRejectionNotificationV03 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.008.001.03")
	static public class Document {
		@XmlElement(name = "AmdmntRjctnNtfctn", required = true)
		public AmendmentRejectionNotificationV03 messageBody;
	}
}