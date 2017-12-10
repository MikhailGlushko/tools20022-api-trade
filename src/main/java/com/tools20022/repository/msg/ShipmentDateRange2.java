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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a shipment schedule, that is the quantity that must be shipped no
 * sooner than the earliest shipment date and no later than the latest shipment
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmSubQuantityValue
 * ShipmentDateRange2.mmSubQuantityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmEarliestShipmentDate
 * ShipmentDateRange2.mmEarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmLatestShipmentDate
 * ShipmentDateRange2.mmLatestShipmentDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
 * ShipmentDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ShipmentDateRange2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a shipment schedule, that is the quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ShipmentDateRange2", propOrder = {"subQuantityValue", "earliestShipmentDate", "latestShipmentDate"})
public class ShipmentDateRange2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber subQuantityValue;
	/**
	 * Sub quantity that must be shipped no sooner than the earliest shipment
	 * date and no later than the latest shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubQtyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubQuantityValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubQuantityValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "SubQtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubQuantityValue";
			definition = "Sub quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected ISODate earliestShipmentDate;
	/**
	 * Earliest date whereby the goods must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmEarliestShipmentDate
	 * ShipmentDateRange.mmEarliestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestShipmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmEarliestShipmentDate;
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "EarlstShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate latestShipmentDate;
	/**
	 * Latest date whereby the goods must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmLatestShipmentDate
	 * ShipmentDateRange.mmLatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2
	 * ShipmentDateRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLatestShipmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmLatestShipmentDate;
			componentContext_lazy = () -> ShipmentDateRange2.mmObject();
			isDerived = false;
			xmlTag = "LatstShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ShipmentDateRange2.mmSubQuantityValue, ShipmentDateRange2.mmEarliestShipmentDate, ShipmentDateRange2.mmLatestShipmentDate);
				trace_lazy = () -> ShipmentDateRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange2";
				definition = "Specifies a shipment schedule, that is the quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SubQtyVal", required = true)
	public DecimalNumber getSubQuantityValue() {
		return subQuantityValue;
	}

	public void setSubQuantityValue(DecimalNumber subQuantityValue) {
		this.subQuantityValue = subQuantityValue;
	}

	@XmlElement(name = "EarlstShipmntDt")
	public ISODate getEarliestShipmentDate() {
		return earliestShipmentDate;
	}

	public void setEarliestShipmentDate(ISODate earliestShipmentDate) {
		this.earliestShipmentDate = earliestShipmentDate;
	}

	@XmlElement(name = "LatstShipmntDt")
	public ISODate getLatestShipmentDate() {
		return latestShipmentDate;
	}

	public void setLatestShipmentDate(ISODate latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
	}
}