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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentIdentification1;
import com.tools20022.repository.msg.PartyIdentification26;
import com.tools20022.repository.msg.TransportDetails4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the transportation of goods that are part of a commercial
 * trade agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmDataSetIdentification
 * TransportDataSet5.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmBuyer
 * TransportDataSet5.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmSeller
 * TransportDataSet5.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmConsignor
 * TransportDataSet5.mmConsignor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmConsignee
 * TransportDataSet5.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5#mmShipTo
 * TransportDataSet5.mmShipTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmTransportInformation
 * TransportDataSet5.mmTransportInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmTransportDataSet
 * ForwardDataSetSubmissionReportV05.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmTransportDataSet
 * DataSetSubmissionV05.mmTransportDataSet}</li>
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
 * "TransportDataSet5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the transportation of goods that are part of a commercial trade agreement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportDataSet5", propOrder = {"dataSetIdentification", "buyer", "seller", "consignor", "consignee", "shipTo", "transportInformation"})
public class TransportDataSet5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted transport data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, DocumentIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<TransportDataSet5, DocumentIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the submitted transport data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1.mmObject();
		}

		@Override
		public DocumentIdentification1 getValue(TransportDataSet5 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(TransportDataSet5 obj, DocumentIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "Buyr")
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>> mmBuyer = new MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(TransportDataSet5 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(TransportDataSet5 obj, Optional<PartyIdentification26> value) {
			obj.setBuyer(value.orElse(null));
		}
	};
	@XmlElement(name = "Sellr")
	protected PartyIdentification26 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>> mmSeller = new MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(TransportDataSet5 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(TransportDataSet5 obj, Optional<PartyIdentification26> value) {
			obj.setSeller(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgnr", required = true)
	protected PartyIdentification26 consignor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party responsible for dispatching the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, PartyIdentification26> mmConsignor = new MMMessageAssociationEnd<TransportDataSet5, PartyIdentification26>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Consgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignor";
			definition = "Party responsible for dispatching the goods.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(TransportDataSet5 obj) {
			return obj.getConsignor();
		}

		@Override
		public void setValue(TransportDataSet5 obj, PartyIdentification26 value) {
			obj.setConsignor(value);
		}
	};
	@XmlElement(name = "Consgn")
	protected PartyIdentification26 consignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>> mmConsignee = new MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to whom the goods must be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(TransportDataSet5 obj) {
			return obj.getConsignee();
		}

		@Override
		public void setValue(TransportDataSet5 obj, Optional<PartyIdentification26> value) {
			obj.setConsignee(value.orElse(null));
		}
	};
	@XmlElement(name = "ShipTo")
	protected PartyIdentification26 shipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods must be delivered in the end."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>> mmShipTo = new MMMessageAssociationEnd<TransportDataSet5, Optional<PartyIdentification26>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods must be delivered in the end.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public Optional<PartyIdentification26> getValue(TransportDataSet5 obj) {
			return obj.getShipTo();
		}

		@Override
		public void setValue(TransportDataSet5 obj, Optional<PartyIdentification26> value) {
			obj.setShipTo(value.orElse(null));
		}
	};
	@XmlElement(name = "TrnsprtInf", required = true)
	protected TransportDetails4 transportInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the shipment date, the charges, the routing and the goods that are described in the transport document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDataSet5, TransportDetails4> mmTransportInformation = new MMMessageAssociationEnd<TransportDataSet5, TransportDetails4>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDataSet5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportInformation";
			definition = "Specifies the shipment date, the charges, the routing and the goods that are described in the transport document.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransportDetails4.mmObject();
		}

		@Override
		public TransportDetails4 getValue(TransportDataSet5 obj) {
			return obj.getTransportInformation();
		}

		@Override
		public void setValue(TransportDataSet5 obj, TransportDetails4 value) {
			obj.setTransportInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDataSet5.mmDataSetIdentification, com.tools20022.repository.msg.TransportDataSet5.mmBuyer,
						com.tools20022.repository.msg.TransportDataSet5.mmSeller, com.tools20022.repository.msg.TransportDataSet5.mmConsignor, com.tools20022.repository.msg.TransportDataSet5.mmConsignee,
						com.tools20022.repository.msg.TransportDataSet5.mmShipTo, com.tools20022.repository.msg.TransportDataSet5.mmTransportInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmTransportDataSet, DataSetSubmissionV05.mmTransportDataSet);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportDataSet5";
				definition = "Provides details on the transportation of goods that are part of a commercial trade agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public TransportDataSet5 setDataSetIdentification(DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public Optional<PartyIdentification26> getBuyer() {
		return buyer == null ? Optional.empty() : Optional.of(buyer);
	}

	public TransportDataSet5 setBuyer(PartyIdentification26 buyer) {
		this.buyer = buyer;
		return this;
	}

	public Optional<PartyIdentification26> getSeller() {
		return seller == null ? Optional.empty() : Optional.of(seller);
	}

	public TransportDataSet5 setSeller(PartyIdentification26 seller) {
		this.seller = seller;
		return this;
	}

	public PartyIdentification26 getConsignor() {
		return consignor;
	}

	public TransportDataSet5 setConsignor(PartyIdentification26 consignor) {
		this.consignor = Objects.requireNonNull(consignor);
		return this;
	}

	public Optional<PartyIdentification26> getConsignee() {
		return consignee == null ? Optional.empty() : Optional.of(consignee);
	}

	public TransportDataSet5 setConsignee(PartyIdentification26 consignee) {
		this.consignee = consignee;
		return this;
	}

	public Optional<PartyIdentification26> getShipTo() {
		return shipTo == null ? Optional.empty() : Optional.of(shipTo);
	}

	public TransportDataSet5 setShipTo(PartyIdentification26 shipTo) {
		this.shipTo = shipTo;
		return this;
	}

	public TransportDetails4 getTransportInformation() {
		return transportInformation;
	}

	public TransportDataSet5 setTransportInformation(TransportDetails4 transportInformation) {
		this.transportInformation = Objects.requireNonNull(transportInformation);
		return this;
	}
}