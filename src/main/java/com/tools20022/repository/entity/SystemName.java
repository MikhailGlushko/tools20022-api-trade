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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Name of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemName" src="doc-files/SystemName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemName#mmName
 * SystemName.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemName#mmSystemIdentification
 * SystemName.mmSystemIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemName
 * SystemIdentification.mmSystemName}</li>
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
 * "SystemName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Name of a system."</li>
 * </ul>
 */
public class SystemName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemName SystemName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a system for instance the common name assigned by the acquirer to the POI system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemName, Max70Text> mmName = new MMBusinessAttribute<SystemName, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a system for instance the common name assigned by the acquirer to the POI system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(SystemName obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SystemName obj, Max70Text value) {
			obj.setName(value);
		}
	};
	protected SystemIdentification systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemName
	 * SystemIdentification.mmSystemName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemName SystemName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemName, SystemIdentification> mmSystemIdentification = new MMBusinessAssociationEnd<SystemName, SystemIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "System identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemIdentification.mmSystemName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemIdentification.mmObject();
		}

		@Override
		public SystemIdentification getValue(SystemName obj) {
			return obj.getSystemIdentification();
		}

		@Override
		public void setValue(SystemName obj, SystemIdentification value) {
			obj.setSystemIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemName";
				definition = "Name of a system.";
				associationDomain_lazy = () -> Arrays.asList(SystemIdentification.mmSystemName);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemName.mmName, com.tools20022.repository.entity.SystemName.mmSystemIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getName() {
		return name;
	}

	public SystemName setName(Max70Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public SystemIdentification getSystemIdentification() {
		return systemIdentification;
	}

	public SystemName setSystemIdentification(SystemIdentification systemIdentification) {
		this.systemIdentification = Objects.requireNonNull(systemIdentification);
		return this;
	}
}