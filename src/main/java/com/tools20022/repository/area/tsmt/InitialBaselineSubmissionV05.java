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
import com.tools20022.repository.choice.BankContactPerson1Choice;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The InitialBaselineSubmission message is sent by the initiator of a
 * transaction to the matching application.<br>
 * This message is used to initiate a transaction.<br>
 * <b>Usage</b><br>
 * The InitialBaselineSubmission message can be sent by a party to register a
 * transaction in the matching application. The message can be submitted with
 * either lodge or push-through instruction.<br>
 * When the push-through instruction is present, the matching application
 * acknowledges the receipt of the message to the sender by sending an
 * Acknowledgement message, stores the submitted information and informs the
 * counterparty about the registration of the transaction by sending a
 * FullPushThroughReport message. With the BaselineReSubmission message the
 * counterparty responds with matching baseline information in order to
 * establish the transaction (baseline).<br>
 * When the lodge instruction is present, the matching application acknowledges
 * the receipt of the message to the sender by sending an Acknowledgement
 * message and stores the submitted information. No matching of the submitted
 * baseline data with other baseline information will take place. For example
 * the submission of an InitialBaselineSubmission message containing a lodge
 * instruction establishes the transaction (baseline) in the matching
 * application.<br>
 * The InitialBaselineSubmission message consists of data which relates to the
 * purchasing agreement covered by the transaction, for example line item
 * details, shipping details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmissionIdentification
 * InitialBaselineSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmitterTransactionReference
 * InitialBaselineSubmissionV05.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmInstruction
 * InitialBaselineSubmissionV05.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBaseline
 * InitialBaselineSubmissionV05.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBuyerContactPerson
 * InitialBaselineSubmissionV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSellerContactPerson
 * InitialBaselineSubmissionV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBankContactPerson
 * InitialBaselineSubmissionV05.mmBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmOtherBankContactPerson
 * InitialBaselineSubmissionV05.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InitlBaselnSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.019.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialBaselineSubmissionV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InitialBaselineSubmission message is sent by the initiator of a transaction to the matching application.\r\nThis message is used to initiate a transaction.\r\nUsage\r\nThe InitialBaselineSubmission message can be sent by a party to register a transaction in the matching application. The message can be submitted with either lodge or push-through instruction.\r\nWhen the push-through instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message, stores the submitted information and informs the counterparty about the registration of the transaction by sending a FullPushThroughReport message. With the BaselineReSubmission message the counterparty responds with matching baseline information in order to establish the transaction (baseline).\r\nWhen the lodge instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message and stores the submitted information. No matching of the submitted baseline data with other baseline information will take place. For example the submission of an InitialBaselineSubmission message containing a lodge instruction establishes the transaction (baseline) in the matching application.\r\nThe InitialBaselineSubmission message consists of data which relates to the purchasing agreement covered by the transaction, for example line item details, shipping details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InitialBaselineSubmissionV05", propOrder = {"submissionIdentification", "submitterTransactionReference", "instruction", "baseline", "buyerContactPerson", "sellerContactPerson", "bankContactPerson", "otherBankContactPerson"})
public class InitialBaselineSubmissionV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubmissnId", required = true)
	protected MessageIdentification1 submissionIdentification;
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
	 * xmlTag} = "SubmissnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, MessageIdentification1> mmSubmissionIdentification = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, MessageIdentification1>() {
		{
			xmlTag = "SubmissnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionIdentification";
			definition = "Identifies the submitted information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getSubmissionIdentification();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, MessageIdentification1 value) {
			obj.setSubmissionIdentification(value);
		}
	};
	@XmlElement(name = "SubmitrTxRef", required = true)
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
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, SimpleIdentificationInformation> mmSubmitterTransactionReference = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, SimpleIdentificationInformation>() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, SimpleIdentificationInformation value) {
			obj.setSubmitterTransactionReference(value);
		}
	};
	@XmlElement(name = "Instr", required = true)
	protected InstructionType1 instruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionType1
	 * InstructionType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instruction requested by the submitter by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, InstructionType1> mmInstruction = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, InstructionType1>() {
		{
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Specifies the instruction requested by the submitter by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType1.mmObject();
		}

		@Override
		public InstructionType1 getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getInstruction();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, InstructionType1 value) {
			obj.setInstruction(value);
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
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, Baseline5> mmBaseline = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, Baseline5>() {
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
		public Baseline5 getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getBaseline();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, Baseline5 value) {
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
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification1>> mmBuyerContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification1>>() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getBuyerContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, List<ContactIdentification1> value) {
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
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification1>> mmSellerContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification1>>() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getSellerContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, List<ContactIdentification1> value) {
			obj.setSellerContactPerson(value);
		}
	};
	@XmlElement(name = "BkCtctPrsn", required = true)
	protected BankContactPerson1Choice bankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice
	 * BankContactPerson1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in the seller's bank or buyer's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, BankContactPerson1Choice> mmBankContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, BankContactPerson1Choice>() {
		{
			xmlTag = "BkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankContactPerson";
			definition = "Person to be contacted in the seller's bank or buyer's bank.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BankContactPerson1Choice.mmObject();
		}

		@Override
		public BankContactPerson1Choice getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getBankContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, BankContactPerson1Choice value) {
			obj.setBankContactPerson(value);
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
	 * "Person to be contacted in another bank than seller or buyer's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification3>> mmOtherBankContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV05, List<ContactIdentification3>>() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than seller or buyer's bank.";
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		@Override
		public List<ContactIdentification3> getValue(InitialBaselineSubmissionV05 obj) {
			return obj.getOtherBankContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV05 obj, List<ContactIdentification3> value) {
			obj.setOtherBankContactPerson(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InitialBaselineSubmissionV05";
				definition = "Scope\r\nThe InitialBaselineSubmission message is sent by the initiator of a transaction to the matching application.\r\nThis message is used to initiate a transaction.\r\nUsage\r\nThe InitialBaselineSubmission message can be sent by a party to register a transaction in the matching application. The message can be submitted with either lodge or push-through instruction.\r\nWhen the push-through instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message, stores the submitted information and informs the counterparty about the registration of the transaction by sending a FullPushThroughReport message. With the BaselineReSubmission message the counterparty responds with matching baseline information in order to establish the transaction (baseline).\r\nWhen the lodge instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message and stores the submitted information. No matching of the submitted baseline data with other baseline information will take place. For example the submission of an InitialBaselineSubmission message containing a lodge instruction establishes the transaction (baseline) in the matching application.\r\nThe InitialBaselineSubmission message consists of data which relates to the purchasing agreement covered by the transaction, for example line item details, shipping details.";
				rootElement = "Document";
				xmlTag = "InitlBaselnSubmissn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmSubmissionIdentification,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmInstruction,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmBaseline, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmSellerContactPerson, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmBankContactPerson,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "019";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InitialBaselineSubmissionV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public InitialBaselineSubmissionV05 setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = Objects.requireNonNull(submissionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public InitialBaselineSubmissionV05 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = Objects.requireNonNull(submitterTransactionReference);
		return this;
	}

	public InstructionType1 getInstruction() {
		return instruction;
	}

	public InitialBaselineSubmissionV05 setInstruction(InstructionType1 instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public Baseline5 getBaseline() {
		return baseline;
	}

	public InitialBaselineSubmissionV05 setBaseline(Baseline5 baseline) {
		this.baseline = Objects.requireNonNull(baseline);
		return this;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson == null ? buyerContactPerson = new ArrayList<>() : buyerContactPerson;
	}

	public InitialBaselineSubmissionV05 setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = Objects.requireNonNull(buyerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson == null ? sellerContactPerson = new ArrayList<>() : sellerContactPerson;
	}

	public InitialBaselineSubmissionV05 setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = Objects.requireNonNull(sellerContactPerson);
		return this;
	}

	public BankContactPerson1Choice getBankContactPerson() {
		return bankContactPerson;
	}

	public InitialBaselineSubmissionV05 setBankContactPerson(BankContactPerson1Choice bankContactPerson) {
		this.bankContactPerson = Objects.requireNonNull(bankContactPerson);
		return this;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson == null ? otherBankContactPerson = new ArrayList<>() : otherBankContactPerson;
	}

	public InitialBaselineSubmissionV05 setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = Objects.requireNonNull(otherBankContactPerson);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05")
	static public class Document {
		@XmlElement(name = "InitlBaselnSubmissn", required = true)
		public InitialBaselineSubmissionV05 messageBody;
	}
}