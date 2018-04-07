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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05;
import com.tools20022.repository.area.tsmt.BaselineReSubmissionV05;
import com.tools20022.repository.area.tsmt.FullPushThroughReportV05;
import com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.entity.*;
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
 * Information needed to contact a physical person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification1#mmName
 * ContactIdentification1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmNamePrefix
 * ContactIdentification1.mmNamePrefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmGivenName
 * ContactIdentification1.mmGivenName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification1#mmRole
 * ContactIdentification1.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmPhoneNumber
 * ContactIdentification1.mmPhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmFaxNumber
 * ContactIdentification1.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmEmailAddress
 * ContactIdentification1.mmEmailAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBuyerContactPerson
 * InitialBaselineSubmissionV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSellerContactPerson
 * InitialBaselineSubmissionV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerContactPerson
 * BaselineAmendmentRequestV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerContactPerson
 * BaselineAmendmentRequestV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerBankContactPerson
 * BaselineAmendmentRequestV05.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerBankContactPerson
 * BaselineAmendmentRequestV05.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmBuyerContactPerson
 * FullPushThroughReportV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmSellerContactPerson
 * FullPushThroughReportV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmBuyerBankContactPerson
 * FullPushThroughReportV05.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmSellerBankContactPerson
 * FullPushThroughReportV05.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmBuyerContactPerson
 * BaselineReSubmissionV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSellerContactPerson
 * BaselineReSubmissionV05.mmSellerContactPerson}</li>
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
 * "ContactIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information needed to contact a physical person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContactIdentification1", propOrder = {"name", "namePrefix", "givenName", "role", "phoneNumber", "faxNumber", "emailAddress"})
public class ContactIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm", required = true)
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Max35Text> mmName = new MMMessageAttribute<ContactIdentification1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ContactIdentification1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Max35Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the terms used to formally address a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<NamePrefix1Code>> mmNamePrefix = new MMMessageAttribute<ContactIdentification1, Optional<NamePrefix1Code>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}

		@Override
		public Optional<NamePrefix1Code> getValue(ContactIdentification1 obj) {
			return obj.getNamePrefix();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<NamePrefix1Code> value) {
			obj.setNamePrefix(value.orElse(null));
		}
	};
	@XmlElement(name = "GvnNm")
	protected Max35Text givenName;
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<Max35Text>> mmGivenName = new MMMessageAttribute<ContactIdentification1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ContactIdentification1 obj) {
			return obj.getGivenName();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<Max35Text> value) {
			obj.setGivenName(value.orElse(null));
		}
	};
	@XmlElement(name = "Role")
	protected Max35Text role;
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
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
	 * ContactPersonRole.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of the party in the activity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<Max35Text>> mmRole = new MMMessageAttribute<ContactIdentification1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ContactPersonRole.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Role of the party in the activity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ContactIdentification1 obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<Max35Text> value) {
			obj.setRole(value.orElse(null));
		}
	};
	@XmlElement(name = "PhneNb")
	protected PhoneNumber phoneNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmPhoneNumber
	 * PhoneAddress.mmPhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhneNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<PhoneNumber>> mmPhoneNumber = new MMMessageAttribute<ContactIdentification1, Optional<PhoneNumber>>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmPhoneNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(ContactIdentification1 obj) {
			return obj.getPhoneNumber();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<PhoneNumber> value) {
			obj.setPhoneNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FaxNb")
	protected PhoneNumber faxNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress#mmFaxNumber
	 * PhoneAddress.mmFaxNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a FAX number, as defined by telecom services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<PhoneNumber>> mmFaxNumber = new MMMessageAttribute<ContactIdentification1, Optional<PhoneNumber>>() {
		{
			businessElementTrace_lazy = () -> PhoneAddress.mmFaxNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(ContactIdentification1 obj) {
			return obj.getFaxNumber();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<PhoneNumber> value) {
			obj.setFaxNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EmailAdr")
	protected Max256Text emailAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmEmailAddress
	 * ElectronicAddress.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactIdentification1, Optional<Max256Text>> mmEmailAddress = new MMMessageAttribute<ContactIdentification1, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmEmailAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContactIdentification1.mmObject();
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(ContactIdentification1 obj) {
			return obj.getEmailAddress();
		}

		@Override
		public void setValue(ContactIdentification1 obj, Optional<Max256Text> value) {
			obj.setEmailAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactIdentification1.mmName, com.tools20022.repository.msg.ContactIdentification1.mmNamePrefix,
						com.tools20022.repository.msg.ContactIdentification1.mmGivenName, com.tools20022.repository.msg.ContactIdentification1.mmRole, com.tools20022.repository.msg.ContactIdentification1.mmPhoneNumber,
						com.tools20022.repository.msg.ContactIdentification1.mmFaxNumber, com.tools20022.repository.msg.ContactIdentification1.mmEmailAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmBuyerContactPerson, InitialBaselineSubmissionV05.mmSellerContactPerson, BaselineAmendmentRequestV05.mmBuyerContactPerson,
						BaselineAmendmentRequestV05.mmSellerContactPerson, BaselineAmendmentRequestV05.mmBuyerBankContactPerson, BaselineAmendmentRequestV05.mmSellerBankContactPerson, FullPushThroughReportV05.mmBuyerContactPerson,
						FullPushThroughReportV05.mmSellerContactPerson, FullPushThroughReportV05.mmBuyerBankContactPerson, FullPushThroughReportV05.mmSellerBankContactPerson, BaselineReSubmissionV05.mmBuyerContactPerson,
						BaselineReSubmissionV05.mmSellerContactPerson);
				trace_lazy = () -> ContactPersonRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactIdentification1";
				definition = "Information needed to contact a physical person.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public ContactIdentification1 setName(Max35Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<NamePrefix1Code> getNamePrefix() {
		return namePrefix == null ? Optional.empty() : Optional.of(namePrefix);
	}

	public ContactIdentification1 setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Optional<Max35Text> getGivenName() {
		return givenName == null ? Optional.empty() : Optional.of(givenName);
	}

	public ContactIdentification1 setGivenName(Max35Text givenName) {
		this.givenName = givenName;
		return this;
	}

	public Optional<Max35Text> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public ContactIdentification1 setRole(Max35Text role) {
		this.role = role;
		return this;
	}

	public Optional<PhoneNumber> getPhoneNumber() {
		return phoneNumber == null ? Optional.empty() : Optional.of(phoneNumber);
	}

	public ContactIdentification1 setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Optional<PhoneNumber> getFaxNumber() {
		return faxNumber == null ? Optional.empty() : Optional.of(faxNumber);
	}

	public ContactIdentification1 setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
		return this;
	}

	public Optional<Max256Text> getEmailAddress() {
		return emailAddress == null ? Optional.empty() : Optional.of(emailAddress);
	}

	public ContactIdentification1 setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}
}