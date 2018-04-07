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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem15#mmPurchaseOrderReference
 * LineItem15.mmPurchaseOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmFinalSubmission
 * LineItem15.mmFinalSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem15#mmCommercialLineItems
 * LineItem15.mmCommercialLineItems}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem15#mmLineItemsTotalAmount
 * LineItem15.mmLineItemsTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmAdjustment
 * LineItem15.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmFreightCharges
 * LineItem15.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmTax
 * LineItem15.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmTotalNetAmount
 * LineItem15.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem15#mmBuyerDefinedInformation
 * LineItem15.mmBuyerDefinedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem15#mmSellerDefinedInformation
 * LineItem15.mmSellerDefinedInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmIncoterms
 * LineItem15.mmIncoterms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem15
 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem15", propOrder = {"purchaseOrderReference", "finalSubmission", "commercialLineItems", "lineItemsTotalAmount", "adjustment", "freightCharges", "tax", "totalNetAmount", "buyerDefinedInformation",
		"sellerDefinedInformation", "incoterms"})
public class LineItem15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PurchsOrdrRef", required = true)
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
	 * PurchaseOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the purchase order of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, DocumentIdentification7> mmPurchaseOrderReference = new MMMessageAssociationEnd<LineItem15, DocumentIdentification7>() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification7.mmObject();
		}

		@Override
		public DocumentIdentification7 getValue(LineItem15 obj) {
			return obj.getPurchaseOrderReference();
		}

		@Override
		public void setValue(LineItem15 obj, DocumentIdentification7 value) {
			obj.setPurchaseOrderReference(value);
		}
	};
	@XmlElement(name = "FnlSubmissn", required = true)
	protected YesNoIndicator finalSubmission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSubmissn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether this current invoice is the last submission against the purchase order referenced."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem15, YesNoIndicator> mmFinalSubmission = new MMMessageAttribute<LineItem15, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "FnlSubmissn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSubmission";
			definition = "Specifies whether this current invoice is the last submission against the purchase order referenced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(LineItem15 obj) {
			return obj.getFinalSubmission();
		}

		@Override
		public void setValue(LineItem15 obj, YesNoIndicator value) {
			obj.setFinalSubmission(value);
		}
	};
	@XmlElement(name = "ComrclLineItms", required = true)
	protected List<LineItemDetails14> commercialLineItems;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails14
	 * LineItemDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclLineItms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialLineItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods which are the subject of the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, List<LineItemDetails14>> mmCommercialLineItems = new MMMessageAssociationEnd<LineItem15, List<LineItemDetails14>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "ComrclLineItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialLineItems";
			definition = "Goods which are the subject of the invoice.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LineItemDetails14.mmObject();
		}

		@Override
		public List<LineItemDetails14> getValue(LineItem15 obj) {
			return obj.getCommercialLineItems();
		}

		@Override
		public void setValue(LineItem15 obj, List<LineItemDetails14> value) {
			obj.setCommercialLineItems(value);
		}
	};
	@XmlElement(name = "LineItmsTtlAmt", required = true)
	protected CurrencyAndAmount lineItemsTotalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmsTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of all line items (incl. their adjustments)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem15, CurrencyAndAmount> mmLineItemsTotalAmount = new MMMessageAttribute<LineItem15, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "LineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemsTotalAmount";
			definition = "Specifies the total amount of all line items (incl. their adjustments).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem15 obj) {
			return obj.getLineItemsTotalAmount();
		}

		@Override
		public void setValue(LineItem15 obj, CurrencyAndAmount value) {
			obj.setLineItemsTotalAmount(value);
		}
	};
	@XmlElement(name = "Adjstmnt")
	protected List<Adjustment6> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Adjustment6
	 * Adjustment6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, List<Adjustment6>> mmAdjustment = new MMMessageAssociationEnd<LineItem15, List<Adjustment6>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Variance on price for the goods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Adjustment6.mmObject();
		}

		@Override
		public List<Adjustment6> getValue(LineItem15 obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(LineItem15 obj, List<Adjustment6> value) {
			obj.setAdjustment(value);
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge25 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge25 Charge25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrghtChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, Optional<Charge25>> mmFreightCharges = new MMMessageAssociationEnd<LineItem15, Optional<Charge25>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge25.mmObject();
		}

		@Override
		public Optional<Charge25> getValue(LineItem15 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(LineItem15 obj, Optional<Charge25> value) {
			obj.setFreightCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected List<Tax22> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax22 Tax22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, List<Tax22>> mmTax = new MMMessageAssociationEnd<LineItem15, List<Tax22>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax22.mmObject();
		}

		@Override
		public List<Tax22> getValue(LineItem15 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(LineItem15 obj, List<Tax22> value) {
			obj.setTax(value);
		}
	};
	@XmlElement(name = "TtlNetAmt", required = true)
	protected CurrencyAndAmount totalNetAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem15, CurrencyAndAmount> mmTotalNetAmount = new MMMessageAttribute<LineItem15, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "TtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetAmount";
			definition = "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem15 obj) {
			return obj.getTotalNetAmount();
		}

		@Override
		public void setValue(LineItem15 obj, CurrencyAndAmount value) {
			obj.setTotalNetAmount(value);
		}
	};
	@XmlElement(name = "BuyrDfndInf")
	protected List<UserDefinedInformation1> buyerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrDfndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, List<UserDefinedInformation1>> mmBuyerDefinedInformation = new MMMessageAssociationEnd<LineItem15, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "BuyrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UserDefinedInformation1.mmObject();
		}

		@Override
		public List<UserDefinedInformation1> getValue(LineItem15 obj) {
			return obj.getBuyerDefinedInformation();
		}

		@Override
		public void setValue(LineItem15 obj, List<UserDefinedInformation1> value) {
			obj.setBuyerDefinedInformation(value);
		}
	};
	@XmlElement(name = "SellrDfndInf")
	protected List<UserDefinedInformation1> sellerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrDfndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, List<UserDefinedInformation1>> mmSellerDefinedInformation = new MMMessageAssociationEnd<LineItem15, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "SellrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UserDefinedInformation1.mmObject();
		}

		@Override
		public List<UserDefinedInformation1> getValue(LineItem15 obj) {
			return obj.getSellerDefinedInformation();
		}

		@Override
		public void setValue(LineItem15 obj, List<UserDefinedInformation1> value) {
			obj.setSellerDefinedInformation(value);
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms4 incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms4 Incoterms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem15
	 * LineItem15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem15, Optional<Incoterms4>> mmIncoterms = new MMMessageAssociationEnd<LineItem15, Optional<Incoterms4>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem15.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms4.mmObject();
		}

		@Override
		public Optional<Incoterms4> getValue(LineItem15 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(LineItem15 obj, Optional<Incoterms4> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem15.mmPurchaseOrderReference, com.tools20022.repository.msg.LineItem15.mmFinalSubmission,
						com.tools20022.repository.msg.LineItem15.mmCommercialLineItems, com.tools20022.repository.msg.LineItem15.mmLineItemsTotalAmount, com.tools20022.repository.msg.LineItem15.mmAdjustment,
						com.tools20022.repository.msg.LineItem15.mmFreightCharges, com.tools20022.repository.msg.LineItem15.mmTax, com.tools20022.repository.msg.LineItem15.mmTotalNetAmount,
						com.tools20022.repository.msg.LineItem15.mmBuyerDefinedInformation, com.tools20022.repository.msg.LineItem15.mmSellerDefinedInformation, com.tools20022.repository.msg.LineItem15.mmIncoterms);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem15";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public LineItem15 setPurchaseOrderReference(DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = Objects.requireNonNull(purchaseOrderReference);
		return this;
	}

	public YesNoIndicator getFinalSubmission() {
		return finalSubmission;
	}

	public LineItem15 setFinalSubmission(YesNoIndicator finalSubmission) {
		this.finalSubmission = Objects.requireNonNull(finalSubmission);
		return this;
	}

	public List<LineItemDetails14> getCommercialLineItems() {
		return commercialLineItems == null ? commercialLineItems = new ArrayList<>() : commercialLineItems;
	}

	public LineItem15 setCommercialLineItems(List<LineItemDetails14> commercialLineItems) {
		this.commercialLineItems = Objects.requireNonNull(commercialLineItems);
		return this;
	}

	public CurrencyAndAmount getLineItemsTotalAmount() {
		return lineItemsTotalAmount;
	}

	public LineItem15 setLineItemsTotalAmount(CurrencyAndAmount lineItemsTotalAmount) {
		this.lineItemsTotalAmount = Objects.requireNonNull(lineItemsTotalAmount);
		return this;
	}

	public List<Adjustment6> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public LineItem15 setAdjustment(List<Adjustment6> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Charge25> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public LineItem15 setFreightCharges(Charge25 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public List<Tax22> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItem15 setTax(List<Tax22> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public LineItem15 setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<UserDefinedInformation1> getBuyerDefinedInformation() {
		return buyerDefinedInformation == null ? buyerDefinedInformation = new ArrayList<>() : buyerDefinedInformation;
	}

	public LineItem15 setBuyerDefinedInformation(List<UserDefinedInformation1> buyerDefinedInformation) {
		this.buyerDefinedInformation = Objects.requireNonNull(buyerDefinedInformation);
		return this;
	}

	public List<UserDefinedInformation1> getSellerDefinedInformation() {
		return sellerDefinedInformation == null ? sellerDefinedInformation = new ArrayList<>() : sellerDefinedInformation;
	}

	public LineItem15 setSellerDefinedInformation(List<UserDefinedInformation1> sellerDefinedInformation) {
		this.sellerDefinedInformation = Objects.requireNonNull(sellerDefinedInformation);
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public LineItem15 setIncoterms(Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}
}