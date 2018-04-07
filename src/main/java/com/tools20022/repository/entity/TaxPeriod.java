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
import com.tools20022.repository.codeset.TaxRecordPeriodCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.TaxRecord;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Period of time details related to the tax payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxPeriod" src="doc-files/TaxPeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmTaxRecord
 * TaxPeriod.mmTaxRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmYear
 * TaxPeriod.mmYear}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmType
 * TaxPeriod.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
 * TaxPeriod.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmEndOfFiscalYear
 * TaxPeriod.mmEndOfFiscalYear}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
 * DateTimePeriod.mmTaxPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
 * TaxRecord.mmPeriod}</li>
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
 * "TaxPeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Period of time details related to the tax payment."</li>
 * </ul>
 */
public class TaxPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxRecord taxRecord;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
	 * TaxRecord.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax record for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxPeriod, Optional<TaxRecord>> mmTaxRecord = new MMBusinessAssociationEnd<TaxPeriod, Optional<TaxRecord>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRecord";
			definition = "Tax record for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TaxRecord.mmPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxRecord.mmObject();
		}

		@Override
		public Optional<TaxRecord> getValue(TaxPeriod obj) {
			return obj.getTaxRecord();
		}

		@Override
		public void setValue(TaxPeriod obj, Optional<TaxRecord> value) {
			obj.setTaxRecord(value.orElse(null));
		}
	};
	protected ISODate year;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxPeriod, ISODate> mmYear = new MMBusinessAttribute<TaxPeriod, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "Year related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxPeriod obj) {
			return obj.getYear();
		}

		@Override
		public void setValue(TaxPeriod obj, ISODate value) {
			obj.setYear(value);
		}
	};
	protected TaxRecordPeriodCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriodCode
	 * TaxRecordPeriodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the period related to the tax payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxPeriod, TaxRecordPeriodCode> mmType = new MMBusinessAttribute<TaxPeriod, TaxRecordPeriodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Identification of the period related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxRecordPeriodCode.mmObject();
		}

		@Override
		public TaxRecordPeriodCode getValue(TaxPeriod obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TaxPeriod obj, TaxRecordPeriodCode value) {
			obj.setType(value);
		}
	};
	protected DateTimePeriod fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
	 * DateTimePeriod.mmTaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for which the tax report is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TaxPeriod, DateTimePeriod> mmFromToDate = new MMBusinessAssociationEnd<TaxPeriod, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the tax report is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmTaxPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(TaxPeriod obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(TaxPeriod obj, DateTimePeriod value) {
			obj.setFromToDate(value);
		}
	};
	protected ISODate endOfFiscalYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TaxPeriod
	 * TaxPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfFiscalYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the fiscal year is closed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TaxPeriod, ISODate> mmEndOfFiscalYear = new MMBusinessAttribute<TaxPeriod, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date on which the fiscal year is closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxPeriod obj) {
			return obj.getEndOfFiscalYear();
		}

		@Override
		public void setValue(TaxPeriod obj, ISODate value) {
			obj.setEndOfFiscalYear(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxPeriod";
				definition = "Period of time details related to the tax payment.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmTaxPeriod, TaxRecord.mmPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxPeriod.mmTaxRecord, com.tools20022.repository.entity.TaxPeriod.mmYear, com.tools20022.repository.entity.TaxPeriod.mmType,
						com.tools20022.repository.entity.TaxPeriod.mmFromToDate, com.tools20022.repository.entity.TaxPeriod.mmEndOfFiscalYear);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxPeriod.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TaxRecord> getTaxRecord() {
		return taxRecord == null ? Optional.empty() : Optional.of(taxRecord);
	}

	public TaxPeriod setTaxRecord(TaxRecord taxRecord) {
		this.taxRecord = taxRecord;
		return this;
	}

	public ISODate getYear() {
		return year;
	}

	public TaxPeriod setYear(ISODate year) {
		this.year = Objects.requireNonNull(year);
		return this;
	}

	public TaxRecordPeriodCode getType() {
		return type;
	}

	public TaxPeriod setType(TaxRecordPeriodCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public DateTimePeriod getFromToDate() {
		return fromToDate;
	}

	public TaxPeriod setFromToDate(DateTimePeriod fromToDate) {
		this.fromToDate = Objects.requireNonNull(fromToDate);
		return this;
	}

	public ISODate getEndOfFiscalYear() {
		return endOfFiscalYear;
	}

	public TaxPeriod setEndOfFiscalYear(ISODate endOfFiscalYear) {
		this.endOfFiscalYear = Objects.requireNonNull(endOfFiscalYear);
		return this;
	}
}