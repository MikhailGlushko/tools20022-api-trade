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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxPeriod;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Record of tax details.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxRecord" src="doc-files/TaxRecord.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTaxRecordType
 * TaxRecord.mmTaxRecordType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmCategory
 * TaxRecord.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmStatus
 * TaxRecord.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmFormsCode
 * TaxRecord.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
 * TaxRecord.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmAmount
 * TaxRecord.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmCategoryDescription
 * TaxRecord.mmCategoryDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
 * TaxPeriod.mmTaxRecord}</li>
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
 * "TaxRecord"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Record of tax details."</li>
 * </ul>
 */
public class TaxRecord {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Tax tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmRecord
	 * Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which tax record information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxRecord, Optional<Tax>> mmTax = new MMBusinessAssociationEnd<TaxRecord, Optional<Tax>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which tax record information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmRecord;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Optional<Tax> getValue(TaxRecord obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(TaxRecord obj, Optional<Tax> value) {
			obj.setTax(value.orElse(null));
		}
	};
	protected Max35Text taxRecordType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecordType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High level code to identify the type of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, Max35Text> mmTaxRecordType = new MMBusinessAttribute<TaxRecord, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRecordType";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxRecord obj) {
			return obj.getTaxRecordType();
		}

		@Override
		public void setValue(TaxRecord obj, Max35Text value) {
			obj.setTaxRecordType(value);
		}
	};
	protected Max35Text category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the tax that is being paid, including specific representation (code) required by the tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, Max35Text> mmCategory = new MMBusinessAttribute<TaxRecord, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Description of the tax that is being paid, including specific representation (code) required by the tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxRecord obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(TaxRecord obj, Max35Text value) {
			obj.setCategory(value);
		}
	};
	protected Max35Text status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code provided by local authority to identify the status of the party that has drawn up the settlement document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, Max35Text> mmStatus = new MMBusinessAttribute<TaxRecord, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxRecord obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(TaxRecord obj, Max35Text value) {
			obj.setStatus(value);
		}
	};
	protected Max35Text formsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code to identify on which template the tax report is to be provided"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, Max35Text> mmFormsCode = new MMBusinessAttribute<TaxRecord, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code to identify on which template the tax report is to be provided";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxRecord obj) {
			return obj.getFormsCode();
		}

		@Override
		public void setValue(TaxRecord obj, Max35Text value) {
			obj.setFormsCode(value);
		}
	};
	protected TaxPeriod period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
	 * TaxPeriod.mmTaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPeriod TaxPeriod}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time details related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxRecord, TaxPeriod> mmPeriod = new MMBusinessAssociationEnd<TaxRecord, TaxPeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Period";
			definition = "Period of time details related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TaxPeriod.mmTaxRecord;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxPeriod.mmObject();
		}

		@Override
		public TaxPeriod getValue(TaxRecord obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(TaxRecord obj, TaxPeriod value) {
			obj.setPeriod(value);
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the tax record."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, ActiveCurrencyAndAmount> mmAmount = new MMBusinessAttribute<TaxRecord, ActiveCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxRecord obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(TaxRecord obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Max35Text categoryDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxRecord
	 * TaxRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the tax that is being paid, including specific representation required by taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxRecord, Max35Text> mmCategoryDescription = new MMBusinessAttribute<TaxRecord, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CategoryDescription";
			definition = "Description of the tax that is being paid, including specific representation required by taxing authority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxRecord obj) {
			return obj.getCategoryDescription();
		}

		@Override
		public void setValue(TaxRecord obj, Max35Text value) {
			obj.setCategoryDescription(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord";
				definition = "Record of tax details.";
				associationDomain_lazy = () -> Arrays.asList(Tax.mmRecord, TaxPeriod.mmTaxRecord);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxRecord.mmTax, com.tools20022.repository.entity.TaxRecord.mmTaxRecordType, com.tools20022.repository.entity.TaxRecord.mmCategory,
						com.tools20022.repository.entity.TaxRecord.mmStatus, com.tools20022.repository.entity.TaxRecord.mmFormsCode, com.tools20022.repository.entity.TaxRecord.mmPeriod, com.tools20022.repository.entity.TaxRecord.mmAmount,
						com.tools20022.repository.entity.TaxRecord.mmCategoryDescription);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxRecord.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Tax> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public TaxRecord setTax(Tax tax) {
		this.tax = tax;
		return this;
	}

	public Max35Text getTaxRecordType() {
		return taxRecordType;
	}

	public TaxRecord setTaxRecordType(Max35Text taxRecordType) {
		this.taxRecordType = Objects.requireNonNull(taxRecordType);
		return this;
	}

	public Max35Text getCategory() {
		return category;
	}

	public TaxRecord setCategory(Max35Text category) {
		this.category = Objects.requireNonNull(category);
		return this;
	}

	public Max35Text getStatus() {
		return status;
	}

	public TaxRecord setStatus(Max35Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Max35Text getFormsCode() {
		return formsCode;
	}

	public TaxRecord setFormsCode(Max35Text formsCode) {
		this.formsCode = Objects.requireNonNull(formsCode);
		return this;
	}

	public TaxPeriod getPeriod() {
		return period;
	}

	public TaxRecord setPeriod(TaxPeriod period) {
		this.period = Objects.requireNonNull(period);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public TaxRecord setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Max35Text getCategoryDescription() {
		return categoryDescription;
	}

	public TaxRecord setCategoryDescription(Max35Text categoryDescription) {
		this.categoryDescription = Objects.requireNonNull(categoryDescription);
		return this;
	}
}