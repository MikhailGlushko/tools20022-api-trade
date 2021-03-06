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
import com.tools20022.repository.choice.UndertakingType1Choice;
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.codeset.ExternalUndertakingTypeCode;
import com.tools20022.repository.codeset.UndertakingNameCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be collected on the
 * presentation of documents that comply with its terms and conditions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Undertaking" src="doc-files/Undertaking.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
 * Undertaking.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
 * Undertaking.mmUndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmIdentification
 * Undertaking.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
 * Undertaking.mmDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmTerminationDate
 * Undertaking.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
 * Undertaking.mmUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
 * Undertaking.mmExpiry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPartyRole
 * Undertaking.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmendment
 * Undertaking.mmUndertakingAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
 * Undertaking.mmSpecifiedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDateOfAdvice
 * Undertaking.mmDateOfAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPurpose
 * Undertaking.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingName
 * Undertaking.mmUndertakingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmType
 * Undertaking.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmConfirmationIndicator
 * Undertaking.mmConfirmationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmCounterUndertakingIndicator
 * Undertaking.mmCounterUndertakingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmRelatedChargesPayableBy
 * Undertaking.mmRelatedChargesPayableBy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmStandardClaimDocumentIndicator
 * Undertaking.mmStandardClaimDocumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUnderlyingTransaction
 * Undertaking.mmUnderlyingTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmModelForm
 * Undertaking.mmModelForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmMultipleDemandIndicator
 * Undertaking.mmMultipleDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPartialDemandIndicator
 * Undertaking.mmPartialDemandIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmTransferIndicator
 * Undertaking.mmTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
 * Undertaking.mmPredefinedVariation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
 * Undertaking.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmPresentation
 * Undertaking.mmPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingExtension
 * Undertaking.mmUndertakingExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
 * Charges.mmRelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmUndertaking
 * ElectronicSignature.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
 * Presentation.mmPresentedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
 * UndertakingStatus.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#mmUndertaking
 * UndertakingPartyRole.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
 * Demand.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmUndertaking
 * Expiry.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmUndertaking
 * UndertakingDocument.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
 * AmendmentOfUndertaking.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmUndertaking
 * UndertakingAmount.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmUndertaking
 * UndertakingExtension.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmUndertaking
 * ModelForm.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmUndertaking
 * UnderlyingTransaction.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
 * AutomaticVariation.mmUndertaking}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmUndertakingIdentification
 * ExtendOrPayQuery1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmCounterUndertaking
 * Undertaking1.mmCounterUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Demand1#mmUndertakingIdentification
 * Demand1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage#mmUndertakingDetails
 * UndertakingIssuanceMessage.mmUndertakingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmUndertakingIssuanceMessage
 * UndertakingAdvice1.mmUndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmUndertakingIssuanceMessage
 * UndertakingAdvice2.mmUndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionRequest1#mmUndertakingIdentification
 * UndertakingNonExtensionRequest1.mmUndertakingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking9 Undertaking9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking6 Undertaking6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
 * ExtendOrPayQuery1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking7 Undertaking7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
 * UndertakingConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking10 Undertaking10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UndertakingType1Choice
 * UndertakingType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2 Undertaking2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1 Undertaking1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4 Undertaking4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3 Undertaking3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage
 * UndertakingIssuanceMessage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice1
 * UndertakingAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice2
 * UndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionRequest1
 * UndertakingNonExtensionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking8 Undertaking8}</li>
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
 * "Undertaking"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions."
 * </li>
 * </ul>
 */
public class Undertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ElectronicSignature electronicSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmUndertaking
	 * ElectronicSignature.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1#mmDigitalSignature
	 * UndertakingAmendmentMessage1.mmDigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment2#mmDigitalSignature
	 * Amendment2.mmDigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentResponseMessage1#mmDigitalSignature
	 * UndertakingAmendmentResponseMessage1.mmDigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage#mmDigitalSignature
	 * UndertakingIssuanceMessage.mmDigitalSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmDigitalSignature
	 * UndertakingAdvice1.mmDigitalSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<ElectronicSignature>> mmElectronicSignature = new MMBusinessAssociationEnd<Undertaking, Optional<ElectronicSignature>>() {
		{
			derivation_lazy = () -> Arrays.asList(UndertakingAmendmentMessage1.mmDigitalSignature, Amendment2.mmDigitalSignature, UndertakingAmendmentResponseMessage1.mmDigitalSignature, UndertakingIssuanceMessage.mmDigitalSignature,
					UndertakingAdvice1.mmDigitalSignature);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ElectronicSignature.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ElectronicSignature.mmObject();
		}

		@Override
		public Optional<ElectronicSignature> getValue(Undertaking obj) {
			return obj.getElectronicSignature();
		}

		@Override
		public void setValue(Undertaking obj, Optional<ElectronicSignature> value) {
			obj.setElectronicSignature(value.orElse(null));
		}
	};
	protected UndertakingStatus undertakingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmTerminationDetails
	 * Amendment1.mmTerminationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmTerminationDetails
	 * Amendment3.mmTerminationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment7#mmAmendmentStatus
	 * Amendment7.mmAmendmentStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, UndertakingStatus> mmUndertakingStatus = new MMBusinessAssociationEnd<Undertaking, UndertakingStatus>() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment1.mmTerminationDetails, Amendment3.mmTerminationDetails, Amendment7.mmAmendmentStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingStatus.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingStatus.mmObject();
		}

		@Override
		public UndertakingStatus getValue(Undertaking obj) {
			return obj.getUndertakingStatus();
		}

		@Override
		public void setValue(Undertaking obj, UndertakingStatus value) {
			obj.setUndertakingStatus(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking9#mmIdentification
	 * Undertaking9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking6#mmIdentification
	 * Undertaking6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking7#mmIdentification
	 * Undertaking7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmUndertakingIdentification
	 * Amendment1.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmIdentification
	 * Undertaking3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking8#mmIdentification
	 * Undertaking8.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, Max35Text> mmIdentification = new MMBusinessAttribute<Undertaking, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking9.mmIdentification, Undertaking6.mmIdentification, Undertaking7.mmIdentification, Amendment1.mmUndertakingIdentification, Undertaking3.mmIdentification,
					Undertaking8.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Undertaking obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Undertaking obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Demand demand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
	 * Demand.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmDemandDetails
	 * DemandRefusal1.mmDemandDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmDemandDetails
	 * ExtendOrPayQuery1.mmDemandDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmDemandDetails
	 * ExtendOrPayQuery2.mmDemandDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Demand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<Demand>> mmDemand = new MMBusinessAssociationEnd<Undertaking, Optional<Demand>>() {
		{
			derivation_lazy = () -> Arrays.asList(DemandRefusal1.mmDemandDetails, ExtendOrPayQuery1.mmDemandDetails, ExtendOrPayQuery2.mmDemandDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Demand.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Demand.mmObject();
		}

		@Override
		public Optional<Demand> getValue(Undertaking obj) {
			return obj.getDemand();
		}

		@Override
		public void setValue(Undertaking obj, Optional<Demand> value) {
			obj.setDemand(value.orElse(null));
		}
	};
	protected ISODate terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3#mmEffectiveDate
	 * UndertakingTermination3.mmEffectiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the undertaking terminates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, ISODate> mmTerminationDate = new MMBusinessAttribute<Undertaking, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(UndertakingTermination3.mmEffectiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationDate";
			definition = "Date when the undertaking terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Undertaking obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(Undertaking obj, ISODate value) {
			obj.setTerminationDate(value);
		}
	};
	protected UndertakingAmount undertakingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmUndertaking
	 * UndertakingAmount.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewUndertakingAmount
	 * Undertaking11.mmNewUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmUndertakingAmountAdjustment
	 * Amendment1.mmUndertakingAmountAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking10#mmNewUndertakingAmount
	 * Undertaking10.mmNewUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmIncreaseDecreaseAmount
	 * Amendment3.mmIncreaseDecreaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmCounterUndertakingAmount
	 * Undertaking2.mmCounterUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUndertakingAmount
	 * Undertaking1.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmLocalUndertakingAmount
	 * Undertaking4.mmLocalUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmUndertakingAmount
	 * Undertaking3.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentObligationAmount
	 * PaymentObligation2.mmPaymentObligationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, UndertakingAmount> mmUndertakingAmount = new MMBusinessAssociationEnd<Undertaking, UndertakingAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking11.mmNewUndertakingAmount, Amendment1.mmUndertakingAmountAdjustment, Undertaking10.mmNewUndertakingAmount, Amendment3.mmIncreaseDecreaseAmount,
					Undertaking2.mmCounterUndertakingAmount, Undertaking1.mmUndertakingAmount, Undertaking4.mmLocalUndertakingAmount, Undertaking3.mmUndertakingAmount, PaymentObligation2.mmPaymentObligationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmount";
			definition = "Amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingAmount.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingAmount.mmObject();
		}

		@Override
		public UndertakingAmount getValue(Undertaking obj) {
			return obj.getUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking obj, UndertakingAmount value) {
			obj.setUndertakingAmount(value);
		}
	};
	protected Expiry expiry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmUndertaking
	 * Expiry.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpiryDetails1#mmExpiryTerms
	 * ExpiryDetails1.mmExpiryTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewExpiryDetails
	 * Undertaking11.mmNewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment1#mmNewExpiryDetails
	 * Amendment1.mmNewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpiryDetails2#mmExpiryTerms
	 * ExpiryDetails2.mmExpiryTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking10#mmNewExpiryDetails
	 * Undertaking10.mmNewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Amendment3#mmNewExpiryDetails
	 * Amendment3.mmNewExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmExpiryDetails
	 * Undertaking2.mmExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmExpiryDetails
	 * Undertaking1.mmExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmExpiryDetails
	 * Undertaking4.mmExpiryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmExpiryDetails
	 * Undertaking3.mmExpiryDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiry information about the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Expiry> mmExpiry = new MMBusinessAssociationEnd<Undertaking, Expiry>() {
		{
			derivation_lazy = () -> Arrays.asList(ExpiryDetails1.mmExpiryTerms, Undertaking11.mmNewExpiryDetails, Amendment1.mmNewExpiryDetails, ExpiryDetails2.mmExpiryTerms, Undertaking10.mmNewExpiryDetails, Amendment3.mmNewExpiryDetails,
					Undertaking2.mmExpiryDetails, Undertaking1.mmExpiryDetails, Undertaking4.mmExpiryDetails, Undertaking3.mmExpiryDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expiry";
			definition = "Expiry information about the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Expiry.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Expiry.mmObject();
		}

		@Override
		public Expiry getValue(Undertaking obj) {
			return obj.getExpiry();
		}

		@Override
		public void setValue(Undertaking obj, Expiry value) {
			obj.setExpiry(value);
		}
	};
	protected UndertakingPartyRole partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole#mmUndertaking
	 * UndertakingPartyRole.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
	 * UndertakingPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmAdditionalParty
	 * Undertaking1.mmAdditionalParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmAdditionalParty
	 * Undertaking4.mmAdditionalParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmAdditionalParty
	 * Undertaking3.mmAdditionalParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, UndertakingPartyRole> mmPartyRole = new MMBusinessAssociationEnd<Undertaking, UndertakingPartyRole>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmAdditionalParty, Undertaking4.mmAdditionalParty, Undertaking3.mmAdditionalParty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingPartyRole.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingPartyRole.mmObject();
		}

		@Override
		public UndertakingPartyRole getValue(Undertaking obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Undertaking obj, UndertakingPartyRole value) {
			obj.setPartyRole(value);
		}
	};
	protected AmendmentOfUndertaking undertakingAmendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of an undertaking such as an guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<AmendmentOfUndertaking>> mmUndertakingAmendment = new MMBusinessAssociationEnd<Undertaking, Optional<AmendmentOfUndertaking>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmendment";
			definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AmendmentOfUndertaking.mmObject();
		}

		@Override
		public Optional<AmendmentOfUndertaking> getValue(Undertaking obj) {
			return obj.getUndertakingAmendment();
		}

		@Override
		public void setValue(Undertaking obj, Optional<AmendmentOfUndertaking> value) {
			obj.setUndertakingAmendment(value.orElse(null));
		}
	};
	protected UndertakingDocument specifiedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmUndertaking
	 * UndertakingDocument.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#mmEnclosedFile
	 * Amendment1.mmEnclosedFile}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#mmEnclosedFile
	 * Amendment3.mmEnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Trigger1#mmDocumentaryEvent
	 * Trigger1.mmDocumentaryEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmEnclosedFile
	 * Undertaking1.mmEnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmEnclosedFile
	 * Undertaking3.mmEnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmEnclosedFile
	 * UndertakingAdvice2.mmEnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmEnclosedFile
	 * UndertakingStatusAdvice1.mmEnclosedFile}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmEnclosedFile
	 * UndertakingTerminationNotice1.mmEnclosedFile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecifiedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<UndertakingDocument>> mmSpecifiedDocument = new MMBusinessAssociationEnd<Undertaking, Optional<UndertakingDocument>>() {
		{
			derivation_lazy = () -> Arrays.asList(Amendment1.mmEnclosedFile, Amendment3.mmEnclosedFile, Trigger1.mmDocumentaryEvent, Undertaking1.mmEnclosedFile, Undertaking3.mmEnclosedFile, UndertakingAdvice2.mmEnclosedFile,
					UndertakingStatusAdvice1.mmEnclosedFile, UndertakingTerminationNotice1.mmEnclosedFile);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecifiedDocument";
			definition = "Document related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> UndertakingDocument.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingDocument.mmObject();
		}

		@Override
		public Optional<UndertakingDocument> getValue(Undertaking obj) {
			return obj.getSpecifiedDocument();
		}

		@Override
		public void setValue(Undertaking obj, Optional<UndertakingDocument> value) {
			obj.setSpecifiedDocument(value.orElse(null));
		}
	};
	protected ISODateTime dateOfAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1#mmDate
	 * UndertakingConfirmation1.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the undertaking or its amendment is advised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, ISODateTime> mmDateOfAdvice = new MMBusinessAttribute<Undertaking, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(UndertakingConfirmation1.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking or its amendment is advised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Undertaking obj) {
			return obj.getDateOfAdvice();
		}

		@Override
		public void setValue(Undertaking obj, ISODateTime value) {
			obj.setDateOfAdvice(value);
		}
	};
	protected Max35Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmPurpose
	 * Undertaking1.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the purpose of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, Max35Text> mmPurpose = new MMBusinessAttribute<Undertaking, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Description of the purpose of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Undertaking obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Undertaking obj, Max35Text value) {
			obj.setPurpose(value);
		}
	};
	protected UndertakingNameCode undertakingName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingNameCode
	 * UndertakingNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#mmName
	 * Undertaking2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmName
	 * Undertaking1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmName
	 * Undertaking4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmName
	 * Undertaking3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of undertaking such as, demand guarantee, standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, UndertakingNameCode> mmUndertakingName = new MMBusinessAttribute<Undertaking, UndertakingNameCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking2.mmName, Undertaking1.mmName, Undertaking4.mmName, Undertaking3.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingName";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingNameCode.mmObject();
		}

		@Override
		public UndertakingNameCode getValue(Undertaking obj) {
			return obj.getUndertakingName();
		}

		@Override
		public void setValue(Undertaking obj, UndertakingNameCode value) {
			obj.setUndertakingName(value);
		}
	};
	protected ExternalUndertakingTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingTypeCode
	 * ExternalUndertakingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingType1Choice#mmCode
	 * UndertakingType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UndertakingType1Choice#mmProprietary
	 * UndertakingType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmType
	 * Undertaking1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmType
	 * Undertaking4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmType
	 * Undertaking3.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of guarantee or standby letter of credit, for example, performance,  payment, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, ExternalUndertakingTypeCode> mmType = new MMBusinessAttribute<Undertaking, ExternalUndertakingTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(UndertakingType1Choice.mmCode, UndertakingType1Choice.mmProprietary, Undertaking1.mmType, Undertaking4.mmType, Undertaking3.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of guarantee or standby letter of credit, for example, performance,  payment, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingTypeCode.mmObject();
		}

		@Override
		public ExternalUndertakingTypeCode getValue(Undertaking obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Undertaking obj, ExternalUndertakingTypeCode value) {
			obj.setType(value);
		}
	};
	protected YesNoIndicator confirmationIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmConfirmationIndicator
	 * Undertaking1.mmConfirmationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmConfirmationIndicator
	 * Undertaking4.mmConfirmationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmConfirmationIndicator
	 * Undertaking3.mmConfirmationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmConfirmationIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmConfirmationIndicator, Undertaking4.mmConfirmationIndicator, Undertaking3.mmConfirmationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getConfirmationIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setConfirmationIndicator(value);
		}
	};
	protected YesNoIndicator counterUndertakingIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmCounterUndertakingIndicator
	 * Undertaking1.mmCounterUndertakingIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterUndertakingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the undertaking is a counter-undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmCounterUndertakingIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmCounterUndertakingIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getCounterUndertakingIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setCounterUndertakingIndicator(value);
		}
	};
	protected ExternalTypeOfPartyCode relatedChargesPayableBy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalTypeOfPartyCode
	 * ExternalTypeOfPartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmConfirmationChargesPayableBy
	 * Undertaking2.mmConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmTransferChargesPayableBy
	 * Undertaking1.mmTransferChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmConfirmationChargesPayableBy
	 * Undertaking1.mmConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmConfirmationChargesPayableBy
	 * Undertaking4.mmConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmTransferChargesPayableBy
	 * Undertaking4.mmTransferChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmConfirmationChargesPayableBy
	 * Undertaking3.mmConfirmationChargesPayableBy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmTransferChargesPayableBy
	 * Undertaking3.mmTransferChargesPayableBy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChargesPayableBy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, ExternalTypeOfPartyCode> mmRelatedChargesPayableBy = new MMBusinessAttribute<Undertaking, ExternalTypeOfPartyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking2.mmConfirmationChargesPayableBy, Undertaking1.mmTransferChargesPayableBy, Undertaking1.mmConfirmationChargesPayableBy, Undertaking4.mmConfirmationChargesPayableBy,
					Undertaking4.mmTransferChargesPayableBy, Undertaking3.mmConfirmationChargesPayableBy, Undertaking3.mmTransferChargesPayableBy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}

		@Override
		public ExternalTypeOfPartyCode getValue(Undertaking obj) {
			return obj.getRelatedChargesPayableBy();
		}

		@Override
		public void setValue(Undertaking obj, ExternalTypeOfPartyCode value) {
			obj.setRelatedChargesPayableBy(value);
		}
	};
	protected YesNoIndicator standardClaimDocumentIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking2#mmStandardClaimDocumentIndicator
	 * Undertaking2.mmStandardClaimDocumentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardClaimDocumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether a claim is to utilise a standard claim form of the issuing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmStandardClaimDocumentIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking2.mmStandardClaimDocumentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardClaimDocumentIndicator";
			definition = "Indication as to whether a claim is to utilise a standard claim form of the issuing institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getStandardClaimDocumentIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setStandardClaimDocumentIndicator(value);
		}
	};
	protected UnderlyingTransaction underlyingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmUndertaking
	 * UnderlyingTransaction.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUnderlyingTransaction
	 * Undertaking1.mmUnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmUnderlyingTransaction
	 * Undertaking4.mmUnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmUnderlyingTransaction
	 * Undertaking3.mmUnderlyingTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<UnderlyingTransaction>> mmUnderlyingTransaction = new MMBusinessAssociationEnd<Undertaking, Optional<UnderlyingTransaction>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmUnderlyingTransaction, Undertaking4.mmUnderlyingTransaction, Undertaking3.mmUnderlyingTransaction);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> UnderlyingTransaction.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UnderlyingTransaction.mmObject();
		}

		@Override
		public Optional<UnderlyingTransaction> getValue(Undertaking obj) {
			return obj.getUnderlyingTransaction();
		}

		@Override
		public void setValue(Undertaking obj, Optional<UnderlyingTransaction> value) {
			obj.setUnderlyingTransaction(value.orElse(null));
		}
	};
	protected ModelForm modelForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmUndertaking
	 * ModelForm.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmUndertakingWording
	 * Undertaking1.mmUndertakingWording}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmUndertakingWording
	 * Undertaking4.mmUndertakingWording}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<ModelForm>> mmModelForm = new MMBusinessAssociationEnd<Undertaking, Optional<ModelForm>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmUndertakingWording, Undertaking4.mmUndertakingWording);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. ";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ModelForm.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ModelForm.mmObject();
		}

		@Override
		public Optional<ModelForm> getValue(Undertaking obj) {
			return obj.getModelForm();
		}

		@Override
		public void setValue(Undertaking obj, Optional<ModelForm> value) {
			obj.setModelForm(value.orElse(null));
		}
	};
	protected YesNoIndicator multipleDemandIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmMultipleDemandIndicator
	 * Undertaking1.mmMultipleDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmMultipleDemandIndicator
	 * Undertaking4.mmMultipleDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmMultipleDemandIndicator
	 * Undertaking3.mmMultipleDemandIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether multiple demands are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmMultipleDemandIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmMultipleDemandIndicator, Undertaking4.mmMultipleDemandIndicator, Undertaking3.mmMultipleDemandIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getMultipleDemandIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setMultipleDemandIndicator(value);
		}
	};
	protected YesNoIndicator partialDemandIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmPartialDemandIndicator
	 * Undertaking1.mmPartialDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmPartialDemandIndicator
	 * Undertaking4.mmPartialDemandIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPartialDemandIndicator
	 * Undertaking3.mmPartialDemandIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDemandIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether partial demands/drawings are permitted against the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmPartialDemandIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmPartialDemandIndicator, Undertaking4.mmPartialDemandIndicator, Undertaking3.mmPartialDemandIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getPartialDemandIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setPartialDemandIndicator(value);
		}
	};
	protected YesNoIndicator transferIndicator;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmTransferIndicator
	 * Undertaking1.mmTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmTransferIndicator
	 * Undertaking4.mmTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmTransferIndicator
	 * Undertaking3.mmTransferIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the undertaking is transferrable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Undertaking, YesNoIndicator> mmTransferIndicator = new MMBusinessAttribute<Undertaking, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmTransferIndicator, Undertaking4.mmTransferIndicator, Undertaking3.mmTransferIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferrable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Undertaking obj) {
			return obj.getTransferIndicator();
		}

		@Override
		public void setValue(Undertaking obj, YesNoIndicator value) {
			obj.setTransferIndicator(value);
		}
	};
	protected AutomaticVariation predefinedVariation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
	 * AutomaticVariation.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmAutomaticAmountVariation
	 * Undertaking1.mmAutomaticAmountVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmAutomaticAmountVariation
	 * Undertaking4.mmAutomaticAmountVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmAutomaticAmountVariation
	 * Undertaking3.mmAutomaticAmountVariation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PredefinedVariation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<AutomaticVariation>> mmPredefinedVariation = new MMBusinessAssociationEnd<Undertaking, Optional<AutomaticVariation>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmAutomaticAmountVariation, Undertaking4.mmAutomaticAmountVariation, Undertaking3.mmAutomaticAmountVariation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PredefinedVariation";
			definition = "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AutomaticVariation.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AutomaticVariation.mmObject();
		}

		@Override
		public Optional<AutomaticVariation> getValue(Undertaking obj) {
			return obj.getPredefinedVariation();
		}

		@Override
		public void setValue(Undertaking obj, Optional<AutomaticVariation> value) {
			obj.setPredefinedVariation(value.orElse(null));
		}
	};
	protected Charges charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
	 * Charges.mmRelatedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and currency of the commissions and changes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<Charges>> mmCharges = new MMBusinessAssociationEnd<Undertaking, Optional<Charges>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Amount and currency of the commissions and changes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmRelatedUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public Optional<Charges> getValue(Undertaking obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(Undertaking obj, Optional<Charges> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	protected Presentation presentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedUndertaking
	 * Presentation.mmPresentedUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#mmPresentationDetails
	 * Undertaking1.mmPresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand1#mmPresentationDetails
	 * Demand1.mmPresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmPresentationDetails
	 * Undertaking4.mmPresentationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPresentationDetails
	 * Undertaking3.mmPresentationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation information related to the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<Presentation>> mmPresentation = new MMBusinessAssociationEnd<Undertaking, Optional<Presentation>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking1.mmPresentationDetails, Demand1.mmPresentationDetails, Undertaking4.mmPresentationDetails, Undertaking3.mmPresentationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation information related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Presentation.mmPresentedUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Presentation.mmObject();
		}

		@Override
		public Optional<Presentation> getValue(Undertaking obj) {
			return obj.getPresentation();
		}

		@Override
		public void setValue(Undertaking obj, Optional<Presentation> value) {
			obj.setPresentation(value.orElse(null));
		}
	};
	protected UndertakingExtension undertakingExtension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmUndertaking
	 * UndertakingExtension.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension
	 * UndertakingExtension}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpiryTerms1#mmAutoExtension
	 * ExpiryTerms1.mmAutoExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information related to the extension of an undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Undertaking, Optional<UndertakingExtension>> mmUndertakingExtension = new MMBusinessAssociationEnd<Undertaking, Optional<UndertakingExtension>>() {
		{
			derivation_lazy = () -> Arrays.asList(ExpiryTerms1.mmAutoExtension);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingExtension";
			definition = "Specifies information related to the extension of an undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> UndertakingExtension.mmUndertaking;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingExtension.mmObject();
		}

		@Override
		public Optional<UndertakingExtension> getValue(Undertaking obj) {
			return obj.getUndertakingExtension();
		}

		@Override
		public void setValue(Undertaking obj, Optional<UndertakingExtension> value) {
			obj.setUndertakingExtension(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
				associationDomain_lazy = () -> Arrays.asList(Charges.mmRelatedUndertaking, ElectronicSignature.mmUndertaking, Presentation.mmPresentedUndertaking, UndertakingStatus.mmUndertaking, UndertakingPartyRole.mmUndertaking,
						Demand.mmUndertaking, Expiry.mmUndertaking, UndertakingDocument.mmUndertaking, AmendmentOfUndertaking.mmUndertaking, UndertakingAmount.mmUndertaking, UndertakingExtension.mmUndertaking, ModelForm.mmUndertaking,
						UnderlyingTransaction.mmUndertaking, AutomaticVariation.mmUndertaking);
				derivationElement_lazy = () -> Arrays.asList(ExtendOrPayQuery1.mmUndertakingIdentification, Undertaking1.mmCounterUndertaking, Demand1.mmUndertakingIdentification, UndertakingIssuanceMessage.mmUndertakingDetails,
						UndertakingAdvice1.mmUndertakingIssuanceMessage, UndertakingAdvice2.mmUndertakingIssuanceMessage, UndertakingNonExtensionRequest1.mmUndertakingIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmElectronicSignature, com.tools20022.repository.entity.Undertaking.mmUndertakingStatus,
						com.tools20022.repository.entity.Undertaking.mmIdentification, com.tools20022.repository.entity.Undertaking.mmDemand, com.tools20022.repository.entity.Undertaking.mmTerminationDate,
						com.tools20022.repository.entity.Undertaking.mmUndertakingAmount, com.tools20022.repository.entity.Undertaking.mmExpiry, com.tools20022.repository.entity.Undertaking.mmPartyRole,
						com.tools20022.repository.entity.Undertaking.mmUndertakingAmendment, com.tools20022.repository.entity.Undertaking.mmSpecifiedDocument, com.tools20022.repository.entity.Undertaking.mmDateOfAdvice,
						com.tools20022.repository.entity.Undertaking.mmPurpose, com.tools20022.repository.entity.Undertaking.mmUndertakingName, com.tools20022.repository.entity.Undertaking.mmType,
						com.tools20022.repository.entity.Undertaking.mmConfirmationIndicator, com.tools20022.repository.entity.Undertaking.mmCounterUndertakingIndicator,
						com.tools20022.repository.entity.Undertaking.mmRelatedChargesPayableBy, com.tools20022.repository.entity.Undertaking.mmStandardClaimDocumentIndicator,
						com.tools20022.repository.entity.Undertaking.mmUnderlyingTransaction, com.tools20022.repository.entity.Undertaking.mmModelForm, com.tools20022.repository.entity.Undertaking.mmMultipleDemandIndicator,
						com.tools20022.repository.entity.Undertaking.mmPartialDemandIndicator, com.tools20022.repository.entity.Undertaking.mmTransferIndicator, com.tools20022.repository.entity.Undertaking.mmPredefinedVariation,
						com.tools20022.repository.entity.Undertaking.mmCharges, com.tools20022.repository.entity.Undertaking.mmPresentation, com.tools20022.repository.entity.Undertaking.mmUndertakingExtension);
				derivationComponent_lazy = () -> Arrays.asList(Undertaking9.mmObject(), Undertaking6.mmObject(), ExtendOrPayQuery1.mmObject(), Undertaking7.mmObject(), Undertaking11.mmObject(), UndertakingConfirmation1.mmObject(),
						Undertaking10.mmObject(), UndertakingType1Choice.mmObject(), Undertaking2.mmObject(), Undertaking1.mmObject(), Undertaking4.mmObject(), Undertaking3.mmObject(), UndertakingIssuanceMessage.mmObject(),
						UndertakingAdvice1.mmObject(), UndertakingAdvice2.mmObject(), UndertakingNonExtensionRequest1.mmObject(), Undertaking8.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Undertaking.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ElectronicSignature> getElectronicSignature() {
		return electronicSignature == null ? Optional.empty() : Optional.of(electronicSignature);
	}

	public Undertaking setElectronicSignature(ElectronicSignature electronicSignature) {
		this.electronicSignature = electronicSignature;
		return this;
	}

	public UndertakingStatus getUndertakingStatus() {
		return undertakingStatus;
	}

	public Undertaking setUndertakingStatus(UndertakingStatus undertakingStatus) {
		this.undertakingStatus = Objects.requireNonNull(undertakingStatus);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Undertaking setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Demand> getDemand() {
		return demand == null ? Optional.empty() : Optional.of(demand);
	}

	public Undertaking setDemand(Demand demand) {
		this.demand = demand;
		return this;
	}

	public ISODate getTerminationDate() {
		return terminationDate;
	}

	public Undertaking setTerminationDate(ISODate terminationDate) {
		this.terminationDate = Objects.requireNonNull(terminationDate);
		return this;
	}

	public UndertakingAmount getUndertakingAmount() {
		return undertakingAmount;
	}

	public Undertaking setUndertakingAmount(UndertakingAmount undertakingAmount) {
		this.undertakingAmount = Objects.requireNonNull(undertakingAmount);
		return this;
	}

	public Expiry getExpiry() {
		return expiry;
	}

	public Undertaking setExpiry(Expiry expiry) {
		this.expiry = Objects.requireNonNull(expiry);
		return this;
	}

	public UndertakingPartyRole getPartyRole() {
		return partyRole;
	}

	public Undertaking setPartyRole(UndertakingPartyRole partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<AmendmentOfUndertaking> getUndertakingAmendment() {
		return undertakingAmendment == null ? Optional.empty() : Optional.of(undertakingAmendment);
	}

	public Undertaking setUndertakingAmendment(AmendmentOfUndertaking undertakingAmendment) {
		this.undertakingAmendment = undertakingAmendment;
		return this;
	}

	public Optional<UndertakingDocument> getSpecifiedDocument() {
		return specifiedDocument == null ? Optional.empty() : Optional.of(specifiedDocument);
	}

	public Undertaking setSpecifiedDocument(UndertakingDocument specifiedDocument) {
		this.specifiedDocument = specifiedDocument;
		return this;
	}

	public ISODateTime getDateOfAdvice() {
		return dateOfAdvice;
	}

	public Undertaking setDateOfAdvice(ISODateTime dateOfAdvice) {
		this.dateOfAdvice = Objects.requireNonNull(dateOfAdvice);
		return this;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public Undertaking setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public UndertakingNameCode getUndertakingName() {
		return undertakingName;
	}

	public Undertaking setUndertakingName(UndertakingNameCode undertakingName) {
		this.undertakingName = Objects.requireNonNull(undertakingName);
		return this;
	}

	public ExternalUndertakingTypeCode getType() {
		return type;
	}

	public Undertaking setType(ExternalUndertakingTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YesNoIndicator getConfirmationIndicator() {
		return confirmationIndicator;
	}

	public Undertaking setConfirmationIndicator(YesNoIndicator confirmationIndicator) {
		this.confirmationIndicator = Objects.requireNonNull(confirmationIndicator);
		return this;
	}

	public YesNoIndicator getCounterUndertakingIndicator() {
		return counterUndertakingIndicator;
	}

	public Undertaking setCounterUndertakingIndicator(YesNoIndicator counterUndertakingIndicator) {
		this.counterUndertakingIndicator = Objects.requireNonNull(counterUndertakingIndicator);
		return this;
	}

	public ExternalTypeOfPartyCode getRelatedChargesPayableBy() {
		return relatedChargesPayableBy;
	}

	public Undertaking setRelatedChargesPayableBy(ExternalTypeOfPartyCode relatedChargesPayableBy) {
		this.relatedChargesPayableBy = Objects.requireNonNull(relatedChargesPayableBy);
		return this;
	}

	public YesNoIndicator getStandardClaimDocumentIndicator() {
		return standardClaimDocumentIndicator;
	}

	public Undertaking setStandardClaimDocumentIndicator(YesNoIndicator standardClaimDocumentIndicator) {
		this.standardClaimDocumentIndicator = Objects.requireNonNull(standardClaimDocumentIndicator);
		return this;
	}

	public Optional<UnderlyingTransaction> getUnderlyingTransaction() {
		return underlyingTransaction == null ? Optional.empty() : Optional.of(underlyingTransaction);
	}

	public Undertaking setUnderlyingTransaction(UnderlyingTransaction underlyingTransaction) {
		this.underlyingTransaction = underlyingTransaction;
		return this;
	}

	public Optional<ModelForm> getModelForm() {
		return modelForm == null ? Optional.empty() : Optional.of(modelForm);
	}

	public Undertaking setModelForm(ModelForm modelForm) {
		this.modelForm = modelForm;
		return this;
	}

	public YesNoIndicator getMultipleDemandIndicator() {
		return multipleDemandIndicator;
	}

	public Undertaking setMultipleDemandIndicator(YesNoIndicator multipleDemandIndicator) {
		this.multipleDemandIndicator = Objects.requireNonNull(multipleDemandIndicator);
		return this;
	}

	public YesNoIndicator getPartialDemandIndicator() {
		return partialDemandIndicator;
	}

	public Undertaking setPartialDemandIndicator(YesNoIndicator partialDemandIndicator) {
		this.partialDemandIndicator = Objects.requireNonNull(partialDemandIndicator);
		return this;
	}

	public YesNoIndicator getTransferIndicator() {
		return transferIndicator;
	}

	public Undertaking setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = Objects.requireNonNull(transferIndicator);
		return this;
	}

	public Optional<AutomaticVariation> getPredefinedVariation() {
		return predefinedVariation == null ? Optional.empty() : Optional.of(predefinedVariation);
	}

	public Undertaking setPredefinedVariation(AutomaticVariation predefinedVariation) {
		this.predefinedVariation = predefinedVariation;
		return this;
	}

	public Optional<Charges> getCharges() {
		return charges == null ? Optional.empty() : Optional.of(charges);
	}

	public Undertaking setCharges(Charges charges) {
		this.charges = charges;
		return this;
	}

	public Optional<Presentation> getPresentation() {
		return presentation == null ? Optional.empty() : Optional.of(presentation);
	}

	public Undertaking setPresentation(Presentation presentation) {
		this.presentation = presentation;
		return this;
	}

	public Optional<UndertakingExtension> getUndertakingExtension() {
		return undertakingExtension == null ? Optional.empty() : Optional.of(undertakingExtension);
	}

	public Undertaking setUndertakingExtension(UndertakingExtension undertakingExtension) {
		this.undertakingExtension = undertakingExtension;
		return this;
	}
}