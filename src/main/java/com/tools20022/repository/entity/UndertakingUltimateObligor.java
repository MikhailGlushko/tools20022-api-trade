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
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.UndertakingPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Undertaking1;
import com.tools20022.repository.msg.UndertakingAdvice2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;

/**
 * Party that takes responsibility for indemnifying the issuer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingUltimateObligor"
 * src="doc-files/UndertakingUltimateObligor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
 * UndertakingPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
 * UndertakingUltimateObligor.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmUltimateObligor
 * CashAccount.mmUltimateObligor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmObligor
 * Undertaking1.mmObligor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmObligor
 * UndertakingAdvice2.mmObligor}</li>
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
 * "UndertakingUltimateObligor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that takes responsibility for indemnifying the issuer."</li>
 * </ul>
 */
public class UndertakingUltimateObligor extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmUltimateObligor
	 * CashAccount.mmUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorLiabilityAccount
	 * Undertaking1.mmObligorLiabilityAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorChargeAccount
	 * Undertaking1.mmObligorChargeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmObligorSettlementAccount
	 * Undertaking1.mmObligorSettlementAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accounts nominated by the obligor for the settlement of the amount claimed, or for the settlement of charges or to record the liability amount related to the undertaking. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingUltimateObligor, Optional<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<UndertakingUltimateObligor, Optional<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmObligorLiabilityAccount, Undertaking1.mmObligorChargeAccount, Undertaking1.mmObligorSettlementAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Accounts nominated by the obligor for the settlement of the amount claimed, or for the settlement of charges or to record the liability amount related to the undertaking. ";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmUltimateObligor;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public Optional<CashAccount> getValue(UndertakingUltimateObligor obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(UndertakingUltimateObligor obj, Optional<CashAccount> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingUltimateObligor";
				definition = "Party that takes responsibility for indemnifying the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmUltimateObligor);
				derivationElement_lazy = () -> Arrays.asList(Undertaking1.mmObligor, UndertakingAdvice2.mmObligor);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingUltimateObligor.mmCashAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingUltimateObligor.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CashAccount> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public UndertakingUltimateObligor setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}
}