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
import com.tools20022.repository.codeset.AdjustmentType2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of adjustment applied to the amount of goods/services by
 * means of a code or free text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#mmType
 * AdjustmentType1Choice.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#mmOtherAdjustmentType
 * AdjustmentType1Choice.mmOtherAdjustmentType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
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
 * "AdjustmentType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code or free text."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdjustmentType1Choice", propOrder = {"type", "otherAdjustmentType"})
public class AdjustmentType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected AdjustmentType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentType2Code
	 * AdjustmentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice
	 * AdjustmentType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdjustmentType1Choice, AdjustmentType2Code> mmType = new MMMessageAttribute<AdjustmentType1Choice, AdjustmentType2Code>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.choice.AdjustmentType1Choice.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentType2Code.mmObject();
		}

		@Override
		public AdjustmentType2Code getValue(AdjustmentType1Choice obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AdjustmentType1Choice obj, AdjustmentType2Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "OthrAdjstmntTp", required = true)
	protected Max35Text otherAdjustmentType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice
	 * AdjustmentType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAdjstmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAdjustmentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a type of adjustment not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdjustmentType1Choice, Max35Text> mmOtherAdjustmentType = new MMMessageAttribute<AdjustmentType1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.choice.AdjustmentType1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrAdjstmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAdjustmentType";
			definition = "Specifies a type of adjustment not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AdjustmentType1Choice obj) {
			return obj.getOtherAdjustmentType();
		}

		@Override
		public void setValue(AdjustmentType1Choice obj, Max35Text value) {
			obj.setOtherAdjustmentType(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdjustmentType1Choice.mmType, com.tools20022.repository.choice.AdjustmentType1Choice.mmOtherAdjustmentType);
				trace_lazy = () -> Adjustment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdjustmentType1Choice";
				definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code or free text.";
			}
		});
		return mmObject_lazy.get();
	}

	public AdjustmentType2Code getType() {
		return type;
	}

	public AdjustmentType1Choice setType(AdjustmentType2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getOtherAdjustmentType() {
		return otherAdjustmentType;
	}

	public AdjustmentType1Choice setOtherAdjustmentType(Max35Text otherAdjustmentType) {
		this.otherAdjustmentType = Objects.requireNonNull(otherAdjustmentType);
		return this;
	}
}