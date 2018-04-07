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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyName" src="doc-files/PartyName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PartyName#mmName
 * PartyName.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName
 * OrganisationName}</li>
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
 * "PartyName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a party is known and which is usually used to identify that party."
 * </li>
 * </ul>
 */
public class PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5#mmName
	 * NameAndAddress5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmName
	 * FinancialInstitutionIdentification8.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#mmName
	 * BranchData2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#mmName
	 * PartyIdentification8.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmName
	 * ContactDetails2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmName
	 * PartyIdentification32.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmName
	 * PartyIdentification43.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmName
	 * FinancialInstitutionIdentification7.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmName
	 * ContactIdentification1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmName
	 * PartyIdentification41.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#mmName
	 * NameAndAddress10.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#mmName
	 * Contacts3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmName
	 * PartyIdentification42.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientName
	 * NonExtension1.mmNotificationRecipientName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToName
	 * CommunicationChannel1.mmDeliverToName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification25#mmName
	 * PartyIdentification25.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmName
	 * PartyIdentification45.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation1#mmName
	 * LegalOrganisation1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6#mmName
	 * NameAndAddress6.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#mmName
	 * PartyIdentification26.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#mmName
	 * PartyIdentification27.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmName
	 * ContactIdentification3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmAirCarrierName
	 * TransportByAir2.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmRoadCarrierName
	 * TransportByRoad2.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmRailCarrierName
	 * TransportByRail2.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification28#mmName
	 * PartyIdentification28.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmRailCarrierName
	 * TransportByRail4.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmCarrierAgentName
	 * TransportByRail4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierName
	 * TransportByAir4.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmCarrierAgentName
	 * TransportByAir4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmRoadCarrierName
	 * TransportByRoad4.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmCarrierAgentName
	 * TransportByRoad4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentName
	 * TransportBySea5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmAirCarrierName
	 * TransportByAir5.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmCarrierAgentName
	 * TransportByAir5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierName
	 * TransportBySea6.mmSeaCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentName
	 * TransportBySea6.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmRailCarrierName
	 * TransportByRail5.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmCarrierAgentName
	 * TransportByRail5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmRoadCarrierName
	 * TransportByRoad5.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmCarrierAgentName
	 * TransportByRoad5.mmCarrierAgentName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyName, Max140Text> mmName = new MMBusinessAttribute<PartyName, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(NameAndAddress5.mmName, FinancialInstitutionIdentification8.mmName, BranchData2.mmName, PartyIdentification8.mmName, ContactDetails2.mmName, PartyIdentification32.mmName,
					PartyIdentification43.mmName, FinancialInstitutionIdentification7.mmName, ContactIdentification1.mmName, PartyIdentification41.mmName, NameAndAddress10.mmName, Contacts3.mmName, PartyIdentification42.mmName,
					NonExtension1.mmNotificationRecipientName, CommunicationChannel1.mmDeliverToName, PartyIdentification25.mmName, PartyIdentification45.mmName, LegalOrganisation1.mmName, NameAndAddress6.mmName,
					PartyIdentification26.mmName, PartyIdentification27.mmName, ContactIdentification3.mmName, TransportByAir2.mmAirCarrierName, TransportByRoad2.mmRoadCarrierName, TransportByRail2.mmRailCarrierName,
					PartyIdentification28.mmName, TransportByRail4.mmRailCarrierName, TransportByRail4.mmCarrierAgentName, TransportByAir4.mmAirCarrierName, TransportByAir4.mmCarrierAgentName, TransportByRoad4.mmRoadCarrierName,
					TransportByRoad4.mmCarrierAgentName, TransportBySea5.mmCarrierAgentName, TransportByAir5.mmAirCarrierName, TransportByAir5.mmCarrierAgentName, TransportBySea6.mmSeaCarrierName, TransportBySea6.mmCarrierAgentName,
					TransportByRail5.mmRailCarrierName, TransportByRail5.mmCarrierAgentName, TransportByRoad5.mmRoadCarrierName, TransportByRoad5.mmCarrierAgentName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PartyName obj) {
			return obj.getName();
		}

		@Override
		public void setValue(PartyName obj, Max140Text value) {
			obj.setName(value);
		}
	};
	protected PartyIdentificationInformation partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
	 * PartyIdentificationInformation.mmPartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyName, Optional<PartyIdentificationInformation>> mmPartyIdentification = new MMBusinessAssociationEnd<PartyName, Optional<PartyIdentificationInformation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PartyIdentificationInformation.mmPartyName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public Optional<PartyIdentificationInformation> getValue(PartyName obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyName obj, Optional<PartyIdentificationInformation> value) {
			obj.setPartyIdentification(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(PartyIdentificationInformation.mmPartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.mmName, com.tools20022.repository.entity.PartyName.mmPartyIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getName() {
		return name;
	}

	public PartyName setName(Max140Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<PartyIdentificationInformation> getPartyIdentification() {
		return partyIdentification == null ? Optional.empty() : Optional.of(partyIdentification);
	}

	public PartyName setPartyIdentification(PartyIdentificationInformation partyIdentification) {
		this.partyIdentification = partyIdentification;
		return this;
	}
}