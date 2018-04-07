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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01;
import com.tools20022.repository.codeset.TaxReportingStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericValidationRuleIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
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
 * Provides the details of each individual invoice tax report transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1#mmTaxReportIdentification
 * InvoiceTaxReportTransactionStatus1.mmTaxReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1#mmStatus
 * InvoiceTaxReportTransactionStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1#mmValidationRule
 * InvoiceTaxReportTransactionStatus1.mmValidationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1#mmSupplementaryData
 * InvoiceTaxReportTransactionStatus1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01#mmTransactionStatus
 * InvoiceTaxReportStatusAdviceV01.mmTransactionStatus}</li>
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
 * "InvoiceTaxReportTransactionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual invoice tax report transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceTaxReportTransactionStatus1", propOrder = {"taxReportIdentification", "status", "validationRule", "supplementaryData"})
public class InvoiceTaxReportTransactionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxRptId", required = true)
	protected Max35Text taxReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1
	 * InvoiceTaxReportTransactionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report identification, for example invoice number or report number from point of sales system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceTaxReportTransactionStatus1, Max35Text> mmTaxReportIdentification = new MMMessageAttribute<InvoiceTaxReportTransactionStatus1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmObject();
			isDerived = false;
			xmlTag = "TaxRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReportIdentification";
			definition = "Report identification, for example invoice number or report number from point of sales system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvoiceTaxReportTransactionStatus1 obj) {
			return obj.getTaxReportIdentification();
		}

		@Override
		public void setValue(InvoiceTaxReportTransactionStatus1 obj, Max35Text value) {
			obj.setTaxReportIdentification(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected TaxReportingStatus2Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code
	 * TaxReportingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1
	 * InvoiceTaxReportTransactionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines status of the reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceTaxReportTransactionStatus1, TaxReportingStatus2Code> mmStatus = new MMMessageAttribute<InvoiceTaxReportTransactionStatus1, TaxReportingStatus2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines status of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxReportingStatus2Code.mmObject();
		}

		@Override
		public TaxReportingStatus2Code getValue(InvoiceTaxReportTransactionStatus1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(InvoiceTaxReportTransactionStatus1 obj, TaxReportingStatus2Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "VldtnRule")
	protected List<GenericValidationRuleIdentification1> validationRule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
	 * GenericValidationRuleIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1
	 * InvoiceTaxReportTransactionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of the rule which could not be validated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceTaxReportTransactionStatus1, List<GenericValidationRuleIdentification1>> mmValidationRule = new MMMessageAssociationEnd<InvoiceTaxReportTransactionStatus1, List<GenericValidationRuleIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericValidationRuleIdentification1.mmObject();
		}

		@Override
		public List<GenericValidationRuleIdentification1> getValue(InvoiceTaxReportTransactionStatus1 obj) {
			return obj.getValidationRule();
		}

		@Override
		public void setValue(InvoiceTaxReportTransactionStatus1 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setValidationRule(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1
	 * InvoiceTaxReportTransactionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceTaxReportTransactionStatus1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<InvoiceTaxReportTransactionStatus1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(InvoiceTaxReportTransactionStatus1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(InvoiceTaxReportTransactionStatus1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmTaxReportIdentification, com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmStatus,
						com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmValidationRule, com.tools20022.repository.msg.InvoiceTaxReportTransactionStatus1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceTaxReportStatusAdviceV01.mmTransactionStatus);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceTaxReportTransactionStatus1";
				definition = "Provides the details of each individual invoice tax report transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTaxReportIdentification() {
		return taxReportIdentification;
	}

	public InvoiceTaxReportTransactionStatus1 setTaxReportIdentification(Max35Text taxReportIdentification) {
		this.taxReportIdentification = Objects.requireNonNull(taxReportIdentification);
		return this;
	}

	public TaxReportingStatus2Code getStatus() {
		return status;
	}

	public InvoiceTaxReportTransactionStatus1 setStatus(TaxReportingStatus2Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule == null ? validationRule = new ArrayList<>() : validationRule;
	}

	public InvoiceTaxReportTransactionStatus1 setValidationRule(List<GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = Objects.requireNonNull(validationRule);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public InvoiceTaxReportTransactionStatus1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}