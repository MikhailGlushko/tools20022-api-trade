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
import com.tools20022.repository.codeset.OptionPartyCode;
import com.tools20022.repository.codeset.TradingCapacityCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Trading party in a commercial, securities, treasury trade. This role may also
 * represent parties which play different intermediary roles in a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradePartyRole" src="doc-files/TradePartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
 * TradePartyRole.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
 * TradePartyRole.mmTradingPartyCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
 * TradePartyRole.mmBuyerOrSeller}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole#mmTrade
 * TradePartyRole.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
 * Account.mmTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
 * Trade.mmTradePartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
 * SecuritiesTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
 * TreasuryTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
 * CommercialTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange StockExchange}
 * </li>
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
 * "TradePartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade."
 * </li>
 * </ul>
 */
public class TradePartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmTradePartyRole
	 * Account.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account used in the context of the party role."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradePartyRole, List<Account>> mmAccount = new MMBusinessAssociationEnd<TradePartyRole, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account used in the context of the party role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmTradePartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}

		@Override
		public List<Account> getValue(TradePartyRole obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(TradePartyRole obj, List<Account> value) {
			obj.setAccount(value);
		}
	};
	protected TradingCapacityCode tradingPartyCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
	 * TradingCapacityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of a trading party in a transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradePartyRole, TradingCapacityCode> mmTradingPartyCapacity = new MMBusinessAttribute<TradePartyRole, TradingCapacityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingPartyCapacity";
			definition = "Specifies the role of a trading party in a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacityCode.mmObject();
		}

		@Override
		public TradingCapacityCode getValue(TradePartyRole obj) {
			return obj.getTradingPartyCapacity();
		}

		@Override
		public void setValue(TradePartyRole obj, TradingCapacityCode value) {
			obj.setTradingPartyCapacity(value);
		}
	};
	protected OptionPartyCode buyerOrSeller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPartyCode
	 * OptionPartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradePartyRole, OptionPartyCode> mmBuyerOrSeller = new MMBusinessAttribute<TradePartyRole, OptionPartyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyerOrSeller";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionPartyCode.mmObject();
		}

		@Override
		public OptionPartyCode getValue(TradePartyRole obj) {
			return obj.getBuyerOrSeller();
		}

		@Override
		public void setValue(TradePartyRole obj, OptionPartyCode value) {
			obj.setBuyerOrSeller(value);
		}
	};
	protected List<com.tools20022.repository.entity.Trade> trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradePartyRole, List<Trade>> mmTrade = new MMBusinessAssociationEnd<TradePartyRole, List<Trade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradePartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}

		@Override
		public List<Trade> getValue(TradePartyRole obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(TradePartyRole obj, List<Trade> value) {
			obj.setTrade(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePartyRole";
				definition = "Trading party in a commercial, securities, treasury trade. This role may also represent parties which play different intermediary roles in a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmTradePartyRole, com.tools20022.repository.entity.Trade.mmTradePartyRole);
				subType_lazy = () -> Arrays.asList(SecuritiesTradePartyRole.mmObject(), BuyerRole.mmObject(), SellerRole.mmObject(), Broker.mmObject(), TreasuryTradePartyRole.mmObject(), CommercialTradePartyRole.mmObject(),
						StockExchange.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradePartyRole.mmAccount, com.tools20022.repository.entity.TradePartyRole.mmTradingPartyCapacity,
						com.tools20022.repository.entity.TradePartyRole.mmBuyerOrSeller, com.tools20022.repository.entity.TradePartyRole.mmTrade);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradePartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public TradePartyRole setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public TradingCapacityCode getTradingPartyCapacity() {
		return tradingPartyCapacity;
	}

	public TradePartyRole setTradingPartyCapacity(TradingCapacityCode tradingPartyCapacity) {
		this.tradingPartyCapacity = Objects.requireNonNull(tradingPartyCapacity);
		return this;
	}

	public OptionPartyCode getBuyerOrSeller() {
		return buyerOrSeller;
	}

	public TradePartyRole setBuyerOrSeller(OptionPartyCode buyerOrSeller) {
		this.buyerOrSeller = Objects.requireNonNull(buyerOrSeller);
		return this;
	}

	public List<Trade> getTrade() {
		return trade == null ? trade = new ArrayList<>() : trade;
	}

	public TradePartyRole setTrade(List<com.tools20022.repository.entity.Trade> trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}
}