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
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.Signature;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the signature requirements for managing an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SignatureCondition" src="doc-files/SignatureCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmRequiredSignatureNumber
 * SignatureCondition.mmRequiredSignatureNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
 * SignatureCondition.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmMandate
 * SignatureCondition.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrderIndicator
 * SignatureCondition.mmSignatureOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrder
 * SignatureCondition.mmSignatureOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignature
 * SignatureCondition.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Signature#mmConditions
 * Signature.mmConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
 * Mandate.mmSignatureConditions}</li>
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
 * "SignatureCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the signature requirements for managing an account."
 * </li>
 * </ul>
 */
public class SignatureCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number requiredSignatureNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatureNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SignatureCondition, Number> mmRequiredSignatureNumber = new MMBusinessAttribute<SignatureCondition, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequiredSignatureNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(SignatureCondition obj) {
			return obj.getRequiredSignatureNumber();
		}

		@Override
		public void setValue(SignatureCondition obj, Number value) {
			obj.setRequiredSignatureNumber(value);
		}
	};
	protected YesNoIndicator signatoryRightIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the signature of the account owner is required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SignatureCondition, YesNoIndicator> mmSignatoryRightIndicator = new MMBusinessAttribute<SignatureCondition, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SignatureCondition obj) {
			return obj.getSignatoryRightIndicator();
		}

		@Override
		public void setValue(SignatureCondition obj, YesNoIndicator value) {
			obj.setSignatoryRightIndicator(value);
		}
	};
	protected Mandate mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmSignatureConditions
	 * Mandate.mmSignatureConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate for which signature conditions are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SignatureCondition, Optional<Mandate>> mmMandate = new MMBusinessAssociationEnd<SignatureCondition, Optional<Mandate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which signature conditions are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Mandate.mmSignatureConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}

		@Override
		public Optional<Mandate> getValue(SignatureCondition obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(SignatureCondition obj, Optional<Mandate> value) {
			obj.setMandate(value.orElse(null));
		}
	};
	protected TrueFalseIndicator signatureOrderIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator whether a certain order of signatures has to be respected or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SignatureCondition, TrueFalseIndicator> mmSignatureOrderIndicator = new MMBusinessAttribute<SignatureCondition, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureOrderIndicator";
			definition = "Indicator whether a certain order of signatures has to be respected or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(SignatureCondition obj) {
			return obj.getSignatureOrderIndicator();
		}

		@Override
		public void setValue(SignatureCondition obj, TrueFalseIndicator value) {
			obj.setSignatureOrderIndicator(value);
		}
	};
	protected Max15PlusSignedNumericText signatureOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the order in which the mandate holders are allowed to sign."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SignatureCondition, Max15PlusSignedNumericText> mmSignatureOrder = new MMBusinessAttribute<SignatureCondition, Max15PlusSignedNumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureOrder";
			definition = "Indicates the order in which the mandate holders are allowed to sign.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}

		@Override
		public Max15PlusSignedNumericText getValue(SignatureCondition obj) {
			return obj.getSignatureOrder();
		}

		@Override
		public void setValue(SignatureCondition obj, Max15PlusSignedNumericText value) {
			obj.setSignatureOrder(value);
		}
	};
	protected List<Signature> signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Signature#mmConditions
	 * Signature.mmConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Signature Signature}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition
	 * SignatureCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manual or digital signature added as security provision by each party involved in the business covered by the document."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SignatureCondition, List<Signature>> mmSignature = new MMBusinessAssociationEnd<SignatureCondition, List<Signature>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SignatureCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Signature";
			definition = "Manual or digital signature added as security provision by each party involved in the business covered by the document.";
			minOccurs = 0;
			opposite_lazy = () -> Signature.mmConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Signature.mmObject();
		}

		@Override
		public List<Signature> getValue(SignatureCondition obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(SignatureCondition obj, List<Signature> value) {
			obj.setSignature(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureCondition";
				definition = "Specifies the signature requirements for managing an account.";
				associationDomain_lazy = () -> Arrays.asList(Signature.mmConditions, Mandate.mmSignatureConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SignatureCondition.mmRequiredSignatureNumber, com.tools20022.repository.entity.SignatureCondition.mmSignatoryRightIndicator,
						com.tools20022.repository.entity.SignatureCondition.mmMandate, com.tools20022.repository.entity.SignatureCondition.mmSignatureOrderIndicator, com.tools20022.repository.entity.SignatureCondition.mmSignatureOrder,
						com.tools20022.repository.entity.SignatureCondition.mmSignature);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SignatureCondition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getRequiredSignatureNumber() {
		return requiredSignatureNumber;
	}

	public SignatureCondition setRequiredSignatureNumber(Number requiredSignatureNumber) {
		this.requiredSignatureNumber = Objects.requireNonNull(requiredSignatureNumber);
		return this;
	}

	public YesNoIndicator getSignatoryRightIndicator() {
		return signatoryRightIndicator;
	}

	public SignatureCondition setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = Objects.requireNonNull(signatoryRightIndicator);
		return this;
	}

	public Optional<Mandate> getMandate() {
		return mandate == null ? Optional.empty() : Optional.of(mandate);
	}

	public SignatureCondition setMandate(Mandate mandate) {
		this.mandate = mandate;
		return this;
	}

	public TrueFalseIndicator getSignatureOrderIndicator() {
		return signatureOrderIndicator;
	}

	public SignatureCondition setSignatureOrderIndicator(TrueFalseIndicator signatureOrderIndicator) {
		this.signatureOrderIndicator = Objects.requireNonNull(signatureOrderIndicator);
		return this;
	}

	public Max15PlusSignedNumericText getSignatureOrder() {
		return signatureOrder;
	}

	public SignatureCondition setSignatureOrder(Max15PlusSignedNumericText signatureOrder) {
		this.signatureOrder = Objects.requireNonNull(signatureOrder);
		return this;
	}

	public List<Signature> getSignature() {
		return signature == null ? signature = new ArrayList<>() : signature;
	}

	public SignatureCondition setSignature(List<Signature> signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}