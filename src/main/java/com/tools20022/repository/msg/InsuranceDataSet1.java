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
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05;
import com.tools20022.repository.choice.PartyIdentification29Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.InsuranceClauses1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Formal document used to record a fact and used as proof of the fact that
 * goods have been insured under an insurance policy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmDataSetIdentification
 * InsuranceDataSet1.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmIssuer
 * InsuranceDataSet1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmIssueDate
 * InsuranceDataSet1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmEffectiveDate
 * InsuranceDataSet1.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmPlaceOfIssue
 * InsuranceDataSet1.mmPlaceOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuranceDocumentIdentification
 * InsuranceDataSet1.mmInsuranceDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmTransport
 * InsuranceDataSet1.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuredAmount
 * InsuranceDataSet1.mmInsuredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuredGoodsDescription
 * InsuranceDataSet1.mmInsuredGoodsDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuranceConditions
 * InsuranceDataSet1.mmInsuranceConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuranceClauses
 * InsuranceDataSet1.mmInsuranceClauses}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmAssured
 * InsuranceDataSet1.mmAssured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmClaimsPayableAt
 * InsuranceDataSet1.mmClaimsPayableAt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmClaimsPayableIn
 * InsuranceDataSet1.mmClaimsPayableIn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmInsuranceDataSet
 * ForwardDataSetSubmissionReportV05.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmInsuranceDataSet
 * DataSetSubmissionV05.mmInsuranceDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceDataSet1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InsuranceDataSet1", propOrder = {"dataSetIdentification", "issuer", "issueDate", "effectiveDate", "placeOfIssue", "insuranceDocumentIdentification", "transport", "insuredAmount", "insuredGoodsDescription",
		"insuranceConditions", "insuranceClauses", "assured", "claimsPayableAt", "claimsPayableIn"})
public class InsuranceDataSet1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * Identifies the insurancedata set
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the insurancedata set"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the insurancedata set";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification1.mmObject();
		}
	};
	protected PartyIdentification26 issuer;
	/**
	 * Issuer of the certificate, typically the insurance company or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer of the certificate, typically the insurance company or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer of the certificate, typically the insurance company or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification26.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * Issue date of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate effectiveDate;
	/**
	 * Date upon which cover under an insurance policy becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmEffectiveDate
	 * InsuranceCertificate.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which cover under an insurance policy becomes effective."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmEffectiveDate;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date upon which cover under an insurance policy becomes effective.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PostalAddress5 placeOfIssue;
	/**
	 * Place where the insurance certificate was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress5
	 * PostalAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the insurance certificate was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfIssue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Location.mmAddress;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the insurance certificate was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress5.mmObject();
		}
	};
	protected Max35Text insuranceDocumentIdentification;
	/**
	 * Unique identifier of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuranceDocumentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "InsrncDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDocumentIdentification";
			definition = "Unique identifier of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SingleTransport3 transport;
	/**
	 * Transport information relative to the goods that are insured under the
	 * insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleTransport3
	 * SingleTransport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport information relative to the goods that are insured under the insurance policy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmTransport;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "Trnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transport";
			definition = "Transport information relative to the goods that are insured under the insurance policy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SingleTransport3.mmObject();
		}
	};
	protected CurrencyAndAmount insuredAmount;
	/**
	 * Value of the goods as insured under the insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuredAmount
	 * InsuranceCertificate.mmInsuredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the goods as insured under the insurance policy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuredAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmInsuredAmount;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "InsrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredAmount";
			definition = "Value of the goods as insured under the insurance policy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max70Text insuredGoodsDescription;
	/**
	 * Information about the goods and/or services of a trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrdGoodsDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredGoodsDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuredGoodsDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "InsrdGoodsDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredGoodsDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected List<Max350Text> insuranceConditions;
	/**
	 * Description of the conditions and exclusion clauses under which insurance
	 * is granted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceConditions
	 * InsuranceCertificate.mmInsuranceConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the conditions and exclusion clauses under which insurance is granted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuranceConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmInsuranceConditions;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "InsrncConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceConditions";
			definition = "Description of the conditions and exclusion clauses under which insurance is granted.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<InsuranceClauses1Code> insuranceClauses;
	/**
	 * Standard insurance clauses defined by the Institute of London
	 * Underwriters (or the American Institute of marine Underwriters).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceClauses
	 * InsuranceCertificate.mmInsuranceClauses}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncClauses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceClauses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuranceClauses = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmInsuranceClauses;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "InsrncClauses";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceClauses";
			definition = "Standard insurance clauses defined by the Institute of London Underwriters (or the American Institute of marine Underwriters).";
			minOccurs = 0;
			simpleType_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	protected PartyIdentification29Choice assured;
	/**
	 * Party that is covered under the assurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification29Choice
	 * PartyIdentification29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that is covered under the assurance policy."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssured = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "Assrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assured";
			definition = "Party that is covered under the assurance policy.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification29Choice.mmObject();
		}
	};
	protected PostalAddress5 claimsPayableAt;
	/**
	 * Place where claims under the insurance policy will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress5
	 * PostalAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableAt
	 * InsuranceCertificate.mmClaimsPayableAt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmsPyblAt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimsPayableAt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where claims under the insurance policy will be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClaimsPayableAt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmClaimsPayableAt;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "ClmsPyblAt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimsPayableAt";
			definition = "Place where claims under the insurance policy will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress5.mmObject();
		}
	};
	protected CurrencyCode claimsPayableIn;
	/**
	 * Currency in which claims, if valid, will be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmClaimsPayableIn
	 * InsuranceCertificate.mmClaimsPayableIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmsPyblIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimsPayableIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which claims, if valid, will be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClaimsPayableIn = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmClaimsPayableIn;
			componentContext_lazy = () -> InsuranceDataSet1.mmObject();
			isDerived = false;
			xmlTag = "ClmsPyblIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimsPayableIn";
			definition = "Currency in which claims, if valid, will be paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InsuranceDataSet1.mmDataSetIdentification, InsuranceDataSet1.mmIssuer, InsuranceDataSet1.mmIssueDate, InsuranceDataSet1.mmEffectiveDate, InsuranceDataSet1.mmPlaceOfIssue,
						InsuranceDataSet1.mmInsuranceDocumentIdentification, InsuranceDataSet1.mmTransport, InsuranceDataSet1.mmInsuredAmount, InsuranceDataSet1.mmInsuredGoodsDescription, InsuranceDataSet1.mmInsuranceConditions,
						InsuranceDataSet1.mmInsuranceClauses, InsuranceDataSet1.mmAssured, InsuranceDataSet1.mmClaimsPayableAt, InsuranceDataSet1.mmClaimsPayableIn);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmInsuranceDataSet, DataSetSubmissionV05.mmInsuranceDataSet);
				trace_lazy = () -> InsuranceCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InsuranceDataSet1";
				definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DataSetId", required = true)
	public DocumentIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public void setDataSetIdentification(com.tools20022.repository.msg.DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	@XmlElement(name = "Issr", required = true)
	public PartyIdentification26 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.PartyIdentification26 issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "IsseDt", required = true)
	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	@XmlElement(name = "FctvDt")
	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@XmlElement(name = "PlcOfIsse")
	public PostalAddress5 getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(com.tools20022.repository.msg.PostalAddress5 placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	@XmlElement(name = "InsrncDocId", required = true)
	public Max35Text getInsuranceDocumentIdentification() {
		return insuranceDocumentIdentification;
	}

	public void setInsuranceDocumentIdentification(Max35Text insuranceDocumentIdentification) {
		this.insuranceDocumentIdentification = insuranceDocumentIdentification;
	}

	@XmlElement(name = "Trnsprt")
	public SingleTransport3 getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.msg.SingleTransport3 transport) {
		this.transport = transport;
	}

	@XmlElement(name = "InsrdAmt", required = true)
	public CurrencyAndAmount getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(CurrencyAndAmount insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	@XmlElement(name = "InsrdGoodsDesc")
	public Max70Text getInsuredGoodsDescription() {
		return insuredGoodsDescription;
	}

	public void setInsuredGoodsDescription(Max70Text insuredGoodsDescription) {
		this.insuredGoodsDescription = insuredGoodsDescription;
	}

	@XmlElement(name = "InsrncConds")
	public List<Max350Text> getInsuranceConditions() {
		return insuranceConditions;
	}

	public void setInsuranceConditions(List<Max350Text> insuranceConditions) {
		this.insuranceConditions = insuranceConditions;
	}

	@XmlElement(name = "InsrncClauses")
	public List<InsuranceClauses1Code> getInsuranceClauses() {
		return insuranceClauses;
	}

	public void setInsuranceClauses(List<InsuranceClauses1Code> insuranceClauses) {
		this.insuranceClauses = insuranceClauses;
	}

	@XmlElement(name = "Assrd", required = true)
	public PartyIdentification29Choice getAssured() {
		return assured;
	}

	public void setAssured(PartyIdentification29Choice assured) {
		this.assured = assured;
	}

	@XmlElement(name = "ClmsPyblAt", required = true)
	public PostalAddress5 getClaimsPayableAt() {
		return claimsPayableAt;
	}

	public void setClaimsPayableAt(com.tools20022.repository.msg.PostalAddress5 claimsPayableAt) {
		this.claimsPayableAt = claimsPayableAt;
	}

	@XmlElement(name = "ClmsPyblIn")
	public CurrencyCode getClaimsPayableIn() {
		return claimsPayableIn;
	}

	public void setClaimsPayableIn(CurrencyCode claimsPayableIn) {
		this.claimsPayableIn = claimsPayableIn;
	}
}