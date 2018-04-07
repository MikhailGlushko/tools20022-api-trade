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
 * The BaselineReport message is sent by the matching application to the parties
 * involved in an amendment request or to the parties involved in a data set
 * match.<br>
 * The message is used to report either a pre-calculation or final calculation
 * of the dynamic part of an established baseline.<br>
 * <b>Usage</b><br>
 * The BaselineReport message can be sent by the matching application to the
 * parties involved in an amendment request for a transaction established in the
 * push-through mode. In the outlined scenario, the message is sent<br>
 * - to the party requested to accept or reject an amendment request after the
 * matching application has received a BaselineAmendmentRequest message. The
 * message informs about the provisional status of the dynamic part of the
 * baseline.<br>
 * - to the requester and the accepter of an amendment request after the
 * matching application has received an AmendmentAcceptance message conveying
 * the acceptance of the amendment request. The message informs about the actual
 * status of the dynamic part of the baseline.<br>
 * or<br>
 * The BaselineReport message can be sent by the matching application to the
 * party which has sent an amendment request for a transaction established in
 * the lodge mode. In the outlined scenario the message is used to inform about
 * the actual status of the dynamic part of the baseline.<br>
 * or<br>
 * The BaselineReport message can be sent by the matching application to the
 * parties involved in a data set match. In the outlined scenario, the message
 * is sent<br>
 * - to the submitter of the data set(s) in the case of a data set match for a
 * transaction established in the lodge mode.<br>
 * - to the submitter of the data set(s) and to the counterparty in case of a
 * data set match for a transaction established in the push-through mode.The
 * message can be sent after a successful data-set match or after the acceptance
 * of mis-matched data sets to inform about the actual status of the dynamic
 * part of the baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportIdentification
 * BaselineReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRelatedMessageReference
 * BaselineReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportType
 * BaselineReportV04.mmReportType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionIdentification
 * BaselineReportV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmEstablishedBaselineIdentification
 * BaselineReportV04.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionStatus
 * BaselineReportV04.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmUserTransactionReference
 * BaselineReportV04.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmBuyer
 * BaselineReportV04.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmSeller
 * BaselineReportV04.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmBuyerBank
 * BaselineReportV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmSellerBank
 * BaselineReportV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportedLineItem
 * BaselineReportV04.mmReportedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRequestForAction
 * BaselineReportV04.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.011.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineReport message is sent by the matching application to the parties involved in an amendment request or to the parties involved in a data set match.\r\nThe message is used to report either a pre-calculation or final calculation of the dynamic part of an established baseline.\r\nUsage\r\nThe BaselineReport message can be sent by the matching application to the parties involved in an amendment request for a transaction established in the push-through mode. In the outlined scenario, the message is sent\r\n- to the party requested to accept or reject an amendment request after the matching application has received a BaselineAmendmentRequest message. The message informs about the provisional status of the dynamic part of the baseline.\r\n- to the requester and the accepter of an amendment request after the matching application has received an AmendmentAcceptance message conveying the acceptance of the amendment request. The message informs about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the party which has sent an amendment request for a transaction established in the lodge mode. In the outlined scenario the message is used to inform about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the parties involved in a data set match. In the outlined scenario, the message is sent\r\n- to the submitter of the data set(s) in the case of a data set match for a transaction established in the lodge mode.\r\n- to the submitter of the data set(s) and to the counterparty in case of a data set match for a transaction established in the push-through mode.The message can be sent after a successful data-set match or after the acceptance of mis-matched data sets to inform about the actual status of the dynamic part of the baseline."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BaselineReportV04", propOrder = {"reportIdentification", "relatedMessageReference", "reportType", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference", "buyer",
		"seller", "buyerBank", "sellerBank", "reportedLineItem", "requestForAction"})
public class BaselineReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId", required = true)
	protected MessageIdentification1 reportIdentification;
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
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, MessageIdentification1> mmReportIdentification = new MMMessageBuildingBlock<BaselineReportV04, MessageIdentification1>() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(BaselineReportV04 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(BaselineReportV04 obj, MessageIdentification1 value) {
			obj.setReportIdentification(value);
		}
	};
	@XmlElement(name = "RltdMsgRef")
	protected MessageIdentification1 relatedMessageReference;
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
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the related message at the origin of the report or sent at the same time than the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, Optional<MessageIdentification1>> mmRelatedMessageReference = new MMMessageBuildingBlock<BaselineReportV04, Optional<MessageIdentification1>>() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to the related message at the origin of the report or sent at the same time than the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(BaselineReportV04 obj) {
			return obj.getRelatedMessageReference();
		}

		@Override
		public void setValue(BaselineReportV04 obj, Optional<MessageIdentification1> value) {
			obj.setRelatedMessageReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RptTp", required = true)
	protected ReportType2 reportType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportType2
	 * ReportType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of baseline report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, ReportType2> mmReportType = new MMMessageBuildingBlock<BaselineReportV04, ReportType2>() {
		{
			xmlTag = "RptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Type of baseline report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportType2.mmObject();
		}

		@Override
		public ReportType2 getValue(BaselineReportV04 obj) {
			return obj.getReportType();
		}

		@Override
		public void setValue(BaselineReportV04 obj, ReportType2 value) {
			obj.setReportType(value);
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
	public static final MMMessageBuildingBlock<BaselineReportV04, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<BaselineReportV04, SimpleIdentificationInformation>() {
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
		public SimpleIdentificationInformation getValue(BaselineReportV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(BaselineReportV04 obj, SimpleIdentificationInformation value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "EstblishdBaselnId", required = true)
	protected DocumentIdentification6 establishedBaselineIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6
	 * DocumentIdentification6}</li>
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
	public static final MMMessageBuildingBlock<BaselineReportV04, DocumentIdentification6> mmEstablishedBaselineIdentification = new MMMessageBuildingBlock<BaselineReportV04, DocumentIdentification6>() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification6.mmObject();
		}

		@Override
		public DocumentIdentification6 getValue(BaselineReportV04 obj) {
			return obj.getEstablishedBaselineIdentification();
		}

		@Override
		public void setValue(BaselineReportV04 obj, DocumentIdentification6 value) {
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
	public static final MMMessageBuildingBlock<BaselineReportV04, TransactionStatus4> mmTransactionStatus = new MMMessageBuildingBlock<BaselineReportV04, TransactionStatus4>() {
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
		public TransactionStatus4 getValue(BaselineReportV04 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(BaselineReportV04 obj, TransactionStatus4 value) {
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
	public static final MMMessageBuildingBlock<BaselineReportV04, List<DocumentIdentification5>> mmUserTransactionReference = new MMMessageBuildingBlock<BaselineReportV04, List<DocumentIdentification5>>() {
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
		public List<DocumentIdentification5> getValue(BaselineReportV04 obj) {
			return obj.getUserTransactionReference();
		}

		@Override
		public void setValue(BaselineReportV04 obj, List<DocumentIdentification5> value) {
			obj.setUserTransactionReference(value);
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, PartyIdentification26> mmBuyer = new MMMessageBuildingBlock<BaselineReportV04, PartyIdentification26>() {
		{
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(BaselineReportV04 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(BaselineReportV04 obj, PartyIdentification26 value) {
			obj.setBuyer(value);
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification26 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, PartyIdentification26> mmSeller = new MMMessageBuildingBlock<BaselineReportV04, PartyIdentification26>() {
		{
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(BaselineReportV04 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(BaselineReportV04 obj, PartyIdentification26 value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "BuyrBk", required = true)
	protected BICIdentification1 buyerBank;
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
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the buyer, uniquely identified by its BIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, BICIdentification1> mmBuyerBank = new MMMessageBuildingBlock<BaselineReportV04, BICIdentification1>() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(BaselineReportV04 obj) {
			return obj.getBuyerBank();
		}

		@Override
		public void setValue(BaselineReportV04 obj, BICIdentification1 value) {
			obj.setBuyerBank(value);
		}
	};
	@XmlElement(name = "SellrBk", required = true)
	protected BICIdentification1 sellerBank;
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
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the seller, uniquely identified by its BIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, BICIdentification1> mmSellerBank = new MMMessageBuildingBlock<BaselineReportV04, BICIdentification1>() {
		{
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(BaselineReportV04 obj) {
			return obj.getSellerBank();
		}

		@Override
		public void setValue(BaselineReportV04 obj, BICIdentification1 value) {
			obj.setSellerBank(value);
		}
	};
	@XmlElement(name = "RptdLineItm", required = true)
	protected LineItem14 reportedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdLineItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the goods."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineReportV04, LineItem14> mmReportedLineItem = new MMMessageBuildingBlock<BaselineReportV04, LineItem14>() {
		{
			xmlTag = "RptdLineItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedLineItem";
			definition = "Information on the goods.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LineItem14.mmObject();
		}

		@Override
		public LineItem14 getValue(BaselineReportV04 obj) {
			return obj.getReportedLineItem();
		}

		@Override
		public void setValue(BaselineReportV04 obj, LineItem14 value) {
			obj.setReportedLineItem(value);
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
	public static final MMMessageBuildingBlock<BaselineReportV04, Optional<PendingActivity2>> mmRequestForAction = new MMMessageBuildingBlock<BaselineReportV04, Optional<PendingActivity2>>() {
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
		public Optional<PendingActivity2> getValue(BaselineReportV04 obj) {
			return obj.getRequestForAction();
		}

		@Override
		public void setValue(BaselineReportV04 obj, Optional<PendingActivity2> value) {
			obj.setRequestForAction(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineReportV04";
				definition = "Scope\r\nThe BaselineReport message is sent by the matching application to the parties involved in an amendment request or to the parties involved in a data set match.\r\nThe message is used to report either a pre-calculation or final calculation of the dynamic part of an established baseline.\r\nUsage\r\nThe BaselineReport message can be sent by the matching application to the parties involved in an amendment request for a transaction established in the push-through mode. In the outlined scenario, the message is sent\r\n- to the party requested to accept or reject an amendment request after the matching application has received a BaselineAmendmentRequest message. The message informs about the provisional status of the dynamic part of the baseline.\r\n- to the requester and the accepter of an amendment request after the matching application has received an AmendmentAcceptance message conveying the acceptance of the amendment request. The message informs about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the party which has sent an amendment request for a transaction established in the lodge mode. In the outlined scenario the message is used to inform about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the parties involved in a data set match. In the outlined scenario, the message is sent\r\n- to the submitter of the data set(s) in the case of a data set match for a transaction established in the lodge mode.\r\n- to the submitter of the data set(s) and to the counterparty in case of a data set match for a transaction established in the push-through mode.The message can be sent after a successful data-set match or after the acceptance of mis-matched data sets to inform about the actual status of the dynamic part of the baseline.";
				rootElement = "Document";
				xmlTag = "BaselnRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.mmRelatedMessageReference,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportType, com.tools20022.repository.area.tsmt.BaselineReportV04.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmEstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.mmTransactionStatus,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmUserTransactionReference, com.tools20022.repository.area.tsmt.BaselineReportV04.mmBuyer, com.tools20022.repository.area.tsmt.BaselineReportV04.mmSeller,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmBuyerBank, com.tools20022.repository.area.tsmt.BaselineReportV04.mmSellerBank, com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportedLineItem,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "011";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BaselineReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public BaselineReportV04 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public Optional<MessageIdentification1> getRelatedMessageReference() {
		return relatedMessageReference == null ? Optional.empty() : Optional.of(relatedMessageReference);
	}

	public BaselineReportV04 setRelatedMessageReference(MessageIdentification1 relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
		return this;
	}

	public ReportType2 getReportType() {
		return reportType;
	}

	public BaselineReportV04 setReportType(ReportType2 reportType) {
		this.reportType = Objects.requireNonNull(reportType);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public BaselineReportV04 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public DocumentIdentification6 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public BaselineReportV04 setEstablishedBaselineIdentification(DocumentIdentification6 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = Objects.requireNonNull(establishedBaselineIdentification);
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public BaselineReportV04 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public BaselineReportV04 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public BaselineReportV04 setBuyer(PartyIdentification26 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public BaselineReportV04 setSeller(PartyIdentification26 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public BaselineReportV04 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public BaselineReportV04 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public LineItem14 getReportedLineItem() {
		return reportedLineItem;
	}

	public BaselineReportV04 setReportedLineItem(LineItem14 reportedLineItem) {
		this.reportedLineItem = Objects.requireNonNull(reportedLineItem);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public BaselineReportV04 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04")
	static public class Document {
		@XmlElement(name = "BaselnRpt", required = true)
		public BaselineReportV04 messageBody;
	}
}