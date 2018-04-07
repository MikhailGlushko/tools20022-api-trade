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
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountService" src="doc-files/AccountService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountContract
 * AccountService.mmAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmReservation
 * AccountService.mmReservation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#mmAccount
 * AccountService.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
 * AccountService.mmAccountAdministrationCharge}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountService
 * Account.mmAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountService
 * AccountContract.mmAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmAccountService
 * Reservation.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmServices
 * Charges.mmServices}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccountService
 * InvestmentAccountService}</li>
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
 * "AccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate."
 * </li>
 * </ul>
 */
public class AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<AccountContract> accountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountService
	 * AccountContract.mmAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract which specifies the services linked to an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountService, List<AccountContract>> mmAccountContract = new MMBusinessAssociationEnd<AccountService, List<AccountContract>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountContract";
			definition = "Account contract which specifies the services linked to an account.";
			minOccurs = 0;
			opposite_lazy = () -> AccountContract.mmAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountContract.mmObject();
		}

		@Override
		public List<AccountContract> getValue(AccountService obj) {
			return obj.getAccountContract();
		}

		@Override
		public void setValue(AccountService obj, List<AccountContract> value) {
			obj.setAccountContract(value);
		}
	};
	protected Reservation reservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmAccountService
	 * Reservation.mmAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reservation information included in the services related to an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountService, Reservation> mmReservation = new MMBusinessAssociationEnd<AccountService, Reservation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Reservation information included in the services related to an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Reservation.mmAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reservation.mmObject();
		}

		@Override
		public Reservation getValue(AccountService obj) {
			return obj.getReservation();
		}

		@Override
		public void setValue(AccountService obj, Reservation value) {
			obj.setReservation(value);
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountService
	 * Account.mmAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which services are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountService, Account> mmAccount = new MMBusinessAssociationEnd<AccountService, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account for which services are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(AccountService obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountService obj, Account value) {
			obj.setAccount(value);
		}
	};
	protected Charges accountAdministrationCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmServices
	 * Charges.mmServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAdministrationCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge applied for the administration of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountService, Optional<Charges>> mmAccountAdministrationCharge = new MMBusinessAssociationEnd<AccountService, Optional<Charges>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountAdministrationCharge";
			definition = "Charge applied for the administration of an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public Optional<Charges> getValue(AccountService obj) {
			return obj.getAccountAdministrationCharge();
		}

		@Override
		public void setValue(AccountService obj, Optional<Charges> value) {
			obj.setAccountAdministrationCharge(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmAccountService, AccountContract.mmAccountService, Reservation.mmAccountService, Charges.mmServices);
				subType_lazy = () -> Arrays.asList(ReportingService.mmObject(), CashAccountService.mmObject(), InvestmentAccountService.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.mmAccountContract, com.tools20022.repository.entity.AccountService.mmReservation, com.tools20022.repository.entity.AccountService.mmAccount,
						com.tools20022.repository.entity.AccountService.mmAccountAdministrationCharge);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountContract> getAccountContract() {
		return accountContract == null ? accountContract = new ArrayList<>() : accountContract;
	}

	public AccountService setAccountContract(List<AccountContract> accountContract) {
		this.accountContract = Objects.requireNonNull(accountContract);
		return this;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public AccountService setReservation(Reservation reservation) {
		this.reservation = Objects.requireNonNull(reservation);
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public AccountService setAccount(Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<Charges> getAccountAdministrationCharge() {
		return accountAdministrationCharge == null ? Optional.empty() : Optional.of(accountAdministrationCharge);
	}

	public AccountService setAccountAdministrationCharge(Charges accountAdministrationCharge) {
		this.accountAdministrationCharge = accountAdministrationCharge;
		return this;
	}
}