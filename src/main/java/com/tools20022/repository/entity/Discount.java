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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DiscountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EarlyPayment1;
import com.tools20022.repository.msg.PaymentTerms6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Decrease of the value of goods and / or services by applying a discount rate
 * to the original amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discount" src="doc-files/Discount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
 * Discount.mmDiscountAppliedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount#mmDiscountType
 * Discount.mmDiscountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountBasisAmount
 * Discount.mmDiscountBasisAmount}</li>
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
 * "Discount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decrease of the value of goods and / or services by applying a discount rate to the original amount."
 * </li>
 * </ul>
 */
public class Discount extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount discountAppliedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDiscountAmount
	 * PaymentTerms6.mmDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountAmount
	 * EarlyPayment1.mmDiscountAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discount, CurrencyAndAmount> mmDiscountAppliedAmount = new MMBusinessAttribute<Discount, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTerms6.mmDiscountAmount, EarlyPayment1.mmDiscountAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Discount obj) {
			return obj.getDiscountAppliedAmount();
		}

		@Override
		public void setValue(Discount obj, CurrencyAndAmount value) {
			obj.setDiscountAppliedAmount(value);
		}
	};
	protected DiscountTypeCode discountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DiscountTypeCode
	 * DiscountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of discount applied to the original amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discount, DiscountTypeCode> mmDiscountType = new MMBusinessAttribute<Discount, DiscountTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountType";
			definition = "Specifies the type of discount applied to the original amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DiscountTypeCode.mmObject();
		}

		@Override
		public DiscountTypeCode getValue(Discount obj) {
			return obj.getDiscountType();
		}

		@Override
		public void setValue(Discount obj, DiscountTypeCode value) {
			obj.setDiscountType(value);
		}
	};
	protected CurrencyAndAmount discountBasisAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmBasisAmount
	 * PaymentTerms6.mmBasisAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Discount
	 * Discount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount used as a basis to calculate the discount amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discount, CurrencyAndAmount> mmDiscountBasisAmount = new MMBusinessAttribute<Discount, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTerms6.mmBasisAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Amount used as a basis to calculate the discount amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Discount obj) {
			return obj.getDiscountBasisAmount();
		}

		@Override
		public void setValue(Discount obj, CurrencyAndAmount value) {
			obj.setDiscountBasisAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Discount";
				definition = "Decrease of the value of goods and / or services by applying a discount rate to the original amount.";
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Discount.mmDiscountAppliedAmount, com.tools20022.repository.entity.Discount.mmDiscountType, com.tools20022.repository.entity.Discount.mmDiscountBasisAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Discount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getDiscountAppliedAmount() {
		return discountAppliedAmount;
	}

	public Discount setDiscountAppliedAmount(CurrencyAndAmount discountAppliedAmount) {
		this.discountAppliedAmount = Objects.requireNonNull(discountAppliedAmount);
		return this;
	}

	public DiscountTypeCode getDiscountType() {
		return discountType;
	}

	public Discount setDiscountType(DiscountTypeCode discountType) {
		this.discountType = Objects.requireNonNull(discountType);
		return this;
	}

	public CurrencyAndAmount getDiscountBasisAmount() {
		return discountBasisAmount;
	}

	public Discount setDiscountBasisAmount(CurrencyAndAmount discountBasisAmount) {
		this.discountBasisAmount = Objects.requireNonNull(discountBasisAmount);
		return this;
	}
}