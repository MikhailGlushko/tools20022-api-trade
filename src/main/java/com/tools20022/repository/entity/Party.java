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
import com.tools20022.repository.choice.AddressOrParty1Choice;
import com.tools20022.repository.codeset.CreditQualityCode;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Party" src="doc-files/Party.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
 * Party.mmMoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCreditQuality
 * Party.mmCreditQuality}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AddressOrParty1Choice
 * AddressOrParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndType1 PartyAndType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1
 * PartyAndAccountIdentificationAndContactInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
 * SingleQualifiedPartyIdentification1}</li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmContactDetails
	 * PartyIdentification32.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmContactDetails
	 * PartyIdentification43.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmContactDetails
	 * PartyIdentification41.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmBankContact
	 * ExtendOrPayQuery1.mmBankContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmContactDetails
	 * PartyIdentification42.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1#mmContactInformation
	 * PartyAndAccountIdentificationAndContactInformation1.mmContactInformation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmContactDetails
	 * PartyIdentification45.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmContactDetails
	 * OrganisationIdentification28.mmContactDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<ContactPoint>> mmContactPoint = new MMBusinessAssociationEnd<Party, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification32.mmContactDetails, PartyIdentification43.mmContactDetails, PartyIdentification41.mmContactDetails, ExtendOrPayQuery1.mmBankContact,
					PartyIdentification42.mmContactDetails, PartyAndAccountIdentificationAndContactInformation1.mmContactInformation, PartyIdentification45.mmContactDetails, OrganisationIdentification28.mmContactDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Party obj) {
			return obj.getContactPoint();
		}

		@Override
		public void setValue(Party obj, List<ContactPoint> value) {
			obj.setContactPoint(value);
		}
	};
	protected List<PartyIdentificationInformation> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#mmParty
	 * PartyAndSignature2.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation8#mmOriginator
	 * StatusReasonInformation8.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientType
	 * NonExtension1.mmNotificationRecipientType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewBeneficiary
	 * Undertaking11.mmNewBeneficiary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmAdvisingParty
	 * Amendment1.mmAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmSecondAdvisingParty
	 * Amendment1.mmSecondAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmNewBeneficiary
	 * Amendment1.mmNewBeneficiary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmConfirmer
	 * UndertakingConfirmation1.mmConfirmer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AddressOrParty1Choice#mmNewBeneficiary
	 * AddressOrParty1Choice.mmNewBeneficiary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmApplicant
	 * Amendment3.mmApplicant}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment8#mmIssuer
	 * Amendment8.mmIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndType1#mmType
	 * PartyAndType1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyAndType1#mmParty
	 * PartyAndType1.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmAdvisingParty
	 * Undertaking1.mmAdvisingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#mmOwner
	 * CashAccount27.mmOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#mmServicer
	 * CashAccount27.mmServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmAdvisingParty
	 * Undertaking4.mmAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmAdvisingParty
	 * Undertaking3.mmAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1#mmNotifyingParty
	 * UndertakingNonExtensionStatusAdvice1.mmNotifyingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionRequest1#mmRequestingParty
	 * UndertakingNonExtensionRequest1.mmRequestingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmInitiatingParty
	 * UndertakingStatusAdvice1.mmInitiatingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1#mmPartyIdentification
	 * PartyAndAccountIdentificationAndContactInformation1.mmPartyIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmBuyer
	 * InvoiceRequestInformation1.mmBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmFinancingRequestor
	 * OriginalRequestInformation1.mmFinancingRequestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmSupplier
	 * InvoiceFinancingDetails1.mmSupplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmFinancingRequestor
	 * CancellationRequestInformation1.mmFinancingRequestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1#mmFirstAgent
	 * CancellationRequestInformation1.mmFirstAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeParty1#mmPartyIdentification
	 * TradeParty1.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchIssuer
	 * RequiredSubmission3.mmMatchIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchIssuer
	 * RequiredSubmission4.mmMatchIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchManufacturer
	 * RequiredSubmission4.mmMatchManufacturer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmIssuer
	 * InsuranceDataSet1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmAssured
	 * InsuranceDataSet1.mmAssured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmIssuer
	 * CertificateDataSet2.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmConsignor
	 * CertificateDataSet2.mmConsignor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmConsignee
	 * CertificateDataSet2.mmConsignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmManufacturer
	 * CertificateDataSet2.mmManufacturer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBuyer
	 * Baseline5.mmBuyer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSeller
	 * Baseline5.mmSeller}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBillTo
	 * Baseline5.mmBillTo}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmShipTo
	 * Baseline5.mmShipTo}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmConsignee
	 * Baseline5.mmConsignee}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmBuyer
	 * CommercialDataSet5.mmBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmSeller
	 * CommercialDataSet5.mmSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmBillTo
	 * CommercialDataSet5.mmBillTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmIssuer
	 * OtherCertificateDataSet2.mmIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmBuyer
	 * TransportDataSet5.mmBuyer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmSeller
	 * TransportDataSet5.mmSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmConsignor
	 * TransportDataSet5.mmConsignor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmConsignee
	 * TransportDataSet5.mmConsignee}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmShipTo
	 * TransportDataSet5.mmShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmOriginator
	 * BusinessLetter1.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmPrimaryRecipient
	 * BusinessLetter1.mmPrimaryRecipient}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmSender
	 * BusinessLetter1.mmSender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAuthorisationUser
	 * BusinessLetter1.mmAuthorisationUser}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmResponseRecipient
	 * BusinessLetter1.mmResponseRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmCopyRecipient
	 * BusinessLetter1.mmCopyRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmOtherParty
	 * BusinessLetter1.mmOtherParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmAgreementRequestor
	 * FinancingAgreementList1.mmAgreementRequestor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmAgreementResponder
	 * FinancingAgreementList1.mmAgreementResponder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeApplicant
	 * FinancingAgreementList1.mmGuaranteeApplicant}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeBeneficiary
	 * FinancingAgreementList1.mmGuaranteeBeneficiary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeIssuer
	 * FinancingAgreementList1.mmGuaranteeIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAssignee
	 * FinancingItemList1.mmAssignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAssigner
	 * FinancingItemList1.mmAssigner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmRecipient
	 * ReconciliationList1.mmRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAdvisor
	 * ReconciliationList1.mmAdvisor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRecipient
	 * EventDescription1.mmRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmAdvisor
	 * EventDescription1.mmAdvisor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmOtherParty
	 * EventDescription1.mmOtherParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmIssuer
	 * QualifiedDocumentInformation1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIssuer
	 * FinancialItemParameters1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmRecipient
	 * FinancialItemParameters1.mmRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmBuyer
	 * FinancialItemParameters1.mmBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmSeller
	 * FinancialItemParameters1.mmSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmSellerFinancialAgent
	 * FinancialItemParameters1.mmSellerFinancialAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmBuyerFinancialAgent
	 * FinancialItemParameters1.mmBuyerFinancialAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1#mmParty
	 * QualifiedPartyAndXMLSignature1.mmParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmIssuer
	 * GuaranteeDetails1.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>> mmIdentification = new MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyAndSignature2.mmParty, StatusReasonInformation8.mmOriginator, NonExtension1.mmNotificationRecipientType, Undertaking11.mmNewBeneficiary, Amendment1.mmAdvisingParty,
					Amendment1.mmSecondAdvisingParty, Amendment1.mmNewBeneficiary, UndertakingConfirmation1.mmConfirmer, AddressOrParty1Choice.mmNewBeneficiary, Amendment3.mmApplicant, Amendment8.mmIssuer, PartyAndType1.mmType,
					PartyAndType1.mmParty, Undertaking1.mmAdvisingParty, CashAccount27.mmOwner, CashAccount27.mmServicer, Undertaking4.mmAdvisingParty, Undertaking3.mmAdvisingParty, UndertakingNonExtensionStatusAdvice1.mmNotifyingParty,
					UndertakingNonExtensionRequest1.mmRequestingParty, UndertakingStatusAdvice1.mmInitiatingParty, PartyAndAccountIdentificationAndContactInformation1.mmPartyIdentification, InvoiceRequestInformation1.mmBuyer,
					OriginalRequestInformation1.mmFinancingRequestor, InvoiceFinancingDetails1.mmSupplier, CancellationRequestInformation1.mmFinancingRequestor, CancellationRequestInformation1.mmFirstAgent,
					TradeParty1.mmPartyIdentification, RequiredSubmission3.mmMatchIssuer, RequiredSubmission4.mmMatchIssuer, RequiredSubmission4.mmMatchManufacturer, InsuranceDataSet1.mmIssuer, InsuranceDataSet1.mmAssured,
					CertificateDataSet2.mmIssuer, CertificateDataSet2.mmConsignor, CertificateDataSet2.mmConsignee, CertificateDataSet2.mmManufacturer, Baseline5.mmBuyer, Baseline5.mmSeller, Baseline5.mmBillTo, Baseline5.mmShipTo,
					Baseline5.mmConsignee, CommercialDataSet5.mmBuyer, CommercialDataSet5.mmSeller, CommercialDataSet5.mmBillTo, OtherCertificateDataSet2.mmIssuer, TransportDataSet5.mmBuyer, TransportDataSet5.mmSeller,
					TransportDataSet5.mmConsignor, TransportDataSet5.mmConsignee, TransportDataSet5.mmShipTo, BusinessLetter1.mmOriginator, BusinessLetter1.mmPrimaryRecipient, BusinessLetter1.mmSender, BusinessLetter1.mmAuthorisationUser,
					BusinessLetter1.mmResponseRecipient, BusinessLetter1.mmCopyRecipient, BusinessLetter1.mmOtherParty, FinancingAgreementList1.mmAgreementRequestor, FinancingAgreementList1.mmAgreementResponder,
					FinancingAgreementList1.mmGuaranteeApplicant, FinancingAgreementList1.mmGuaranteeBeneficiary, FinancingAgreementList1.mmGuaranteeIssuer, FinancingItemList1.mmAssignee, FinancingItemList1.mmAssigner,
					ReconciliationList1.mmRecipient, ReconciliationList1.mmAdvisor, EventDescription1.mmRecipient, EventDescription1.mmAdvisor, EventDescription1.mmOtherParty, QualifiedDocumentInformation1.mmIssuer,
					FinancialItemParameters1.mmIssuer, FinancialItemParameters1.mmRecipient, FinancialItemParameters1.mmBuyer, FinancialItemParameters1.mmSeller, FinancialItemParameters1.mmSellerFinancialAgent,
					FinancialItemParameters1.mmBuyerFinancialAgent, QualifiedPartyAndXMLSignature1.mmParty, GuaranteeDetails1.mmIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public List<PartyIdentificationInformation> getValue(Party obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Party obj, List<PartyIdentificationInformation> value) {
			obj.setIdentification(value);
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Party, MoneyLaunderingCheckCode> mmMoneyLaunderingCheck = new MMBusinessAttribute<Party, MoneyLaunderingCheckCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}

		@Override
		public MoneyLaunderingCheckCode getValue(Party obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(Party obj, MoneyLaunderingCheckCode value) {
			obj.setMoneyLaunderingCheck(value);
		}
	};
	protected Tax taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
	 * Tax.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Tax> mmTaxationConditions = new MMBusinessAssociationEnd<Party, Tax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(Party obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(Party obj, Tax value) {
			obj.setTaxationConditions(value);
		}
	};
	protected Location domicile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
	 * Location.mmDomiciledParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmDomicile = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getDomicile();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setDomicile(value);
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmParty
	 * Location.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmBuyerCountry
	 * ReportSpecification4.mmBuyerCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmSellerCountry
	 * ReportSpecification4.mmSellerCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<Location>> mmResidence = new MMBusinessAssociationEnd<Party, List<Location>>() {
		{
			derivation_lazy = () -> Arrays.asList(ReportSpecification4.mmBuyerCountry, ReportSpecification4.mmSellerCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public List<Location> getValue(Party obj) {
			return obj.getResidence();
		}

		@Override
		public void setValue(Party obj, List<Location> value) {
			obj.setResidence(value);
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
	 * PowerOfAttorney.mmAuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>> mmPowerOfAttorney = new MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}

		@Override
		public Optional<PowerOfAttorney> getValue(Party obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(Party obj, Optional<PowerOfAttorney> value) {
			obj.setPowerOfAttorney(value.orElse(null));
		}
	};
	protected Location location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
	 * Location.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmLocation = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setLocation(value);
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCloseLink
	 * Security.mmCloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Security> mmCloseLinkSecurity = new MMBusinessAssociationEnd<Party, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCloseLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Party obj) {
			return obj.getCloseLinkSecurity();
		}

		@Override
		public void setValue(Party obj, Security value) {
			obj.setCloseLinkSecurity(value);
		}
	};
	protected CreditQualityCode creditQuality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQuality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit quality for the clearing member."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Party, CreditQualityCode> mmCreditQuality = new MMBusinessAttribute<Party, CreditQualityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditQuality";
			definition = "Credit quality for the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditQualityCode.mmObject();
		}

		@Override
		public CreditQualityCode getValue(Party obj) {
			return obj.getCreditQuality();
		}

		@Override
		public void setValue(Party obj, CreditQualityCode value) {
			obj.setCreditQuality(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty, PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty, com.tools20022.repository.entity.Location.mmTaxableParty, Tax.mmTaxableParty,
						com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity,
						com.tools20022.repository.entity.Party.mmCreditQuality);
				derivationComponent_lazy = () -> Arrays.asList(AddressOrParty1Choice.mmObject(), PartyAndType1.mmObject(), PartyAndAccountIdentificationAndContactInformation1.mmObject(), SingleQualifiedPartyIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Party.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint == null ? contactPoint = new ArrayList<>() : contactPoint;
	}

	public Party setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = Objects.requireNonNull(contactPoint);
		return this;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Party setIdentification(List<PartyIdentificationInformation> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public Party setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = Objects.requireNonNull(moneyLaunderingCheck);
		return this;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public Party setTaxationConditions(Tax taxationConditions) {
		this.taxationConditions = Objects.requireNonNull(taxationConditions);
		return this;
	}

	public Location getDomicile() {
		return domicile;
	}

	public Party setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = Objects.requireNonNull(domicile);
		return this;
	}

	public List<Location> getResidence() {
		return residence == null ? residence = new ArrayList<>() : residence;
	}

	public Party setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = Objects.requireNonNull(residence);
		return this;
	}

	public Optional<PowerOfAttorney> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public Party setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public Party setLocation(com.tools20022.repository.entity.Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public Party setCloseLinkSecurity(Security closeLinkSecurity) {
		this.closeLinkSecurity = Objects.requireNonNull(closeLinkSecurity);
		return this;
	}

	public CreditQualityCode getCreditQuality() {
		return creditQuality;
	}

	public Party setCreditQuality(CreditQualityCode creditQuality) {
		this.creditQuality = Objects.requireNonNull(creditQuality);
		return this;
	}
}