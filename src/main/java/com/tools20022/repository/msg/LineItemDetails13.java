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
import com.tools20022.repository.choice.ProductCategory1Choice;
import com.tools20022.repository.choice.ProductCharacteristics1Choice;
import com.tools20022.repository.choice.ProductIdentifier2Choice;
import com.tools20022.repository.choice.ShipmentSchedule2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max70Text;
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
 * Goods or services that are part of a commercial trade agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmLineItemIdentification
 * LineItemDetails13.mmLineItemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmQuantity
 * LineItemDetails13.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmQuantityTolerance
 * LineItemDetails13.mmQuantityTolerance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmUnitPrice
 * LineItemDetails13.mmUnitPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmPriceTolerance
 * LineItemDetails13.mmPriceTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductName
 * LineItemDetails13.mmProductName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductIdentifier
 * LineItemDetails13.mmProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCharacteristics
 * LineItemDetails13.mmProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCategory
 * LineItemDetails13.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductOrigin
 * LineItemDetails13.mmProductOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmShipmentSchedule
 * LineItemDetails13.mmShipmentSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmRoutingSummary
 * LineItemDetails13.mmRoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmAdjustment
 * LineItemDetails13.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmFreightCharges
 * LineItemDetails13.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmTax
 * LineItemDetails13.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmTotalAmount
 * LineItemDetails13.mmTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmIncoterms
 * LineItemDetails13.mmIncoterms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProductOriginBPORule#forLineItemDetails13
 * ConstraintProductOriginBPORule.forLineItemDetails13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItemDetails13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Goods or services that are part of a commercial trade agreement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItemDetails13", propOrder = {"lineItemIdentification", "quantity", "quantityTolerance", "unitPrice", "priceTolerance", "productName", "productIdentifier", "productCharacteristics", "productCategory", "productOrigin",
		"shipmentSchedule", "routingSummary", "adjustment", "freightCharges", "tax", "totalAmount", "incoterms"})
public class LineItemDetails13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LineItmId", required = true)
	protected Max70Text lineItemIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned to a line item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails13, Max70Text> mmLineItemIdentification = new MMMessageAttribute<LineItemDetails13, Max70Text>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Identification assigned to a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(LineItemDetails13 obj) {
			return obj.getLineItemIdentification();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Max70Text value) {
			obj.setLineItemIdentification(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected Quantity9 quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of goods on a line in a trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, Quantity9> mmQuantity = new MMMessageAssociationEnd<LineItemDetails13, Quantity9>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of goods on a line in a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity9.mmObject();
		}

		@Override
		public Quantity9 getValue(LineItemDetails13 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Quantity9 value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "QtyTlrnce")
	protected PercentageTolerance1 quantityTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentageTolerance1
	 * PercentageTolerance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
	 * ProductQuantity.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyTlrnce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed in the quantity of goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<PercentageTolerance1>> mmQuantityTolerance = new MMMessageAssociationEnd<LineItemDetails13, Optional<PercentageTolerance1>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmQuantityTolerance;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "QtyTlrnce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PercentageTolerance1.mmObject();
		}

		@Override
		public Optional<PercentageTolerance1> getValue(LineItemDetails13 obj) {
			return obj.getQuantityTolerance();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<PercentageTolerance1> value) {
			obj.setQuantityTolerance(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitPric")
	protected UnitPrice18 unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice18
	 * UnitPrice18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<UnitPrice18>> mmUnitPrice = new MMMessageAssociationEnd<LineItemDetails13, Optional<UnitPrice18>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice18.mmObject();
		}

		@Override
		public Optional<UnitPrice18> getValue(LineItemDetails13 obj) {
			return obj.getUnitPrice();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<UnitPrice18> value) {
			obj.setUnitPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "PricTlrnce")
	protected PercentageTolerance1 priceTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentageTolerance1
	 * PercentageTolerance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
	 * Price.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTlrnce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed on a price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<PercentageTolerance1>> mmPriceTolerance = new MMMessageAssociationEnd<LineItemDetails13, Optional<PercentageTolerance1>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceTolerance;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PricTlrnce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTolerance";
			definition = "Variance allowed on a price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PercentageTolerance1.mmObject();
		}

		@Override
		public Optional<PercentageTolerance1> getValue(LineItemDetails13 obj) {
			return obj.getPriceTolerance();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<PercentageTolerance1> value) {
			obj.setPriceTolerance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctNm")
	protected Max70Text productName;
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
	 * {@linkplain com.tools20022.repository.entity.Product#mmName
	 * Product.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the product detailed in the corresponding line item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails13, Optional<Max70Text>> mmProductName = new MMMessageAttribute<LineItemDetails13, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PdctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductName";
			definition = "Name of the product detailed in the corresponding line item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(LineItemDetails13 obj) {
			return obj.getProductName();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<Max70Text> value) {
			obj.setProductName(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctIdr")
	protected List<ProductIdentifier2Choice> productIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice
	 * ProductIdentifier2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
	 * Product.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product of the corresponding line item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, List<ProductIdentifier2Choice>> mmProductIdentifier = new MMMessageAssociationEnd<LineItemDetails13, List<ProductIdentifier2Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentifier";
			definition = "Identifies the product of the corresponding line item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductIdentifier2Choice.mmObject();
		}

		@Override
		public List<ProductIdentifier2Choice> getValue(LineItemDetails13 obj) {
			return obj.getProductIdentifier();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<ProductIdentifier2Choice> value) {
			obj.setProductIdentifier(value);
		}
	};
	@XmlElement(name = "PdctChrtcs")
	protected List<ProductCharacteristics1Choice> productCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice
	 * ProductCharacteristics1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
	 * Product.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the characteristics of a product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, List<ProductCharacteristics1Choice>> mmProductCharacteristics = new MMMessageAssociationEnd<LineItemDetails13, List<ProductCharacteristics1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristics of a product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCharacteristics1Choice.mmObject();
		}

		@Override
		public List<ProductCharacteristics1Choice> getValue(LineItemDetails13 obj) {
			return obj.getProductCharacteristics();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<ProductCharacteristics1Choice> value) {
			obj.setProductCharacteristics(value);
		}
	};
	@XmlElement(name = "PdctCtgy")
	protected List<ProductCategory1Choice> productCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice
	 * ProductCategory1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the category of product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, List<ProductCategory1Choice>> mmProductCategory = new MMMessageAssociationEnd<LineItemDetails13, List<ProductCategory1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Identifies the category of product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCategory1Choice.mmObject();
		}

		@Override
		public List<ProductCategory1Choice> getValue(LineItemDetails13 obj) {
			return obj.getProductCategory();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<ProductCategory1Choice> value) {
			obj.setProductCategory(value);
		}
	};
	@XmlElement(name = "PdctOrgn")
	protected List<CountryCode> productOrigin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctOrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country from which the product originates."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails13, List<CountryCode>> mmProductOrigin = new MMMessageAttribute<LineItemDetails13, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "PdctOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductOrigin";
			definition = "Country from which the product originates.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(LineItemDetails13 obj) {
			return obj.getProductOrigin();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<CountryCode> value) {
			obj.setProductOrigin(value);
		}
	};
	@XmlElement(name = "ShipmntSchdl")
	protected ShipmentSchedule2Choice shipmentSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice
	 * ShipmentSchedule2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the shipment schedule for the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<ShipmentSchedule2Choice>> mmShipmentSchedule = new MMMessageAssociationEnd<LineItemDetails13, Optional<ShipmentSchedule2Choice>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "ShipmntSchdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentSchedule";
			definition = "Specifies the shipment schedule for the goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ShipmentSchedule2Choice.mmObject();
		}

		@Override
		public Optional<ShipmentSchedule2Choice> getValue(LineItemDetails13 obj) {
			return obj.getShipmentSchedule();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<ShipmentSchedule2Choice> value) {
			obj.setShipmentSchedule(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
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
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<TransportMeans5>> mmRoutingSummary = new MMMessageAssociationEnd<LineItemDetails13, Optional<TransportMeans5>>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
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
		public Optional<TransportMeans5> getValue(LineItemDetails13 obj) {
			return obj.getRoutingSummary();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<TransportMeans5> value) {
			obj.setRoutingSummary(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
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
	public static final MMMessageAssociationEnd<LineItemDetails13, List<Adjustment7>> mmAdjustment = new MMMessageAssociationEnd<LineItemDetails13, List<Adjustment7>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
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
		public List<Adjustment7> getValue(LineItemDetails13 obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<Adjustment7> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
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
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<Charge24>> mmFreightCharges = new MMMessageAssociationEnd<LineItemDetails13, Optional<Charge24>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
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
		public Optional<Charge24> getValue(LineItemDetails13 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<Charge24> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
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
	public static final MMMessageAssociationEnd<LineItemDetails13, List<Tax23>> mmTax = new MMMessageAssociationEnd<LineItemDetails13, List<Tax23>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
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
		public List<Tax23> getValue(LineItemDetails13 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(LineItemDetails13 obj, List<Tax23> value) {
			obj.setTax(value);
		}
	};
	@XmlElement(name = "TtlAmt", required = true)
	protected CurrencyAndAmount totalAmount;
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the line item after adjustments have been applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails13, CurrencyAndAmount> mmTotalAmount = new MMMessageAttribute<LineItemDetails13, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the line item after adjustments have been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItemDetails13 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(LineItemDetails13 obj, CurrencyAndAmount value) {
			obj.setTotalAmount(value);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13
	 * LineItemDetails13}</li>
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
	public static final MMMessageAssociationEnd<LineItemDetails13, Optional<Incoterms4>> mmIncoterms = new MMMessageAssociationEnd<LineItemDetails13, Optional<Incoterms4>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails13.mmObject();
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
		public Optional<Incoterms4> getValue(LineItemDetails13 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(LineItemDetails13 obj, Optional<Incoterms4> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails13.mmLineItemIdentification, com.tools20022.repository.msg.LineItemDetails13.mmQuantity,
						com.tools20022.repository.msg.LineItemDetails13.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails13.mmUnitPrice, com.tools20022.repository.msg.LineItemDetails13.mmPriceTolerance,
						com.tools20022.repository.msg.LineItemDetails13.mmProductName, com.tools20022.repository.msg.LineItemDetails13.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails13.mmProductCharacteristics,
						com.tools20022.repository.msg.LineItemDetails13.mmProductCategory, com.tools20022.repository.msg.LineItemDetails13.mmProductOrigin, com.tools20022.repository.msg.LineItemDetails13.mmShipmentSchedule,
						com.tools20022.repository.msg.LineItemDetails13.mmRoutingSummary, com.tools20022.repository.msg.LineItemDetails13.mmAdjustment, com.tools20022.repository.msg.LineItemDetails13.mmFreightCharges,
						com.tools20022.repository.msg.LineItemDetails13.mmTax, com.tools20022.repository.msg.LineItemDetails13.mmTotalAmount, com.tools20022.repository.msg.LineItemDetails13.mmIncoterms);
				trace_lazy = () -> LineItem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProductOriginBPORule.forLineItemDetails13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItemDetails13";
				definition = "Goods or services that are part of a commercial trade agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getLineItemIdentification() {
		return lineItemIdentification;
	}

	public LineItemDetails13 setLineItemIdentification(Max70Text lineItemIdentification) {
		this.lineItemIdentification = Objects.requireNonNull(lineItemIdentification);
		return this;
	}

	public Quantity9 getQuantity() {
		return quantity;
	}

	public LineItemDetails13 setQuantity(Quantity9 quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<PercentageTolerance1> getQuantityTolerance() {
		return quantityTolerance == null ? Optional.empty() : Optional.of(quantityTolerance);
	}

	public LineItemDetails13 setQuantityTolerance(PercentageTolerance1 quantityTolerance) {
		this.quantityTolerance = quantityTolerance;
		return this;
	}

	public Optional<UnitPrice18> getUnitPrice() {
		return unitPrice == null ? Optional.empty() : Optional.of(unitPrice);
	}

	public LineItemDetails13 setUnitPrice(UnitPrice18 unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public Optional<PercentageTolerance1> getPriceTolerance() {
		return priceTolerance == null ? Optional.empty() : Optional.of(priceTolerance);
	}

	public LineItemDetails13 setPriceTolerance(PercentageTolerance1 priceTolerance) {
		this.priceTolerance = priceTolerance;
		return this;
	}

	public Optional<Max70Text> getProductName() {
		return productName == null ? Optional.empty() : Optional.of(productName);
	}

	public LineItemDetails13 setProductName(Max70Text productName) {
		this.productName = productName;
		return this;
	}

	public List<ProductIdentifier2Choice> getProductIdentifier() {
		return productIdentifier == null ? productIdentifier = new ArrayList<>() : productIdentifier;
	}

	public LineItemDetails13 setProductIdentifier(List<ProductIdentifier2Choice> productIdentifier) {
		this.productIdentifier = Objects.requireNonNull(productIdentifier);
		return this;
	}

	public List<ProductCharacteristics1Choice> getProductCharacteristics() {
		return productCharacteristics == null ? productCharacteristics = new ArrayList<>() : productCharacteristics;
	}

	public LineItemDetails13 setProductCharacteristics(List<ProductCharacteristics1Choice> productCharacteristics) {
		this.productCharacteristics = Objects.requireNonNull(productCharacteristics);
		return this;
	}

	public List<ProductCategory1Choice> getProductCategory() {
		return productCategory == null ? productCategory = new ArrayList<>() : productCategory;
	}

	public LineItemDetails13 setProductCategory(List<ProductCategory1Choice> productCategory) {
		this.productCategory = Objects.requireNonNull(productCategory);
		return this;
	}

	public List<CountryCode> getProductOrigin() {
		return productOrigin == null ? productOrigin = new ArrayList<>() : productOrigin;
	}

	public LineItemDetails13 setProductOrigin(List<CountryCode> productOrigin) {
		this.productOrigin = Objects.requireNonNull(productOrigin);
		return this;
	}

	public Optional<ShipmentSchedule2Choice> getShipmentSchedule() {
		return shipmentSchedule == null ? Optional.empty() : Optional.of(shipmentSchedule);
	}

	public LineItemDetails13 setShipmentSchedule(ShipmentSchedule2Choice shipmentSchedule) {
		this.shipmentSchedule = shipmentSchedule;
		return this;
	}

	public Optional<TransportMeans5> getRoutingSummary() {
		return routingSummary == null ? Optional.empty() : Optional.of(routingSummary);
	}

	public LineItemDetails13 setRoutingSummary(TransportMeans5 routingSummary) {
		this.routingSummary = routingSummary;
		return this;
	}

	public List<Adjustment7> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public LineItemDetails13 setAdjustment(List<Adjustment7> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Charge24> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public LineItemDetails13 setFreightCharges(Charge24 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public List<Tax23> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItemDetails13 setTax(List<Tax23> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public LineItemDetails13 setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public LineItemDetails13 setIncoterms(Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}
}