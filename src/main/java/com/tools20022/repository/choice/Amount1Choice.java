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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.entity.UndertakingAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of amounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Amount1Choice#mmIncreaseAmount
 * Amount1Choice.mmIncreaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Amount1Choice#mmDecreaseAmount
 * Amount1Choice.mmDecreaseAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
 * UndertakingAmount}</li>
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
 * "Amount1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of amounts."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amount1Choice", propOrder = {"increaseAmount", "decreaseAmount"})
public class Amount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IncrAmt", required = true)
	protected ActiveCurrencyAndAmount increaseAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmChangeOfAmount
	 * AmendmentOfUndertaking.mmChangeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice Amount1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of increase, and currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amount1Choice, ActiveCurrencyAndAmount> mmIncreaseAmount = new MMMessageAttribute<Amount1Choice, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmChangeOfAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.Amount1Choice.mmObject();
			isDerived = false;
			xmlTag = "IncrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseAmount";
			definition = "Amount of increase, and currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Amount1Choice obj) {
			return obj.getIncreaseAmount();
		}

		@Override
		public void setValue(Amount1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setIncreaseAmount(value);
		}
	};
	@XmlElement(name = "DcrAmt", required = true)
	protected ActiveCurrencyAndAmount decreaseAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmChangeOfAmount
	 * AmendmentOfUndertaking.mmChangeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Amount1Choice Amount1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of decrease, and currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amount1Choice, ActiveCurrencyAndAmount> mmDecreaseAmount = new MMMessageAttribute<Amount1Choice, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmChangeOfAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.Amount1Choice.mmObject();
			isDerived = false;
			xmlTag = "DcrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseAmount";
			definition = "Amount of decrease, and currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Amount1Choice obj) {
			return obj.getDecreaseAmount();
		}

		@Override
		public void setValue(Amount1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setDecreaseAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Amount1Choice.mmIncreaseAmount, com.tools20022.repository.choice.Amount1Choice.mmDecreaseAmount);
				trace_lazy = () -> UndertakingAmount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amount1Choice";
				definition = "Choice of amounts.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getIncreaseAmount() {
		return increaseAmount;
	}

	public Amount1Choice setIncreaseAmount(ActiveCurrencyAndAmount increaseAmount) {
		this.increaseAmount = Objects.requireNonNull(increaseAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getDecreaseAmount() {
		return decreaseAmount;
	}

	public Amount1Choice setDecreaseAmount(ActiveCurrencyAndAmount decreaseAmount) {
		this.decreaseAmount = Objects.requireNonNull(decreaseAmount);
		return this;
	}
}