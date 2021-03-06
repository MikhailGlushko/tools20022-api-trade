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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TaxReport1;
import com.tools20022.repository.msg.TaxReportHeader1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax
 * authorities require corporates to report their sales based value added tax
 * (VAT). This message is targeted to this reporting based on information in
 * sales invoices and card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmInvoiceTaxReportHeader
 * InvoiceTaxReportV01.mmInvoiceTaxReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmTaxReport
 * InvoiceTaxReportV01.mmTaxReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmSupplementaryData
 * InvoiceTaxReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcTaxRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.034.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceTaxReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax authorities require corporates to report their sales based value added tax (VAT). This message is targeted to this reporting based on information in sales invoices and card transactions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceTaxReportV01", propOrder = {"invoiceTaxReportHeader", "taxReport", "supplementaryData"})
public class InvoiceTaxReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvcTaxRptHdr", required = true)
	protected TaxReportHeader1 invoiceTaxReportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxReportHeader1
	 * TaxReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcTaxRptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceTaxReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines message level identification, number of individual tax reports and tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoiceTaxReportV01, TaxReportHeader1> mmInvoiceTaxReportHeader = new MMMessageBuildingBlock<InvoiceTaxReportV01, TaxReportHeader1>() {
		{
			xmlTag = "InvcTaxRptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceTaxReportHeader";
			definition = "Defines message level identification, number of individual tax reports and tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TaxReportHeader1.mmObject();
		}

		@Override
		public TaxReportHeader1 getValue(InvoiceTaxReportV01 obj) {
			return obj.getInvoiceTaxReportHeader();
		}

		@Override
		public void setValue(InvoiceTaxReportV01 obj, TaxReportHeader1 value) {
			obj.setInvoiceTaxReportHeader(value);
		}
	};
	@XmlElement(name = "TaxRpt", required = true)
	protected List<TaxReport1> taxReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InvoiceTaxReportV01, List<TaxReport1>> mmTaxReport = new MMMessageBuildingBlock<InvoiceTaxReportV01, List<TaxReport1>>() {
		{
			xmlTag = "TaxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReport";
			definition = "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction.";
			minOccurs = 1;
			complexType_lazy = () -> TaxReport1.mmObject();
		}

		@Override
		public List<TaxReport1> getValue(InvoiceTaxReportV01 obj) {
			return obj.getTaxReport();
		}

		@Override
		public void setValue(InvoiceTaxReportV01 obj, List<TaxReport1> value) {
			obj.setTaxReport(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
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
	public static final MMMessageBuildingBlock<InvoiceTaxReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<InvoiceTaxReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(InvoiceTaxReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(InvoiceTaxReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceTaxReportV01";
				definition = "The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax authorities require corporates to report their sales based value added tax (VAT). This message is targeted to this reporting based on information in sales invoices and card transactions.";
				rootElement = "Document";
				xmlTag = "InvcTaxRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmInvoiceTaxReportHeader, com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmTaxReport,
						com.tools20022.repository.area.auth.InvoiceTaxReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "034";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceTaxReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TaxReportHeader1 getInvoiceTaxReportHeader() {
		return invoiceTaxReportHeader;
	}

	public InvoiceTaxReportV01 setInvoiceTaxReportHeader(TaxReportHeader1 invoiceTaxReportHeader) {
		this.invoiceTaxReportHeader = Objects.requireNonNull(invoiceTaxReportHeader);
		return this;
	}

	public List<TaxReport1> getTaxReport() {
		return taxReport == null ? taxReport = new ArrayList<>() : taxReport;
	}

	public InvoiceTaxReportV01 setTaxReport(List<TaxReport1> taxReport) {
		this.taxReport = Objects.requireNonNull(taxReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public InvoiceTaxReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.034.001.01")
	static public class Document {
		@XmlElement(name = "InvcTaxRpt", required = true)
		public InvoiceTaxReportV01 messageBody;
	}
}