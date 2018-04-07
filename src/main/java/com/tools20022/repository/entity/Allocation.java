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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Distribution of the (block) trade (transactions) by the investor or
 * investment manager to different underlying clients, ie, investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Allocation" src="doc-files/Allocation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmPercentage
 * Allocation.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
 * Allocation.mmAllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementCurrency
 * Allocation.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
 * Allocation.mmAllocationAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
 * Allocation.mmAllocatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAmount
 * Allocation.mmAllocationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmMethod
 * Allocation.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAveragePricePrecision
 * Allocation.mmAveragePricePrecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
 * Allocation.mmSettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesOrder
 * Allocation.mmSecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
 * Allocation.mmSecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmIdentification
 * Allocation.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAllocation
 * SecuritiesPricing.mmAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedAllocation
 * SecuritiesAccount.mmRelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAllocation
 * SecuritiesQuantity.mmAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
 * SecuritiesTrade.mmTradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettledAllocation
 * SecuritiesSettlement.mmSettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
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
 * "Allocation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distribution of the (block) trade (transactions) by the investor or investment manager to different underlying clients, ie, investment funds."
 * </li>
 * </ul>
 */
public class Allocation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate percentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent of the securities quantity that this allocation represents."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, PercentageRate> mmPercentage = new MMBusinessAttribute<Allocation, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Percent of the securities quantity that this allocation represents.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Allocation obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(Allocation obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	protected SecuritiesQuantity allocatedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAllocation
	 * SecuritiesQuantity.mmAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ALLO, FIXSynonym: 80</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, SecuritiesQuantity> mmAllocatedQuantity = new MMBusinessAssociationEnd<Allocation, SecuritiesQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ALLO"), new FIXSynonym(this, "80"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocatedQuantity";
			definition = "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Allocation obj) {
			return obj.getAllocatedQuantity();
		}

		@Override
		public void setValue(Allocation obj, SecuritiesQuantity value) {
			obj.setAllocatedQuantity(value);
		}
	};
	protected CurrencyCode settlementCurrency;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 120</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency to be used for settlement of the allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, CurrencyCode> mmSettlementCurrency = new MMBusinessAttribute<Allocation, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "120"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement of the allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Allocation obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(Allocation obj, CurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	protected SecuritiesAccount allocationAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedAllocation
	 * SecuritiesAccount.mmRelatedAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which an allocation must be made."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, SecuritiesAccount> mmAllocationAccount = new MMBusinessAssociationEnd<Allocation, SecuritiesAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationAccount";
			definition = "Account to or from which an allocation must be made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesAccount.mmRelatedAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}

		@Override
		public SecuritiesAccount getValue(Allocation obj) {
			return obj.getAllocationAccount();
		}

		@Override
		public void setValue(Allocation obj, SecuritiesAccount value) {
			obj.setAllocationAccount(value);
		}
	};
	protected SecuritiesPricing allocatedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAllocation
	 * SecuritiesPricing.mmAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 366</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Executed price used in an allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, SecuritiesPricing> mmAllocatedPrice = new MMBusinessAssociationEnd<Allocation, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "366"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocatedPrice";
			definition = "Executed price used in an allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Allocation obj) {
			return obj.getAllocatedPrice();
		}

		@Override
		public void setValue(Allocation obj, SecuritiesPricing value) {
			obj.setAllocatedPrice(value);
		}
	};
	protected CurrencyAndAmount allocationAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocated quantity of security multiplied by the allocated price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, CurrencyAndAmount> mmAllocationAmount = new MMBusinessAttribute<Allocation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationAmount";
			definition = "Allocated quantity of security multiplied by the allocated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Allocation obj) {
			return obj.getAllocationAmount();
		}

		@Override
		public void setValue(Allocation obj, CurrencyAndAmount value) {
			obj.setAllocationAmount(value);
		}
	};
	protected RoundingDirectionCode method;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 591</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the method of pre-allocation, that is the factors that are/were applied in the pre-allocation process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, RoundingDirectionCode> mmMethod = new MMBusinessAttribute<Allocation, RoundingDirectionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "591"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Indicates the method of pre-allocation, that is the factors that are/were applied in the pre-allocation process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}

		@Override
		public RoundingDirectionCode getValue(Allocation obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(Allocation obj, RoundingDirectionCode value) {
			obj.setMethod(value);
		}
	};
	protected DecimalNumber averagePricePrecision;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 74</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePricePrecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of decimal places used for average pricing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, DecimalNumber> mmAveragePricePrecision = new MMBusinessAttribute<Allocation, DecimalNumber>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "74"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AveragePricePrecision";
			definition = "Number of decimal places used for average pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Allocation obj) {
			return obj.getAveragePricePrecision();
		}

		@Override
		public void setValue(Allocation obj, DecimalNumber value) {
			obj.setAveragePricePrecision(value);
		}
	};
	protected SecuritiesSettlement settlementExecutionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettledAllocation
	 * SecuritiesSettlement.mmSettledAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementExecutionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of a securities allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, Optional<SecuritiesSettlement>> mmSettlementExecutionParameters = new MMBusinessAssociationEnd<Allocation, Optional<SecuritiesSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementExecutionParameters";
			definition = "Parameters used to execute the settlement of a securities allocation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlement.mmSettledAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement> getValue(Allocation obj) {
			return obj.getSettlementExecutionParameters();
		}

		@Override
		public void setValue(Allocation obj, Optional<SecuritiesSettlement> value) {
			obj.setSettlementExecutionParameters(value.orElse(null));
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
	 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securites order which is allocated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, Optional<SecuritiesOrder>> mmSecuritiesOrder = new MMBusinessAssociationEnd<Allocation, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securites order which is allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmSecuritiesOrderAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(Allocation obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(Allocation obj, Optional<SecuritiesOrder> value) {
			obj.setSecuritiesOrder(value.orElse(null));
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
	 * SecuritiesTrade.mmTradeAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is allocated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Allocation, Optional<SecuritiesTrade>> mmSecuritiesTrade = new MMBusinessAssociationEnd<Allocation, Optional<SecuritiesTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade which is allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTrade.mmTradeAllocation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}

		@Override
		public Optional<SecuritiesTrade> getValue(Allocation obj) {
			return obj.getSecuritiesTrade();
		}

		@Override
		public void setValue(Allocation obj, Optional<SecuritiesTrade> value) {
			obj.setSecuritiesTrade(value.orElse(null));
		}
	};
	protected Max35Text identification;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the allocation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Allocation, Max35Text> mmIdentification = new MMBusinessAttribute<Allocation, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Allocation obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Allocation obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Allocation";
				definition = "Distribution of the (block) trade (transactions) by the investor or investment manager to different underlying clients, ie, investment funds.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmAllocation, SecuritiesAccount.mmRelatedAllocation, SecuritiesQuantity.mmAllocation, SecuritiesTrade.mmTradeAllocation,
						SecuritiesSettlement.mmSettledAllocation, SecuritiesOrder.mmSecuritiesOrderAllocation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Allocation.mmPercentage, com.tools20022.repository.entity.Allocation.mmAllocatedQuantity, com.tools20022.repository.entity.Allocation.mmSettlementCurrency,
						com.tools20022.repository.entity.Allocation.mmAllocationAccount, com.tools20022.repository.entity.Allocation.mmAllocatedPrice, com.tools20022.repository.entity.Allocation.mmAllocationAmount,
						com.tools20022.repository.entity.Allocation.mmMethod, com.tools20022.repository.entity.Allocation.mmAveragePricePrecision, com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters,
						com.tools20022.repository.entity.Allocation.mmSecuritiesOrder, com.tools20022.repository.entity.Allocation.mmSecuritiesTrade, com.tools20022.repository.entity.Allocation.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Allocation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public Allocation setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public SecuritiesQuantity getAllocatedQuantity() {
		return allocatedQuantity;
	}

	public Allocation setAllocatedQuantity(SecuritiesQuantity allocatedQuantity) {
		this.allocatedQuantity = Objects.requireNonNull(allocatedQuantity);
		return this;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public Allocation setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public SecuritiesAccount getAllocationAccount() {
		return allocationAccount;
	}

	public Allocation setAllocationAccount(SecuritiesAccount allocationAccount) {
		this.allocationAccount = Objects.requireNonNull(allocationAccount);
		return this;
	}

	public SecuritiesPricing getAllocatedPrice() {
		return allocatedPrice;
	}

	public Allocation setAllocatedPrice(SecuritiesPricing allocatedPrice) {
		this.allocatedPrice = Objects.requireNonNull(allocatedPrice);
		return this;
	}

	public CurrencyAndAmount getAllocationAmount() {
		return allocationAmount;
	}

	public Allocation setAllocationAmount(CurrencyAndAmount allocationAmount) {
		this.allocationAmount = Objects.requireNonNull(allocationAmount);
		return this;
	}

	public RoundingDirectionCode getMethod() {
		return method;
	}

	public Allocation setMethod(RoundingDirectionCode method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public DecimalNumber getAveragePricePrecision() {
		return averagePricePrecision;
	}

	public Allocation setAveragePricePrecision(DecimalNumber averagePricePrecision) {
		this.averagePricePrecision = Objects.requireNonNull(averagePricePrecision);
		return this;
	}

	public Optional<SecuritiesSettlement> getSettlementExecutionParameters() {
		return settlementExecutionParameters == null ? Optional.empty() : Optional.of(settlementExecutionParameters);
	}

	public Allocation setSettlementExecutionParameters(SecuritiesSettlement settlementExecutionParameters) {
		this.settlementExecutionParameters = settlementExecutionParameters;
		return this;
	}

	public Optional<SecuritiesOrder> getSecuritiesOrder() {
		return securitiesOrder == null ? Optional.empty() : Optional.of(securitiesOrder);
	}

	public Allocation setSecuritiesOrder(SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
		return this;
	}

	public Optional<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade == null ? Optional.empty() : Optional.of(securitiesTrade);
	}

	public Allocation setSecuritiesTrade(SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Allocation setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}