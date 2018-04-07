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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a fixed date and a recurring date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FixedOrRecurrentDate1Choice#mmFixedDate
 * FixedOrRecurrentDate1Choice.mmFixedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FixedOrRecurrentDate1Choice#mmRecurrentDate
 * FixedOrRecurrentDate1Choice.mmRecurrentDate}</li>
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
 * "FixedOrRecurrentDate1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a fixed date and a recurring date."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FixedOrRecurrentDate1Choice", propOrder = {"fixedDate", "recurrentDate"})
public class FixedOrRecurrentDate1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FxdDt", required = true)
	protected ISODate fixedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FixedOrRecurrentDate1Choice
	 * FixedOrRecurrentDate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the variation is triggered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FixedOrRecurrentDate1Choice, ISODate> mmFixedDate = new MMMessageAttribute<FixedOrRecurrentDate1Choice, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FixedOrRecurrentDate1Choice.mmObject();
			isDerived = false;
			xmlTag = "FxdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedDate";
			definition = "Date on which the variation is triggered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(FixedOrRecurrentDate1Choice obj) {
			return obj.getFixedDate();
		}

		@Override
		public void setValue(FixedOrRecurrentDate1Choice obj, ISODate value) {
			obj.setFixedDate(value);
		}
	};
	@XmlElement(name = "RcrntDt", required = true)
	protected DateInformation1 recurrentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateInformation1
	 * DateInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FixedOrRecurrentDate1Choice
	 * FixedOrRecurrentDate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurrentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to recurrent dates on which the variation is triggered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FixedOrRecurrentDate1Choice, DateInformation1> mmRecurrentDate = new MMMessageAssociationEnd<FixedOrRecurrentDate1Choice, DateInformation1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FixedOrRecurrentDate1Choice.mmObject();
			isDerived = false;
			xmlTag = "RcrntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurrentDate";
			definition = "Details related to recurrent dates on which the variation is triggered.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateInformation1.mmObject();
		}

		@Override
		public DateInformation1 getValue(FixedOrRecurrentDate1Choice obj) {
			return obj.getRecurrentDate();
		}

		@Override
		public void setValue(FixedOrRecurrentDate1Choice obj, DateInformation1 value) {
			obj.setRecurrentDate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FixedOrRecurrentDate1Choice.mmFixedDate, com.tools20022.repository.choice.FixedOrRecurrentDate1Choice.mmRecurrentDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FixedOrRecurrentDate1Choice";
				definition = "Choice between a fixed date and a recurring date.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getFixedDate() {
		return fixedDate;
	}

	public FixedOrRecurrentDate1Choice setFixedDate(ISODate fixedDate) {
		this.fixedDate = Objects.requireNonNull(fixedDate);
		return this;
	}

	public DateInformation1 getRecurrentDate() {
		return recurrentDate;
	}

	public FixedOrRecurrentDate1Choice setRecurrentDate(DateInformation1 recurrentDate) {
		this.recurrentDate = Objects.requireNonNull(recurrentDate);
		return this;
	}
}