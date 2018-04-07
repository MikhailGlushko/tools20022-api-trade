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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ProductCharacteristics;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification4;
import com.tools20022.repository.msg.ProductCharacteristics1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies that the category of a product may be indicated by a code or by
 * free text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice#mmStructuredProductCharacteristics
 * ProductCharacteristics1Choice.mmStructuredProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice#mmOtherProductCharacteristics
 * ProductCharacteristics1Choice.mmOtherProductCharacteristics}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductCharacteristics
 * ProductCharacteristics}</li>
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
 * "ProductCharacteristics1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies that the category of a product may be indicated by a code or by free text."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProductCharacteristics1Choice", propOrder = {"structuredProductCharacteristics", "otherProductCharacteristics"})
public class ProductCharacteristics1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StrdPdctChrtcs", required = true)
	protected ProductCharacteristics1 structuredProductCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics1
	 * ProductCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice
	 * ProductCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrdPdctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of product characteristic."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductCharacteristics1Choice, ProductCharacteristics1> mmStructuredProductCharacteristics = new MMMessageAssociationEnd<ProductCharacteristics1Choice, ProductCharacteristics1>() {
		{
			businessComponentTrace_lazy = () -> ProductCharacteristics.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "StrdPdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredProductCharacteristics";
			definition = "Specifies the type of product characteristic.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProductCharacteristics1.mmObject();
		}

		@Override
		public ProductCharacteristics1 getValue(ProductCharacteristics1Choice obj) {
			return obj.getStructuredProductCharacteristics();
		}

		@Override
		public void setValue(ProductCharacteristics1Choice obj, ProductCharacteristics1 value) {
			obj.setStructuredProductCharacteristics(value);
		}
	};
	@XmlElement(name = "OthrPdctChrtcs", required = true)
	protected GenericIdentification4 otherProductCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice
	 * ProductCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPdctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product characteristic not present in the code list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductCharacteristics1Choice, GenericIdentification4> mmOtherProductCharacteristics = new MMMessageAssociationEnd<ProductCharacteristics1Choice, GenericIdentification4>() {
		{
			businessComponentTrace_lazy = () -> ProductCharacteristics.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProductCharacteristics";
			definition = "Specifies the type of product characteristic not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public GenericIdentification4 getValue(ProductCharacteristics1Choice obj) {
			return obj.getOtherProductCharacteristics();
		}

		@Override
		public void setValue(ProductCharacteristics1Choice obj, GenericIdentification4 value) {
			obj.setOtherProductCharacteristics(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProductCharacteristics1Choice.mmStructuredProductCharacteristics,
						com.tools20022.repository.choice.ProductCharacteristics1Choice.mmOtherProductCharacteristics);
				trace_lazy = () -> ProductCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristics1Choice";
				definition = "Specifies that the category of a product may be indicated by a code or by free text.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProductCharacteristics1 getStructuredProductCharacteristics() {
		return structuredProductCharacteristics;
	}

	public ProductCharacteristics1Choice setStructuredProductCharacteristics(ProductCharacteristics1 structuredProductCharacteristics) {
		this.structuredProductCharacteristics = Objects.requireNonNull(structuredProductCharacteristics);
		return this;
	}

	public GenericIdentification4 getOtherProductCharacteristics() {
		return otherProductCharacteristics;
	}

	public ProductCharacteristics1Choice setOtherProductCharacteristics(GenericIdentification4 otherProductCharacteristics) {
		this.otherProductCharacteristics = Objects.requireNonNull(otherProductCharacteristics);
		return this;
	}
}