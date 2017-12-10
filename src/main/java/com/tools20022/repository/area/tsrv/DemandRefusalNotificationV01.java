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
import com.tools20022.repository.msg.DemandRefusal1;
import com.tools20022.repository.msg.PartyAndSignature2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The DemandRefusalNotification message is sent to the beneficiary or presenter
 * by the party obligated on the undertaking and to whom a demand for payment
 * has been made, either directly or via one or more advising parties. It
 * notifies the beneficiary or presenter that the demand has been refused.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01#mmDemandRefusalNotificationDetails
 * DemandRefusalNotificationV01.mmDemandRefusalNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01#mmDigitalSignature
 * DemandRefusalNotificationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DmndRfslNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.016.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DemandRefusalNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The DemandRefusalNotification message is sent to the beneficiary or presenter by the party obligated on the undertaking and to whom a demand for payment has been made, either directly or via one or more advising parties. It notifies the beneficiary or presenter that the demand has been refused."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DemandRefusalNotificationV01", propOrder = {"demandRefusalNotificationDetails", "digitalSignature"})
public class DemandRefusalNotificationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected List<DemandRefusal1> demandRefusalNotificationDetails;
	/**
	 * Details of the demand refusal notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DemandRefusal1
	 * DemandRefusal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndRfslNtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandRefusalNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the demand refusal notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDemandRefusalNotificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "DmndRfslNtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandRefusalNotificationDetails";
			definition = "Details of the demand refusal notification.";
			minOccurs = 0;
			complexType_lazy = () -> DemandRefusal1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DemandRefusalNotificationV01.class.getMethod("getDemandRefusalNotificationDetails", new Class[]{});
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
				return DemandRefusalNotificationV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DemandRefusalNotificationV01";
				definition = "The DemandRefusalNotification message is sent to the beneficiary or presenter by the party obligated on the undertaking and to whom a demand for payment has been made, either directly or via one or more advising parties. It notifies the beneficiary or presenter that the demand has been refused.";
				rootElement = "Document";
				xmlTag = "DmndRfslNtfctn";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01.mmDemandRefusalNotificationDetails,
						com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "016";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DemandRefusalNotificationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DmndRfslNtfctnDtls")
	public List<DemandRefusal1> getDemandRefusalNotificationDetails() {
		return demandRefusalNotificationDetails;
	}

	public void setDemandRefusalNotificationDetails(List<DemandRefusal1> demandRefusalNotificationDetails) {
		this.demandRefusalNotificationDetails = demandRefusalNotificationDetails;
	}

	@XmlElement(name = "DgtlSgntr")
	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.016.01.01")
	static public class Document {
		@XmlElement(name = "DmndRfslNtfctn", required = true)
		public DemandRefusalNotificationV01 messageBody;
	}
}