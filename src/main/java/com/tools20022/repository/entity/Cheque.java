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
import com.tools20022.repository.codeset.ChequeTypeCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Negotiable instrument instructing a financial institution to pay a specific
 * amount of a specific currency from the account of the drawer with that
 * institution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Cheque" src="doc-files/Cheque.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequeDelivery
 * Cheque.mmChequeDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmNumber
 * Cheque.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequeType
 * Cheque.mmChequeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmMaturityDate
 * Cheque.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmFormsCode
 * Cheque.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmMemoField
 * Cheque.mmMemoField}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Cheque#mmRegionalClearingZone
 * Cheque.mmRegionalClearingZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmRelatedPayment
 * Cheque.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmChequePartyRole
 * Cheque.mmChequePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmCashAccount
 * Cheque.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCheque
 * CashAccount.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePayment#mmCheque
 * ChequePayment.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmCheque
 * ChequeIssue.mmCheque}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePartyRole#mmCheque
 * ChequePartyRole.mmCheque}</li>
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
 * "Cheque"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution."
 * </li>
 * </ul>
 */
public class Cheque extends FinancialDocument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ChequeIssue chequeDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmCheque
	 * ChequeIssue.mmCheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequeIssue
	 * ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters related to the delivery of the cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Cheque, ChequeIssue> mmChequeDelivery = new MMBusinessAssociationEnd<Cheque, ChequeIssue>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeDelivery";
			definition = "Specifies the parameters related to the delivery of the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ChequeIssue.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ChequeIssue.mmObject();
		}

		@Override
		public ChequeIssue getValue(Cheque obj) {
			return obj.getChequeDelivery();
		}

		@Override
		public void setValue(Cheque obj, ChequeIssue value) {
			obj.setChequeDelivery(value);
		}
	};
	protected Max35Text number;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a cheque as assigned by the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, Max35Text> mmNumber = new MMBusinessAttribute<Cheque, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Cheque obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(Cheque obj, Max35Text value) {
			obj.setNumber(value);
		}
	};
	protected ChequeTypeCode chequeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode
	 * ChequeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, ChequeTypeCode> mmChequeType = new MMBusinessAttribute<Cheque, ChequeTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChequeTypeCode.mmObject();
		}

		@Override
		public ChequeTypeCode getValue(Cheque obj) {
			return obj.getChequeType();
		}

		@Override
		public void setValue(Cheque obj, ChequeTypeCode value) {
			obj.setChequeType(value);
		}
	};
	protected ISODate maturityDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the draft becomes payable and the debtor's account is debited."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, ISODate> mmMaturityDate = new MMBusinessAttribute<Cheque, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Cheque obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(Cheque obj, ISODate value) {
			obj.setMaturityDate(value);
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, Max35Text> mmFormsCode = new MMBusinessAttribute<Cheque, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Cheque obj) {
			return obj.getFormsCode();
		}

		@Override
		public void setValue(Cheque obj, Max35Text value) {
			obj.setFormsCode(value);
		}
	};
	protected Max35Text memoField;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoField"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, Max35Text> mmMemoField = new MMBusinessAttribute<Cheque, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Cheque obj) {
			return obj.getMemoField();
		}

		@Override
		public void setValue(Cheque obj, Max35Text value) {
			obj.setMemoField(value);
		}
	};
	protected Max35Text regionalClearingZone;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionalClearingZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Cheque, Max35Text> mmRegionalClearingZone = new MMBusinessAttribute<Cheque, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Cheque obj) {
			return obj.getRegionalClearingZone();
		}

		@Override
		public void setValue(Cheque obj, Max35Text value) {
			obj.setRegionalClearingZone(value);
		}
	};
	protected List<ChequePayment> relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment#mmCheque
	 * ChequePayment.mmCheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequePayment
	 * ChequePayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which uses a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Cheque, List<ChequePayment>> mmRelatedPayment = new MMBusinessAssociationEnd<Cheque, List<ChequePayment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses a cheque.";
			minOccurs = 0;
			opposite_lazy = () -> ChequePayment.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ChequePayment.mmObject();
		}

		@Override
		public List<ChequePayment> getValue(Cheque obj) {
			return obj.getRelatedPayment();
		}

		@Override
		public void setValue(Cheque obj, List<ChequePayment> value) {
			obj.setRelatedPayment(value);
		}
	};
	protected List<com.tools20022.repository.entity.ChequePartyRole> chequePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequePartyRole#mmCheque
	 * ChequePartyRole.mmCheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequePartyRole
	 * ChequePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role played by a party in the process of paying by cheque."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Cheque, List<ChequePartyRole>> mmChequePartyRole = new MMBusinessAssociationEnd<Cheque, List<ChequePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequePartyRole";
			definition = "Specifies each role played by a party in the process of paying by cheque.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmObject();
		}

		@Override
		public List<ChequePartyRole> getValue(Cheque obj) {
			return obj.getChequePartyRole();
		}

		@Override
		public void setValue(Cheque obj, List<ChequePartyRole> value) {
			obj.setChequePartyRole(value);
		}
	};
	protected CashAccount cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCheque
	 * CashAccount.mmCheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Cheque
	 * Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account on which a cheque is drawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Cheque, com.tools20022.repository.entity.CashAccount> mmCashAccount = new MMBusinessAssociationEnd<Cheque, com.tools20022.repository.entity.CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which a cheque is drawn.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCheque;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashAccount getValue(Cheque obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(Cheque obj, com.tools20022.repository.entity.CashAccount value) {
			obj.setCashAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cheque";
				definition = "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCheque, ChequePayment.mmCheque, ChequeIssue.mmCheque, com.tools20022.repository.entity.ChequePartyRole.mmCheque);
				superType_lazy = () -> FinancialDocument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.mmChequeDelivery, com.tools20022.repository.entity.Cheque.mmNumber, com.tools20022.repository.entity.Cheque.mmChequeType,
						com.tools20022.repository.entity.Cheque.mmMaturityDate, com.tools20022.repository.entity.Cheque.mmFormsCode, com.tools20022.repository.entity.Cheque.mmMemoField,
						com.tools20022.repository.entity.Cheque.mmRegionalClearingZone, com.tools20022.repository.entity.Cheque.mmRelatedPayment, com.tools20022.repository.entity.Cheque.mmChequePartyRole,
						com.tools20022.repository.entity.Cheque.mmCashAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Cheque.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ChequeIssue getChequeDelivery() {
		return chequeDelivery;
	}

	public Cheque setChequeDelivery(ChequeIssue chequeDelivery) {
		this.chequeDelivery = Objects.requireNonNull(chequeDelivery);
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public Cheque setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public ChequeTypeCode getChequeType() {
		return chequeType;
	}

	public Cheque setChequeType(ChequeTypeCode chequeType) {
		this.chequeType = Objects.requireNonNull(chequeType);
		return this;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public Cheque setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public Max35Text getFormsCode() {
		return formsCode;
	}

	public Cheque setFormsCode(Max35Text formsCode) {
		this.formsCode = Objects.requireNonNull(formsCode);
		return this;
	}

	public Max35Text getMemoField() {
		return memoField;
	}

	public Cheque setMemoField(Max35Text memoField) {
		this.memoField = Objects.requireNonNull(memoField);
		return this;
	}

	public Max35Text getRegionalClearingZone() {
		return regionalClearingZone;
	}

	public Cheque setRegionalClearingZone(Max35Text regionalClearingZone) {
		this.regionalClearingZone = Objects.requireNonNull(regionalClearingZone);
		return this;
	}

	public List<ChequePayment> getRelatedPayment() {
		return relatedPayment == null ? relatedPayment = new ArrayList<>() : relatedPayment;
	}

	public Cheque setRelatedPayment(List<ChequePayment> relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public List<ChequePartyRole> getChequePartyRole() {
		return chequePartyRole == null ? chequePartyRole = new ArrayList<>() : chequePartyRole;
	}

	public Cheque setChequePartyRole(List<com.tools20022.repository.entity.ChequePartyRole> chequePartyRole) {
		this.chequePartyRole = Objects.requireNonNull(chequePartyRole);
		return this;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public Cheque setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}
}