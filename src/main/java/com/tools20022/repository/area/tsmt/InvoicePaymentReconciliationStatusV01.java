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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.ReconciliationList1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The message InvoicePaymentReconciliationStatus is sent from a payee to a
 * payer to acknowledge attribution of payments.<br>
 * A payee that has received payment reconciliation information uses this
 * message to confirm or to question common understanding of payments and
 * instalments.<br>
 * The payee may include references to the corresponding items of an
 * InvoicePaymentReconciliationAdvice message or to other messages and may
 * include the referenced data.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmHeader
 * InvoicePaymentReconciliationStatusV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmReconciliationList
 * InvoicePaymentReconciliationStatusV01.mmReconciliationList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmReconciliationCount
 * InvoicePaymentReconciliationStatusV01.mmReconciliationCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmItemCount
 * InvoicePaymentReconciliationStatusV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmControlSum
 * InvoicePaymentReconciliationStatusV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01#mmAttachedMessage
 * InvoicePaymentReconciliationStatusV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcPmtRcncltnSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.054.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoicePaymentReconciliationStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The message InvoicePaymentReconciliationStatus is sent from a payee to a payer to acknowledge attribution of payments.\r\nA payee that has received payment reconciliation information uses this message to confirm or to question common understanding of payments and instalments.\r\nThe payee may include references to the corresponding items of an InvoicePaymentReconciliationAdvice message or to other messages and may include the referenced data.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoicePaymentReconciliationStatusV01", propOrder = {"header", "reconciliationList", "reconciliationCount", "itemCount", "controlSum", "attachedMessage"})
public class InvoicePaymentReconciliationStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected BusinessLetter1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a set of characteristics that unambiguously identify the status, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, BusinessLetter1> mmHeader = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, BusinessLetter1>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies a set of characteristics that unambiguously identify the status, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		@Override
		public BusinessLetter1 getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, BusinessLetter1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "RcncltnList", required = true)
	protected List<ReconciliationList1> reconciliationList;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1
	 * ReconciliationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of payment reconciliation information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, List<ReconciliationList1>> mmReconciliationList = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, List<ReconciliationList1>>() {
		{
			xmlTag = "RcncltnList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationList";
			definition = "List of payment reconciliation information.";
			minOccurs = 1;
			complexType_lazy = () -> ReconciliationList1.mmObject();
		}

		@Override
		public List<ReconciliationList1> getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getReconciliationList();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, List<ReconciliationList1> value) {
			obj.setReconciliationList(value);
		}
	};
	@XmlElement(name = "RcncltnCnt")
	protected Max15NumericText reconciliationCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of reconciliation lists."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<Max15NumericText>> mmReconciliationCount = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<Max15NumericText>>() {
		{
			xmlTag = "RcncltnCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationCount";
			definition = "Specifies the number of reconciliation lists.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getReconciliationCount();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, Optional<Max15NumericText> value) {
			obj.setReconciliationCount(value.orElse(null));
		}
	};
	@XmlElement(name = "ItmCnt")
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of individual items in all lists."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<Max15NumericText>> mmItemCount = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<Max15NumericText>>() {
		{
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Total number of individual items in all lists.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, Optional<Max15NumericText> value) {
			obj.setItemCount(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in all lists, irrespective of currencies or direction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<DecimalNumber>> mmControlSum = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, Optional<DecimalNumber>>() {
		{
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in all lists, irrespective of currencies or direction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "AttchdMsg")
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, List<EncapsulatedBusinessMessage1>> mmAttachedMessage = new MMMessageBuildingBlock<InvoicePaymentReconciliationStatusV01, List<EncapsulatedBusinessMessage1>>() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		@Override
		public List<EncapsulatedBusinessMessage1> getValue(InvoicePaymentReconciliationStatusV01 obj) {
			return obj.getAttachedMessage();
		}

		@Override
		public void setValue(InvoicePaymentReconciliationStatusV01 obj, List<EncapsulatedBusinessMessage1> value) {
			obj.setAttachedMessage(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoicePaymentReconciliationStatusV01";
				definition = "The message InvoicePaymentReconciliationStatus is sent from a payee to a payer to acknowledge attribution of payments.\r\nA payee that has received payment reconciliation information uses this message to confirm or to question common understanding of payments and instalments.\r\nThe payee may include references to the corresponding items of an InvoicePaymentReconciliationAdvice message or to other messages and may include the referenced data.\r\nThe message can carry digital signatures if required by context.";
				rootElement = "Document";
				xmlTag = "InvcPmtRcncltnSts";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmHeader,
						com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmReconciliationList, com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmReconciliationCount,
						com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmItemCount, com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmControlSum,
						com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "054";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoicePaymentReconciliationStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessLetter1 getHeader() {
		return header;
	}

	public InvoicePaymentReconciliationStatusV01 setHeader(BusinessLetter1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<ReconciliationList1> getReconciliationList() {
		return reconciliationList == null ? reconciliationList = new ArrayList<>() : reconciliationList;
	}

	public InvoicePaymentReconciliationStatusV01 setReconciliationList(List<ReconciliationList1> reconciliationList) {
		this.reconciliationList = Objects.requireNonNull(reconciliationList);
		return this;
	}

	public Optional<Max15NumericText> getReconciliationCount() {
		return reconciliationCount == null ? Optional.empty() : Optional.of(reconciliationCount);
	}

	public InvoicePaymentReconciliationStatusV01 setReconciliationCount(Max15NumericText reconciliationCount) {
		this.reconciliationCount = reconciliationCount;
		return this;
	}

	public Optional<Max15NumericText> getItemCount() {
		return itemCount == null ? Optional.empty() : Optional.of(itemCount);
	}

	public InvoicePaymentReconciliationStatusV01 setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public InvoicePaymentReconciliationStatusV01 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage == null ? attachedMessage = new ArrayList<>() : attachedMessage;
	}

	public InvoicePaymentReconciliationStatusV01 setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = Objects.requireNonNull(attachedMessage);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01")
	static public class Document {
		@XmlElement(name = "InvcPmtRcncltnSts", required = true)
		public InvoicePaymentReconciliationStatusV01 messageBody;
	}
}