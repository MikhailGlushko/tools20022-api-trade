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
import com.tools20022.repository.choice.Incoterms4Choice;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Incoterms;
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
 * Specifies the applicable Incoterm and associated location.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#mmIncotermsCode
 * Incoterms4.mmIncotermsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#mmLocation
 * Incoterms4.mmLocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}</li>
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
 * "Incoterms4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the applicable Incoterm and associated location."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Incoterms4", propOrder = {"incotermsCode", "location"})
public class Incoterms4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IncotrmsCd", required = true)
	protected Incoterms4Choice incotermsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Incoterms4Choice
	 * Incoterms4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmCode
	 * Incoterms.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Incoterms4
	 * Incoterms4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncotrmsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncotermsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the Incoterms."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Incoterms4, Incoterms4Choice> mmIncotermsCode = new MMMessageAssociationEnd<Incoterms4, Incoterms4Choice>() {
		{
			businessElementTrace_lazy = () -> Incoterms.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Incoterms4.mmObject();
			isDerived = false;
			xmlTag = "IncotrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncotermsCode";
			definition = "Specifies the Incoterms.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Incoterms4Choice.mmObject();
		}

		@Override
		public Incoterms4Choice getValue(Incoterms4 obj) {
			return obj.getIncotermsCode();
		}

		@Override
		public void setValue(Incoterms4 obj, Incoterms4Choice value) {
			obj.setIncotermsCode(value);
		}
	};
	@XmlElement(name = "Lctn")
	protected Max70Text location;
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
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmLocation
	 * Incoterms.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Incoterms4
	 * Incoterms4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location where the Incoterms are actioned. Reference UN/ECE Recommendation 16 - LOCODE - Code for Trade and Transport Locations (www.unece.org/cefact/recommendations)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Incoterms4, Optional<Max70Text>> mmLocation = new MMMessageAttribute<Incoterms4, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Incoterms.mmLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Incoterms4.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Location where the Incoterms are actioned. Reference UN/ECE Recommendation 16 - LOCODE - Code for Trade and Transport Locations (www.unece.org/cefact/recommendations).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Incoterms4 obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(Incoterms4 obj, Optional<Max70Text> value) {
			obj.setLocation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Incoterms4.mmIncotermsCode, com.tools20022.repository.msg.Incoterms4.mmLocation);
				trace_lazy = () -> Incoterms.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Incoterms4";
				definition = "Specifies the applicable Incoterm and associated location.";
			}
		});
		return mmObject_lazy.get();
	}

	public Incoterms4Choice getIncotermsCode() {
		return incotermsCode;
	}

	public Incoterms4 setIncotermsCode(Incoterms4Choice incotermsCode) {
		this.incotermsCode = Objects.requireNonNull(incotermsCode);
		return this;
	}

	public Optional<Max70Text> getLocation() {
		return location == null ? Optional.empty() : Optional.of(location);
	}

	public Incoterms4 setLocation(Max70Text location) {
		this.location = location;
		return this;
	}
}