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
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MultimodalTransport3;
import com.tools20022.repository.msg.SingleTransport7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the multimodal or the individual transport of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmIndividualTransport
 * TransportMeans5.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmMultimodalTransport
 * TransportMeans5.mmMultimodalTransport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
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
 * "TransportMeans5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the multimodal or the individual transport of goods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportMeans5", propOrder = {"individualTransport", "multimodalTransport"})
public class TransportMeans5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndvTrnsprt", required = true)
	protected SingleTransport7 individualTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleTransport7
	 * SingleTransport7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans5
	 * TransportMeans5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Moving of goods or people from one place to another by vehicle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportMeans5, SingleTransport7> mmIndividualTransport = new MMMessageAssociationEnd<TransportMeans5, SingleTransport7>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportMeans5.mmObject();
			isDerived = false;
			xmlTag = "IndvTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransport";
			definition = "Moving of goods or people from one place to another by vehicle.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SingleTransport7.mmObject();
		}

		@Override
		public SingleTransport7 getValue(TransportMeans5 obj) {
			return obj.getIndividualTransport();
		}

		@Override
		public void setValue(TransportMeans5 obj, SingleTransport7 value) {
			obj.setIndividualTransport(value);
		}
	};
	@XmlElement(name = "MltmdlTrnsprt")
	protected MultimodalTransport3 multimodalTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MultimodalTransport3
	 * MultimodalTransport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans5
	 * TransportMeans5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltmdlTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultimodalTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different movements and places and their role in a multimodal conveyance of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportMeans5, Optional<MultimodalTransport3>> mmMultimodalTransport = new MMMessageAssociationEnd<TransportMeans5, Optional<MultimodalTransport3>>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportMeans5.mmObject();
			isDerived = false;
			xmlTag = "MltmdlTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultimodalTransport";
			definition = "Specifies the different movements and places and their role in a multimodal conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MultimodalTransport3.mmObject();
		}

		@Override
		public Optional<MultimodalTransport3> getValue(TransportMeans5 obj) {
			return obj.getMultimodalTransport();
		}

		@Override
		public void setValue(TransportMeans5 obj, Optional<MultimodalTransport3> value) {
			obj.setMultimodalTransport(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans5.mmIndividualTransport, com.tools20022.repository.msg.TransportMeans5.mmMultimodalTransport);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportMeans5";
				definition = "Describes the multimodal or the individual transport of goods.";
			}
		});
		return mmObject_lazy.get();
	}

	public SingleTransport7 getIndividualTransport() {
		return individualTransport;
	}

	public TransportMeans5 setIndividualTransport(SingleTransport7 individualTransport) {
		this.individualTransport = Objects.requireNonNull(individualTransport);
		return this;
	}

	public Optional<MultimodalTransport3> getMultimodalTransport() {
		return multimodalTransport == null ? Optional.empty() : Optional.of(multimodalTransport);
	}

	public TransportMeans5 setMultimodalTransport(MultimodalTransport3 multimodalTransport) {
		this.multimodalTransport = multimodalTransport;
		return this;
	}
}