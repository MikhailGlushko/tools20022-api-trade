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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingNonExtensionNotification message is sent by the party that
 * issued the undertaking to the beneficiary, either directly or via one or more
 * advising parties, to notify it of the non-extension of the referenced
 * undertaking beyond the current expiry date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01#mmUndertakingNonExtensionNotificationDetails
 * UndertakingNonExtensionNotificationV01.
 * mmUndertakingNonExtensionNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01#mmDigitalSignature
 * UndertakingNonExtensionNotificationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgNonXtnsnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingNonExtensionNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingNonExtensionNotification message is sent by the party that issued the undertaking to the beneficiary, either directly or via one or more advising parties, to notify it of the non-extension of the referenced undertaking beyond the current expiry date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UndertakingNonExtensionNotificationV01", propOrder = {"undertakingNonExtensionNotificationDetails", "digitalSignature"})
public class UndertakingNonExtensionNotificationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected UndertakingNonExtensionStatusAdvice1 undertakingNonExtensionNotificationDetails;
	/**
	 * Details of the non-extension notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1
	 * UndertakingNonExtensionStatusAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgNonXtnsnNtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingNonExtensionNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the non-extension notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUndertakingNonExtensionNotificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UdrtkgNonXtnsnNtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingNonExtensionNotificationDetails";
			definition = "Details of the non-extension notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingNonExtensionStatusAdvice1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingNonExtensionNotificationV01.class.getMethod("getUndertakingNonExtensionNotificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyAndSignature2 digitalSignature;
	/**
	 * Digital signature of the notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the notification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingNonExtensionNotificationV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingNonExtensionNotificationV01";
				definition = "The UndertakingNonExtensionNotification message is sent by the party that issued the undertaking to the beneficiary, either directly or via one or more advising parties, to notify it of the non-extension of the referenced undertaking beyond the current expiry date.";
				rootElement = "Document";
				xmlTag = "UdrtkgNonXtnsnNtfctn";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01.mmUndertakingNonExtensionNotificationDetails,
						com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingNonExtensionNotificationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UdrtkgNonXtnsnNtfctnDtls", required = true)
	public UndertakingNonExtensionStatusAdvice1 getUndertakingNonExtensionNotificationDetails() {
		return undertakingNonExtensionNotificationDetails;
	}

	public void setUndertakingNonExtensionNotificationDetails(UndertakingNonExtensionStatusAdvice1 undertakingNonExtensionNotificationDetails) {
		this.undertakingNonExtensionNotificationDetails = undertakingNonExtensionNotificationDetails;
	}

	@XmlElement(name = "DgtlSgntr")
	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.011.01.01")
	static public class Document {
		@XmlElement(name = "UdrtkgNonXtnsnNtfctn", required = true)
		public UndertakingNonExtensionNotificationV01 messageBody;
	}
}