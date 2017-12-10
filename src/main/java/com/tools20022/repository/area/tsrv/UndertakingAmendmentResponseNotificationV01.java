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
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.Amendment9;
import com.tools20022.repository.msg.PartyAndSignature2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingAmendmentResponseNotification message is sent by the advising
 * party to the party that issued the undertaking, either directly or via one or
 * more other parties, to notify the recipient of the acceptance or rejection by
 * the beneficiary of the amendment. On receipt of this message or the
 * UndertakingAmendmentResponse message, the issuer may also send the
 * UndertakingAmendmentResponseNotification to the applicant.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01#mmUndertakingAmendmentResponseNotificationDetails
 * UndertakingAmendmentResponseNotificationV01.
 * mmUndertakingAmendmentResponseNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01#mmAdditionalInformation
 * UndertakingAmendmentResponseNotificationV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01#mmDigitalSignature
 * UndertakingAmendmentResponseNotificationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgAmdmntRspnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.009.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingAmendmentResponseNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingAmendmentResponseNotification message is sent by the advising party to the party that issued the undertaking, either directly or via one or more other parties, to notify the recipient of the acceptance or rejection by the beneficiary of the amendment. On receipt of this message or the UndertakingAmendmentResponse message, the issuer may also send the UndertakingAmendmentResponseNotification to the applicant."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UndertakingAmendmentResponseNotificationV01", propOrder = {"undertakingAmendmentResponseNotificationDetails", "additionalInformation", "digitalSignature"})
public class UndertakingAmendmentResponseNotificationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Amendment9 undertakingAmendmentResponseNotificationDetails;
	/**
	 * Details related to the proposed amendment response notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Amendment9
	 * Amendment9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntRspnNtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentResponseNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the proposed amendment response notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUndertakingAmendmentResponseNotificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UdrtkgAmdmntRspnNtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentResponseNotificationDetails";
			definition = "Details related to the proposed amendment response notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amendment9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingAmendmentResponseNotificationV01.class.getMethod("getUndertakingAmendmentResponseNotificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max2000Text additionalInformation;
	/**
	 * Additional information reported by the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information reported by the beneficiary."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information reported by the beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingAmendmentResponseNotificationV01.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyAndSignature2 digitalSignature;
	/**
	 * Digital signature of the response notification.
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
	 * definition} = "Digital signature of the response notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the response notification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingAmendmentResponseNotificationV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAmendmentResponseNotificationV01";
				definition = "The UndertakingAmendmentResponseNotification message is sent by the advising party to the party that issued the undertaking, either directly or via one or more other parties, to notify the recipient of the acceptance or rejection by the beneficiary of the amendment. On receipt of this message or the UndertakingAmendmentResponse message, the issuer may also send the UndertakingAmendmentResponseNotification to the applicant.";
				rootElement = "Document";
				xmlTag = "UdrtkgAmdmntRspnNtfctn";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01.mmUndertakingAmendmentResponseNotificationDetails,
						com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01.mmAdditionalInformation, com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "009";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingAmendmentResponseNotificationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UdrtkgAmdmntRspnNtfctnDtls", required = true)
	public Amendment9 getUndertakingAmendmentResponseNotificationDetails() {
		return undertakingAmendmentResponseNotificationDetails;
	}

	public void setUndertakingAmendmentResponseNotificationDetails(Amendment9 undertakingAmendmentResponseNotificationDetails) {
		this.undertakingAmendmentResponseNotificationDetails = undertakingAmendmentResponseNotificationDetails;
	}

	@XmlElement(name = "AddtlInf")
	public Max2000Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "DgtlSgntr")
	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.009.01.01")
	static public class Document {
		@XmlElement(name = "UdrtkgAmdmntRspnNtfctn", required = true)
		public UndertakingAmendmentResponseNotificationV01 messageBody;
	}
}