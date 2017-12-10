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
import com.tools20022.repository.choice.CategoryPurpose1Choice;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.choice.ServiceLevel8Choice;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide further details of the type of payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmInstructionPriority
 * PaymentTypeInformation19.mmInstructionPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmServiceLevel
 * PaymentTypeInformation19.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmLocalInstrument
 * PaymentTypeInformation19.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19#mmCategoryPurpose
 * PaymentTypeInformation19.mmCategoryPurpose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
 * PaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTypeInformation19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide further details of the type of payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTypeInformation19", propOrder = {"instructionPriority", "serviceLevel", "localInstrument", "categoryPurpose"})
public class PaymentTypeInformation19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Priority2Code instructionPriority;
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> PaymentTypeInformation19.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}
	};
	protected ServiceLevel8Choice serviceLevel;
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
	 * ServiceLevel8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceLevel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmServiceLevel;
			componentContext_lazy = () -> PaymentTypeInformation19.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ServiceLevel8Choice.mmObject();
		}
	};
	protected LocalInstrument2Choice localInstrument;
	/**
	 * User community specific instrument.
	 * 
	 * Usage: This element is used to specify a local instrument, local clearing
	 * option and/or further qualify the service or service level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument2Choice
	 * LocalInstrument2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
	 * PaymentProcessing.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\n\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmLocalInstrument;
			componentContext_lazy = () -> PaymentTypeInformation19.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\n\nUsage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument2Choice.mmObject();
		}
	};
	protected CategoryPurpose1Choice categoryPurpose;
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories. Usage: This is used by the initiating party to
	 * provide information concerning the processing of the payment. It is
	 * likely to trigger special processing by any of the agents involved in the
	 * payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
	 * CategoryPurpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
	 * PaymentProcessing.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCategoryPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmCategoryPurpose;
			componentContext_lazy = () -> PaymentTypeInformation19.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CategoryPurpose1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTypeInformation19.mmInstructionPriority, PaymentTypeInformation19.mmServiceLevel, PaymentTypeInformation19.mmLocalInstrument, PaymentTypeInformation19.mmCategoryPurpose);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeInformation19";
				definition = "Set of elements used to provide further details of the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrPrty")
	public Priority2Code getInstructionPriority() {
		return instructionPriority;
	}

	public void setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
	}

	@XmlElement(name = "SvcLvl")
	public ServiceLevel8Choice getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(ServiceLevel8Choice serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	@XmlElement(name = "LclInstrm")
	public LocalInstrument2Choice getLocalInstrument() {
		return localInstrument;
	}

	public void setLocalInstrument(LocalInstrument2Choice localInstrument) {
		this.localInstrument = localInstrument;
	}

	@XmlElement(name = "CtgyPurp")
	public CategoryPurpose1Choice getCategoryPurpose() {
		return categoryPurpose;
	}

	public void setCategoryPurpose(CategoryPurpose1Choice categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
	}
}