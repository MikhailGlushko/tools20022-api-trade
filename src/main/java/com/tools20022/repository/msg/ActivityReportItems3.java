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
import com.tools20022.repository.area.tsmt.ActivityReportV04;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ActivityDetails1;
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.DocumentIdentification5;
import com.tools20022.repository.msg.PendingActivity2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the events that occurred for one transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3#mmTransactionIdentification
 * ActivityReportItems3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3#mmUserTransactionReference
 * ActivityReportItems3.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3#mmReportedEntity
 * ActivityReportItems3.mmReportedEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3#mmReportedItem
 * ActivityReportItems3.mmReportedItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3#mmPendingRequestForAction
 * ActivityReportItems3.mmPendingRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmReport
 * ActivityReportV04.mmReport}</li>
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
 * "ActivityReportItems3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes the events that occurred for one transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActivityReportItems3", propOrder = {"transactionIdentification", "userTransactionReference", "reportedEntity", "reportedItem", "pendingRequestForAction"})
public class ActivityReportItems3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActivityReportItems3, Max35Text> mmTransactionIdentification = new MMMessageAttribute<ActivityReportItems3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActivityReportItems3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ActivityReportItems3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ActivityReportItems3 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "UsrTxRef")
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for each financial institution which is a party to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActivityReportItems3, List<DocumentIdentification5>> mmUserTransactionReference = new MMMessageAssociationEnd<ActivityReportItems3, List<DocumentIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActivityReportItems3.mmObject();
			isDerived = false;
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentIdentification5.mmObject();
		}

		@Override
		public List<DocumentIdentification5> getValue(ActivityReportItems3 obj) {
			return obj.getUserTransactionReference();
		}

		@Override
		public void setValue(ActivityReportItems3 obj, List<DocumentIdentification5> value) {
			obj.setUserTransactionReference(value);
		}
	};
	@XmlElement(name = "RptdNtty", required = true)
	protected List<BICIdentification1> reportedEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity for which the activity is reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActivityReportItems3, List<BICIdentification1>> mmReportedEntity = new MMMessageAssociationEnd<ActivityReportItems3, List<BICIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActivityReportItems3.mmObject();
			isDerived = false;
			xmlTag = "RptdNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedEntity";
			definition = "Entity for which the activity is reported.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(ActivityReportItems3 obj) {
			return obj.getReportedEntity();
		}

		@Override
		public void setValue(ActivityReportItems3 obj, List<BICIdentification1> value) {
			obj.setReportedEntity(value);
		}
	};
	@XmlElement(name = "RptdItm", required = true)
	protected List<ActivityDetails1> reportedItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ActivityDetails1
	 * ActivityDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes an activity that took place during a period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActivityReportItems3, List<ActivityDetails1>> mmReportedItem = new MMMessageAssociationEnd<ActivityReportItems3, List<ActivityDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActivityReportItems3.mmObject();
			isDerived = false;
			xmlTag = "RptdItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedItem";
			definition = "Describes an activity that took place during a period.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ActivityDetails1.mmObject();
		}

		@Override
		public List<ActivityDetails1> getValue(ActivityReportItems3 obj) {
			return obj.getReportedItem();
		}

		@Override
		public void setValue(ActivityReportItems3 obj, List<ActivityDetails1> value) {
			obj.setReportedItem(value);
		}
	};
	@XmlElement(name = "PdgReqForActn")
	protected List<PendingActivity2> pendingRequestForAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgReqForActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingRequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Next processing step required."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActivityReportItems3, List<PendingActivity2>> mmPendingRequestForAction = new MMMessageAssociationEnd<ActivityReportItems3, List<PendingActivity2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActivityReportItems3.mmObject();
			isDerived = false;
			xmlTag = "PdgReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingRequestForAction";
			definition = "Next processing step required.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingActivity2.mmObject();
		}

		@Override
		public List<PendingActivity2> getValue(ActivityReportItems3 obj) {
			return obj.getPendingRequestForAction();
		}

		@Override
		public void setValue(ActivityReportItems3 obj, List<PendingActivity2> value) {
			obj.setPendingRequestForAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActivityReportItems3.mmTransactionIdentification, com.tools20022.repository.msg.ActivityReportItems3.mmUserTransactionReference,
						com.tools20022.repository.msg.ActivityReportItems3.mmReportedEntity, com.tools20022.repository.msg.ActivityReportItems3.mmReportedItem, com.tools20022.repository.msg.ActivityReportItems3.mmPendingRequestForAction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ActivityReportV04.mmReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActivityReportItems3";
				definition = "Describes the events that occurred for one transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public ActivityReportItems3 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public ActivityReportItems3 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public List<BICIdentification1> getReportedEntity() {
		return reportedEntity == null ? reportedEntity = new ArrayList<>() : reportedEntity;
	}

	public ActivityReportItems3 setReportedEntity(List<BICIdentification1> reportedEntity) {
		this.reportedEntity = Objects.requireNonNull(reportedEntity);
		return this;
	}

	public List<ActivityDetails1> getReportedItem() {
		return reportedItem == null ? reportedItem = new ArrayList<>() : reportedItem;
	}

	public ActivityReportItems3 setReportedItem(List<ActivityDetails1> reportedItem) {
		this.reportedItem = Objects.requireNonNull(reportedItem);
		return this;
	}

	public List<PendingActivity2> getPendingRequestForAction() {
		return pendingRequestForAction == null ? pendingRequestForAction = new ArrayList<>() : pendingRequestForAction;
	}

	public ActivityReportItems3 setPendingRequestForAction(List<PendingActivity2> pendingRequestForAction) {
		this.pendingRequestForAction = Objects.requireNonNull(pendingRequestForAction);
		return this;
	}
}