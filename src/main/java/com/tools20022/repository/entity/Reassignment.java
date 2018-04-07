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
import com.tools20022.repository.codeset.CaseForwardingNotificationCode;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.entity.InvestigationResolution;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Action that consists in forwarding an investigation case assignment to
 * another party which becomes the new assignee.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reassignment" src="doc-files/Reassignment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
 * InvestigationResolution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reassignment#mmJustification
 * Reassignment.mmJustification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reassignment#mmReassignedCase
 * Reassignment.mmReassignedCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmReassignment
 * InvestigationCase.mmReassignment}</li>
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
 * "Reassignment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action that consists in forwarding an investigation case assignment to another party which becomes the new assignee."
 * </li>
 * </ul>
 */
public class Reassignment extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CaseForwardingNotificationCode justification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment Reassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Justification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification for the forward action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Reassignment, CaseForwardingNotificationCode> mmJustification = new MMBusinessAttribute<Reassignment, CaseForwardingNotificationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Justification";
			definition = "Justification for the forward action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseForwardingNotificationCode.mmObject();
		}

		@Override
		public CaseForwardingNotificationCode getValue(Reassignment obj) {
			return obj.getJustification();
		}

		@Override
		public void setValue(Reassignment obj, CaseForwardingNotificationCode value) {
			obj.setJustification(value);
		}
	};
	protected InvestigationCase reassignedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmReassignment
	 * InvestigationCase.mmReassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment Reassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReassignedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the investigation case that is assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Reassignment, Optional<InvestigationCase>> mmReassignedCase = new MMBusinessAssociationEnd<Reassignment, Optional<InvestigationCase>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReassignedCase";
			definition = "Specifies the investigation case that is assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmReassignment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}

		@Override
		public Optional<InvestigationCase> getValue(Reassignment obj) {
			return obj.getReassignedCase();
		}

		@Override
		public void setValue(Reassignment obj, Optional<InvestigationCase> value) {
			obj.setReassignedCase(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reassignment";
				definition = "Action that consists in forwarding an investigation case assignment to another party which becomes the new assignee.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.mmReassignment);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reassignment.mmJustification, com.tools20022.repository.entity.Reassignment.mmReassignedCase);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Reassignment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseForwardingNotificationCode getJustification() {
		return justification;
	}

	public Reassignment setJustification(CaseForwardingNotificationCode justification) {
		this.justification = Objects.requireNonNull(justification);
		return this;
	}

	public Optional<InvestigationCase> getReassignedCase() {
		return reassignedCase == null ? Optional.empty() : Optional.of(reassignedCase);
	}

	public Reassignment setReassignedCase(com.tools20022.repository.entity.InvestigationCase reassignedCase) {
		this.reassignedCase = reassignedCase;
		return this;
	}
}