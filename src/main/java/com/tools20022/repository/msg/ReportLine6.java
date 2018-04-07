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
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.PurchaseOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Adjustment6;
import com.tools20022.repository.msg.InvoiceIdentification1;
import com.tools20022.repository.msg.ReportLine7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a payment against a commercial invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportLine6#mmCommercialDocumentReference
 * ReportLine6.mmCommercialDocumentReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#mmAdjustment
 * ReportLine6.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#mmNetAmount
 * ReportLine6.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportLine6#mmBreakdownByPurchaseOrder
 * ReportLine6.mmBreakdownByPurchaseOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
 * PurchaseOrder}</li>
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
 * "ReportLine6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a payment against a commercial invoice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportLine6", propOrder = {"commercialDocumentReference", "adjustment", "netAmount", "breakdownByPurchaseOrder"})
public class ReportLine6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ComrclDocRef", required = true)
	protected InvoiceIdentification1 commercialDocumentReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1
	 * InvoiceIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
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
	public static final MMMessageAttribute<ReportLine6, InvoiceIdentification1> mmCommercialDocumentReference = new MMMessageAttribute<ReportLine6, InvoiceIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportLine6.mmObject();
			isDerived = false;
			xmlTag = "ComrclDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDocumentReference";
			definition = "Reference to the identification of the underlying commercial document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvoiceIdentification1.mmObject();
		}

		@Override
		public InvoiceIdentification1 getValue(ReportLine6 obj) {
			return obj.getCommercialDocumentReference();
		}

		@Override
		public void setValue(ReportLine6 obj, InvoiceIdentification1 value) {
			obj.setCommercialDocumentReference(value);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
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
	 * definition} =
	 * "Specifies the adjustments applied to obtain the net amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportLine6, List<Adjustment6>> mmAdjustment = new MMMessageAssociationEnd<ReportLine6, List<Adjustment6>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportLine6.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments applied to obtain the net amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Adjustment6.mmObject();
		}

		@Override
		public List<Adjustment6> getValue(ReportLine6 obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(ReportLine6 obj, List<Adjustment6> value) {
			obj.setAdjustment(value);
		}
	};
	@XmlElement(name = "NetAmt", required = true)
	protected CurrencyAndAmount netAmount;
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
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetAmount
	 * LineItem.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net amount, after adjustments, intended to be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportLine6, CurrencyAndAmount> mmNetAmount = new MMMessageAttribute<ReportLine6, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportLine6.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Net amount, after adjustments, intended to be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(ReportLine6 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(ReportLine6 obj, CurrencyAndAmount value) {
			obj.setNetAmount(value);
		}
	};
	@XmlElement(name = "BrkdwnByPurchsOrdr", required = true)
	protected List<ReportLine7> breakdownByPurchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportLine7
	 * ReportLine7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByPurchsOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the net amount to be paid is related to different purchase orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportLine6, List<ReportLine7>> mmBreakdownByPurchaseOrder = new MMMessageAttribute<ReportLine6, List<ReportLine7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportLine6.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByPurchsOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByPurchaseOrder";
			definition = "Specifies how the net amount to be paid is related to different purchase orders.";
			minOccurs = 1;
			complexType_lazy = () -> ReportLine7.mmObject();
		}

		@Override
		public List<ReportLine7> getValue(ReportLine6 obj) {
			return obj.getBreakdownByPurchaseOrder();
		}

		@Override
		public void setValue(ReportLine6 obj, List<ReportLine7> value) {
			obj.setBreakdownByPurchaseOrder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportLine6.mmCommercialDocumentReference, com.tools20022.repository.msg.ReportLine6.mmAdjustment,
						com.tools20022.repository.msg.ReportLine6.mmNetAmount, com.tools20022.repository.msg.ReportLine6.mmBreakdownByPurchaseOrder);
				trace_lazy = () -> PurchaseOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportLine6";
				definition = "Information about a payment against a commercial invoice.";
			}
		});
		return mmObject_lazy.get();
	}

	public InvoiceIdentification1 getCommercialDocumentReference() {
		return commercialDocumentReference;
	}

	public ReportLine6 setCommercialDocumentReference(InvoiceIdentification1 commercialDocumentReference) {
		this.commercialDocumentReference = Objects.requireNonNull(commercialDocumentReference);
		return this;
	}

	public List<Adjustment6> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public ReportLine6 setAdjustment(List<Adjustment6> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public ReportLine6 setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public List<ReportLine7> getBreakdownByPurchaseOrder() {
		return breakdownByPurchaseOrder == null ? breakdownByPurchaseOrder = new ArrayList<>() : breakdownByPurchaseOrder;
	}

	public ReportLine6 setBreakdownByPurchaseOrder(List<ReportLine7> breakdownByPurchaseOrder) {
		this.breakdownByPurchaseOrder = Objects.requireNonNull(breakdownByPurchaseOrder);
		return this;
	}
}