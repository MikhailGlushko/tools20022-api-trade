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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingIssuer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about an undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking8#mmIdentification
 * Undertaking8.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking8#mmIssuer
 * Undertaking8.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking8#mmApplicantReferenceNumber
 * Undertaking8.mmApplicantReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking8#mmBeneficiaryReferenceNumber
 * Undertaking8.mmBeneficiaryReferenceNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
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
 * "Undertaking8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about an undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking8", propOrder = {"identification", "issuer", "applicantReferenceNumber", "beneficiaryReferenceNumber"})
public class Undertaking8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
	 * Undertaking.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking8, Max35Text> mmIdentification = new MMMessageAttribute<Undertaking8, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking8.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned by the issuer to the undertaking, for example the guarantee or standby number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Undertaking8 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Undertaking8 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected PartyIdentification43 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingIssuer
	 * UndertakingIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issues the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Undertaking8, PartyIdentification43> mmIssuer = new MMMessageAssociationEnd<Undertaking8, PartyIdentification43>() {
		{
			businessComponentTrace_lazy = () -> UndertakingIssuer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking8.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issues the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(Undertaking8 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(Undertaking8 obj, PartyIdentification43 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "ApplcntRefNb")
	protected Max35Text applicantReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking8, Optional<Max35Text>> mmApplicantReferenceNumber = new MMMessageAttribute<Undertaking8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking8.mmObject();
			isDerived = false;
			xmlTag = "ApplcntRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Undertaking8 obj) {
			return obj.getApplicantReferenceNumber();
		}

		@Override
		public void setValue(Undertaking8 obj, Optional<Max35Text> value) {
			obj.setApplicantReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryRefNb")
	protected Max35Text beneficiaryReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the beneficiary to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking8, Optional<Max35Text>> mmBeneficiaryReferenceNumber = new MMMessageAttribute<Undertaking8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking8.mmObject();
			isDerived = false;
			xmlTag = "BnfcryRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the beneficiary to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Undertaking8 obj) {
			return obj.getBeneficiaryReferenceNumber();
		}

		@Override
		public void setValue(Undertaking8 obj, Optional<Max35Text> value) {
			obj.setBeneficiaryReferenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking8.mmIdentification, com.tools20022.repository.msg.Undertaking8.mmIssuer,
						com.tools20022.repository.msg.Undertaking8.mmApplicantReferenceNumber, com.tools20022.repository.msg.Undertaking8.mmBeneficiaryReferenceNumber);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking8";
				definition = "Information about an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Undertaking8 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public PartyIdentification43 getIssuer() {
		return issuer;
	}

	public Undertaking8 setIssuer(PartyIdentification43 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public Optional<Max35Text> getApplicantReferenceNumber() {
		return applicantReferenceNumber == null ? Optional.empty() : Optional.of(applicantReferenceNumber);
	}

	public Undertaking8 setApplicantReferenceNumber(Max35Text applicantReferenceNumber) {
		this.applicantReferenceNumber = applicantReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getBeneficiaryReferenceNumber() {
		return beneficiaryReferenceNumber == null ? Optional.empty() : Optional.of(beneficiaryReferenceNumber);
	}

	public Undertaking8 setBeneficiaryReferenceNumber(Max35Text beneficiaryReferenceNumber) {
		this.beneficiaryReferenceNumber = beneficiaryReferenceNumber;
		return this;
	}
}