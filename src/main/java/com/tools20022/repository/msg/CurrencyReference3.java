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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExchangeRateInformation1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the process of a currency exchange or conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmTargetCurrency
 * CurrencyReference3.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmSourceCurrency
 * CurrencyReference3.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmExchangeRateInformation
 * CurrencyReference3.mmExchangeRateInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the process of a currency exchange or conversion."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyReference3", propOrder = {"targetCurrency", "sourceCurrency", "exchangeRateInformation"})
public class CurrencyReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrgtCcy", required = true)
	protected ActiveCurrencyCode targetCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which an amount is to be converted in a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyReference3, ActiveCurrencyCode> mmTargetCurrency = new MMMessageAttribute<CurrencyReference3, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyReference3.mmObject();
			isDerived = false;
			xmlTag = "TrgtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CurrencyReference3 obj) {
			return obj.getTargetCurrency();
		}

		@Override
		public void setValue(CurrencyReference3 obj, ActiveCurrencyCode value) {
			obj.setTargetCurrency(value);
		}
	};
	@XmlElement(name = "SrcCcy", required = true)
	protected ActiveCurrencyCode sourceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the amount to be converted in a currency conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyReference3, ActiveCurrencyCode> mmSourceCurrency = new MMMessageAttribute<CurrencyReference3, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyReference3.mmObject();
			isDerived = false;
			xmlTag = "SrcCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CurrencyReference3 obj) {
			return obj.getSourceCurrency();
		}

		@Override
		public void setValue(CurrencyReference3 obj, ActiveCurrencyCode value) {
			obj.setSourceCurrency(value);
		}
	};
	@XmlElement(name = "XchgRateInf")
	protected List<ExchangeRateInformation1> exchangeRateInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1
	 * ExchangeRateInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRateInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyReference3, List<ExchangeRateInformation1>> mmExchangeRateInformation = new MMMessageAttribute<CurrencyReference3, List<ExchangeRateInformation1>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyReference3.mmObject();
			isDerived = false;
			xmlTag = "XchgRateInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateInformation";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			minOccurs = 0;
			complexType_lazy = () -> ExchangeRateInformation1.mmObject();
		}

		@Override
		public List<ExchangeRateInformation1> getValue(CurrencyReference3 obj) {
			return obj.getExchangeRateInformation();
		}

		@Override
		public void setValue(CurrencyReference3 obj, List<ExchangeRateInformation1> value) {
			obj.setExchangeRateInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyReference3.mmTargetCurrency, com.tools20022.repository.msg.CurrencyReference3.mmSourceCurrency,
						com.tools20022.repository.msg.CurrencyReference3.mmExchangeRateInformation);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyReference3";
				definition = "Specifies the process of a currency exchange or conversion.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public CurrencyReference3 setTargetCurrency(ActiveCurrencyCode targetCurrency) {
		this.targetCurrency = Objects.requireNonNull(targetCurrency);
		return this;
	}

	public ActiveCurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyReference3 setSourceCurrency(ActiveCurrencyCode sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public List<ExchangeRateInformation1> getExchangeRateInformation() {
		return exchangeRateInformation == null ? exchangeRateInformation = new ArrayList<>() : exchangeRateInformation;
	}

	public CurrencyReference3 setExchangeRateInformation(List<ExchangeRateInformation1> exchangeRateInformation) {
		this.exchangeRateInformation = Objects.requireNonNull(exchangeRateInformation);
		return this;
	}
}