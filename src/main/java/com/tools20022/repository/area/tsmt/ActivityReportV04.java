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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.ActivityReportItems3;
import com.tools20022.repository.msg.MessageIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ActivityReport message is sent by the matching application to the
 * requester of an activity report.<br>
 * This message is used to report on all transactions for which an activity has
 * taken place within a given time span.<br>
 * <b>Usage</b><br>
 * The ActivityReport message can be sent<br>
 * - at a pre-determined time every 24 hours. The message reports on all
 * transactions that the requester is involved in and for which an activity has
 * taken place within the last 24 hours.<br>
 * - on demand in response to an ActivityReportRequest message. The message
 * reports on all transactions that the requester is involved in and for which
 * an activity has taken place within a time span specified by the requester in
 * the ActivityReportRequest message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmReportIdentification
 * ActivityReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmRelatedMessageReference
 * ActivityReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmReport
 * ActivityReportV04.mmReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ActvtyRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.002.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActivityReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ActivityReport message is sent by the matching application to the requester of an activity report.\r\nThis message is used to report on all transactions for which an activity has taken place within a given time span.\r\nUsage\r\nThe ActivityReport message can be sent\r\n- at a pre-determined time every 24 hours. The message reports on all transactions that the requester is involved in and for which an activity has taken place within the last 24 hours.\r\n- on demand in response to an ActivityReportRequest message. The message reports on all transactions that the requester is involved in and for which an activity has taken place within a time span specified by the requester in the ActivityReportRequest message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActivityReportV04", propOrder = {"reportIdentification", "relatedMessageReference", "report"})
public class ActivityReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId", required = true)
	protected MessageIdentification1 reportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ActivityReportV04, MessageIdentification1> mmReportIdentification = new MMMessageBuildingBlock<ActivityReportV04, MessageIdentification1>() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ActivityReportV04 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(ActivityReportV04 obj, MessageIdentification1 value) {
			obj.setReportIdentification(value);
		}
	};
	@XmlElement(name = "RltdMsgRef")
	protected MessageIdentification1 relatedMessageReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the previous message requesting the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ActivityReportV04, Optional<MessageIdentification1>> mmRelatedMessageReference = new MMMessageBuildingBlock<ActivityReportV04, Optional<MessageIdentification1>>() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to the previous message requesting the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(ActivityReportV04 obj) {
			return obj.getRelatedMessageReference();
		}

		@Override
		public void setValue(ActivityReportV04 obj, Optional<MessageIdentification1> value) {
			obj.setRelatedMessageReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Rpt")
	protected List<ActivityReportItems3> report;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ActivityReportItems3
	 * ActivityReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the events that occurred for one transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ActivityReportV04, List<ActivityReportItems3>> mmReport = new MMMessageBuildingBlock<ActivityReportV04, List<ActivityReportItems3>>() {
		{
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Describes the events that occurred for one transaction.";
			minOccurs = 0;
			complexType_lazy = () -> ActivityReportItems3.mmObject();
		}

		@Override
		public List<ActivityReportItems3> getValue(ActivityReportV04 obj) {
			return obj.getReport();
		}

		@Override
		public void setValue(ActivityReportV04 obj, List<ActivityReportItems3> value) {
			obj.setReport(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActivityReportV04";
				definition = "Scope\r\nThe ActivityReport message is sent by the matching application to the requester of an activity report.\r\nThis message is used to report on all transactions for which an activity has taken place within a given time span.\r\nUsage\r\nThe ActivityReport message can be sent\r\n- at a pre-determined time every 24 hours. The message reports on all transactions that the requester is involved in and for which an activity has taken place within the last 24 hours.\r\n- on demand in response to an ActivityReportRequest message. The message reports on all transactions that the requester is involved in and for which an activity has taken place within a time span specified by the requester in the ActivityReportRequest message.";
				rootElement = "Document";
				xmlTag = "ActvtyRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ActivityReportV04.mmReportIdentification, com.tools20022.repository.area.tsmt.ActivityReportV04.mmRelatedMessageReference,
						com.tools20022.repository.area.tsmt.ActivityReportV04.mmReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "002";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ActivityReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public ActivityReportV04 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public Optional<MessageIdentification1> getRelatedMessageReference() {
		return relatedMessageReference == null ? Optional.empty() : Optional.of(relatedMessageReference);
	}

	public ActivityReportV04 setRelatedMessageReference(MessageIdentification1 relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
		return this;
	}

	public List<ActivityReportItems3> getReport() {
		return report == null ? report = new ArrayList<>() : report;
	}

	public ActivityReportV04 setReport(List<ActivityReportItems3> report) {
		this.report = Objects.requireNonNull(report);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.002.001.04")
	static public class Document {
		@XmlElement(name = "ActvtyRpt", required = true)
		public ActivityReportV04 messageBody;
	}
}