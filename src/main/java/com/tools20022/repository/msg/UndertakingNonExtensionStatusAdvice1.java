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
import com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.UndertakingStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification43;
import com.tools20022.repository.msg.Undertaking7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of a non-extension advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1#mmNotifyingParty
 * UndertakingNonExtensionStatusAdvice1.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1#mmUndertakingIdentification
 * UndertakingNonExtensionStatusAdvice1.mmUndertakingIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01#mmUndertakingNonExtensionNotificationDetails
 * UndertakingNonExtensionNotificationV01.
 * mmUndertakingNonExtensionNotificationDetails}</li>
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
 * "UndertakingNonExtensionStatusAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of a non-extension advice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingNonExtensionStatusAdvice1", propOrder = {"notifyingParty", "undertakingIdentification"})
public class UndertakingNonExtensionStatusAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtifngPty", required = true)
	protected PartyIdentification43 notifyingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1
	 * UndertakingNonExtensionStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the notifying party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingNonExtensionStatusAdvice1, PartyIdentification43> mmNotifyingParty = new MMMessageAssociationEnd<UndertakingNonExtensionStatusAdvice1, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Details related to the notifying party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(UndertakingNonExtensionStatusAdvice1 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(UndertakingNonExtensionStatusAdvice1 obj, PartyIdentification43 value) {
			obj.setNotifyingParty(value);
		}
	};
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking7 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking7
	 * Undertaking7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1
	 * UndertakingNonExtensionStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingNonExtensionStatusAdvice1, Undertaking7> mmUndertakingIdentification = new MMMessageAssociationEnd<UndertakingNonExtensionStatusAdvice1, Undertaking7>() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking7.mmObject();
		}

		@Override
		public Undertaking7 getValue(UndertakingNonExtensionStatusAdvice1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(UndertakingNonExtensionStatusAdvice1 obj, Undertaking7 value) {
			obj.setUndertakingIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1.mmNotifyingParty, com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1.mmUndertakingIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingNonExtensionNotificationV01.mmUndertakingNonExtensionNotificationDetails);
				trace_lazy = () -> UndertakingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingNonExtensionStatusAdvice1";
				definition = "Details of a non-extension advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification43 getNotifyingParty() {
		return notifyingParty;
	}

	public UndertakingNonExtensionStatusAdvice1 setNotifyingParty(PartyIdentification43 notifyingParty) {
		this.notifyingParty = Objects.requireNonNull(notifyingParty);
		return this;
	}

	public Undertaking7 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public UndertakingNonExtensionStatusAdvice1 setUndertakingIdentification(Undertaking7 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}
}