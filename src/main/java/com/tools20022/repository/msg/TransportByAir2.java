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
import com.tools20022.repository.choice.AirportName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportByAir;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the transportation of goods by air.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDepartureAirport
 * TransportByAir2.mmDepartureAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDestinationAirport
 * TransportByAir2.mmDestinationAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmAirCarrierName
 * TransportByAir2.mmAirCarrierName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
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
 * "TransportByAir2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by air."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir4
 * TransportByAir4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportByAir2", propOrder = {"departureAirport", "destinationAirport", "airCarrierName"})
public class TransportByAir2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DprtureAirprt", required = true)
	protected AirportName1Choice departureAirport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2
	 * TransportByAir2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DprtureAirprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepartureAirport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDepartureAirport
	 * TransportByAir4.mmDepartureAirport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportByAir2, AirportName1Choice> mmDepartureAirport = new MMMessageAssociationEnd<TransportByAir2, AirportName1Choice>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir2.mmObject();
			isDerived = false;
			xmlTag = "DprtureAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepartureAirport";
			definition = "Place from where the goods must leave.";
			nextVersions_lazy = () -> Arrays.asList(TransportByAir4.mmDepartureAirport);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}

		@Override
		public AirportName1Choice getValue(TransportByAir2 obj) {
			return obj.getDepartureAirport();
		}

		@Override
		public void setValue(TransportByAir2 obj, AirportName1Choice value) {
			obj.setDepartureAirport(value);
		}
	};
	@XmlElement(name = "DstnAirprt", required = true)
	protected AirportName1Choice destinationAirport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2
	 * TransportByAir2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstnAirprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DestinationAirport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDestinationAirport
	 * TransportByAir4.mmDestinationAirport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportByAir2, AirportName1Choice> mmDestinationAirport = new MMMessageAssociationEnd<TransportByAir2, AirportName1Choice>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir2.mmObject();
			isDerived = false;
			xmlTag = "DstnAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationAirport";
			definition = "Place where the goods must arrive.";
			nextVersions_lazy = () -> Arrays.asList(TransportByAir4.mmDestinationAirport);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}

		@Override
		public AirportName1Choice getValue(TransportByAir2 obj) {
			return obj.getDestinationAirport();
		}

		@Override
		public void setValue(TransportByAir2 obj, AirportName1Choice value) {
			obj.setDestinationAirport(value);
		}
	};
	@XmlElement(name = "AirCrrierNm")
	protected Max35Text airCarrierName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2
	 * TransportByAir2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AirCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierName
	 * TransportByAir4.mmAirCarrierName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransportByAir2, Optional<Max35Text>> mmAirCarrierName = new MMMessageAttribute<TransportByAir2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir2.mmObject();
			isDerived = false;
			xmlTag = "AirCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			nextVersions_lazy = () -> Arrays.asList(TransportByAir4.mmAirCarrierName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransportByAir2 obj) {
			return obj.getAirCarrierName();
		}

		@Override
		public void setValue(TransportByAir2 obj, Optional<Max35Text> value) {
			obj.setAirCarrierName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir2.mmDepartureAirport, com.tools20022.repository.msg.TransportByAir2.mmDestinationAirport,
						com.tools20022.repository.msg.TransportByAir2.mmAirCarrierName);
				trace_lazy = () -> TransportByAir.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByAir2";
				definition = "Information related to the transportation of goods by air.";
				nextVersions_lazy = () -> Arrays.asList(TransportByAir4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AirportName1Choice getDepartureAirport() {
		return departureAirport;
	}

	public TransportByAir2 setDepartureAirport(AirportName1Choice departureAirport) {
		this.departureAirport = Objects.requireNonNull(departureAirport);
		return this;
	}

	public AirportName1Choice getDestinationAirport() {
		return destinationAirport;
	}

	public TransportByAir2 setDestinationAirport(AirportName1Choice destinationAirport) {
		this.destinationAirport = Objects.requireNonNull(destinationAirport);
		return this;
	}

	public Optional<Max35Text> getAirCarrierName() {
		return airCarrierName == null ? Optional.empty() : Optional.of(airCarrierName);
	}

	public TransportByAir2 setAirCarrierName(Max35Text airCarrierName) {
		this.airCarrierName = airCarrierName;
		return this;
	}
}