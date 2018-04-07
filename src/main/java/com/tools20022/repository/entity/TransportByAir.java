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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AirportName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Information related to the transportation of goods by air.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportByAir" src="doc-files/TransportByAir.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportByAir#mmAirportName
 * TransportByAir.mmAirportName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportByAir#mmFlightNumber
 * TransportByAir.mmFlightNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#mmTransportByAir
 * SingleTransport3.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByAir
 * SingleTransport7.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByAir
 * SingleTransport8.mmTransportByAir}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AirportName1Choice
 * AirportName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir2
 * TransportByAir2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir4
 * TransportByAir4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir5
 * TransportByAir5}</li>
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
 * "TransportByAir"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by air."</li>
 * </ul>
 */
public class TransportByAir extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max6Text airportName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#mmAirportCode
	 * AirportName1Choice.mmAirportCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#mmOtherAirportDescription
	 * AirportName1Choice.mmOtherAirportDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirportName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an airport by means of its IATA identification code. Example: LHR."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TransportByAir, Max6Text> mmAirportName = new MMBusinessAttribute<TransportByAir, Max6Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AirportName1Choice.mmAirportCode, AirportName1Choice.mmOtherAirportDescription);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportByAir.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AirportName";
			definition = "Identifies an airport by means of its IATA identification code. Example: LHR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(TransportByAir obj) {
			return obj.getAirportName();
		}

		@Override
		public void setValue(TransportByAir obj, Max6Text value) {
			obj.setAirportName(value);
		}
	};
	protected Max35Text flightNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmFlightNumber
	 * TransportByAir4.mmFlightNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlightNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the flight and the carrier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TransportByAir, Max35Text> mmFlightNumber = new MMBusinessAttribute<TransportByAir, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TransportByAir4.mmFlightNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportByAir.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlightNumber";
			definition = "Identifies the flight and the carrier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransportByAir obj) {
			return obj.getFlightNumber();
		}

		@Override
		public void setValue(TransportByAir obj, Max35Text value) {
			obj.setFlightNumber(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByAir";
				definition = "Information related to the transportation of goods by air.";
				derivationElement_lazy = () -> Arrays.asList(SingleTransport3.mmTransportByAir, SingleTransport7.mmTransportByAir, SingleTransport8.mmTransportByAir);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportByAir.mmAirportName, com.tools20022.repository.entity.TransportByAir.mmFlightNumber);
				derivationComponent_lazy = () -> Arrays.asList(AirportName1Choice.mmObject(), TransportByAir2.mmObject(), TransportByAir4.mmObject(), TransportByAir5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransportByAir.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max6Text getAirportName() {
		return airportName;
	}

	public TransportByAir setAirportName(Max6Text airportName) {
		this.airportName = Objects.requireNonNull(airportName);
		return this;
	}

	public Max35Text getFlightNumber() {
		return flightNumber;
	}

	public TransportByAir setFlightNumber(Max35Text flightNumber) {
		this.flightNumber = Objects.requireNonNull(flightNumber);
		return this;
	}
}