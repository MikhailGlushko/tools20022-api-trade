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
import com.tools20022.repository.datatype.Max70Text;
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
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmGoodsAndOrServicesDescription
 * LineItem13.mmGoodsAndOrServicesDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmPartialShipment
 * LineItem13.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTransShipment
 * LineItem13.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmShipmentDateRange
 * LineItem13.mmShipmentDateRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemDetails
 * LineItem13.mmLineItemDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemsTotalAmount
 * LineItem13.mmLineItemsTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmRoutingSummary
 * LineItem13.mmRoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmIncoterms
 * LineItem13.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmAdjustment
 * LineItem13.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmFreightCharges
 * LineItem13.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTax
 * LineItem13.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTotalNetAmount
 * LineItem13.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmBuyerDefinedInformation
 * LineItem13.mmBuyerDefinedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem13#mmSellerDefinedInformation
 * LineItem13.mmSellerDefinedInformation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule#forLineItem13
 * ConstraintLatestShipmentDateRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRoutingSummaryRule#forLineItem13
 * ConstraintRoutingSummaryRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem13
 * ConstraintIncotermsRule.forLineItem13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem13
 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem13", propOrder = {"goodsAndOrServicesDescription", "partialShipment", "transShipment", "shipmentDateRange", "lineItemDetails", "lineItemsTotalAmount", "routingSummary", "incoterms", "adjustment", "freightCharges",
		"tax", "totalNetAmount", "buyerDefinedInformation", "sellerDefinedInformation"})
public class LineItem13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GoodsAndOrSvcsDesc")
	protected Max70Text goodsAndOrServicesDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoodsAndOrSvcsDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodsAndOrServicesDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem13, Optional<Max70Text>> mmGoodsAndOrServicesDescription = new MMMessageAttribute<LineItem13, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "GoodsAndOrSvcsDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodsAndOrServicesDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(LineItem13 obj) {
			return obj.getGoodsAndOrServicesDescription();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<Max70Text> value) {
			obj.setGoodsAndOrServicesDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlShipmnt", required = true)
	protected YesNoIndicator partialShipment;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
	 * Transport.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlShipmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem13, YesNoIndicator> mmPartialShipment = new MMMessageAttribute<LineItem13, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPartialShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "PrtlShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(LineItem13 obj) {
			return obj.getPartialShipment();
		}

		@Override
		public void setValue(LineItem13 obj, YesNoIndicator value) {
			obj.setPartialShipment(value);
		}
	};
	@XmlElement(name = "TrnsShipmnt")
	protected YesNoIndicator transShipment;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
	 * Transport.mmTransShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsShipmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem13, Optional<YesNoIndicator>> mmTransShipment = new MMMessageAttribute<LineItem13, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "TrnsShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(LineItem13 obj) {
			return obj.getTransShipment();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<YesNoIndicator> value) {
			obj.setTransShipment(value.orElse(null));
		}
	};
	@XmlElement(name = "ShipmntDtRg")
	protected ShipmentDateRange1 shipmentDateRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ShipmentDateRange1
	 * ShipmentDateRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntDtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an earliest shipment date and a latest shipment date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem13, Optional<ShipmentDateRange1>> mmShipmentDateRange = new MMMessageAssociationEnd<LineItem13, Optional<ShipmentDateRange1>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "ShipmntDtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentDateRange";
			definition = "Specifies an earliest shipment date and a latest shipment date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ShipmentDateRange1.mmObject();
		}

		@Override
		public Optional<ShipmentDateRange1> getValue(LineItem13 obj) {
			return obj.getShipmentDateRange();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<ShipmentDateRange1> value) {
			obj.setShipmentDateRange(value.orElse(null));
		}
	};
	@XmlElement(name = "LineItmDtls", required = true)
	protected List<LineItemDetails13> lineItemDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods or services that are purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem13, List<LineItemDetails13>> mmLineItemDetails = new MMMessageAssociationEnd<LineItem13, List<LineItemDetails13>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "LineItmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemDetails";
			definition = "Goods or services that are purchased.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LineItemDetails13.mmObject();
		}

		@Override
		public List<LineItemDetails13> getValue(LineItem13 obj) {
			return obj.getLineItemDetails();
		}

		@Override
		public void setValue(LineItem13 obj, List<LineItemDetails13> value) {
			obj.setLineItemDetails(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAttribute<LineItem13, CurrencyAndAmount> mmLineItemsTotalAmount = new MMMessageAttribute<LineItem13, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
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
		public CurrencyAndAmount getValue(LineItem13 obj) {
			return obj.getLineItemsTotalAmount();
		}

		@Override
		public void setValue(LineItem13 obj, CurrencyAndAmount value) {
			obj.setLineItemsTotalAmount(value);
		}
	};
	@XmlElement(name = "RtgSummry")
	protected TransportMeans5 routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans5
	 * TransportMeans5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem13, Optional<TransportMeans5>> mmRoutingSummary = new MMMessageAssociationEnd<LineItem13, Optional<TransportMeans5>>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportMeans5.mmObject();
		}

		@Override
		public Optional<TransportMeans5> getValue(LineItem13 obj) {
			return obj.getRoutingSummary();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<TransportMeans5> value) {
			obj.setRoutingSummary(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * "Specifies the applicable Incoterms and associated location. Latest version of Incoterms in effect at the date of message creation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem13, Optional<Incoterms4>> mmIncoterms = new MMMessageAssociationEnd<LineItem13, Optional<Incoterms4>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterms and associated location. Latest version of Incoterms in effect at the date of message creation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms4.mmObject();
		}

		@Override
		public Optional<Incoterms4> getValue(LineItem13 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<Incoterms4> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};
	@XmlElement(name = "Adjstmnt")
	protected List<Adjustment7> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Adjustment7
	 * Adjustment7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAssociationEnd<LineItem13, List<Adjustment7>> mmAdjustment = new MMMessageAssociationEnd<LineItem13, List<Adjustment7>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Variance on price for the goods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Adjustment7.mmObject();
		}

		@Override
		public List<Adjustment7> getValue(LineItem13 obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(LineItem13 obj, List<Adjustment7> value) {
			obj.setAdjustment(value);
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge24 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge24 Charge24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	 * definition} = "Maximum charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem13, Optional<Charge24>> mmFreightCharges = new MMMessageAssociationEnd<LineItem13, Optional<Charge24>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Maximum charges related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge24.mmObject();
		}

		@Override
		public Optional<Charge24> getValue(LineItem13 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(LineItem13 obj, Optional<Charge24> value) {
			obj.setFreightCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected List<Tax23> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax23 Tax23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAssociationEnd<LineItem13, List<Tax23>> mmTax = new MMMessageAssociationEnd<LineItem13, List<Tax23>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax23.mmObject();
		}

		@Override
		public List<Tax23> getValue(LineItem13 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(LineItem13 obj, List<Tax23> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAttribute<LineItem13, CurrencyAndAmount> mmTotalNetAmount = new MMMessageAttribute<LineItem13, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
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
		public CurrencyAndAmount getValue(LineItem13 obj) {
			return obj.getTotalNetAmount();
		}

		@Override
		public void setValue(LineItem13 obj, CurrencyAndAmount value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAssociationEnd<LineItem13, List<UserDefinedInformation1>> mmBuyerDefinedInformation = new MMMessageAssociationEnd<LineItem13, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
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
		public List<UserDefinedInformation1> getValue(LineItem13 obj) {
			return obj.getBuyerDefinedInformation();
		}

		@Override
		public void setValue(LineItem13 obj, List<UserDefinedInformation1> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem13
	 * LineItem13}</li>
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
	public static final MMMessageAssociationEnd<LineItem13, List<UserDefinedInformation1>> mmSellerDefinedInformation = new MMMessageAssociationEnd<LineItem13, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem13.mmObject();
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
		public List<UserDefinedInformation1> getValue(LineItem13 obj) {
			return obj.getSellerDefinedInformation();
		}

		@Override
		public void setValue(LineItem13 obj, List<UserDefinedInformation1> value) {
			obj.setSellerDefinedInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem13.mmGoodsAndOrServicesDescription, com.tools20022.repository.msg.LineItem13.mmPartialShipment,
						com.tools20022.repository.msg.LineItem13.mmTransShipment, com.tools20022.repository.msg.LineItem13.mmShipmentDateRange, com.tools20022.repository.msg.LineItem13.mmLineItemDetails,
						com.tools20022.repository.msg.LineItem13.mmLineItemsTotalAmount, com.tools20022.repository.msg.LineItem13.mmRoutingSummary, com.tools20022.repository.msg.LineItem13.mmIncoterms,
						com.tools20022.repository.msg.LineItem13.mmAdjustment, com.tools20022.repository.msg.LineItem13.mmFreightCharges, com.tools20022.repository.msg.LineItem13.mmTax,
						com.tools20022.repository.msg.LineItem13.mmTotalNetAmount, com.tools20022.repository.msg.LineItem13.mmBuyerDefinedInformation, com.tools20022.repository.msg.LineItem13.mmSellerDefinedInformation);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule.forLineItem13, com.tools20022.repository.constraints.ConstraintRoutingSummaryRule.forLineItem13,
						com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem13, com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItem13";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max70Text> getGoodsAndOrServicesDescription() {
		return goodsAndOrServicesDescription == null ? Optional.empty() : Optional.of(goodsAndOrServicesDescription);
	}

	public LineItem13 setGoodsAndOrServicesDescription(Max70Text goodsAndOrServicesDescription) {
		this.goodsAndOrServicesDescription = goodsAndOrServicesDescription;
		return this;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public LineItem13 setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = Objects.requireNonNull(partialShipment);
		return this;
	}

	public Optional<YesNoIndicator> getTransShipment() {
		return transShipment == null ? Optional.empty() : Optional.of(transShipment);
	}

	public LineItem13 setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = transShipment;
		return this;
	}

	public Optional<ShipmentDateRange1> getShipmentDateRange() {
		return shipmentDateRange == null ? Optional.empty() : Optional.of(shipmentDateRange);
	}

	public LineItem13 setShipmentDateRange(ShipmentDateRange1 shipmentDateRange) {
		this.shipmentDateRange = shipmentDateRange;
		return this;
	}

	public List<LineItemDetails13> getLineItemDetails() {
		return lineItemDetails == null ? lineItemDetails = new ArrayList<>() : lineItemDetails;
	}

	public LineItem13 setLineItemDetails(List<LineItemDetails13> lineItemDetails) {
		this.lineItemDetails = Objects.requireNonNull(lineItemDetails);
		return this;
	}

	public CurrencyAndAmount getLineItemsTotalAmount() {
		return lineItemsTotalAmount;
	}

	public LineItem13 setLineItemsTotalAmount(CurrencyAndAmount lineItemsTotalAmount) {
		this.lineItemsTotalAmount = Objects.requireNonNull(lineItemsTotalAmount);
		return this;
	}

	public Optional<TransportMeans5> getRoutingSummary() {
		return routingSummary == null ? Optional.empty() : Optional.of(routingSummary);
	}

	public LineItem13 setRoutingSummary(TransportMeans5 routingSummary) {
		this.routingSummary = routingSummary;
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public LineItem13 setIncoterms(Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}

	public List<Adjustment7> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public LineItem13 setAdjustment(List<Adjustment7> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Charge24> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public LineItem13 setFreightCharges(Charge24 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public List<Tax23> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItem13 setTax(List<Tax23> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public LineItem13 setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<UserDefinedInformation1> getBuyerDefinedInformation() {
		return buyerDefinedInformation == null ? buyerDefinedInformation = new ArrayList<>() : buyerDefinedInformation;
	}

	public LineItem13 setBuyerDefinedInformation(List<UserDefinedInformation1> buyerDefinedInformation) {
		this.buyerDefinedInformation = Objects.requireNonNull(buyerDefinedInformation);
		return this;
	}

	public List<UserDefinedInformation1> getSellerDefinedInformation() {
		return sellerDefinedInformation == null ? sellerDefinedInformation = new ArrayList<>() : sellerDefinedInformation;
	}

	public LineItem13 setSellerDefinedInformation(List<UserDefinedInformation1> sellerDefinedInformation) {
		this.sellerDefinedInformation = Objects.requireNonNull(sellerDefinedInformation);
		return this;
	}
}