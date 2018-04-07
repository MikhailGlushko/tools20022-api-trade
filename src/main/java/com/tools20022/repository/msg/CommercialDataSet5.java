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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.Goods;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Goods or services that are part of a commercial trade agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmDataSetIdentification
 * CommercialDataSet5.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmCommercialDocumentReference
 * CommercialDataSet5.mmCommercialDocumentReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmBuyer
 * CommercialDataSet5.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmSeller
 * CommercialDataSet5.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmBillTo
 * CommercialDataSet5.mmBillTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmGoods
 * CommercialDataSet5.mmGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmPaymentTerms
 * CommercialDataSet5.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmSettlementTerms
 * CommercialDataSet5.mmSettlementTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommercialDataSet
 * ForwardDataSetSubmissionReportV05.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCommercialDataSet
 * DataSetSubmissionV05.mmCommercialDataSet}</li>
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
 * "CommercialDataSet5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Goods or services that are part of a commercial trade agreement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommercialDataSet5", propOrder = {"dataSetIdentification", "commercialDocumentReference", "buyer", "seller", "billTo", "goods", "paymentTerms", "settlementTerms"})
public class CommercialDataSet5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the commercial data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, DocumentIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<CommercialDataSet5, DocumentIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the commercial data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1.mmObject();
		}

		@Override
		public DocumentIdentification1 getValue(CommercialDataSet5 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, DocumentIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "ComrclDocRef", required = true)
	protected InvoiceIdentification1 commercialDocumentReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceIdentification1
	 * InvoiceIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclDocRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDocumentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the underlying commercial document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, InvoiceIdentification1> mmCommercialDocumentReference = new MMMessageAssociationEnd<CommercialDataSet5, InvoiceIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "ComrclDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDocumentReference";
			definition = "Reference to the identification of the underlying commercial document.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvoiceIdentification1.mmObject();
		}

		@Override
		public InvoiceIdentification1 getValue(CommercialDataSet5 obj) {
			return obj.getCommercialDocumentReference();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, InvoiceIdentification1 value) {
			obj.setCommercialDocumentReference(value);
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
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
	public static final MMMessageAssociationEnd<CommercialDataSet5, PartyIdentification26> mmBuyer = new MMMessageAssociationEnd<CommercialDataSet5, PartyIdentification26>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(CommercialDataSet5 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, PartyIdentification26 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
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
	public static final MMMessageAssociationEnd<CommercialDataSet5, PartyIdentification26> mmSeller = new MMMessageAssociationEnd<CommercialDataSet5, PartyIdentification26>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(CommercialDataSet5 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, PartyIdentification26 value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "BllTo")
	protected PartyIdentification26 billTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to be invoiced for the purchase."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, Optional<PartyIdentification26>> mmBillTo = new MMMessageAssociationEnd<CommercialDataSet5, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "BllTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillTo";
			definition = "Party to be invoiced for the purchase.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(CommercialDataSet5 obj) {
			return obj.getBillTo();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, Optional<PartyIdentification26> value) {
			obj.setBillTo(value.orElse(null));
		}
	};
	@XmlElement(name = "Goods", required = true)
	protected List<LineItem15> goods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of the underlying transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, List<LineItem15>> mmGoods = new MMMessageAssociationEnd<CommercialDataSet5, List<LineItem15>>() {
		{
			businessComponentTrace_lazy = () -> Goods.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Goods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Goods";
			definition = "Information about the goods and/or services of the underlying transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LineItem15.mmObject();
		}

		@Override
		public List<LineItem15> getValue(CommercialDataSet5 obj) {
			return obj.getGoods();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, List<LineItem15> value) {
			obj.setGoods(value);
		}
	};
	@XmlElement(name = "PmtTerms", required = true)
	protected List<PaymentTerms4> paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms4
	 * PaymentTerms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment terms by means of a code and a limit in time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, List<PaymentTerms4>> mmPaymentTerms = new MMMessageAssociationEnd<CommercialDataSet5, List<PaymentTerms4>>() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPaymentObligation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms by means of a code and a limit in time.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentTerms4.mmObject();
		}

		@Override
		public List<PaymentTerms4> getValue(CommercialDataSet5 obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, List<PaymentTerms4> value) {
			obj.setPaymentTerms(value);
		}
	};
	@XmlElement(name = "SttlmTerms", required = true)
	protected SettlementTerms3 settlementTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms3
	 * SettlementTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how the transaction should be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommercialDataSet5, SettlementTerms3> mmSettlementTerms = new MMMessageAssociationEnd<CommercialDataSet5, SettlementTerms3>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CommercialDataSet5.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies how the transaction should be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTerms3.mmObject();
		}

		@Override
		public SettlementTerms3 getValue(CommercialDataSet5 obj) {
			return obj.getSettlementTerms();
		}

		@Override
		public void setValue(CommercialDataSet5 obj, SettlementTerms3 value) {
			obj.setSettlementTerms(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommercialDataSet5.mmDataSetIdentification, com.tools20022.repository.msg.CommercialDataSet5.mmCommercialDocumentReference,
						com.tools20022.repository.msg.CommercialDataSet5.mmBuyer, com.tools20022.repository.msg.CommercialDataSet5.mmSeller, com.tools20022.repository.msg.CommercialDataSet5.mmBillTo,
						com.tools20022.repository.msg.CommercialDataSet5.mmGoods, com.tools20022.repository.msg.CommercialDataSet5.mmPaymentTerms, com.tools20022.repository.msg.CommercialDataSet5.mmSettlementTerms);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmCommercialDataSet, DataSetSubmissionV05.mmCommercialDataSet);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommercialDataSet5";
				definition = "Goods or services that are part of a commercial trade agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CommercialDataSet5 setDataSetIdentification(DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public InvoiceIdentification1 getCommercialDocumentReference() {
		return commercialDocumentReference;
	}

	public CommercialDataSet5 setCommercialDocumentReference(InvoiceIdentification1 commercialDocumentReference) {
		this.commercialDocumentReference = Objects.requireNonNull(commercialDocumentReference);
		return this;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public CommercialDataSet5 setBuyer(PartyIdentification26 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public CommercialDataSet5 setSeller(PartyIdentification26 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public Optional<PartyIdentification26> getBillTo() {
		return billTo == null ? Optional.empty() : Optional.of(billTo);
	}

	public CommercialDataSet5 setBillTo(PartyIdentification26 billTo) {
		this.billTo = billTo;
		return this;
	}

	public List<LineItem15> getGoods() {
		return goods == null ? goods = new ArrayList<>() : goods;
	}

	public CommercialDataSet5 setGoods(List<LineItem15> goods) {
		this.goods = Objects.requireNonNull(goods);
		return this;
	}

	public List<PaymentTerms4> getPaymentTerms() {
		return paymentTerms == null ? paymentTerms = new ArrayList<>() : paymentTerms;
	}

	public CommercialDataSet5 setPaymentTerms(List<PaymentTerms4> paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public SettlementTerms3 getSettlementTerms() {
		return settlementTerms;
	}

	public CommercialDataSet5 setSettlementTerms(SettlementTerms3 settlementTerms) {
		this.settlementTerms = Objects.requireNonNull(settlementTerms);
		return this;
	}
}