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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.entity.PostalAddress;
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
 * Identifies an airport by its location and by its name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AirportDescription1#mmTown
 * AirportDescription1.mmTown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AirportDescription1#mmAirportName
 * AirportDescription1.mmAirportName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
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
 * "AirportDescription1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies an airport by its location and by its name."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AirportDescription1", propOrder = {"town", "airportName"})
public class AirportDescription1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Twn", required = true)
	protected Max35Text town;
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
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
	 * PostalAddress.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AirportDescription1
	 * AirportDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Twn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Town"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the town where the airport is located. For example: London."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AirportDescription1, Max35Text> mmTown = new MMMessageAttribute<AirportDescription1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmTownName;
			componentContext_lazy = () -> com.tools20022.repository.msg.AirportDescription1.mmObject();
			isDerived = false;
			xmlTag = "Twn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Town";
			definition = "Identifies the town where the airport is located. For example: London.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AirportDescription1 obj) {
			return obj.getTown();
		}

		@Override
		public void setValue(AirportDescription1 obj, Max35Text value) {
			obj.setTown(value);
		}
	};
	@XmlElement(name = "AirprtNm")
	protected Max35Text airportName;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AirportDescription1
	 * AirportDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AirprtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirportName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the airport by its name. For example: Heathrow."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AirportDescription1, Optional<Max35Text>> mmAirportName = new MMMessageAttribute<AirportDescription1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AirportDescription1.mmObject();
			isDerived = false;
			xmlTag = "AirprtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirportName";
			definition = "Identifies the airport by its name. For example: Heathrow.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AirportDescription1 obj) {
			return obj.getAirportName();
		}

		@Override
		public void setValue(AirportDescription1 obj, Optional<Max35Text> value) {
			obj.setAirportName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AirportDescription1.mmTown, com.tools20022.repository.msg.AirportDescription1.mmAirportName);
				trace_lazy = () -> Location.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AirportDescription1";
				definition = "Identifies an airport by its location and by its name.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTown() {
		return town;
	}

	public AirportDescription1 setTown(Max35Text town) {
		this.town = Objects.requireNonNull(town);
		return this;
	}

	public Optional<Max35Text> getAirportName() {
		return airportName == null ? Optional.empty() : Optional.of(airportName);
	}

	public AirportDescription1 setAirportName(Max35Text airportName) {
		this.airportName = airportName;
		return this;
	}
}