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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BankContactPerson1Choice;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactIdentification1;
import com.tools20022.repository.msg.ContactIdentification3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Person to be contacted in a given organisation. In the corporate action
 * domain (including meeting notifications) , it is the contact person at the
 * party organising the meeting, at the issuer or at an intermediary.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ContactPersonRole" src="doc-files/ContactPersonRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
 * ContactPersonRole.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
 * ContactPersonRole.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
 * ContactPersonRole.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
 * Role.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
 * Person.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPerson
 * Meeting.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice#mmBuyerBankContactPerson
 * BankContactPerson1Choice.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice#mmSellerBankContactPerson
 * BankContactPerson1Choice.mmSellerBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification1
 * ContactIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactIdentification3
 * ContactIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BankContactPerson1Choice
 * BankContactPerson1Choice}</li>
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
 * "ContactPersonRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Person to be contacted in a given organisation. In the corporate action domain (including meeting notifications) , it is the contact person at the party organising the meeting, at the issuer or at an intermediary."
 * </li>
 * </ul>
 */
public class ContactPersonRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Role> role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmRole
	 * ContactIdentification1.mmRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role for which a contact person is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPersonRole, List<Role>> mmRole = new MMBusinessAssociationEnd<ContactPersonRole, List<Role>>() {
		{
			derivation_lazy = () -> Arrays.asList(ContactIdentification1.mmRole);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Role";
			definition = "Role for which a contact person is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Role.mmContactPersonRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
		}

		@Override
		public List<Role> getValue(ContactPersonRole obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(ContactPersonRole obj, List<Role> value) {
			obj.setRole(value);
		}
	};
	protected List<com.tools20022.repository.entity.Meeting> meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmPerson
	 * Meeting.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which a person is the contact."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPersonRole, List<Meeting>> mmMeeting = new MMBusinessAssociationEnd<ContactPersonRole, List<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a person is the contact.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}

		@Override
		public List<Meeting> getValue(ContactPersonRole obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(ContactPersonRole obj, List<Meeting> value) {
			obj.setMeeting(value);
		}
	};
	protected Person person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
	 * Person.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the person which plays the role of contact."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ContactPersonRole, com.tools20022.repository.entity.Person> mmPerson = new MMBusinessAssociationEnd<ContactPersonRole, com.tools20022.repository.entity.Person>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identifies the person which plays the role of contact.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmContactPersonRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Person getValue(ContactPersonRole obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(ContactPersonRole obj, com.tools20022.repository.entity.Person value) {
			obj.setPerson(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactPersonRole";
				definition = "Person to be contacted in a given organisation. In the corporate action domain (including meeting notifications) , it is the contact person at the party organising the meeting, at the issuer or at an intermediary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmContactPersonRole, com.tools20022.repository.entity.Person.mmContactPersonRole, com.tools20022.repository.entity.Meeting.mmPerson);
				derivationElement_lazy = () -> Arrays.asList(BankContactPerson1Choice.mmBuyerBankContactPerson, BankContactPerson1Choice.mmSellerBankContactPerson);
				superType_lazy = () -> com.tools20022.repository.entity.Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPersonRole.mmRole, com.tools20022.repository.entity.ContactPersonRole.mmMeeting, com.tools20022.repository.entity.ContactPersonRole.mmPerson);
				derivationComponent_lazy = () -> Arrays.asList(ContactIdentification1.mmObject(), ContactIdentification3.mmObject(), BankContactPerson1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ContactPersonRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Role> getRole() {
		return role == null ? role = new ArrayList<>() : role;
	}

	public ContactPersonRole setRole(List<com.tools20022.repository.entity.Role> role) {
		this.role = Objects.requireNonNull(role);
		return this;
	}

	public List<Meeting> getMeeting() {
		return meeting == null ? meeting = new ArrayList<>() : meeting;
	}

	public ContactPersonRole setMeeting(List<com.tools20022.repository.entity.Meeting> meeting) {
		this.meeting = Objects.requireNonNull(meeting);
		return this;
	}

	public Person getPerson() {
		return person;
	}

	public ContactPersonRole setPerson(com.tools20022.repository.entity.Person person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}
}