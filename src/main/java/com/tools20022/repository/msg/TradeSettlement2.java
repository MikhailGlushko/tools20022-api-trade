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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trade settlement details for this invoice which involves the payment of an
 * outstanding debt, account, or charge.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmPaymentReference
 * TradeSettlement2.mmPaymentReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDueDate
 * TradeSettlement2.mmDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
 * TradeSettlement2.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmInvoiceCurrencyExchange
 * TradeSettlement2.mmInvoiceCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDeliveryDate
 * TradeSettlement2.mmDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmBillingPeriod
 * TradeSettlement2.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmTaxTotalAmount
 * TradeSettlement2.mmTaxTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmExemptionReasonCode
 * TradeSettlement2.mmExemptionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmExemptionReason
 * TradeSettlement2.mmExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmSubTotalCalculatedTax
 * TradeSettlement2.mmSubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmEarlyPayments
 * TradeSettlement2.mmEarlyPayments}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeSettlement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeSettlement2", propOrder = {"paymentReference", "dueDate", "duePayableAmount", "invoiceCurrencyExchange", "deliveryDate", "billingPeriod", "taxTotalAmount", "exemptionReasonCode", "exemptionReason",
		"subTotalCalculatedTax", "earlyPayments"})
public class TradeSettlement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtRef")
	protected CreditorReferenceInformation2 paymentReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment or creditor reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement2, Optional<CreditorReferenceInformation2>> mmPaymentReference = new MMMessageAssociationEnd<TradeSettlement2, Optional<CreditorReferenceInformation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Payment or creditor reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditorReferenceInformation2.mmObject();
		}

		@Override
		public Optional<CreditorReferenceInformation2> getValue(TradeSettlement2 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<CreditorReferenceInformation2> value) {
			obj.setPaymentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DueDt")
	protected ISODate dueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when invoice should be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, Optional<ISODate>> mmDueDate = new MMMessageAttribute<TradeSettlement2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Date when invoice should be paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeSettlement2 obj) {
			return obj.getDueDate();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<ISODate> value) {
			obj.setDueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DuePyblAmt", required = true)
	protected CurrencyAndAmount duePayableAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payable amount with currency code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, CurrencyAndAmount> mmDuePayableAmount = new MMMessageAttribute<TradeSettlement2, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Payable amount with currency code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TradeSettlement2 obj) {
			return obj.getDuePayableAmount();
		}

		@Override
		public void setValue(TradeSettlement2 obj, CurrencyAndAmount value) {
			obj.setDuePayableAmount(value);
		}
	};
	@XmlElement(name = "InvcCcyXchg")
	protected CurrencyReference3 invoiceCurrencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcCcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If invoice currency is different from local tax reporting currency, then applied exchange rate is given in this message structure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement2, Optional<CurrencyReference3>> mmInvoiceCurrencyExchange = new MMMessageAssociationEnd<TradeSettlement2, Optional<CurrencyReference3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyExchange";
			definition = "If invoice currency is different from local tax reporting currency, then applied exchange rate is given in this message structure.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyReference3.mmObject();
		}

		@Override
		public Optional<CurrencyReference3> getValue(TradeSettlement2 obj) {
			return obj.getInvoiceCurrencyExchange();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<CurrencyReference3> value) {
			obj.setInvoiceCurrencyExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryDt")
	protected ISODate deliveryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when goods/services are delivered to buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, Optional<ISODate>> mmDeliveryDate = new MMMessageAttribute<TradeSettlement2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDate";
			definition = "Date when goods/services are delivered to buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeSettlement2 obj) {
			return obj.getDeliveryDate();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<ISODate> value) {
			obj.setDeliveryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "BllgPrd")
	protected Period2 billingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmStartDate
	 * Trade.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which delivery executed or agreed invoicing period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement2, Optional<Period2>> mmBillingPeriod = new MMMessageAssociationEnd<TradeSettlement2, Optional<Period2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmStartDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Period during which delivery executed or agreed invoicing period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period2.mmObject();
		}

		@Override
		public Optional<Period2> getValue(TradeSettlement2 obj) {
			return obj.getBillingPeriod();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<Period2> value) {
			obj.setBillingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxTtlAmt", required = true)
	protected CurrencyAndAmount taxTotalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
	 * CommercialTrade.mmTotalAcceptedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax total amount with currency code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, CurrencyAndAmount> mmTaxTotalAmount = new MMMessageAttribute<TradeSettlement2, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmTotalAcceptedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "TaxTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTotalAmount";
			definition = "Tax total amount with currency code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TradeSettlement2 obj) {
			return obj.getTaxTotalAmount();
		}

		@Override
		public void setValue(TradeSettlement2 obj, CurrencyAndAmount value) {
			obj.setTaxTotalAmount(value);
		}
	};
	@XmlElement(name = "XmptnRsnCd")
	protected Max4Text exemptionReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR6#forTradeSettlement2_ExemptionReasonCode
	 * ConstraintR6.forTradeSettlement2_ExemptionReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for tax exemption expressed as a code, if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, Optional<Max4Text>> mmExemptionReasonCode = new MMMessageAttribute<TradeSettlement2, Optional<Max4Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnCd";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR6.forTradeSettlement2_ExemptionReasonCode);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonCode";
			definition = "Reason for tax exemption expressed as a code, if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(TradeSettlement2 obj) {
			return obj.getExemptionReasonCode();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<Max4Text> value) {
			obj.setExemptionReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnRsn")
	protected Max500Text exemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for a tax exemption, if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement2, Optional<Max500Text>> mmExemptionReason = new MMMessageAttribute<TradeSettlement2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption, if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(TradeSettlement2 obj) {
			return obj.getExemptionReason();
		}

		@Override
		public void setValue(TradeSettlement2 obj, Optional<Max500Text> value) {
			obj.setExemptionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "SubTtlClctdTax")
	protected List<SettlementSubTotalCalculatedTax2> subTotalCalculatedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlClctdTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalCalculatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated tax subtotal."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement2, List<SettlementSubTotalCalculatedTax2>> mmSubTotalCalculatedTax = new MMMessageAssociationEnd<TradeSettlement2, List<SettlementSubTotalCalculatedTax2>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "SubTtlClctdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalCalculatedTax";
			definition = "Calculated tax subtotal.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
		}

		@Override
		public List<SettlementSubTotalCalculatedTax2> getValue(TradeSettlement2 obj) {
			return obj.getSubTotalCalculatedTax();
		}

		@Override
		public void setValue(TradeSettlement2 obj, List<SettlementSubTotalCalculatedTax2> value) {
			obj.setSubTotalCalculatedTax(value);
		}
	};
	@XmlElement(name = "EarlyPmts")
	protected List<EarlyPayment1> earlyPayments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EarlyPayment1
	 * EarlyPayment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyPmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of each early payment discount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement2, List<EarlyPayment1>> mmEarlyPayments = new MMMessageAssociationEnd<TradeSettlement2, List<EarlyPayment1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPayments";
			definition = "Details of each early payment discount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EarlyPayment1.mmObject();
		}

		@Override
		public List<EarlyPayment1> getValue(TradeSettlement2 obj) {
			return obj.getEarlyPayments();
		}

		@Override
		public void setValue(TradeSettlement2 obj, List<EarlyPayment1> value) {
			obj.setEarlyPayments(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement2.mmPaymentReference, com.tools20022.repository.msg.TradeSettlement2.mmDueDate,
						com.tools20022.repository.msg.TradeSettlement2.mmDuePayableAmount, com.tools20022.repository.msg.TradeSettlement2.mmInvoiceCurrencyExchange, com.tools20022.repository.msg.TradeSettlement2.mmDeliveryDate,
						com.tools20022.repository.msg.TradeSettlement2.mmBillingPeriod, com.tools20022.repository.msg.TradeSettlement2.mmTaxTotalAmount, com.tools20022.repository.msg.TradeSettlement2.mmExemptionReasonCode,
						com.tools20022.repository.msg.TradeSettlement2.mmExemptionReason, com.tools20022.repository.msg.TradeSettlement2.mmSubTotalCalculatedTax, com.tools20022.repository.msg.TradeSettlement2.mmEarlyPayments);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeSettlement2";
				definition = "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CreditorReferenceInformation2> getPaymentReference() {
		return paymentReference == null ? Optional.empty() : Optional.of(paymentReference);
	}

	public TradeSettlement2 setPaymentReference(CreditorReferenceInformation2 paymentReference) {
		this.paymentReference = paymentReference;
		return this;
	}

	public Optional<ISODate> getDueDate() {
		return dueDate == null ? Optional.empty() : Optional.of(dueDate);
	}

	public TradeSettlement2 setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public CurrencyAndAmount getDuePayableAmount() {
		return duePayableAmount;
	}

	public TradeSettlement2 setDuePayableAmount(CurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = Objects.requireNonNull(duePayableAmount);
		return this;
	}

	public Optional<CurrencyReference3> getInvoiceCurrencyExchange() {
		return invoiceCurrencyExchange == null ? Optional.empty() : Optional.of(invoiceCurrencyExchange);
	}

	public TradeSettlement2 setInvoiceCurrencyExchange(CurrencyReference3 invoiceCurrencyExchange) {
		this.invoiceCurrencyExchange = invoiceCurrencyExchange;
		return this;
	}

	public Optional<ISODate> getDeliveryDate() {
		return deliveryDate == null ? Optional.empty() : Optional.of(deliveryDate);
	}

	public TradeSettlement2 setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	public Optional<Period2> getBillingPeriod() {
		return billingPeriod == null ? Optional.empty() : Optional.of(billingPeriod);
	}

	public TradeSettlement2 setBillingPeriod(Period2 billingPeriod) {
		this.billingPeriod = billingPeriod;
		return this;
	}

	public CurrencyAndAmount getTaxTotalAmount() {
		return taxTotalAmount;
	}

	public TradeSettlement2 setTaxTotalAmount(CurrencyAndAmount taxTotalAmount) {
		this.taxTotalAmount = Objects.requireNonNull(taxTotalAmount);
		return this;
	}

	public Optional<Max4Text> getExemptionReasonCode() {
		return exemptionReasonCode == null ? Optional.empty() : Optional.of(exemptionReasonCode);
	}

	public TradeSettlement2 setExemptionReasonCode(Max4Text exemptionReasonCode) {
		this.exemptionReasonCode = exemptionReasonCode;
		return this;
	}

	public Optional<Max500Text> getExemptionReason() {
		return exemptionReason == null ? Optional.empty() : Optional.of(exemptionReason);
	}

	public TradeSettlement2 setExemptionReason(Max500Text exemptionReason) {
		this.exemptionReason = exemptionReason;
		return this;
	}

	public List<SettlementSubTotalCalculatedTax2> getSubTotalCalculatedTax() {
		return subTotalCalculatedTax == null ? subTotalCalculatedTax = new ArrayList<>() : subTotalCalculatedTax;
	}

	public TradeSettlement2 setSubTotalCalculatedTax(List<SettlementSubTotalCalculatedTax2> subTotalCalculatedTax) {
		this.subTotalCalculatedTax = Objects.requireNonNull(subTotalCalculatedTax);
		return this;
	}

	public List<EarlyPayment1> getEarlyPayments() {
		return earlyPayments == null ? earlyPayments = new ArrayList<>() : earlyPayments;
	}

	public TradeSettlement2 setEarlyPayments(List<EarlyPayment1> earlyPayments) {
		this.earlyPayments = Objects.requireNonNull(earlyPayments);
		return this;
	}
}