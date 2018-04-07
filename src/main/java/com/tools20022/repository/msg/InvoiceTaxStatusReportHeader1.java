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
import com.tools20022.repository.codeset.TaxReportingStatus1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericValidationRuleIdentification1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.TaxOrganisationIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the Invoice tax status report header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmTaxAuthority
 * InvoiceTaxStatusReportHeader1.mmTaxAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmMessageIdentification
 * InvoiceTaxStatusReportHeader1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmOriginalMessageIdentification
 * InvoiceTaxStatusReportHeader1.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmReportStatus
 * InvoiceTaxStatusReportHeader1.mmReportStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmValidationRule
 * InvoiceTaxStatusReportHeader1.mmValidationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01#mmStatusReportHeader
 * InvoiceTaxReportStatusAdviceV01.mmStatusReportHeader}</li>
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
 * "InvoiceTaxStatusReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the Invoice tax status report header details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceTaxStatusReportHeader1", propOrder = {"taxAuthority", "messageIdentification", "originalMessageIdentification", "reportStatus", "validationRule"})
public class InvoiceTaxStatusReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxAuthrty")
	protected TaxOrganisationIdentification1 taxAuthority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1
	 * TaxOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAuthrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the TaxReport is delivered. This message block contains party details for a specific tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, Optional<TaxOrganisationIdentification1>> mmTaxAuthority = new MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, Optional<TaxOrganisationIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "TaxAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAuthority";
			definition = "Party to which the TaxReport is delivered. This message block contains party details for a specific tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxOrganisationIdentification1.mmObject();
		}

		@Override
		public Optional<TaxOrganisationIdentification1> getValue(InvoiceTaxStatusReportHeader1 obj) {
			return obj.getTaxAuthority();
		}

		@Override
		public void setValue(InvoiceTaxStatusReportHeader1 obj, Optional<TaxOrganisationIdentification1> value) {
			obj.setTaxAuthority(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the InvoiceTaxReportStatusAdvice message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, MessageIdentification1> mmMessageIdentification = new MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the InvoiceTaxReportStatusAdvice message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(InvoiceTaxStatusReportHeader1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(InvoiceTaxStatusReportHeader1 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected MessageIdentification1 originalMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the InvoiceTaxReport message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, MessageIdentification1> mmOriginalMessageIdentification = new MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Reference to the identification of the InvoiceTaxReport message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(InvoiceTaxStatusReportHeader1 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(InvoiceTaxStatusReportHeader1 obj, MessageIdentification1 value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "RptSts", required = true)
	protected TaxReportingStatus1Code reportStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus1Code
	 * TaxReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status for the full report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceTaxStatusReportHeader1, TaxReportingStatus1Code> mmReportStatus = new MMMessageAttribute<InvoiceTaxStatusReportHeader1, TaxReportingStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatus";
			definition = "Provides the status for the full report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxReportingStatus1Code.mmObject();
		}

		@Override
		public TaxReportingStatus1Code getValue(InvoiceTaxStatusReportHeader1 obj) {
			return obj.getReportStatus();
		}

		@Override
		public void setValue(InvoiceTaxStatusReportHeader1 obj, TaxReportingStatus1Code value) {
			obj.setReportStatus(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
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
	public static final MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, List<GenericValidationRuleIdentification1>> mmValidationRule = new MMMessageAssociationEnd<InvoiceTaxStatusReportHeader1, List<GenericValidationRuleIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmObject();
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
		public List<GenericValidationRuleIdentification1> getValue(InvoiceTaxStatusReportHeader1 obj) {
			return obj.getValidationRule();
		}

		@Override
		public void setValue(InvoiceTaxStatusReportHeader1 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setValidationRule(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmTaxAuthority, com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmMessageIdentification,
						com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmOriginalMessageIdentification, com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmReportStatus,
						com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1.mmValidationRule);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceTaxReportStatusAdviceV01.mmStatusReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceTaxStatusReportHeader1";
				definition = "Provides the Invoice tax status report header details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TaxOrganisationIdentification1> getTaxAuthority() {
		return taxAuthority == null ? Optional.empty() : Optional.of(taxAuthority);
	}

	public InvoiceTaxStatusReportHeader1 setTaxAuthority(TaxOrganisationIdentification1 taxAuthority) {
		this.taxAuthority = taxAuthority;
		return this;
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public InvoiceTaxStatusReportHeader1 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public MessageIdentification1 getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public InvoiceTaxStatusReportHeader1 setOriginalMessageIdentification(MessageIdentification1 originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public TaxReportingStatus1Code getReportStatus() {
		return reportStatus;
	}

	public InvoiceTaxStatusReportHeader1 setReportStatus(TaxReportingStatus1Code reportStatus) {
		this.reportStatus = Objects.requireNonNull(reportStatus);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule == null ? validationRule = new ArrayList<>() : validationRule;
	}

	public InvoiceTaxStatusReportHeader1 setValidationRule(List<GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = Objects.requireNonNull(validationRule);
		return this;
	}
}