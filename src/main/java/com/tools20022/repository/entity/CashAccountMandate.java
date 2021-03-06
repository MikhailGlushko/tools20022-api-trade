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
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Authorisation given to a mandate holder to perform some operation on an
 * account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountMandate" src="doc-files/CashAccountMandate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmServices
 * CashAccountMandate.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmCashAccountContract
 * CashAccountMandate.mmCashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccountMandate
 * CashAccountContract.mmCashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
 * CashAccountService.mmCashAccountMandate}</li>
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
 * "CashAccountMandate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Authorisation given to a mandate holder to perform some operation on an account."
 * </li>
 * </ul>
 */
public class CashAccountMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CashAccountService> services;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
	 * CashAccountService.mmCashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services that the holder of an account mandate can exercise."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountMandate, List<CashAccountService>> mmServices = new MMBusinessAssociationEnd<CashAccountMandate, List<CashAccountService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Services that the holder of an account mandate can exercise.";
			minOccurs = 0;
			opposite_lazy = () -> CashAccountService.mmCashAccountMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}

		@Override
		public List<CashAccountService> getValue(CashAccountMandate obj) {
			return obj.getServices();
		}

		@Override
		public void setValue(CashAccountMandate obj, List<CashAccountService> value) {
			obj.setServices(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashAccountContract> cashAccountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccountMandate
	 * CashAccountContract.mmCashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract to which a mandate applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountMandate, List<CashAccountContract>> mmCashAccountContract = new MMBusinessAssociationEnd<CashAccountMandate, List<CashAccountContract>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract to which a mandate applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmCashAccountMandate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}

		@Override
		public List<CashAccountContract> getValue(CashAccountMandate obj) {
			return obj.getCashAccountContract();
		}

		@Override
		public void setValue(CashAccountMandate obj, List<CashAccountContract> value) {
			obj.setCashAccountContract(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountMandate";
				definition = "Authorisation given to a mandate holder to perform some operation on an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.mmCashAccountMandate, CashAccountService.mmCashAccountMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountMandate.mmServices, com.tools20022.repository.entity.CashAccountMandate.mmCashAccountContract);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashAccountMandate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccountService> getServices() {
		return services == null ? services = new ArrayList<>() : services;
	}

	public CashAccountMandate setServices(List<CashAccountService> services) {
		this.services = Objects.requireNonNull(services);
		return this;
	}

	public List<CashAccountContract> getCashAccountContract() {
		return cashAccountContract == null ? cashAccountContract = new ArrayList<>() : cashAccountContract;
	}

	public CashAccountMandate setCashAccountContract(List<com.tools20022.repository.entity.CashAccountContract> cashAccountContract) {
		this.cashAccountContract = Objects.requireNonNull(cashAccountContract);
		return this;
	}
}