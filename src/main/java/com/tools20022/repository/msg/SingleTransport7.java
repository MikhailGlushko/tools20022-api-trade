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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies individually each leg of a transport of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByAir
 * SingleTransport7.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportBySea
 * SingleTransport7.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByRoad
 * SingleTransport7.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByRail
 * SingleTransport7.mmTransportByRail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
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
 * "SingleTransport7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies individually each leg of a transport of goods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SingleTransport7", propOrder = {"transportByAir", "transportBySea", "transportByRoad", "transportByRail"})
public class SingleTransport7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TransportByAir5> transportByAir;
	/**
	 * Moving of goods or people from one place to another by vehicle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport7
	 * SingleTransport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Moving of goods or people from one place to another by vehicle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByAir = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByAir.mmObject();
			componentContext_lazy = () -> SingleTransport7.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByAir";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByAir";
			definition = "Moving of goods or people from one place to another by vehicle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransportBySea6> transportBySea;
	/**
	 * Information related for the transportation of goods by sea.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport7
	 * SingleTransport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related for the transportation of goods by sea."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportBySea = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportBySea.mmObject();
			componentContext_lazy = () -> SingleTransport7.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtBySea";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportBySea";
			definition = "Information related for the transportation of goods by sea.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportBySea6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransportByRoad5> transportByRoad;
	/**
	 * Information related to the transportation of goods by road.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRoad5
	 * TransportByRoad5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRoad
	 * TransportByRoad}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport7
	 * SingleTransport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by road."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRoad = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRoad.mmObject();
			componentContext_lazy = () -> SingleTransport7.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRoad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRoad";
			definition = "Information related to the transportation of goods by road.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRoad5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransportByRail5> transportByRail;
	/**
	 * Information related to the transportation of goods by rail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRail5
	 * TransportByRail5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRail
	 * TransportByRail}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport7
	 * SingleTransport7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by rail."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRail = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRail.mmObject();
			componentContext_lazy = () -> SingleTransport7.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRail";
			definition = "Information related to the transportation of goods by rail.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRail5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SingleTransport7.mmTransportByAir, SingleTransport7.mmTransportBySea, SingleTransport7.mmTransportByRoad, SingleTransport7.mmTransportByRail);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SingleTransport7";
				definition = "Specifies individually each leg of a transport of goods.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TrnsprtByAir")
	public List<TransportByAir5> getTransportByAir() {
		return transportByAir;
	}

	public void setTransportByAir(List<com.tools20022.repository.msg.TransportByAir5> transportByAir) {
		this.transportByAir = transportByAir;
	}

	@XmlElement(name = "TrnsprtBySea")
	public List<TransportBySea6> getTransportBySea() {
		return transportBySea;
	}

	public void setTransportBySea(List<com.tools20022.repository.msg.TransportBySea6> transportBySea) {
		this.transportBySea = transportBySea;
	}

	@XmlElement(name = "TrnsprtByRoad")
	public List<TransportByRoad5> getTransportByRoad() {
		return transportByRoad;
	}

	public void setTransportByRoad(List<com.tools20022.repository.msg.TransportByRoad5> transportByRoad) {
		this.transportByRoad = transportByRoad;
	}

	@XmlElement(name = "TrnsprtByRail")
	public List<TransportByRail5> getTransportByRail() {
		return transportByRail;
	}

	public void setTransportByRail(List<com.tools20022.repository.msg.TransportByRail5> transportByRail) {
		this.transportByRail = transportByRail;
	}
}