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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BaselineAmendmentRequestV05", propOrder = {"requestIdentification", "transactionIdentification", "submitterTransactionReference", "baseline", "buyerContactPerson", "sellerContactPerson", "buyerBankContactPerson",
		"sellerBankContactPerson", "otherBankContactPerson"})
public class BaselineAmendmentRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the request message.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getRequestIdentification", new Class[]{});
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
				return BaselineAmendmentRequestV05.class.getMethod("getTransactionIdentification", new Class[]{});
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
				return BaselineAmendmentRequestV05.class.getMethod("getSubmitterTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Baseline5 baseline;
	/**
	 * Specifies the commercial details of the underlying transaction.
	 * <p>
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
	public static final MMMessageBuildingBlock mmBaseline = new MMMessageBuildingBlock() {
		{
			xmlTag = "Baseln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getBaseline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * Person to be contacted in the organisation of the buyer.
	 * <p>
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
	public static final MMMessageBuildingBlock mmBuyerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getBuyerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * Person to be contacted in the organisation of the seller.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSellerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getSellerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ContactIdentification1> buyerBankContactPerson;
	/**
	 * Person to be contacted in the buyer's bank.
	 * <p>
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
	public static final MMMessageBuildingBlock mmBuyerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankContactPerson";
			definition = "Person to be contacted in the buyer's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getBuyerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ContactIdentification1> sellerBankContactPerson;
	/**
	 * Person to be contacted in the seller's bank.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSellerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankContactPerson";
			definition = "Person to be contacted in the seller's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getSellerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * Person to be contacted in another bank than the seller or buyer's bank.
	 * <p>
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
	public static final MMMessageBuildingBlock mmOtherBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineAmendmentRequestV05.class.getMethod("getOtherBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

	@XmlElement(name = "ReqId", required = true)
	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public void setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = requestIdentification;
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

	@XmlElement(name = "Baseln", required = true)
	public Baseline5 getBaseline() {
		return baseline;
	}

	public void setBaseline(Baseline5 baseline) {
		this.baseline = baseline;
	}

	@XmlElement(name = "BuyrCtctPrsn")
	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson;
	}

	public void setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = buyerContactPerson;
	}

	@XmlElement(name = "SellrCtctPrsn")
	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson;
	}

	public void setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = sellerContactPerson;
	}

	@XmlElement(name = "BuyrBkCtctPrsn")
	public List<ContactIdentification1> getBuyerBankContactPerson() {
		return buyerBankContactPerson;
	}

	public void setBuyerBankContactPerson(List<ContactIdentification1> buyerBankContactPerson) {
		this.buyerBankContactPerson = buyerBankContactPerson;
	}

	@XmlElement(name = "SellrBkCtctPrsn")
	public List<ContactIdentification1> getSellerBankContactPerson() {
		return sellerBankContactPerson;
	}

	public void setSellerBankContactPerson(List<ContactIdentification1> sellerBankContactPerson) {
		this.sellerBankContactPerson = sellerBankContactPerson;
	}

	@XmlElement(name = "OthrBkCtctPrsn")
	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson;
	}

	public void setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = otherBankContactPerson;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.009.05.05")
	static public class Document {
		@XmlElement(name = "BaselnAmdmntReq", required = true)
		public BaselineAmendmentRequestV05 messageBody;
	}
}