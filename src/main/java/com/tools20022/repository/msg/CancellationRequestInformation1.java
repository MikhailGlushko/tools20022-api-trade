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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.InvoiceFinancingStatus;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstitutionIdentification6;
import com.tools20022.repository.msg.PartyIdentificationAndAccount6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of information related to the cancellation request, such as actors
 * involved and identification of the original multiple invoice financing
 * request to which the cancellation request is referring.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmOriginalGroupIdentification
 * CancellationRequestInformation1.mmOriginalGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmOriginalCreationDateTime
 * CancellationRequestInformation1.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmNumberOfInvoiceRequests
 * CancellationRequestInformation1.mmNumberOfInvoiceRequests}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmTotalBulkInvoiceAmount
 * CancellationRequestInformation1.mmTotalBulkInvoiceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmCancellationReason
 * CancellationRequestInformation1.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmFinancingRequestor
 * CancellationRequestInformation1.mmFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmIntermediaryAgent
 * CancellationRequestInformation1.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmFirstAgent
 * CancellationRequestInformation1.mmFirstAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#mmCancellationRequestInformation
 * InvoiceFinancingCancellationRequestV01.mmCancellationRequestInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationRequestInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of information related to the cancellation request, such as actors involved and identification of the original multiple invoice financing request to which the cancellation request is referring."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancellationRequestInformation1", propOrder = {"originalGroupIdentification", "originalCreationDateTime", "numberOfInvoiceRequests", "totalBulkInvoiceAmount", "cancellationReason", "financingRequestor",
		"intermediaryAgent", "firstAgent"})
public class CancellationRequestInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpId", required = true)
	protected Max35Text originalGroupIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the original financing request message as assigned by the original sending party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationRequestInformation1, Max35Text> mmOriginalGroupIdentification = new MMMessageAttribute<CancellationRequestInformation1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupIdentification";
			definition = "Unique and unambiguous identifier of the original financing request message as assigned by the original sending party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CancellationRequestInformation1 obj) {
			return obj.getOriginalGroupIdentification();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Max35Text value) {
			obj.setOriginalGroupIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlCreDtTm", required = true)
	protected ISODateTime originalCreationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the original financing request message was created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationRequestInformation1, ISODateTime> mmOriginalCreationDateTime = new MMMessageAttribute<CancellationRequestInformation1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original financing request message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CancellationRequestInformation1 obj) {
			return obj.getOriginalCreationDateTime();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, ISODateTime value) {
			obj.setOriginalCreationDateTime(value);
		}
	};
	@XmlElement(name = "NbOfInvcReqs")
	protected Max15NumericText numberOfInvoiceRequests;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfInvcReqs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfInvoiceRequests"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of single invoice financing requests included in the original financing request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationRequestInformation1, Optional<Max15NumericText>> mmNumberOfInvoiceRequests = new MMMessageAttribute<CancellationRequestInformation1, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "NbOfInvcReqs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfInvoiceRequests";
			definition = "Specifies the number of single invoice financing requests included in the original financing request message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(CancellationRequestInformation1 obj) {
			return obj.getNumberOfInvoiceRequests();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Optional<Max15NumericText> value) {
			obj.setNumberOfInvoiceRequests(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlBlkInvcAmt")
	protected ActiveCurrencyAndAmount totalBulkInvoiceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBlkInvcAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBulkInvoiceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the bulk invoice financing request. It is composed by the sum of the total amounts of all invoices included in the original financing request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationRequestInformation1, Optional<ActiveCurrencyAndAmount>> mmTotalBulkInvoiceAmount = new MMMessageAttribute<CancellationRequestInformation1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBlkInvcAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBulkInvoiceAmount";
			definition = "Total amount of the bulk invoice financing request. It is composed by the sum of the total amounts of all invoices included in the original financing request message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CancellationRequestInformation1 obj) {
			return obj.getTotalBulkInvoiceAmount();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalBulkInvoiceAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRsn", required = true)
	protected Max105Text cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationRequestReason
	 * InvoiceFinancingStatus.mmCancellationRequestReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further details on the cancellation request information, in an uncoded form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationRequestInformation1, Max105Text> mmCancellationReason = new MMMessageAttribute<CancellationRequestInformation1, Max105Text>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmCancellationRequestReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Further details on the cancellation request information, in an uncoded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(CancellationRequestInformation1 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Max105Text value) {
			obj.setCancellationReason(value);
		}
	};
	@XmlElement(name = "FincgRqstr")
	protected PartyIdentificationAndAccount6 financingRequestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6
	 * PartyIdentificationAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgRqstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that requests the cancellation of a financing request previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationRequestInformation1, Optional<PartyIdentificationAndAccount6>> mmFinancingRequestor = new MMMessageAssociationEnd<CancellationRequestInformation1, Optional<PartyIdentificationAndAccount6>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "FincgRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingRequestor";
			definition = "Party that requests the cancellation of a financing request previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount6.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount6> getValue(CancellationRequestInformation1 obj) {
			return obj.getFinancingRequestor();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Optional<PartyIdentificationAndAccount6> value) {
			obj.setFinancingRequestor(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt")
	protected FinancialInstitutionIdentification6 intermediaryAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationRequestInformation1, Optional<FinancialInstitutionIdentification6>> mmIntermediaryAgent = new MMMessageAssociationEnd<CancellationRequestInformation1, Optional<FinancialInstitutionIdentification6>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			definition = "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification6.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification6> getValue(CancellationRequestInformation1 obj) {
			return obj.getIntermediaryAgent();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Optional<FinancialInstitutionIdentification6> value) {
			obj.setIntermediaryAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstAgt")
	protected FinancialInstitutionIdentification6 firstAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of financing requestor to which an invoice financing cancellation request is addressed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationRequestInformation1, Optional<FinancialInstitutionIdentification6>> mmFirstAgent = new MMMessageAssociationEnd<CancellationRequestInformation1, Optional<FinancialInstitutionIdentification6>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution of financing requestor to which an invoice financing cancellation request is addressed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification6.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification6> getValue(CancellationRequestInformation1 obj) {
			return obj.getFirstAgent();
		}

		@Override
		public void setValue(CancellationRequestInformation1 obj, Optional<FinancialInstitutionIdentification6> value) {
			obj.setFirstAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationRequestInformation1.mmOriginalGroupIdentification,
						com.tools20022.repository.msg.CancellationRequestInformation1.mmOriginalCreationDateTime, com.tools20022.repository.msg.CancellationRequestInformation1.mmNumberOfInvoiceRequests,
						com.tools20022.repository.msg.CancellationRequestInformation1.mmTotalBulkInvoiceAmount, com.tools20022.repository.msg.CancellationRequestInformation1.mmCancellationReason,
						com.tools20022.repository.msg.CancellationRequestInformation1.mmFinancingRequestor, com.tools20022.repository.msg.CancellationRequestInformation1.mmIntermediaryAgent,
						com.tools20022.repository.msg.CancellationRequestInformation1.mmFirstAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingCancellationRequestV01.mmCancellationRequestInformation);
				trace_lazy = () -> InvoiceFinancingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationRequestInformation1";
				definition = "Set of information related to the cancellation request, such as actors involved and identification of the original multiple invoice financing request to which the cancellation request is referring.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalGroupIdentification() {
		return originalGroupIdentification;
	}

	public CancellationRequestInformation1 setOriginalGroupIdentification(Max35Text originalGroupIdentification) {
		this.originalGroupIdentification = Objects.requireNonNull(originalGroupIdentification);
		return this;
	}

	public ISODateTime getOriginalCreationDateTime() {
		return originalCreationDateTime;
	}

	public CancellationRequestInformation1 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = Objects.requireNonNull(originalCreationDateTime);
		return this;
	}

	public Optional<Max15NumericText> getNumberOfInvoiceRequests() {
		return numberOfInvoiceRequests == null ? Optional.empty() : Optional.of(numberOfInvoiceRequests);
	}

	public CancellationRequestInformation1 setNumberOfInvoiceRequests(Max15NumericText numberOfInvoiceRequests) {
		this.numberOfInvoiceRequests = numberOfInvoiceRequests;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalBulkInvoiceAmount() {
		return totalBulkInvoiceAmount == null ? Optional.empty() : Optional.of(totalBulkInvoiceAmount);
	}

	public CancellationRequestInformation1 setTotalBulkInvoiceAmount(ActiveCurrencyAndAmount totalBulkInvoiceAmount) {
		this.totalBulkInvoiceAmount = totalBulkInvoiceAmount;
		return this;
	}

	public Max105Text getCancellationReason() {
		return cancellationReason;
	}

	public CancellationRequestInformation1 setCancellationReason(Max105Text cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public Optional<PartyIdentificationAndAccount6> getFinancingRequestor() {
		return financingRequestor == null ? Optional.empty() : Optional.of(financingRequestor);
	}

	public CancellationRequestInformation1 setFinancingRequestor(PartyIdentificationAndAccount6 financingRequestor) {
		this.financingRequestor = financingRequestor;
		return this;
	}

	public Optional<FinancialInstitutionIdentification6> getIntermediaryAgent() {
		return intermediaryAgent == null ? Optional.empty() : Optional.of(intermediaryAgent);
	}

	public CancellationRequestInformation1 setIntermediaryAgent(FinancialInstitutionIdentification6 intermediaryAgent) {
		this.intermediaryAgent = intermediaryAgent;
		return this;
	}

	public Optional<FinancialInstitutionIdentification6> getFirstAgent() {
		return firstAgent == null ? Optional.empty() : Optional.of(firstAgent);
	}

	public CancellationRequestInformation1 setFirstAgent(FinancialInstitutionIdentification6 firstAgent) {
		this.firstAgent = firstAgent;
		return this;
	}
}