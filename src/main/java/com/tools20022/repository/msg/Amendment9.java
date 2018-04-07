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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment9#mmUndertakingAmendmentResponseMessage
 * Amendment9.mmUndertakingAmendmentResponseMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01#mmUndertakingAmendmentResponseNotificationDetails
 * UndertakingAmendmentResponseNotificationV01.
 * mmUndertakingAmendmentResponseNotificationDetails}</li>
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
 * "Amendment9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amendment9", propOrder = "undertakingAmendmentResponseMessage")
public class Amendment9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgAmdmntRspnMsg", required = true)
	protected UndertakingAmendmentResponseMessage1 undertakingAmendmentResponseMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1
	 * UndertakingAmendmentResponseMessage1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment9
	 * Amendment9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntRspnMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentResponseMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contents of the related UndertakingAmendmentResponse message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment9, UndertakingAmendmentResponseMessage1> mmUndertakingAmendmentResponseMessage = new MMMessageAssociationEnd<Amendment9, UndertakingAmendmentResponseMessage1>() {
		{
			businessComponentTrace_lazy = () -> AmendmentOfUndertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment9.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmdmntRspnMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentResponseMessage";
			definition = "Contents of the related UndertakingAmendmentResponse message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmendmentResponseMessage1.mmObject();
		}

		@Override
		public UndertakingAmendmentResponseMessage1 getValue(Amendment9 obj) {
			return obj.getUndertakingAmendmentResponseMessage();
		}

		@Override
		public void setValue(Amendment9 obj, UndertakingAmendmentResponseMessage1 value) {
			obj.setUndertakingAmendmentResponseMessage(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment9.mmUndertakingAmendmentResponseMessage);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentResponseNotificationV01.mmUndertakingAmendmentResponseNotificationDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment9";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingAmendmentResponseMessage1 getUndertakingAmendmentResponseMessage() {
		return undertakingAmendmentResponseMessage;
	}

	public Amendment9 setUndertakingAmendmentResponseMessage(UndertakingAmendmentResponseMessage1 undertakingAmendmentResponseMessage) {
		this.undertakingAmendmentResponseMessage = Objects.requireNonNull(undertakingAmendmentResponseMessage);
		return this;
	}
}