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
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Process of matching different documents submitted by parties to a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reconciliation" src="doc-files/Reconciliation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmSystem
 * Reconciliation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
 * Reconciliation.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmReconciledTrades
 * Reconciliation.mmReconciledTrades}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmAccount
 * Reconciliation.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReconciliation
 * Account.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmReconciliation
 * Trade.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmReconciliation
 * Document.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmReconciliation
 * System.mmReconciliation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
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
 * "Reconciliation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of matching different documents submitted by parties to a trade."</li>
 * </ul>
 */
public class Reconciliation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<System> system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmReconciliation
	 * System.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System which provides the reconciliation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Reconciliation, List<System>> mmSystem = new MMBusinessAssociationEnd<Reconciliation, List<System>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System which provides the reconciliation process.";
			minOccurs = 0;
			opposite_lazy = () -> System.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> System.mmObject();
		}

		@Override
		public List<System> getValue(Reconciliation obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(Reconciliation obj, List<System> value) {
			obj.setSystem(value);
		}
	};
	protected Document document;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmReconciliation
	 * Document.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document submitted in a reconciliation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Reconciliation, Document> mmDocument = new MMBusinessAssociationEnd<Reconciliation, Document>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document submitted in a reconciliation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Document.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public Document getValue(Reconciliation obj) {
			return obj.getDocument();
		}

		@Override
		public void setValue(Reconciliation obj, Document value) {
			obj.setDocument(value);
		}
	};
	protected Trade reconciledTrades;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmReconciliation
	 * Trade.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciledTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades which are reconciled with entries in an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Reconciliation, Trade> mmReconciledTrades = new MMBusinessAssociationEnd<Reconciliation, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciledTrades";
			definition = "Trades which are reconciled with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Reconciliation obj) {
			return obj.getReconciledTrades();
		}

		@Override
		public void setValue(Reconciliation obj, Trade value) {
			obj.setReconciledTrades(value);
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmReconciliation
	 * Account.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a reconciliation process is performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Reconciliation, Account> mmAccount = new MMBusinessAssociationEnd<Reconciliation, Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reconciliation process is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Account.mmReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public Account getValue(Reconciliation obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Reconciliation obj, Account value) {
			obj.setAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reconciliation";
				definition = "Process of matching different documents submitted by parties to a trade.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmReconciliation, Trade.mmReconciliation, Document.mmReconciliation, System.mmReconciliation);
				subType_lazy = () -> Arrays.asList(ReconciliationTransaction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reconciliation.mmSystem, com.tools20022.repository.entity.Reconciliation.mmDocument, com.tools20022.repository.entity.Reconciliation.mmReconciledTrades,
						com.tools20022.repository.entity.Reconciliation.mmAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Reconciliation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<System> getSystem() {
		return system == null ? system = new ArrayList<>() : system;
	}

	public Reconciliation setSystem(List<System> system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public Document getDocument() {
		return document;
	}

	public Reconciliation setDocument(Document document) {
		this.document = Objects.requireNonNull(document);
		return this;
	}

	public Trade getReconciledTrades() {
		return reconciledTrades;
	}

	public Reconciliation setReconciledTrades(Trade reconciledTrades) {
		this.reconciledTrades = Objects.requireNonNull(reconciledTrades);
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public Reconciliation setAccount(Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}
}