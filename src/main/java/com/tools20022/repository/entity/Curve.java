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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes a benchmark curve.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Curve" src="doc-files/Curve.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmCurrency
 * Curve.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmPoint Curve.mmPoint}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmSpread
 * Curve.mmSpread}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
 * Spread.mmBenchmarkCurve}</li>
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
 * "Curve"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes a benchmark curve."</li>
 * </ul>
 */
public class Curve {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 220</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Curve, CurrencyCode> mmCurrency = new MMBusinessAttribute<Curve, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "220"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Identifies the currency used for the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Curve obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Curve obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected BenchmarkCurveNameCode name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 221</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Curve, BenchmarkCurveNameCode> mmName = new MMBusinessAttribute<Curve, BenchmarkCurveNameCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "221"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Identifies the name of the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}

		@Override
		public BenchmarkCurveNameCode getValue(Curve obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Curve obj, BenchmarkCurveNameCode value) {
			obj.setName(value);
		}
	};
	protected Max256Text point;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 222</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Point"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Curve, Max256Text> mmPoint = new MMBusinessAttribute<Curve, Max256Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "222"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Point";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(Curve obj) {
			return obj.getPoint();
		}

		@Override
		public void setValue(Curve obj, Max256Text value) {
			obj.setPoint(value);
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
	 * Spread.mmBenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread for which a benchmark curve is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Curve, Optional<Spread>> mmSpread = new MMBusinessAssociationEnd<Curve, Optional<Spread>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread for which a benchmark curve is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Spread.mmBenchmarkCurve;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Optional<Spread> getValue(Curve obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(Curve obj, Optional<Spread> value) {
			obj.setSpread(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Curve";
				definition = "Describes a benchmark curve.";
				associationDomain_lazy = () -> Arrays.asList(Spread.mmBenchmarkCurve);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Curve.mmCurrency, com.tools20022.repository.entity.Curve.mmName, com.tools20022.repository.entity.Curve.mmPoint,
						com.tools20022.repository.entity.Curve.mmSpread);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Curve.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Curve setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public BenchmarkCurveNameCode getName() {
		return name;
	}

	public Curve setName(BenchmarkCurveNameCode name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Max256Text getPoint() {
		return point;
	}

	public Curve setPoint(Max256Text point) {
		this.point = Objects.requireNonNull(point);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Curve setSpread(Spread spread) {
		this.spread = spread;
		return this;
	}
}