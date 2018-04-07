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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.InvoiceRequestInformation1;
import com.tools20022.repository.msg.RequestGroupInformation1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The InvoiceFinancingRequest message is sent by Financing Requestor to the
 * Intermediary Agent or First agent. It is used to request financing of a set
 * of invoices, referenced in the request message itself. If the whole financing
 * request (or a selection of single invoice requests included) is accepted, the
 * amount financed by the First Agent will be credited either to the account
 * specified in the financing request or to another account held by Financing
 * Requestor to First Agent.<br>
 * <b>Usage</b><br>
 * The InvoiceFinancingRequest message is issued by the Financing Requestor and
 * represents a bulk financing request since it can contain one or more single
 * financing requests, each request related to an invoice.<br>
 * For every invoice it is always possible to identify a supplier and a buyer.<br>
 * The subject playing the role of supplier can be different from the Financing
 * Requestor; in this case the Financing Requestor is allowed to send the
 * request message on behalf of the supplier itself.<br>
 * This caters for example in the scenario of a collection agency initiating all
 * requests on behalf of a large corporate.<br>
 * In instances where an invoice is going to be paid by means of instalments,
 * the Financing Requestor can request financing for one or more instalments
 * related to the invoice payment. In this case, together with the general
 * information related to the invoice, references about instalments to be
 * financed are specified into the request message. The request message must
 * contain information only about the instalments that the Financing Requestor
 * wants to be financed.<br>
 * The InvoiceFinancingRequest message is used to exchange:<br>
 * - One instance of general information related to the invoice financing
 * request;<br>
 * - One instance of information for each single invoice financing request;<br>
 * - Optionally, one instance of information for each single instalment to be
 * financed.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the First Agent. The
 * First Agent is the account servicer of the Financing Requestor;<br>
 * - In a relay scenario, the message is sent to an Intermediary Agent. The
 * Intermediary Agent acts as an access point that will forward the
 * InvoiceFinancingRequest message to the First Agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01#mmRequestGroupInformation
 * InvoiceFinancingRequestV01.mmRequestGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01#mmInvoiceRequestInformation
 * InvoiceFinancingRequestV01.mmInvoiceRequestInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcFincgReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.001.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMandatory1Rule#for_tsin_InvoiceFinancingRequestV01
 * ConstraintMandatory1Rule.for_tsin_InvoiceFinancingRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMandatory2Rule#for_tsin_InvoiceFinancingRequestV01
 * ConstraintMandatory2Rule.for_tsin_InvoiceFinancingRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHomogeneity1Rule#for_tsin_InvoiceFinancingRequestV01
 * ConstraintHomogeneity1Rule.for_tsin_InvoiceFinancingRequestV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceFinancingRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InvoiceFinancingRequest message is sent by Financing Requestor to the Intermediary Agent or First agent. It is used to request financing of a set of invoices, referenced in the request message itself. If the whole financing request (or a selection of single invoice requests included) is accepted, the amount financed by the First Agent will be credited either to the account specified in the financing request or to another account held by Financing Requestor to First Agent.\r\nUsage\r\nThe InvoiceFinancingRequest message is issued by the Financing Requestor and represents a bulk financing request since it can contain one or more single financing requests, each request related to an invoice.\r\nFor every invoice it is always possible to identify a supplier and a buyer.\r\nThe subject playing the role of supplier can be different from the Financing Requestor; in this case the Financing Requestor is allowed to send the request message on behalf of the supplier itself.\r\nThis caters for example in the scenario of a collection agency initiating all requests on behalf of a large corporate.\r\nIn instances where an invoice is going to be paid by means of instalments, the Financing Requestor can request financing for one or more instalments related to the invoice payment. In this case, together with the general information related to the invoice, references about instalments to be financed are specified into the request message. The request message must contain information only about the instalments that the Financing Requestor wants to be financed.\r\nThe InvoiceFinancingRequest message is used to exchange:\r\n- One instance of general information related to the invoice financing request;\r\n- One instance of information for each single invoice financing request;\r\n- Optionally, one instance of information for each single instalment to be financed.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor;\r\n- In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent acts as an access point that will forward the InvoiceFinancingRequest message to the First Agent."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceFinancingRequestV01", propOrder = {"requestGroupInformation", "invoiceRequestInformation"})
public class InvoiceFinancingRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqGrpInf", required = true)
	protected RequestGroupInformation1 requestGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a set of characteristics that unambiguously identify the invoice financing request, such as group identification, creation date time, number of single invoice financing requests."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoiceFinancingRequestV01, RequestGroupInformation1> mmRequestGroupInformation = new MMMessageBuildingBlock<InvoiceFinancingRequestV01, RequestGroupInformation1>() {
		{
			xmlTag = "ReqGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestGroupInformation";
			definition = "Specifies a set of characteristics that unambiguously identify the invoice financing request, such as group identification, creation date time, number of single invoice financing requests.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RequestGroupInformation1.mmObject();
		}

		@Override
		public RequestGroupInformation1 getValue(InvoiceFinancingRequestV01 obj) {
			return obj.getRequestGroupInformation();
		}

		@Override
		public void setValue(InvoiceFinancingRequestV01 obj, RequestGroupInformation1 value) {
			obj.setRequestGroupInformation(value);
		}
	};
	@XmlElement(name = "InvcReqInf", required = true)
	protected List<InvoiceRequestInformation1> invoiceRequestInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcReqInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceRequestInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the single invoice financing request related to the entire invoice or a specific instalment of the invoice settlement, such as actors involved, invoice totals or payment method."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoiceFinancingRequestV01, List<InvoiceRequestInformation1>> mmInvoiceRequestInformation = new MMMessageBuildingBlock<InvoiceFinancingRequestV01, List<InvoiceRequestInformation1>>() {
		{
			xmlTag = "InvcReqInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceRequestInformation";
			definition = "Set of characteristics that unambiguously identify the single invoice financing request related to the entire invoice or a specific instalment of the invoice settlement, such as actors involved, invoice totals or payment method.";
			minOccurs = 1;
			complexType_lazy = () -> InvoiceRequestInformation1.mmObject();
		}

		@Override
		public List<InvoiceRequestInformation1> getValue(InvoiceFinancingRequestV01 obj) {
			return obj.getInvoiceRequestInformation();
		}

		@Override
		public void setValue(InvoiceFinancingRequestV01 obj, List<InvoiceRequestInformation1> value) {
			obj.setInvoiceRequestInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMandatory1Rule.for_tsin_InvoiceFinancingRequestV01,
						com.tools20022.repository.constraints.ConstraintMandatory2Rule.for_tsin_InvoiceFinancingRequestV01, com.tools20022.repository.constraints.ConstraintHomogeneity1Rule.for_tsin_InvoiceFinancingRequestV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingRequestV01";
				definition = "Scope\r\nThe InvoiceFinancingRequest message is sent by Financing Requestor to the Intermediary Agent or First agent. It is used to request financing of a set of invoices, referenced in the request message itself. If the whole financing request (or a selection of single invoice requests included) is accepted, the amount financed by the First Agent will be credited either to the account specified in the financing request or to another account held by Financing Requestor to First Agent.\r\nUsage\r\nThe InvoiceFinancingRequest message is issued by the Financing Requestor and represents a bulk financing request since it can contain one or more single financing requests, each request related to an invoice.\r\nFor every invoice it is always possible to identify a supplier and a buyer.\r\nThe subject playing the role of supplier can be different from the Financing Requestor; in this case the Financing Requestor is allowed to send the request message on behalf of the supplier itself.\r\nThis caters for example in the scenario of a collection agency initiating all requests on behalf of a large corporate.\r\nIn instances where an invoice is going to be paid by means of instalments, the Financing Requestor can request financing for one or more instalments related to the invoice payment. In this case, together with the general information related to the invoice, references about instalments to be financed are specified into the request message. The request message must contain information only about the instalments that the Financing Requestor wants to be financed.\r\nThe InvoiceFinancingRequest message is used to exchange:\r\n- One instance of general information related to the invoice financing request;\r\n- One instance of information for each single invoice financing request;\r\n- Optionally, one instance of information for each single instalment to be financed.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor;\r\n- In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent acts as an access point that will forward the InvoiceFinancingRequest message to the First Agent.";
				rootElement = "Document";
				xmlTag = "InvcFincgReq";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01.mmRequestGroupInformation,
						com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01.mmInvoiceRequestInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RequestGroupInformation1 getRequestGroupInformation() {
		return requestGroupInformation;
	}

	public InvoiceFinancingRequestV01 setRequestGroupInformation(RequestGroupInformation1 requestGroupInformation) {
		this.requestGroupInformation = Objects.requireNonNull(requestGroupInformation);
		return this;
	}

	public List<InvoiceRequestInformation1> getInvoiceRequestInformation() {
		return invoiceRequestInformation == null ? invoiceRequestInformation = new ArrayList<>() : invoiceRequestInformation;
	}

	public InvoiceFinancingRequestV01 setInvoiceRequestInformation(List<InvoiceRequestInformation1> invoiceRequestInformation) {
		this.invoiceRequestInformation = Objects.requireNonNull(invoiceRequestInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01")
	static public class Document {
		@XmlElement(name = "InvcFincgReq", required = true)
		public InvoiceFinancingRequestV01 messageBody;
	}
}