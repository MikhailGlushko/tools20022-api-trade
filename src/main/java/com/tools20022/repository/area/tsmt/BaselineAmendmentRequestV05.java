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
 * The BaselineAmendmentRequest message is sent by a primary party involved in a
 * transaction to the matching application.<br>
 * The message is used to request the amendment of an established baseline.<br>
 * <b>Usage</b><br>
 * The BaselineAmendmentRequest message may only be sent if the transaction is
 * in the state Established or Active.<br>
 * The BaselineAmendmentRequest message can be sent to the matching application
 * by one of the primary parties involved in a transaction established in the
 * push-through mode to request the amendment of an established baseline.<br>
 * The matching application acknowledges the receipt of the amendment request by
 * sending a DeltaReport message to the submitter of the
 * BaselineAmendmentRequest message. It passes on the newly proposed baseline to
 * the counterparty by sending a FullPushThroughReport message, a DeltaReport
 * message and a pre-calculated BaselineReport message.<br>
 * The counterparty is expected to either accept or reject the amendment request
 * by submitting an AmendmentAcceptance or AmendmentRejection message.<br>
 * or<br>
 * The BaselineAmendmentRequest message can be sent by the party involved in a
 * transaction established in the lodge mode to the matching application to
 * amend an established baseline.<br>
 * The matching application amends the baseline according to the
 * BaselineAmendmentRequest message and confirms the execution of the request by
 * sending a DeltaReport and calculated BaselineReport message to the requester
 * of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmRequestIdentification
 * BaselineAmendmentRequestV05.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmTransactionIdentification
 * BaselineAmendmentRequestV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSubmitterTransactionReference
 * BaselineAmendmentRequestV05.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBaseline
 * BaselineAmendmentRequestV05.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerContactPerson
 * BaselineAmendmentRequestV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerContactPerson
 * BaselineAmendmentRequestV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerBankContactPerson
 * BaselineAmendmentRequestV05.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerBankContactPerson
 * BaselineAmendmentRequestV05.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmOtherBankContactPerson
 * BaselineAmendmentRequestV05.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.009.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineAmendmentRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineAmendmentRequest message is sent by a primary party involved in a transaction to the matching application.\r\nThe message is used to request the amendment of an established baseline.\r\nUsage\r\nThe BaselineAmendmentRequest message may only be sent if the transaction is in the state Established or Active.\r\nThe BaselineAmendmentRequest message can be sent to the matching application by one of the primary parties involved in a transaction established in the push-through mode to request the amendment of an established baseline.\r\nThe matching application acknowledges the receipt of the amendment request by sending a DeltaReport message to the submitter of the BaselineAmendmentRequest message. It passes on the newly proposed baseline to the counterparty by sending a FullPushThroughReport message, a DeltaReport message and a pre-calculated BaselineReport message.\r\nThe counterparty is expected to either accept or reject the amendment request by submitting an AmendmentAcceptance or AmendmentRejection message.\r\nor\r\nThe BaselineAmendmentRequest message can be sent by the party involved in a transaction established in the lodge mode to the matching application to amend an established baseline.\r\nThe matching application amends the baseline according to the BaselineAmendmentRequest message and confirms the execution of the request by sending a DeltaReport and calculated BaselineReport message to the requester of the amendment."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BaselineAmendmentRequestV05", propOrder = {"requestIdentification", "transactionIdentification", "submitterTransactionReference", "baseline", "buyerContactPerson", "sellerContactPerson", "buyerBankContactPerson",
		"sellerBankContactPerson", "otherBankContactPerson"})
public class BaselineAmendmentRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqId", required = true)
	protected MessageIdentification1 requestIdentification;
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
	 * xmlTag} = "ReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the request message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, MessageIdentification1> mmRequestIdentification = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, MessageIdentification1>() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getRequestIdentification();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, MessageIdentification1 value) {
			obj.setRequestIdentification(value);
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
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, SimpleIdentificationInformation> mmTransactionIdentification = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, SimpleIdentificationInformation>() {
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
		public SimpleIdentificationInformation getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, SimpleIdentificationInformation value) {
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
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, Optional<SimpleIdentificationInformation>> mmSubmitterTransactionReference = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, Optional<SimpleIdentificationInformation>>() {
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
		public Optional<SimpleIdentificationInformation> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, Optional<SimpleIdentificationInformation> value) {
			obj.setSubmitterTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Baseln", required = true)
	protected Baseline5 baseline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Baseln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the commercial details of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, Baseline5> mmBaseline = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, Baseline5>() {
		{
			xmlTag = "Baseln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline5.mmObject();
		}

		@Override
		public Baseline5 getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getBaseline();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, Baseline5 value) {
			obj.setBaseline(value);
		}
	};
	@XmlElement(name = "BuyrCtctPrsn")
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the buyer."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>> mmBuyerContactPerson = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>>() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getBuyerContactPerson();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, List<ContactIdentification1> value) {
			obj.setBuyerContactPerson(value);
		}
	};
	@XmlElement(name = "SellrCtctPrsn")
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the seller."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>> mmSellerContactPerson = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>>() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getSellerContactPerson();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, List<ContactIdentification1> value) {
			obj.setSellerContactPerson(value);
		}
	};
	@XmlElement(name = "BuyrBkCtctPrsn")
	protected List<ContactIdentification1> buyerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the buyer's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>> mmBuyerBankContactPerson = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>>() {
		{
			xmlTag = "BuyrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankContactPerson";
			definition = "Person to be contacted in the buyer's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getBuyerBankContactPerson();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, List<ContactIdentification1> value) {
			obj.setBuyerBankContactPerson(value);
		}
	};
	@XmlElement(name = "SellrBkCtctPrsn")
	protected List<ContactIdentification1> sellerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the seller's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>> mmSellerBankContactPerson = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification1>>() {
		{
			xmlTag = "SellrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankContactPerson";
			definition = "Person to be contacted in the seller's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getSellerBankContactPerson();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, List<ContactIdentification1> value) {
			obj.setSellerBankContactPerson(value);
		}
	};
	@XmlElement(name = "OthrBkCtctPrsn")
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in another bank than the seller or buyer's bank."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification3>> mmOtherBankContactPerson = new MMMessageBuildingBlock<BaselineAmendmentRequestV05, List<ContactIdentification3>>() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		@Override
		public List<ContactIdentification3> getValue(BaselineAmendmentRequestV05 obj) {
			return obj.getOtherBankContactPerson();
		}

		@Override
		public void setValue(BaselineAmendmentRequestV05 obj, List<ContactIdentification3> value) {
			obj.setOtherBankContactPerson(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineAmendmentRequestV05";
				definition = "Scope\r\nThe BaselineAmendmentRequest message is sent by a primary party involved in a transaction to the matching application.\r\nThe message is used to request the amendment of an established baseline.\r\nUsage\r\nThe BaselineAmendmentRequest message may only be sent if the transaction is in the state Established or Active.\r\nThe BaselineAmendmentRequest message can be sent to the matching application by one of the primary parties involved in a transaction established in the push-through mode to request the amendment of an established baseline.\r\nThe matching application acknowledges the receipt of the amendment request by sending a DeltaReport message to the submitter of the BaselineAmendmentRequest message. It passes on the newly proposed baseline to the counterparty by sending a FullPushThroughReport message, a DeltaReport message and a pre-calculated BaselineReport message.\r\nThe counterparty is expected to either accept or reject the amendment request by submitting an AmendmentAcceptance or AmendmentRejection message.\r\nor\r\nThe BaselineAmendmentRequest message can be sent by the party involved in a transaction established in the lodge mode to the matching application to amend an established baseline.\r\nThe matching application amends the baseline according to the BaselineAmendmentRequest message and confirms the execution of the request by sending a DeltaReport and calculated BaselineReport message to the requester of the amendment.";
				rootElement = "Document";
				xmlTag = "BaselnAmdmntReq";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmRequestIdentification,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmTransactionIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBaseline, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSellerContactPerson, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBuyerBankContactPerson,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSellerBankContactPerson, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "009";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BaselineAmendmentRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public BaselineAmendmentRequestV05 setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = Objects.requireNonNull(requestIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public BaselineAmendmentRequestV05 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? Optional.empty() : Optional.of(submitterTransactionReference);
	}

	public BaselineAmendmentRequestV05 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
		return this;
	}

	public Baseline5 getBaseline() {
		return baseline;
	}

	public BaselineAmendmentRequestV05 setBaseline(Baseline5 baseline) {
		this.baseline = Objects.requireNonNull(baseline);
		return this;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson == null ? buyerContactPerson = new ArrayList<>() : buyerContactPerson;
	}

	public BaselineAmendmentRequestV05 setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = Objects.requireNonNull(buyerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson == null ? sellerContactPerson = new ArrayList<>() : sellerContactPerson;
	}

	public BaselineAmendmentRequestV05 setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = Objects.requireNonNull(sellerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getBuyerBankContactPerson() {
		return buyerBankContactPerson == null ? buyerBankContactPerson = new ArrayList<>() : buyerBankContactPerson;
	}

	public BaselineAmendmentRequestV05 setBuyerBankContactPerson(List<ContactIdentification1> buyerBankContactPerson) {
		this.buyerBankContactPerson = Objects.requireNonNull(buyerBankContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerBankContactPerson() {
		return sellerBankContactPerson == null ? sellerBankContactPerson = new ArrayList<>() : sellerBankContactPerson;
	}

	public BaselineAmendmentRequestV05 setSellerBankContactPerson(List<ContactIdentification1> sellerBankContactPerson) {
		this.sellerBankContactPerson = Objects.requireNonNull(sellerBankContactPerson);
		return this;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson == null ? otherBankContactPerson = new ArrayList<>() : otherBankContactPerson;
	}

	public BaselineAmendmentRequestV05 setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = Objects.requireNonNull(otherBankContactPerson);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05")
	static public class Document {
		@XmlElement(name = "BaselnAmdmntReq", required = true)
		public BaselineAmendmentRequestV05 messageBody;
	}
}