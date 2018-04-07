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
 * The DataSetSubmission message is sent by a party involved in the transaction
 * to the matching application.<br>
 * This message is used to trigger either a match or a pre-match of the
 * information submitted with the message.<br>
 * <b>Usage</b><br>
 * The DataSetSubmission message can be sent by either party with the
 * instruction pre-match. In the outlined scenario, the matching application
 * will compare the data set(s) conveyed by the DataSetSubmission message with
 * the established baseline and report the matching result to the requester of
 * the data set pre-match by sending a DataSetMatchReport message.<br>
 * or<br>
 * The DataSetSubmission message can be sent by the party specified in the
 * baseline as data set submitter with the instruction match. In the outlined
 * scenario, the matching application will compare the data set(s) conveyed by
 * the DataSetSubmission message with the established baseline and report the
 * matching result to<br>
 * - the parties involved in a transaction established in the push-through mode,
 * or<br>
 * - the initiator of a transaction established in the lodge mode.<br>
 * The DataSetSubmission message can be used to submit multiple data sets for
 * multiple transactions (baselines) at the same time. However, all transactions
 * (baselines) covered by the message must be for the same parties, that is
 * transaction initiator and counterparty, as well as for the same buyer and
 * seller.<br>
 * The DataSetSubmission message consists of data reflecting trade information
 * related to the purchasing agreement covered by the transaction(s), for
 * example shipment date, invoice amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmSubmissionIdentification
 * DataSetSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmRelatedTransactionReferences
 * DataSetSubmissionV05.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCommonSubmissionReference
 * DataSetSubmissionV05.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmInstruction
 * DataSetSubmissionV05.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmBuyerBank
 * DataSetSubmissionV05.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmSellerBank
 * DataSetSubmissionV05.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCommercialDataSet
 * DataSetSubmissionV05.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmTransportDataSet
 * DataSetSubmissionV05.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmInsuranceDataSet
 * DataSetSubmissionV05.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCertificateDataSet
 * DataSetSubmissionV05.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmOtherCertificateDataSet
 * DataSetSubmissionV05.mmOtherCertificateDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DataSetSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.014.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetSubmissionV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe DataSetSubmission message is sent by a party involved in the transaction to the matching application.\r\nThis message is used to trigger either a match or a pre-match of the information submitted with the message.\r\nUsage\r\nThe DataSetSubmission message can be sent by either party with the instruction pre-match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to the requester of the data set pre-match by sending a DataSetMatchReport message.\r\nor\r\nThe DataSetSubmission message can be sent by the party specified in the baseline as data set submitter with the instruction match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to\r\n- the parties involved in a transaction established in the push-through mode, or\r\n- the initiator of a transaction established in the lodge mode.\r\nThe DataSetSubmission message can be used to submit multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.\r\nThe DataSetSubmission message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DataSetSubmissionV05", propOrder = {"submissionIdentification", "relatedTransactionReferences", "commonSubmissionReference", "instruction", "buyerBank", "sellerBank", "commercialDataSet", "transportDataSet",
		"insuranceDataSet", "certificateDataSet", "otherCertificateDataSet"})
public class DataSetSubmissionV05 {

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
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, MessageIdentification1> mmSubmissionIdentification = new MMMessageBuildingBlock<DataSetSubmissionV05, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(DataSetSubmissionV05 obj) {
			return obj.getSubmissionIdentification();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, MessageIdentification1 value) {
			obj.setSubmissionIdentification(value);
		}
	};
	@XmlElement(name = "RltdTxRefs", required = true)
	protected List<DataSetSubmissionReferences3> relatedTransactionReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdTxRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the transactions that this submission relates to and provides associated information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, List<DataSetSubmissionReferences3>> mmRelatedTransactionReferences = new MMMessageBuildingBlock<DataSetSubmissionV05, List<DataSetSubmissionReferences3>>() {
		{
			xmlTag = "RltdTxRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTransactionReferences";
			definition = "Identifies the transactions that this submission relates to and provides associated information.";
			minOccurs = 1;
			complexType_lazy = () -> DataSetSubmissionReferences3.mmObject();
		}

		@Override
		public List<DataSetSubmissionReferences3> getValue(DataSetSubmissionV05 obj) {
			return obj.getRelatedTransactionReferences();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, List<DataSetSubmissionReferences3> value) {
			obj.setRelatedTransactionReferences(value);
		}
	};
	@XmlElement(name = "CmonSubmissnRef", required = true)
	protected SimpleIdentificationInformation commonSubmissionReference;
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
	 * xmlTag} = "CmonSubmissnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonSubmissionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This reference must be used for all data sets belonging to the same submission group."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, SimpleIdentificationInformation> mmCommonSubmissionReference = new MMMessageBuildingBlock<DataSetSubmissionV05, SimpleIdentificationInformation>() {
		{
			xmlTag = "CmonSubmissnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSubmissionReference";
			definition = "This reference must be used for all data sets belonging to the same submission group.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(DataSetSubmissionV05 obj) {
			return obj.getCommonSubmissionReference();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, SimpleIdentificationInformation value) {
			obj.setCommonSubmissionReference(value);
		}
	};
	@XmlElement(name = "Instr", required = true)
	protected InstructionType3 instruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionType3
	 * InstructionType3}</li>
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
	 * definition} = "Specifies the instruction given by the submitter."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, InstructionType3> mmInstruction = new MMMessageBuildingBlock<DataSetSubmissionV05, InstructionType3>() {
		{
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Specifies the instruction given by the submitter.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType3.mmObject();
		}

		@Override
		public InstructionType3 getValue(DataSetSubmissionV05 obj) {
			return obj.getInstruction();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, InstructionType3 value) {
			obj.setInstruction(value);
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
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, BICIdentification1> mmBuyerBank = new MMMessageBuildingBlock<DataSetSubmissionV05, BICIdentification1>() {
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
		public BICIdentification1 getValue(DataSetSubmissionV05 obj) {
			return obj.getBuyerBank();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, BICIdentification1 value) {
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
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, BICIdentification1> mmSellerBank = new MMMessageBuildingBlock<DataSetSubmissionV05, BICIdentification1>() {
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
		public BICIdentification1 getValue(DataSetSubmissionV05 obj) {
			return obj.getSellerBank();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, BICIdentification1 value) {
			obj.setSellerBank(value);
		}
	};
	@XmlElement(name = "ComrclDataSet")
	protected CommercialDataSet5 commercialDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial information that is submitted to the matching application for processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, Optional<CommercialDataSet5>> mmCommercialDataSet = new MMMessageBuildingBlock<DataSetSubmissionV05, Optional<CommercialDataSet5>>() {
		{
			xmlTag = "ComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Commercial information that is submitted to the matching application for processing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommercialDataSet5.mmObject();
		}

		@Override
		public Optional<CommercialDataSet5> getValue(DataSetSubmissionV05 obj) {
			return obj.getCommercialDataSet();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, Optional<CommercialDataSet5> value) {
			obj.setCommercialDataSet(value.orElse(null));
		}
	};
	@XmlElement(name = "TrnsprtDataSet")
	protected TransportDataSet5 transportDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport information that is submitted to the matching application for processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, Optional<TransportDataSet5>> mmTransportDataSet = new MMMessageBuildingBlock<DataSetSubmissionV05, Optional<TransportDataSet5>>() {
		{
			xmlTag = "TrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Transport information that is submitted to the matching application for processing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransportDataSet5.mmObject();
		}

		@Override
		public Optional<TransportDataSet5> getValue(DataSetSubmissionV05 obj) {
			return obj.getTransportDataSet();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, Optional<TransportDataSet5> value) {
			obj.setTransportDataSet(value.orElse(null));
		}
	};
	@XmlElement(name = "InsrncDataSet")
	protected InsuranceDataSet1 insuranceDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insurance information that is submitted to the matching application for processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, Optional<InsuranceDataSet1>> mmInsuranceDataSet = new MMMessageBuildingBlock<DataSetSubmissionV05, Optional<InsuranceDataSet1>>() {
		{
			xmlTag = "InsrncDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Insurance information that is submitted to the matching application for processing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceDataSet1.mmObject();
		}

		@Override
		public Optional<InsuranceDataSet1> getValue(DataSetSubmissionV05 obj) {
			return obj.getInsuranceDataSet();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, Optional<InsuranceDataSet1> value) {
			obj.setInsuranceDataSet(value.orElse(null));
		}
	};
	@XmlElement(name = "CertDataSet")
	protected List<CertificateDataSet2> certificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate information that is submitted to the matching application for processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, List<CertificateDataSet2>> mmCertificateDataSet = new MMMessageBuildingBlock<DataSetSubmissionV05, List<CertificateDataSet2>>() {
		{
			xmlTag = "CertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Certificate information that is submitted to the matching application for processing.";
			minOccurs = 0;
			complexType_lazy = () -> CertificateDataSet2.mmObject();
		}

		@Override
		public List<CertificateDataSet2> getValue(DataSetSubmissionV05 obj) {
			return obj.getCertificateDataSet();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, List<CertificateDataSet2> value) {
			obj.setCertificateDataSet(value);
		}
	};
	@XmlElement(name = "OthrCertDataSet")
	protected List<OtherCertificateDataSet2> otherCertificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCertDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other certificate information that is submitted to the matching application for processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DataSetSubmissionV05, List<OtherCertificateDataSet2>> mmOtherCertificateDataSet = new MMMessageBuildingBlock<DataSetSubmissionV05, List<OtherCertificateDataSet2>>() {
		{
			xmlTag = "OthrCertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Other certificate information that is submitted to the matching application for processing.";
			minOccurs = 0;
			complexType_lazy = () -> OtherCertificateDataSet2.mmObject();
		}

		@Override
		public List<OtherCertificateDataSet2> getValue(DataSetSubmissionV05 obj) {
			return obj.getOtherCertificateDataSet();
		}

		@Override
		public void setValue(DataSetSubmissionV05 obj, List<OtherCertificateDataSet2> value) {
			obj.setOtherCertificateDataSet(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetSubmissionV05";
				definition = "Scope\r\nThe DataSetSubmission message is sent by a party involved in the transaction to the matching application.\r\nThis message is used to trigger either a match or a pre-match of the information submitted with the message.\r\nUsage\r\nThe DataSetSubmission message can be sent by either party with the instruction pre-match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to the requester of the data set pre-match by sending a DataSetMatchReport message.\r\nor\r\nThe DataSetSubmission message can be sent by the party specified in the baseline as data set submitter with the instruction match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to\r\n- the parties involved in a transaction established in the push-through mode, or\r\n- the initiator of a transaction established in the lodge mode.\r\nThe DataSetSubmission message can be used to submit multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.\r\nThe DataSetSubmission message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount.";
				rootElement = "Document";
				xmlTag = "DataSetSubmissn";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmSubmissionIdentification, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmRelatedTransactionReferences,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmCommonSubmissionReference, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmInstruction,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmBuyerBank, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmSellerBank,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmCommercialDataSet, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmTransportDataSet,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmInsuranceDataSet, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmCertificateDataSet,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.mmOtherCertificateDataSet);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "014";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DataSetSubmissionV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public DataSetSubmissionV05 setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = Objects.requireNonNull(submissionIdentification);
		return this;
	}

	public List<DataSetSubmissionReferences3> getRelatedTransactionReferences() {
		return relatedTransactionReferences == null ? relatedTransactionReferences = new ArrayList<>() : relatedTransactionReferences;
	}

	public DataSetSubmissionV05 setRelatedTransactionReferences(List<DataSetSubmissionReferences3> relatedTransactionReferences) {
		this.relatedTransactionReferences = Objects.requireNonNull(relatedTransactionReferences);
		return this;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return commonSubmissionReference;
	}

	public DataSetSubmissionV05 setCommonSubmissionReference(SimpleIdentificationInformation commonSubmissionReference) {
		this.commonSubmissionReference = Objects.requireNonNull(commonSubmissionReference);
		return this;
	}

	public InstructionType3 getInstruction() {
		return instruction;
	}

	public DataSetSubmissionV05 setInstruction(InstructionType3 instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public DataSetSubmissionV05 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public DataSetSubmissionV05 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public Optional<CommercialDataSet5> getCommercialDataSet() {
		return commercialDataSet == null ? Optional.empty() : Optional.of(commercialDataSet);
	}

	public DataSetSubmissionV05 setCommercialDataSet(CommercialDataSet5 commercialDataSet) {
		this.commercialDataSet = commercialDataSet;
		return this;
	}

	public Optional<TransportDataSet5> getTransportDataSet() {
		return transportDataSet == null ? Optional.empty() : Optional.of(transportDataSet);
	}

	public DataSetSubmissionV05 setTransportDataSet(TransportDataSet5 transportDataSet) {
		this.transportDataSet = transportDataSet;
		return this;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return insuranceDataSet == null ? Optional.empty() : Optional.of(insuranceDataSet);
	}

	public DataSetSubmissionV05 setInsuranceDataSet(InsuranceDataSet1 insuranceDataSet) {
		this.insuranceDataSet = insuranceDataSet;
		return this;
	}

	public List<CertificateDataSet2> getCertificateDataSet() {
		return certificateDataSet == null ? certificateDataSet = new ArrayList<>() : certificateDataSet;
	}

	public DataSetSubmissionV05 setCertificateDataSet(List<CertificateDataSet2> certificateDataSet) {
		this.certificateDataSet = Objects.requireNonNull(certificateDataSet);
		return this;
	}

	public List<OtherCertificateDataSet2> getOtherCertificateDataSet() {
		return otherCertificateDataSet == null ? otherCertificateDataSet = new ArrayList<>() : otherCertificateDataSet;
	}

	public DataSetSubmissionV05 setOtherCertificateDataSet(List<OtherCertificateDataSet2> otherCertificateDataSet) {
		this.otherCertificateDataSet = Objects.requireNonNull(otherCertificateDataSet);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05")
	static public class Document {
		@XmlElement(name = "DataSetSubmissn", required = true)
		public DataSetSubmissionV05 messageBody;
	}
}