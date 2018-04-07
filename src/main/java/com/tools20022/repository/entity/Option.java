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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Option" src="doc-files/Option.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmInstrumentAssignmentMethod
 * Option.mmInstrumentAssignmentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettleStyle
 * Option.mmSettleStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStandardisation
 * Option.mmStandardisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmPositionLimit
 * Option.mmPositionLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmUnderlyingType
 * Option.mmUnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmCoverIndicator
 * Option.mmCoverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
 * Option.mmOptionConversionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionRatio
 * Option.mmOptionRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmSecuritiesOptionTrade
 * Option.mmSecuritiesOptionTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettlementType
 * Option.mmSettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
 * Option.mmStrikeMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmExpiryLocation
 * Option.mmExpiryLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmFinalSettlementDate
 * Option.mmFinalSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
 * Option.mmOptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmCurrencyOption
 * Option.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmEarliestExerciseDate
 * Option.mmEarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettlementDays
 * Option.mmSettlementDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
 * Option.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionStartDate
 * Option.mmOptionStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmExpiryDateAndTime
 * Option.mmExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionType
 * Option.mmOptionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikeValue
 * Option.mmStrikeValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmSettlementPeriodType
 * Option.mmSettlementPeriodType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmOption
 * Price.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
 * SecuritiesConversion.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
 * CurrencyOption.mmOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#mmOption
 * SecuritiesOptionTrade.mmOption}</li>
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
 * "Option"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
 * </li>
 * </ul>
 */
public class Option extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AssignmentMethodCode instrumentAssignmentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssignmentMethodCode
	 * AssignmentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentAssignmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method under which assignment was conducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, AssignmentMethodCode> mmInstrumentAssignmentMethod = new MMBusinessAttribute<Option, AssignmentMethodCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}

		@Override
		public AssignmentMethodCode getValue(Option obj) {
			return obj.getInstrumentAssignmentMethod();
		}

		@Override
		public void setValue(Option obj, AssignmentMethodCode value) {
			obj.setInstrumentAssignmentMethod(value);
		}
	};
	protected SettleStyleCode settleStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode
	 * SettleStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option contract settles at the open or close of the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, SettleStyleCode> mmSettleStyle = new MMBusinessAttribute<Option, SettleStyleCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}

		@Override
		public SettleStyleCode getValue(Option obj) {
			return obj.getSettleStyle();
		}

		@Override
		public void setValue(Option obj, SettleStyleCode value) {
			obj.setSettleStyle(value);
		}
	};
	protected StandardisationCode standardisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, StandardisationCode> mmStandardisation = new MMBusinessAttribute<Option, StandardisationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}

		@Override
		public StandardisationCode getValue(Option obj) {
			return obj.getStandardisation();
		}

		@Override
		public void setValue(Option obj, StandardisationCode value) {
			obj.setStandardisation(value);
		}
	};
	protected Number positionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmPositionLimit = new MMBusinessAttribute<Option, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getPositionLimit();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setPositionLimit(value);
		}
	};
	protected UnderlyingTypeCode underlyingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying to which the option relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, UnderlyingTypeCode> mmUnderlyingType = new MMBusinessAttribute<Option, UnderlyingTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}

		@Override
		public UnderlyingTypeCode getValue(Option obj) {
			return obj.getUnderlyingType();
		}

		@Override
		public void setValue(Option obj, UnderlyingTypeCode value) {
			obj.setUnderlyingType(value);
		}
	};
	protected YesNoIndicator coverIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying financial instrument of an option is owned by the writer of the option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, YesNoIndicator> mmCoverIndicator = new MMBusinessAttribute<Option, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COVE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Option obj) {
			return obj.getCoverIndicator();
		}

		@Override
		public void setValue(Option obj, YesNoIndicator value) {
			obj.setCoverIndicator(value);
		}
	};
	protected List<SecuritiesConversion> optionConversionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
	 * SecuritiesConversion.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionConversionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an option into another form of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, List<SecuritiesConversion>> mmOptionConversionInformation = new MMBusinessAssociationEnd<Option, List<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public List<SecuritiesConversion> getValue(Option obj) {
			return obj.getOptionConversionInformation();
		}

		@Override
		public void setValue(Option obj, List<SecuritiesConversion> value) {
			obj.setOptionConversionInformation(value);
		}
	};
	protected PercentageRate optionRatio;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, PercentageRate> mmOptionRatio = new MMBusinessAttribute<Option, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Option obj) {
			return obj.getOptionRatio();
		}

		@Override
		public void setValue(Option obj, PercentageRate value) {
			obj.setOptionRatio(value);
		}
	};
	protected SecuritiesOptionTrade securitiesOptionTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#mmOption
	 * SecuritiesOptionTrade.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
	 * SecuritiesOptionTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOptionTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade elements for the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, com.tools20022.repository.entity.SecuritiesOptionTrade> mmSecuritiesOptionTrade = new MMBusinessAssociationEnd<Option, com.tools20022.repository.entity.SecuritiesOptionTrade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesOptionTrade getValue(Option obj) {
			return obj.getSecuritiesOptionTrade();
		}

		@Override
		public void setValue(Option obj, com.tools20022.repository.entity.SecuritiesOptionTrade value) {
			obj.setSecuritiesOptionTrade(value);
		}
	};
	protected SettlementTypeCode settlementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTypeCode
	 * SettlementTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, SettlementTypeCode> mmSettlementType = new MMBusinessAttribute<Option, SettlementTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}

		@Override
		public SettlementTypeCode getValue(Option obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(Option obj, SettlementTypeCode value) {
			obj.setSettlementType(value);
		}
	};
	protected Number strikeMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmStrikeMultiplier = new MMBusinessAttribute<Option, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getStrikeMultiplier();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setStrikeMultiplier(value);
		}
	};
	protected Max4AlphaNumericText expiryLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Max4AlphaNumericText> mmExpiryLocation = new MMBusinessAttribute<Option, Max4AlphaNumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Option obj) {
			return obj.getExpiryLocation();
		}

		@Override
		public void setValue(Option obj, Max4AlphaNumericText value) {
			obj.setExpiryLocation(value);
		}
	};
	protected ISODate finalSettlementDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled. i.e., the amounts are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODate> mmFinalSettlementDate = new MMBusinessAttribute<Option, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Option obj) {
			return obj.getFinalSettlementDate();
		}

		@Override
		public void setValue(Option obj, ISODate value) {
			obj.setFinalSettlementDate(value);
		}
	};
	protected OptionStyleCode optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, OptionStyleCode> mmOptionStyle = new MMBusinessAttribute<Option, OptionStyleCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}

		@Override
		public OptionStyleCode getValue(Option obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(Option obj, OptionStyleCode value) {
			obj.setOptionStyle(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyOption> currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
	 * CurrencyOption.mmOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to a currency option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, List<CurrencyOption>> mmCurrencyOption = new MMBusinessAssociationEnd<Option, List<CurrencyOption>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}

		@Override
		public List<CurrencyOption> getValue(Option obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(Option obj, List<CurrencyOption> value) {
			obj.setCurrencyOption(value);
		}
	};
	protected ISODateTime earliestExerciseDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an american option can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmEarliestExerciseDate = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getEarliestExerciseDate();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setEarliestExerciseDate(value);
		}
	};
	protected Number settlementDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of business days between the hit date and the payment date in case of settlement at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmSettlementDays = new MMBusinessAttribute<Option, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getSettlementDays();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setSettlementDays(value);
		}
	};
	protected Price strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#mmOption
	 * Price.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, Price> mmStrikePrice = new MMBusinessAssociationEnd<Option, Price>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Price.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Price getValue(Option obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(Option obj, Price value) {
			obj.setStrikePrice(value);
		}
	};
	protected ISODateTime optionStartDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an option becomes effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmOptionStartDate = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getOptionStartDate();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setOptionStartDate(value);
		}
	};
	protected ISODateTime expiryDateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmExpiryDateAndTime = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getExpiryDateAndTime();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setExpiryDateAndTime(value);
		}
	};
	protected OptionDefinitionTypeCode optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, OptionDefinitionTypeCode> mmOptionType = new MMBusinessAttribute<Option, OptionDefinitionTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}

		@Override
		public OptionDefinitionTypeCode getValue(Option obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(Option obj, OptionDefinitionTypeCode value) {
			obj.setOptionType(value);
		}
	};
	protected Number strikeValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmStrikeValue = new MMBusinessAttribute<Option, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getStrikeValue();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setStrikeValue(value);
		}
	};
	protected Max35Text settlementPeriodType;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how settlement will take place for instance at expiration or at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Max35Text> mmSettlementPeriodType = new MMBusinessAttribute<Option, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Option obj) {
			return obj.getSettlementPeriodType();
		}

		@Override
		public void setValue(Option obj, Max35Text value) {
			obj.setSettlementPeriodType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(Price.mmOption, SecuritiesConversion.mmRelatedOption, com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition,
						com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Option.mmInstrumentAssignmentMethod, com.tools20022.repository.entity.Option.mmSettleStyle, com.tools20022.repository.entity.Option.mmStandardisation,
						com.tools20022.repository.entity.Option.mmPositionLimit, com.tools20022.repository.entity.Option.mmUnderlyingType, com.tools20022.repository.entity.Option.mmCoverIndicator,
						com.tools20022.repository.entity.Option.mmOptionConversionInformation, com.tools20022.repository.entity.Option.mmOptionRatio, com.tools20022.repository.entity.Option.mmSecuritiesOptionTrade,
						com.tools20022.repository.entity.Option.mmSettlementType, com.tools20022.repository.entity.Option.mmStrikeMultiplier, com.tools20022.repository.entity.Option.mmExpiryLocation,
						com.tools20022.repository.entity.Option.mmFinalSettlementDate, com.tools20022.repository.entity.Option.mmOptionStyle, com.tools20022.repository.entity.Option.mmCurrencyOption,
						com.tools20022.repository.entity.Option.mmEarliestExerciseDate, com.tools20022.repository.entity.Option.mmSettlementDays, com.tools20022.repository.entity.Option.mmStrikePrice,
						com.tools20022.repository.entity.Option.mmOptionStartDate, com.tools20022.repository.entity.Option.mmExpiryDateAndTime, com.tools20022.repository.entity.Option.mmOptionType,
						com.tools20022.repository.entity.Option.mmStrikeValue, com.tools20022.repository.entity.Option.mmSettlementPeriodType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Option.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AssignmentMethodCode getInstrumentAssignmentMethod() {
		return instrumentAssignmentMethod;
	}

	public Option setInstrumentAssignmentMethod(AssignmentMethodCode instrumentAssignmentMethod) {
		this.instrumentAssignmentMethod = Objects.requireNonNull(instrumentAssignmentMethod);
		return this;
	}

	public SettleStyleCode getSettleStyle() {
		return settleStyle;
	}

	public Option setSettleStyle(SettleStyleCode settleStyle) {
		this.settleStyle = Objects.requireNonNull(settleStyle);
		return this;
	}

	public StandardisationCode getStandardisation() {
		return standardisation;
	}

	public Option setStandardisation(StandardisationCode standardisation) {
		this.standardisation = Objects.requireNonNull(standardisation);
		return this;
	}

	public Number getPositionLimit() {
		return positionLimit;
	}

	public Option setPositionLimit(Number positionLimit) {
		this.positionLimit = Objects.requireNonNull(positionLimit);
		return this;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return underlyingType;
	}

	public Option setUnderlyingType(UnderlyingTypeCode underlyingType) {
		this.underlyingType = Objects.requireNonNull(underlyingType);
		return this;
	}

	public YesNoIndicator getCoverIndicator() {
		return coverIndicator;
	}

	public Option setCoverIndicator(YesNoIndicator coverIndicator) {
		this.coverIndicator = Objects.requireNonNull(coverIndicator);
		return this;
	}

	public List<SecuritiesConversion> getOptionConversionInformation() {
		return optionConversionInformation == null ? optionConversionInformation = new ArrayList<>() : optionConversionInformation;
	}

	public Option setOptionConversionInformation(List<SecuritiesConversion> optionConversionInformation) {
		this.optionConversionInformation = Objects.requireNonNull(optionConversionInformation);
		return this;
	}

	public PercentageRate getOptionRatio() {
		return optionRatio;
	}

	public Option setOptionRatio(PercentageRate optionRatio) {
		this.optionRatio = Objects.requireNonNull(optionRatio);
		return this;
	}

	public SecuritiesOptionTrade getSecuritiesOptionTrade() {
		return securitiesOptionTrade;
	}

	public Option setSecuritiesOptionTrade(com.tools20022.repository.entity.SecuritiesOptionTrade securitiesOptionTrade) {
		this.securitiesOptionTrade = Objects.requireNonNull(securitiesOptionTrade);
		return this;
	}

	public SettlementTypeCode getSettlementType() {
		return settlementType;
	}

	public Option setSettlementType(SettlementTypeCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}

	public Number getStrikeMultiplier() {
		return strikeMultiplier;
	}

	public Option setStrikeMultiplier(Number strikeMultiplier) {
		this.strikeMultiplier = Objects.requireNonNull(strikeMultiplier);
		return this;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public Option setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = Objects.requireNonNull(expiryLocation);
		return this;
	}

	public ISODate getFinalSettlementDate() {
		return finalSettlementDate;
	}

	public Option setFinalSettlementDate(ISODate finalSettlementDate) {
		this.finalSettlementDate = Objects.requireNonNull(finalSettlementDate);
		return this;
	}

	public OptionStyleCode getOptionStyle() {
		return optionStyle;
	}

	public Option setOptionStyle(OptionStyleCode optionStyle) {
		this.optionStyle = Objects.requireNonNull(optionStyle);
		return this;
	}

	public List<CurrencyOption> getCurrencyOption() {
		return currencyOption == null ? currencyOption = new ArrayList<>() : currencyOption;
	}

	public Option setCurrencyOption(List<com.tools20022.repository.entity.CurrencyOption> currencyOption) {
		this.currencyOption = Objects.requireNonNull(currencyOption);
		return this;
	}

	public ISODateTime getEarliestExerciseDate() {
		return earliestExerciseDate;
	}

	public Option setEarliestExerciseDate(ISODateTime earliestExerciseDate) {
		this.earliestExerciseDate = Objects.requireNonNull(earliestExerciseDate);
		return this;
	}

	public Number getSettlementDays() {
		return settlementDays;
	}

	public Option setSettlementDays(Number settlementDays) {
		this.settlementDays = Objects.requireNonNull(settlementDays);
		return this;
	}

	public Price getStrikePrice() {
		return strikePrice;
	}

	public Option setStrikePrice(Price strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public ISODateTime getOptionStartDate() {
		return optionStartDate;
	}

	public Option setOptionStartDate(ISODateTime optionStartDate) {
		this.optionStartDate = Objects.requireNonNull(optionStartDate);
		return this;
	}

	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public Option setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = Objects.requireNonNull(expiryDateAndTime);
		return this;
	}

	public OptionDefinitionTypeCode getOptionType() {
		return optionType;
	}

	public Option setOptionType(OptionDefinitionTypeCode optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public Number getStrikeValue() {
		return strikeValue;
	}

	public Option setStrikeValue(Number strikeValue) {
		this.strikeValue = Objects.requireNonNull(strikeValue);
		return this;
	}

	public Max35Text getSettlementPeriodType() {
		return settlementPeriodType;
	}

	public Option setSettlementPeriodType(Max35Text settlementPeriodType) {
		this.settlementPeriodType = Objects.requireNonNull(settlementPeriodType);
		return this;
	}
}