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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportByRail;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the transportation of goods by rail.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfReceipt
 * TransportByRail5.mmPlaceOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfDelivery
 * TransportByRail5.mmPlaceOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmRailCarrierName
 * TransportByRail5.mmRailCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmRailCarrierCountry
 * TransportByRail5.mmRailCarrierCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmCarrierAgentName
 * TransportByRail5.mmCarrierAgentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmCarrierAgentCountry
 * TransportByRail5.mmCarrierAgentCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportByRail
 * TransportByRail}</li>
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
 * "TransportByRail5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by rail."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransportByRail4 TransportByRail4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransportByRail5", propOrder = {"placeOfReceipt", "placeOfDelivery", "railCarrierName", "railCarrierCountry", "carrierAgentName", "carrierAgentCountry"})
public class TransportByRail5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> placeOfReceipt;
	/**
	 * Identifies the location where the goods are received for transportation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfRct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the location where the goods are received for transportation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfReceipt
	 * TransportByRail4.mmPlaceOfReceipt}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfReceipt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "PlcOfRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfReceipt";
			definition = "Identifies the location where the goods are received for transportation.";
			previousVersion_lazy = () -> TransportByRail4.mmPlaceOfReceipt;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> placeOfDelivery;
	/**
	 * Identifies the location of delivery of the goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfDlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the location of delivery of the goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfDelivery
	 * TransportByRail4.mmPlaceOfDelivery}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfDelivery = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "PlcOfDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfDelivery";
			definition = "Identifies the location of delivery of the goods.";
			previousVersion_lazy = () -> TransportByRail4.mmPlaceOfDelivery;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text railCarrierName;
	/**
	 * Identifies the party that is responsible for the conveyance of the goods
	 * from one place to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RailCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RailCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmRailCarrierName
	 * TransportByRail4.mmRailCarrierName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRailCarrierName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "RailCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RailCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			previousVersion_lazy = () -> TransportByRail4.mmRailCarrierName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode railCarrierCountry;
	/**
	 * Country in which the carrier of the goods, for example, shipping company,
	 * is located or registered.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RailCrrierCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RailCarrierCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the carrier of the goods, for example, shipping company, is located or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmRailCarrierCountry
	 * TransportByRail4.mmRailCarrierCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRailCarrierCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "RailCrrierCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RailCarrierCountry";
			definition = "Country in which the carrier of the goods, for example, shipping company, is located or registered.";
			previousVersion_lazy = () -> TransportByRail4.mmRailCarrierCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max70Text carrierAgentName;
	/**
	 * Name of the carrier's (for example, shipping company's) agent that acts
	 * on behalf of the carrier and may be the issuer of transport documents
	 * relating to the underlying shipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrierAgtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierAgentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmCarrierAgentName
	 * TransportByRail4.mmCarrierAgentName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentName";
			definition = "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> TransportByRail4.mmCarrierAgentName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode carrierAgentCountry;
	/**
	 * Country of registration of the carrier's (for example, shipping
	 * company's) agent that acts on behalf of the carrier and may be the issuer
	 * of transport documents relating to the underlying shipment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrierAgtCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierAgentCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmCarrierAgentCountry
	 * TransportByRail4.mmCarrierAgentCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> TransportByRail5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentCountry";
			definition = "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> TransportByRail4.mmCarrierAgentCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransportByRail5.mmPlaceOfReceipt, TransportByRail5.mmPlaceOfDelivery, TransportByRail5.mmRailCarrierName, TransportByRail5.mmRailCarrierCountry,
						TransportByRail5.mmCarrierAgentName, TransportByRail5.mmCarrierAgentCountry);
				trace_lazy = () -> TransportByRail.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByRail5";
				definition = "Information related to the transportation of goods by rail.";
				previousVersion_lazy = () -> TransportByRail4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcOfRct")
	public List<Max35Text> getPlaceOfReceipt() {
		return placeOfReceipt;
	}

	public void setPlaceOfReceipt(List<Max35Text> placeOfReceipt) {
		this.placeOfReceipt = placeOfReceipt;
	}

	@XmlElement(name = "PlcOfDlvry", required = true)
	public List<Max35Text> getPlaceOfDelivery() {
		return placeOfDelivery;
	}

	public void setPlaceOfDelivery(List<Max35Text> placeOfDelivery) {
		this.placeOfDelivery = placeOfDelivery;
	}

	@XmlElement(name = "RailCrrierNm")
	public Max70Text getRailCarrierName() {
		return railCarrierName;
	}

	public void setRailCarrierName(Max70Text railCarrierName) {
		this.railCarrierName = railCarrierName;
	}

	@XmlElement(name = "RailCrrierCtry")
	public CountryCode getRailCarrierCountry() {
		return railCarrierCountry;
	}

	public void setRailCarrierCountry(CountryCode railCarrierCountry) {
		this.railCarrierCountry = railCarrierCountry;
	}

	@XmlElement(name = "CrrierAgtNm")
	public Max70Text getCarrierAgentName() {
		return carrierAgentName;
	}

	public void setCarrierAgentName(Max70Text carrierAgentName) {
		this.carrierAgentName = carrierAgentName;
	}

	@XmlElement(name = "CrrierAgtCtry")
	public CountryCode getCarrierAgentCountry() {
		return carrierAgentCountry;
	}

	public void setCarrierAgentCountry(CountryCode carrierAgentCountry) {
		this.carrierAgentCountry = carrierAgentCountry;
	}
}