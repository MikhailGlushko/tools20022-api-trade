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
import com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification4;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous identifier of a financial institution, as assigned
 * under an internationally recognised or proprietary identification scheme.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmClearingSystemMemberIdentification
 * FinancialInstitutionIdentification6.mmClearingSystemMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmProprietaryIdentification
 * FinancialInstitutionIdentification6.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmBIC
 * FinancialInstitutionIdentification6.mmBIC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitutionIdentification6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionIdentification6", propOrder = {"clearingSystemMemberIdentification", "proprietaryIdentification", "bIC"})
public class FinancialInstitutionIdentification6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification2Choice clearingSystemMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, as assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstitutionIdentification6, Optional<ClearingSystemMemberIdentification2Choice>> mmClearingSystemMemberIdentification = new MMMessageAssociationEnd<FinancialInstitutionIdentification6, Optional<ClearingSystemMemberIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmObject();
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, as assigned by the system or system administrator.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemMemberIdentification2Choice.mmObject();
		}

		@Override
		public Optional<ClearingSystemMemberIdentification2Choice> getValue(FinancialInstitutionIdentification6 obj) {
			return obj.getClearingSystemMemberIdentification();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification6 obj, Optional<ClearingSystemMemberIdentification2Choice> value) {
			obj.setClearingSystemMemberIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtryId")
	protected GenericIdentification4 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstitutionIdentification6, Optional<GenericIdentification4>> mmProprietaryIdentification = new MMMessageAssociationEnd<FinancialInstitutionIdentification6, Optional<GenericIdentification4>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public Optional<GenericIdentification4> getValue(FinancialInstitutionIdentification6 obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification6 obj, Optional<GenericIdentification4> value) {
			obj.setProprietaryIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BIC")
	protected BICIdentifier bIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification6, Optional<BICIdentifier>> mmBIC = new MMMessageAttribute<FinancialInstitutionIdentification6, Optional<BICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmObject();
			isDerived = false;
			xmlTag = "BIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public Optional<BICIdentifier> getValue(FinancialInstitutionIdentification6 obj) {
			return obj.getBIC();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification6 obj, Optional<BICIdentifier> value) {
			obj.setBIC(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmClearingSystemMemberIdentification,
						com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmProprietaryIdentification, com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmBIC);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstitutionIdentification6";
				definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ClearingSystemMemberIdentification2Choice> getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification == null ? Optional.empty() : Optional.of(clearingSystemMemberIdentification);
	}

	public FinancialInstitutionIdentification6 setClearingSystemMemberIdentification(ClearingSystemMemberIdentification2Choice clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
		return this;
	}

	public Optional<GenericIdentification4> getProprietaryIdentification() {
		return proprietaryIdentification == null ? Optional.empty() : Optional.of(proprietaryIdentification);
	}

	public FinancialInstitutionIdentification6 setProprietaryIdentification(GenericIdentification4 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
		return this;
	}

	public Optional<BICIdentifier> getBIC() {
		return bIC == null ? Optional.empty() : Optional.of(bIC);
	}

	public FinancialInstitutionIdentification6 setBIC(BICIdentifier bIC) {
		this.bIC = bIC;
		return this;
	}
}