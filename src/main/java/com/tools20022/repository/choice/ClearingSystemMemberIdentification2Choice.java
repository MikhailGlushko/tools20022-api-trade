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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AustralianBSBIdentification;
import com.tools20022.repository.entity.CashClearingSystemMember;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identifiers for a clearing system member, as assigned by the
 * clearing system. In some clearing systems, the accounts of the clearing
 * system members are also assigned an identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCHIPSUniversalIdentification
 * ClearingSystemMemberIdentification2Choice.mmCHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmNewZealandNCCIdentification
 * ClearingSystemMemberIdentification2Choice.mmNewZealandNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmIrishNSCIdentification
 * ClearingSystemMemberIdentification2Choice.mmIrishNSCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmUKDomesticSortCode
 * ClearingSystemMemberIdentification2Choice.mmUKDomesticSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCHIPSParticipantIdentification
 * ClearingSystemMemberIdentification2Choice.mmCHIPSParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSwissBCIdentification
 * ClearingSystemMemberIdentification2Choice.mmSwissBCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmFedwireRoutingNumberIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmFedwireRoutingNumberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmPortugueseNCCIdentification
 * ClearingSystemMemberIdentification2Choice.mmPortugueseNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmRussianCentralBankIdentificationCode
 * ClearingSystemMemberIdentification2Choice.
 * mmRussianCentralBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmItalianDomesticIdentificationCode
 * ClearingSystemMemberIdentification2Choice.mmItalianDomesticIdentificationCode
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmAustrianBankleitzahlIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmAustrianBankleitzahlIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmCanadianPaymentsAssociationRoutingNumberIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmCanadianPaymentsAssociationRoutingNumberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSwissSICIdentification
 * ClearingSystemMemberIdentification2Choice.mmSwissSICIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmGermanBankleitzahlIdentification
 * ClearingSystemMemberIdentification2Choice.mmGermanBankleitzahlIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSpanishDomesticInterbankingIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmSpanishDomesticInterbankingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmSouthAfricanNCCIdentification
 * ClearingSystemMemberIdentification2Choice.mmSouthAfricanNCCIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmHongKongBankCode
 * ClearingSystemMemberIdentification2Choice.mmHongKongBankCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmAustralianExtensiveBranchNetworkIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmAustralianExtensiveBranchNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmAustralianSmallNetworkIdentification
 * ClearingSystemMemberIdentification2Choice.
 * mmAustralianSmallNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmIndianFinancialSystemCode
 * ClearingSystemMemberIdentification2Choice.mmIndianFinancialSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmHellenicBankIdentificationCode
 * ClearingSystemMemberIdentification2Choice.mmHellenicBankIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmPolishNationalClearingCode
 * ClearingSystemMemberIdentification2Choice.mmPolishNationalClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice#mmOtherClearingCodeIdentification
 * ClearingSystemMemberIdentification2Choice.mmOtherClearingCodeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
 * CashClearingSystemMember}</li>
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
 * "ClearingSystemMemberIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingSystemMemberIdentification2Choice", propOrder = {"cHIPSUniversalIdentification", "newZealandNCCIdentification", "irishNSCIdentification", "uKDomesticSortCode", "cHIPSParticipantIdentification",
		"swissBCIdentification", "fedwireRoutingNumberIdentification", "portugueseNCCIdentification", "russianCentralBankIdentificationCode", "italianDomesticIdentificationCode", "austrianBankleitzahlIdentification",
		"canadianPaymentsAssociationRoutingNumberIdentification", "swissSICIdentification", "germanBankleitzahlIdentification", "spanishDomesticInterbankingIdentification", "southAfricanNCCIdentification", "hongKongBankCode",
		"australianExtensiveBranchNetworkIdentification", "australianSmallNetworkIdentification", "indianFinancialSystemCode", "hellenicBankIdentificationCode", "polishNationalClearingCode", "otherClearingCodeIdentification"})
public class ClearingSystemMemberIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "USCHU", required = true)
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSUniversalIdentification
	 * CashClearingSystemMember.mmCHIPSUniversalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCHU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CHIPSUniversalIdentifier> mmCHIPSUniversalIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CHIPSUniversalIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCHIPSUniversalIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "USCHU";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}

		@Override
		public CHIPSUniversalIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getCHIPSUniversalIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, CHIPSUniversalIdentifier value) {
			obj.setCHIPSUniversalIdentification(value);
		}
	};
	@XmlElement(name = "NZNCC", required = true)
	protected NewZealandNCCIdentifier newZealandNCCIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NewZealandNCCIdentifier
	 * NewZealandNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmNewZealandNCC
	 * CashClearingSystemMember.mmNewZealandNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NZNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, NewZealandNCCIdentifier> mmNewZealandNCCIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, NewZealandNCCIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmNewZealandNCC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "NZNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNCCIdentification";
			definition = "New Zealand Bank/Branch Code - identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NewZealandNCCIdentifier.mmObject();
		}

		@Override
		public NewZealandNCCIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getNewZealandNCCIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, NewZealandNCCIdentifier value) {
			obj.setNewZealandNCCIdentification(value);
		}
	};
	@XmlElement(name = "IENSC", required = true)
	protected IrishNSCIdentifier irishNSCIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IrishNSCIdentifier
	 * IrishNSCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIrishNSC
	 * CashClearingSystemMember.mmIrishNSC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IENSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNSCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, IrishNSCIdentifier> mmIrishNSCIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, IrishNSCIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmIrishNSC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "IENSC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNSCIdentification";
			definition = "Irish National Sorting Code - identifies Irish financial institutions on the Irish national clearing system. The code is assigned by the Irish Payments Services Organisation (IPSO).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IrishNSCIdentifier.mmObject();
		}

		@Override
		public IrishNSCIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getIrishNSCIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, IrishNSCIdentifier value) {
			obj.setIrishNSCIdentification(value);
		}
	};
	@XmlElement(name = "GBSC", required = true)
	protected UKDomesticSortCodeIdentifier uKDomesticSortCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UKDomesticSortCodeIdentifier
	 * UKDomesticSortCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmUKSortCode
	 * CashClearingSystemMember.mmUKSortCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomesticSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, UKDomesticSortCodeIdentifier> mmUKDomesticSortCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, UKDomesticSortCodeIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmUKSortCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "GBSC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSortCode";
			definition = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKDomesticSortCodeIdentifier.mmObject();
		}

		@Override
		public UKDomesticSortCodeIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getUKDomesticSortCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, UKDomesticSortCodeIdentifier value) {
			obj.setUKDomesticSortCode(value);
		}
	};
	@XmlElement(name = "USCH", required = true)
	protected CHIPSParticipantIdentifier cHIPSParticipantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSParticipantIdentifier
	 * CHIPSParticipantIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCHIPSParticipantIdentification
	 * CashClearingSystemMember.mmCHIPSParticipantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CHIPSParticipantIdentifier> mmCHIPSParticipantIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CHIPSParticipantIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCHIPSParticipantIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "USCH";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSParticipantIdentification";
			definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID) - identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CHIPSParticipantIdentifier.mmObject();
		}

		@Override
		public CHIPSParticipantIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getCHIPSParticipantIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, CHIPSParticipantIdentifier value) {
			obj.setCHIPSParticipantIdentification(value);
		}
	};
	@XmlElement(name = "CHBC", required = true)
	protected SwissBCIdentifier swissBCIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissBCIdentifier
	 * SwissBCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissBC
	 * CashClearingSystemMember.mmSwissBC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissBCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SwissBCIdentifier> mmSwissBCIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SwissBCIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSwissBC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "CHBC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissBCIdentification";
			definition = "Swiss Bank Code - identifies Swiss institutions on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissBCIdentifier.mmObject();
		}

		@Override
		public SwissBCIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getSwissBCIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, SwissBCIdentifier value) {
			obj.setSwissBCIdentification(value);
		}
	};
	@XmlElement(name = "USFW", required = true)
	protected FedwireRoutingNumberIdentifier fedwireRoutingNumberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.FedwireRoutingNumberIdentifier
	 * FedwireRoutingNumberIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmFedwireRoutingNumber
	 * CashClearingSystemMember.mmFedwireRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, FedwireRoutingNumberIdentifier> mmFedwireRoutingNumberIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, FedwireRoutingNumberIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmFedwireRoutingNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "USFW";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumberIdentification";
			definition = "Fedwire Routing Number - identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FedwireRoutingNumberIdentifier.mmObject();
		}

		@Override
		public FedwireRoutingNumberIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getFedwireRoutingNumberIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, FedwireRoutingNumberIdentifier value) {
			obj.setFedwireRoutingNumberIdentification(value);
		}
	};
	@XmlElement(name = "PTNCC", required = true)
	protected PortugueseNCCIdentifier portugueseNCCIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PortugueseNCCIdentifier
	 * PortugueseNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPortugueseNCC
	 * CashClearingSystemMember.mmPortugueseNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PTNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, PortugueseNCCIdentifier> mmPortugueseNCCIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, PortugueseNCCIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmPortugueseNCC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "PTNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNCCIdentification";
			definition = "Portuguese National Clearing Code - identifies Portuguese financial institutions on the Portuguese national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PortugueseNCCIdentifier.mmObject();
		}

		@Override
		public PortugueseNCCIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getPortugueseNCCIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, PortugueseNCCIdentifier value) {
			obj.setPortugueseNCCIdentification(value);
		}
	};
	@XmlElement(name = "RUCB", required = true)
	protected RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier
	 * RussianCentralBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmRussianCentralBankIdentificationCode
	 * CashClearingSystemMember.mmRussianCentralBankIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RUCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, RussianCentralBankIdentificationCodeIdentifier> mmRussianCentralBankIdentificationCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, RussianCentralBankIdentificationCodeIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmRussianCentralBankIdentificationCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "RUCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RussianCentralBankIdentificationCode";
			definition = "Russian Central Bank Identification Code - identifies Russian financial institutions on the Russian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RussianCentralBankIdentificationCodeIdentifier.mmObject();
		}

		@Override
		public RussianCentralBankIdentificationCodeIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getRussianCentralBankIdentificationCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, RussianCentralBankIdentificationCodeIdentifier value) {
			obj.setRussianCentralBankIdentificationCode(value);
		}
	};
	@XmlElement(name = "ITNCC", required = true)
	protected ItalianDomesticIdentifier italianDomesticIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ItalianDomesticIdentifier
	 * ItalianDomesticIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmItalianDomesticIdentificationCode
	 * CashClearingSystemMember.mmItalianDomesticIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ITNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, ItalianDomesticIdentifier> mmItalianDomesticIdentificationCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, ItalianDomesticIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmItalianDomesticIdentificationCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ITNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentificationCode";
			definition = "Italian Domestic Identification Code - identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ItalianDomesticIdentifier.mmObject();
		}

		@Override
		public ItalianDomesticIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getItalianDomesticIdentificationCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, ItalianDomesticIdentifier value) {
			obj.setItalianDomesticIdentificationCode(value);
		}
	};
	@XmlElement(name = "ATBLZ", required = true)
	protected AustrianBankleitzahlIdentifier austrianBankleitzahlIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AustrianBankleitzahlIdentifier
	 * AustrianBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustrianBankleitzahl
	 * CashClearingSystemMember.mmAustrianBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, AustrianBankleitzahlIdentifier> mmAustrianBankleitzahlIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, AustrianBankleitzahlIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmAustrianBankleitzahl;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ATBLZ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankleitzahlIdentification";
			definition = "Austrian Bankleitzahl - identifies Austrian financial institutions on the Austrian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AustrianBankleitzahlIdentifier.mmObject();
		}

		@Override
		public AustrianBankleitzahlIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getAustrianBankleitzahlIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, AustrianBankleitzahlIdentifier value) {
			obj.setAustrianBankleitzahlIdentification(value);
		}
	};
	@XmlElement(name = "CACPA", required = true)
	protected CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CanadianPaymentsARNIdentifier
	 * CanadianPaymentsARNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmCanadianPaymentsAssociationRoutingNumber
	 * CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CACPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociationRoutingNumberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CanadianPaymentsARNIdentifier> mmCanadianPaymentsAssociationRoutingNumberIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, CanadianPaymentsARNIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmCanadianPaymentsAssociationRoutingNumber;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "CACPA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociationRoutingNumberIdentification";
			definition = "Canadian Payments Association Routing Number - identifies Canadian financial institutions on the Canadian national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CanadianPaymentsARNIdentifier.mmObject();
		}

		@Override
		public CanadianPaymentsARNIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getCanadianPaymentsAssociationRoutingNumberIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, CanadianPaymentsARNIdentifier value) {
			obj.setCanadianPaymentsAssociationRoutingNumberIdentification(value);
		}
	};
	@XmlElement(name = "CHSIC", required = true)
	protected SwissSICIdentifier swissSICIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SwissSICIdentifier
	 * SwissSICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSwissSIC
	 * CashClearingSystemMember.mmSwissSIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CHSIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissSICIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SwissSICIdentifier> mmSwissSICIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SwissSICIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSwissSIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "CHSIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissSICIdentification";
			definition = "Swiss Interbank Clearing (SIC) Code - identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SwissSICIdentifier.mmObject();
		}

		@Override
		public SwissSICIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getSwissSICIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, SwissSICIdentifier value) {
			obj.setSwissSICIdentification(value);
		}
	};
	@XmlElement(name = "DEBLZ", required = true)
	protected GermanBankleitzahlIdentifier germanBankleitzahlIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GermanBankleitzahlIdentifier
	 * GermanBankleitzahlIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmGermanBankleitzahl
	 * CashClearingSystemMember.mmGermanBankleitzahl}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DEBLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahlIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "German Bankleitzahl - identifies German financial institutions on the German national clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, GermanBankleitzahlIdentifier> mmGermanBankleitzahlIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, GermanBankleitzahlIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmGermanBankleitzahl;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "DEBLZ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahlIdentification";
			definition = "German Bankleitzahl - identifies German financial institutions on the German national clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GermanBankleitzahlIdentifier.mmObject();
		}

		@Override
		public GermanBankleitzahlIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getGermanBankleitzahlIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, GermanBankleitzahlIdentifier value) {
			obj.setGermanBankleitzahlIdentification(value);
		}
	};
	@XmlElement(name = "ESNCC", required = true)
	protected SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SpanishDomesticInterbankingIdentifier
	 * SpanishDomesticInterbankingIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSpanishDomesticInterbankingCode
	 * CashClearingSystemMember.mmSpanishDomesticInterbankingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ESNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbankingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SpanishDomesticInterbankingIdentifier> mmSpanishDomesticInterbankingIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SpanishDomesticInterbankingIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSpanishDomesticInterbankingCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ESNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbankingIdentification";
			definition = "Spanish Domestic Interbanking Code - identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SpanishDomesticInterbankingIdentifier.mmObject();
		}

		@Override
		public SpanishDomesticInterbankingIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getSpanishDomesticInterbankingIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, SpanishDomesticInterbankingIdentifier value) {
			obj.setSpanishDomesticInterbankingIdentification(value);
		}
	};
	@XmlElement(name = "ZANCC", required = true)
	protected SouthAfricanNCCIdentifier southAfricanNCCIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SouthAfricanNCCIdentifier
	 * SouthAfricanNCCIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmSouthAfricanNCC
	 * CashClearingSystemMember.mmSouthAfricanNCC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZANCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNCCIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SouthAfricanNCCIdentifier> mmSouthAfricanNCCIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SouthAfricanNCCIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmSouthAfricanNCC;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ZANCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNCCIdentification";
			definition = "South African National Clearing Code (NCC) - identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SouthAfricanNCCIdentifier.mmObject();
		}

		@Override
		public SouthAfricanNCCIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getSouthAfricanNCCIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, SouthAfricanNCCIdentifier value) {
			obj.setSouthAfricanNCCIdentification(value);
		}
	};
	@XmlElement(name = "HKNCC", required = true)
	protected HongKongBankIdentifier hongKongBankCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HongKongBankIdentifier
	 * HongKongBankIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHongKongBankCode
	 * CashClearingSystemMember.mmHongKongBankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HKNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongBankCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, HongKongBankIdentifier> mmHongKongBankCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, HongKongBankIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmHongKongBankCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "HKNCC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongBankCode";
			definition = "Hong Kong Bank Code - identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HongKongBankIdentifier.mmObject();
		}

		@Override
		public HongKongBankIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getHongKongBankCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, HongKongBankIdentifier value) {
			obj.setHongKongBankCode(value);
		}
	};
	@XmlElement(name = "AUBSBx", required = true)
	protected ExtensiveBranchNetworkIdentifier australianExtensiveBranchNetworkIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier
	 * ExtensiveBranchNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmExtensiveBranchNetworkIdentification
	 * AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianExtensiveBranchNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, ExtensiveBranchNetworkIdentifier> mmAustralianExtensiveBranchNetworkIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, ExtensiveBranchNetworkIdentifier>() {
		{
			businessElementTrace_lazy = () -> AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "AUBSBx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}

		@Override
		public ExtensiveBranchNetworkIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getAustralianExtensiveBranchNetworkIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, ExtensiveBranchNetworkIdentifier value) {
			obj.setAustralianExtensiveBranchNetworkIdentification(value);
		}
	};
	@XmlElement(name = "AUBSBs", required = true)
	protected SmallNetworkIdentifier australianSmallNetworkIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SmallNetworkIdentifier
	 * SmallNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmSmallNetworkIdentification
	 * AustralianBSBIdentification.mmSmallNetworkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AUBSBs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianSmallNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SmallNetworkIdentifier> mmAustralianSmallNetworkIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, SmallNetworkIdentifier>() {
		{
			businessElementTrace_lazy = () -> AustralianBSBIdentification.mmSmallNetworkIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "AUBSBs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianSmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}

		@Override
		public SmallNetworkIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getAustralianSmallNetworkIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, SmallNetworkIdentifier value) {
			obj.setAustralianSmallNetworkIdentification(value);
		}
	};
	@XmlElement(name = "INIFSC", required = true)
	protected IndianFinancialSystemCodeIdentifier indianFinancialSystemCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IndianFinancialSystemCodeIdentifier
	 * IndianFinancialSystemCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmIndianFinancialSystemCode
	 * CashClearingSystemMember.mmIndianFinancialSystemCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "INIFSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndianFinancialSystemCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, IndianFinancialSystemCodeIdentifier> mmIndianFinancialSystemCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, IndianFinancialSystemCodeIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmIndianFinancialSystemCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "INIFSC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndianFinancialSystemCode";
			definition = "Indian Financial System Code - identifies Indian financial institutions on the Indian local clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IndianFinancialSystemCodeIdentifier.mmObject();
		}

		@Override
		public IndianFinancialSystemCodeIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getIndianFinancialSystemCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, IndianFinancialSystemCodeIdentifier value) {
			obj.setIndianFinancialSystemCode(value);
		}
	};
	@XmlElement(name = "GRHEBIC", required = true)
	protected HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.HellenicBankIdentificationCodeIdentifier
	 * HellenicBankIdentificationCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmHellenicBankIdentificationCode
	 * CashClearingSystemMember.mmHellenicBankIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GRHEBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HellenicBankIdentificationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, HellenicBankIdentificationCodeIdentifier> mmHellenicBankIdentificationCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, HellenicBankIdentificationCodeIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmHellenicBankIdentificationCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "GRHEBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HellenicBankIdentificationCode";
			definition = "Hellenic Bank Identification Code - identifies Hellenic financial institutions on the Hellenic national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HellenicBankIdentificationCodeIdentifier.mmObject();
		}

		@Override
		public HellenicBankIdentificationCodeIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getHellenicBankIdentificationCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, HellenicBankIdentificationCodeIdentifier value) {
			obj.setHellenicBankIdentificationCode(value);
		}
	};
	@XmlElement(name = "PLKNR", required = true)
	protected PolishNationalClearingCodeIdentifier polishNationalClearingCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PolishNationalClearingCodeIdentifier
	 * PolishNationalClearingCodeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmPolishNationalClearingCode
	 * CashClearingSystemMember.mmPolishNationalClearingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PLKNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PolishNationalClearingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, PolishNationalClearingCodeIdentifier> mmPolishNationalClearingCode = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, PolishNationalClearingCodeIdentifier>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystemMember.mmPolishNationalClearingCode;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "PLKNR";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PolishNationalClearingCode";
			definition = "Polish National Clearing Code - identifies Polish financial institutions on the Polish national clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PolishNationalClearingCodeIdentifier.mmObject();
		}

		@Override
		public PolishNationalClearingCodeIdentifier getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getPolishNationalClearingCode();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, PolishNationalClearingCodeIdentifier value) {
			obj.setPolishNationalClearingCode(value);
		}
	};
	@XmlElement(name = "OthrClrCdId", required = true)
	protected Max35Text otherClearingCodeIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice
	 * ClearingSystemMemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrClrCdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherClearingCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification Code for a clearing system, that has not yet been identified in the list of clearing systems."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemMemberIdentification2Choice, Max35Text> mmOtherClearingCodeIdentification = new MMMessageAttribute<ClearingSystemMemberIdentification2Choice, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystemMember.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrClrCdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherClearingCodeIdentification";
			definition = "Identification Code for a clearing system, that has not yet been identified in the list of clearing systems.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ClearingSystemMemberIdentification2Choice obj) {
			return obj.getOtherClearingCodeIdentification();
		}

		@Override
		public void setValue(ClearingSystemMemberIdentification2Choice obj, Max35Text value) {
			obj.setOtherClearingCodeIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCHIPSUniversalIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmNewZealandNCCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmIrishNSCIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmUKDomesticSortCode, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCHIPSParticipantIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSwissBCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmFedwireRoutingNumberIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmPortugueseNCCIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmRussianCentralBankIdentificationCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmItalianDomesticIdentificationCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmAustrianBankleitzahlIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmCanadianPaymentsAssociationRoutingNumberIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSwissSICIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmGermanBankleitzahlIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSpanishDomesticInterbankingIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmSouthAfricanNCCIdentification, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmHongKongBankCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmAustralianExtensiveBranchNetworkIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmAustralianSmallNetworkIdentification,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmIndianFinancialSystemCode, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmHellenicBankIdentificationCode,
						com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmPolishNationalClearingCode, com.tools20022.repository.choice.ClearingSystemMemberIdentification2Choice.mmOtherClearingCodeIdentification);
				trace_lazy = () -> CashClearingSystemMember.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemMemberIdentification2Choice";
				definition = "Choice of identifiers for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.";
			}
		});
		return mmObject_lazy.get();
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return cHIPSUniversalIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setCHIPSUniversalIdentification(CHIPSUniversalIdentifier cHIPSUniversalIdentification) {
		this.cHIPSUniversalIdentification = Objects.requireNonNull(cHIPSUniversalIdentification);
		return this;
	}

	public NewZealandNCCIdentifier getNewZealandNCCIdentification() {
		return newZealandNCCIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setNewZealandNCCIdentification(NewZealandNCCIdentifier newZealandNCCIdentification) {
		this.newZealandNCCIdentification = Objects.requireNonNull(newZealandNCCIdentification);
		return this;
	}

	public IrishNSCIdentifier getIrishNSCIdentification() {
		return irishNSCIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setIrishNSCIdentification(IrishNSCIdentifier irishNSCIdentification) {
		this.irishNSCIdentification = Objects.requireNonNull(irishNSCIdentification);
		return this;
	}

	public UKDomesticSortCodeIdentifier getUKDomesticSortCode() {
		return uKDomesticSortCode;
	}

	public ClearingSystemMemberIdentification2Choice setUKDomesticSortCode(UKDomesticSortCodeIdentifier uKDomesticSortCode) {
		this.uKDomesticSortCode = Objects.requireNonNull(uKDomesticSortCode);
		return this;
	}

	public CHIPSParticipantIdentifier getCHIPSParticipantIdentification() {
		return cHIPSParticipantIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setCHIPSParticipantIdentification(CHIPSParticipantIdentifier cHIPSParticipantIdentification) {
		this.cHIPSParticipantIdentification = Objects.requireNonNull(cHIPSParticipantIdentification);
		return this;
	}

	public SwissBCIdentifier getSwissBCIdentification() {
		return swissBCIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setSwissBCIdentification(SwissBCIdentifier swissBCIdentification) {
		this.swissBCIdentification = Objects.requireNonNull(swissBCIdentification);
		return this;
	}

	public FedwireRoutingNumberIdentifier getFedwireRoutingNumberIdentification() {
		return fedwireRoutingNumberIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setFedwireRoutingNumberIdentification(FedwireRoutingNumberIdentifier fedwireRoutingNumberIdentification) {
		this.fedwireRoutingNumberIdentification = Objects.requireNonNull(fedwireRoutingNumberIdentification);
		return this;
	}

	public PortugueseNCCIdentifier getPortugueseNCCIdentification() {
		return portugueseNCCIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setPortugueseNCCIdentification(PortugueseNCCIdentifier portugueseNCCIdentification) {
		this.portugueseNCCIdentification = Objects.requireNonNull(portugueseNCCIdentification);
		return this;
	}

	public RussianCentralBankIdentificationCodeIdentifier getRussianCentralBankIdentificationCode() {
		return russianCentralBankIdentificationCode;
	}

	public ClearingSystemMemberIdentification2Choice setRussianCentralBankIdentificationCode(RussianCentralBankIdentificationCodeIdentifier russianCentralBankIdentificationCode) {
		this.russianCentralBankIdentificationCode = Objects.requireNonNull(russianCentralBankIdentificationCode);
		return this;
	}

	public ItalianDomesticIdentifier getItalianDomesticIdentificationCode() {
		return italianDomesticIdentificationCode;
	}

	public ClearingSystemMemberIdentification2Choice setItalianDomesticIdentificationCode(ItalianDomesticIdentifier italianDomesticIdentificationCode) {
		this.italianDomesticIdentificationCode = Objects.requireNonNull(italianDomesticIdentificationCode);
		return this;
	}

	public AustrianBankleitzahlIdentifier getAustrianBankleitzahlIdentification() {
		return austrianBankleitzahlIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setAustrianBankleitzahlIdentification(AustrianBankleitzahlIdentifier austrianBankleitzahlIdentification) {
		this.austrianBankleitzahlIdentification = Objects.requireNonNull(austrianBankleitzahlIdentification);
		return this;
	}

	public CanadianPaymentsARNIdentifier getCanadianPaymentsAssociationRoutingNumberIdentification() {
		return canadianPaymentsAssociationRoutingNumberIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setCanadianPaymentsAssociationRoutingNumberIdentification(CanadianPaymentsARNIdentifier canadianPaymentsAssociationRoutingNumberIdentification) {
		this.canadianPaymentsAssociationRoutingNumberIdentification = Objects.requireNonNull(canadianPaymentsAssociationRoutingNumberIdentification);
		return this;
	}

	public SwissSICIdentifier getSwissSICIdentification() {
		return swissSICIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setSwissSICIdentification(SwissSICIdentifier swissSICIdentification) {
		this.swissSICIdentification = Objects.requireNonNull(swissSICIdentification);
		return this;
	}

	public GermanBankleitzahlIdentifier getGermanBankleitzahlIdentification() {
		return germanBankleitzahlIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setGermanBankleitzahlIdentification(GermanBankleitzahlIdentifier germanBankleitzahlIdentification) {
		this.germanBankleitzahlIdentification = Objects.requireNonNull(germanBankleitzahlIdentification);
		return this;
	}

	public SpanishDomesticInterbankingIdentifier getSpanishDomesticInterbankingIdentification() {
		return spanishDomesticInterbankingIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setSpanishDomesticInterbankingIdentification(SpanishDomesticInterbankingIdentifier spanishDomesticInterbankingIdentification) {
		this.spanishDomesticInterbankingIdentification = Objects.requireNonNull(spanishDomesticInterbankingIdentification);
		return this;
	}

	public SouthAfricanNCCIdentifier getSouthAfricanNCCIdentification() {
		return southAfricanNCCIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setSouthAfricanNCCIdentification(SouthAfricanNCCIdentifier southAfricanNCCIdentification) {
		this.southAfricanNCCIdentification = Objects.requireNonNull(southAfricanNCCIdentification);
		return this;
	}

	public HongKongBankIdentifier getHongKongBankCode() {
		return hongKongBankCode;
	}

	public ClearingSystemMemberIdentification2Choice setHongKongBankCode(HongKongBankIdentifier hongKongBankCode) {
		this.hongKongBankCode = Objects.requireNonNull(hongKongBankCode);
		return this;
	}

	public ExtensiveBranchNetworkIdentifier getAustralianExtensiveBranchNetworkIdentification() {
		return australianExtensiveBranchNetworkIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setAustralianExtensiveBranchNetworkIdentification(ExtensiveBranchNetworkIdentifier australianExtensiveBranchNetworkIdentification) {
		this.australianExtensiveBranchNetworkIdentification = Objects.requireNonNull(australianExtensiveBranchNetworkIdentification);
		return this;
	}

	public SmallNetworkIdentifier getAustralianSmallNetworkIdentification() {
		return australianSmallNetworkIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setAustralianSmallNetworkIdentification(SmallNetworkIdentifier australianSmallNetworkIdentification) {
		this.australianSmallNetworkIdentification = Objects.requireNonNull(australianSmallNetworkIdentification);
		return this;
	}

	public IndianFinancialSystemCodeIdentifier getIndianFinancialSystemCode() {
		return indianFinancialSystemCode;
	}

	public ClearingSystemMemberIdentification2Choice setIndianFinancialSystemCode(IndianFinancialSystemCodeIdentifier indianFinancialSystemCode) {
		this.indianFinancialSystemCode = Objects.requireNonNull(indianFinancialSystemCode);
		return this;
	}

	public HellenicBankIdentificationCodeIdentifier getHellenicBankIdentificationCode() {
		return hellenicBankIdentificationCode;
	}

	public ClearingSystemMemberIdentification2Choice setHellenicBankIdentificationCode(HellenicBankIdentificationCodeIdentifier hellenicBankIdentificationCode) {
		this.hellenicBankIdentificationCode = Objects.requireNonNull(hellenicBankIdentificationCode);
		return this;
	}

	public PolishNationalClearingCodeIdentifier getPolishNationalClearingCode() {
		return polishNationalClearingCode;
	}

	public ClearingSystemMemberIdentification2Choice setPolishNationalClearingCode(PolishNationalClearingCodeIdentifier polishNationalClearingCode) {
		this.polishNationalClearingCode = Objects.requireNonNull(polishNationalClearingCode);
		return this;
	}

	public Max35Text getOtherClearingCodeIdentification() {
		return otherClearingCodeIdentification;
	}

	public ClearingSystemMemberIdentification2Choice setOtherClearingCodeIdentification(Max35Text otherClearingCodeIdentification) {
		this.otherClearingCodeIdentification = Objects.requireNonNull(otherClearingCodeIdentification);
		return this;
	}
}