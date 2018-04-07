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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.PartyIdentification43;
import com.tools20022.repository.msg.UndertakingAdvice1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingIssuanceAdvice message is sent by an advising party to the
 * beneficiary, either directly or via one or more other advising parties in the
 * transaction chain, to advise the issuance of an undertaking. Other interested
 * parties may also be informed of the advice. The undertaking advised could be
 * a demand guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). In addition to providing details on
 * the applicable rules, expiry date, the amount, required documents, and terms
 * and conditions of the undertaking, the advice may provide information from
 * the sender such as confirmation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmAdvisingParty
 * UndertakingIssuanceAdviceV01.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmSecondAdvisingParty
 * UndertakingIssuanceAdviceV01.mmSecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmDateOfAdvice
 * UndertakingIssuanceAdviceV01.mmDateOfAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmUndertakingIssuanceAdviceDetails
 * UndertakingIssuanceAdviceV01.mmUndertakingIssuanceAdviceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmBankToBankInformation
 * UndertakingIssuanceAdviceV01.mmBankToBankInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmDigitalSignature
 * UndertakingIssuanceAdviceV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgIssncAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.002.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuanceAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingIssuanceAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the issuance of an undertaking. Other interested parties may also be informed of the advice. The undertaking advised could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the advice may provide information from the sender such as confirmation details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingIssuanceAdviceV01", propOrder = {"advisingParty", "secondAdvisingParty", "dateOfAdvice", "undertakingIssuanceAdviceDetails", "bankToBankInformation", "digitalSignature"})
public class UndertakingIssuanceAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdvsgPty", required = true)
	protected PartyIdentification43 advisingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party advising the undertaking to the beneficiary or to another party."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, PartyIdentification43> mmAdvisingParty = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, PartyIdentification43>() {
		{
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party advising the undertaking to the beneficiary or to another party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getAdvisingParty();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, PartyIdentification43 value) {
			obj.setAdvisingParty(value);
		}
	};
	@XmlElement(name = "ScndAdvsgPty")
	protected PartyIdentification43 secondAdvisingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional party that advises the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, Optional<PartyIdentification43>> mmSecondAdvisingParty = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, Optional<PartyIdentification43>>() {
		{
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party that advises the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getSecondAdvisingParty();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, Optional<PartyIdentification43> value) {
			obj.setSecondAdvisingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "DtOfAdvc", required = true)
	protected DateAndDateTimeChoice dateOfAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the undertaking is advised."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, DateAndDateTimeChoice> mmDateOfAdvice = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, DateAndDateTimeChoice>() {
		{
			xmlTag = "DtOfAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking is advised.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getDateOfAdvice();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, DateAndDateTimeChoice value) {
			obj.setDateOfAdvice(value);
		}
	};
	@XmlElement(name = "UdrtkgIssncAdvcDtls", required = true)
	protected UndertakingAdvice1 undertakingIssuanceAdviceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgIssncAdvcDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuanceAdviceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the advice of the issued undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, UndertakingAdvice1> mmUndertakingIssuanceAdviceDetails = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, UndertakingAdvice1>() {
		{
			xmlTag = "UdrtkgIssncAdvcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceAdviceDetails";
			definition = "Details related to the advice of the issued undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingAdvice1.mmObject();
		}

		@Override
		public UndertakingAdvice1 getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getUndertakingIssuanceAdviceDetails();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, UndertakingAdvice1 value) {
			obj.setUndertakingIssuanceAdviceDetails(value);
		}
	};
	@XmlElement(name = "BkToBkInf")
	protected List<Max2000Text> bankToBankInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkToBkInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankToBankInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information specific to the bank-to-bank communication."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, List<Max2000Text>> mmBankToBankInformation = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, List<Max2000Text>>() {
		{
			xmlTag = "BkToBkInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToBankInformation";
			definition = "Additional information specific to the bank-to-bank communication.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getBankToBankInformation();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, List<Max2000Text> value) {
			obj.setBankToBankInformation(value);
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected PartyAndSignature2 digitalSignature;
	/**
	 * 
	 <p>
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
	 * definition} = "Digital signature of the undertaking advice."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, Optional<PartyAndSignature2>> mmDigitalSignature = new MMMessageBuildingBlock<UndertakingIssuanceAdviceV01, Optional<PartyAndSignature2>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the undertaking advice.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public Optional<PartyAndSignature2> getValue(UndertakingIssuanceAdviceV01 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(UndertakingIssuanceAdviceV01 obj, Optional<PartyAndSignature2> value) {
			obj.setDigitalSignature(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuanceAdviceV01";
				definition = "The UndertakingIssuanceAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the issuance of an undertaking. Other interested parties may also be informed of the advice. The undertaking advised could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the advice may provide information from the sender such as confirmation details.";
				rootElement = "Document";
				xmlTag = "UdrtkgIssncAdvc";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmAdvisingParty, com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmSecondAdvisingParty,
						com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmDateOfAdvice, com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmUndertakingIssuanceAdviceDetails,
						com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmBankToBankInformation, com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingIssuanceAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification43 getAdvisingParty() {
		return advisingParty;
	}

	public UndertakingIssuanceAdviceV01 setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = Objects.requireNonNull(advisingParty);
		return this;
	}

	public Optional<PartyIdentification43> getSecondAdvisingParty() {
		return secondAdvisingParty == null ? Optional.empty() : Optional.of(secondAdvisingParty);
	}

	public UndertakingIssuanceAdviceV01 setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
		return this;
	}

	public DateAndDateTimeChoice getDateOfAdvice() {
		return dateOfAdvice;
	}

	public UndertakingIssuanceAdviceV01 setDateOfAdvice(DateAndDateTimeChoice dateOfAdvice) {
		this.dateOfAdvice = Objects.requireNonNull(dateOfAdvice);
		return this;
	}

	public UndertakingAdvice1 getUndertakingIssuanceAdviceDetails() {
		return undertakingIssuanceAdviceDetails;
	}

	public UndertakingIssuanceAdviceV01 setUndertakingIssuanceAdviceDetails(UndertakingAdvice1 undertakingIssuanceAdviceDetails) {
		this.undertakingIssuanceAdviceDetails = Objects.requireNonNull(undertakingIssuanceAdviceDetails);
		return this;
	}

	public List<Max2000Text> getBankToBankInformation() {
		return bankToBankInformation == null ? bankToBankInformation = new ArrayList<>() : bankToBankInformation;
	}

	public UndertakingIssuanceAdviceV01 setBankToBankInformation(List<Max2000Text> bankToBankInformation) {
		this.bankToBankInformation = Objects.requireNonNull(bankToBankInformation);
		return this;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public UndertakingIssuanceAdviceV01 setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01")
	static public class Document {
		@XmlElement(name = "UdrtkgIssncAdvc", required = true)
		public UndertakingIssuanceAdviceV01 messageBody;
	}
}