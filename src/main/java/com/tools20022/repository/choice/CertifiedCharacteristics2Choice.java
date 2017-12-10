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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Goods;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quantity9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the goods that are certified, in the context of a
 * commercial trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmOrigin
 * CertifiedCharacteristics2Choice.mmOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuality
 * CertifiedCharacteristics2Choice.mmQuality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmAnalysis
 * CertifiedCharacteristics2Choice.mmAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmWeight
 * CertifiedCharacteristics2Choice.mmWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuantity
 * CertifiedCharacteristics2Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmHealthIndication
 * CertifiedCharacteristics2Choice.mmHealthIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmPhytosanitaryIndication
 * CertifiedCharacteristics2Choice.mmPhytosanitaryIndication}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "CertifiedCharacteristics2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of the goods that are certified, in the context of a commercial trade transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CertifiedCharacteristics2Choice", propOrder = {"origin", "quality", "analysis", "weight", "quantity", "healthIndication", "phytosanitaryIndication"})
public class CertifiedCharacteristics2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode origin;
	/**
	 * Country of origin of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of origin of the goods, as proven by the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrigin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmOrigin;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Orgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Origin";
			definition = "Country of origin of the goods, as proven by the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max70Text quality;
	/**
	 * Quality of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuality
	 * Product.mmQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the goods, as proven by the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuality = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuality;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quality";
			definition = "Quality of the goods, as proven by the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text analysis;
	/**
	 * Analysis of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmAnalysis
	 * Goods.mmAnalysis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Anlys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analysis of the goods, as proven by the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnalysis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Goods.mmAnalysis;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Anlys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Analysis";
			definition = "Analysis of the goods, as proven by the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Quantity9 weight;
	/**
	 * Weight of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity9
	 * Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weight of the goods, as proven by the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Wght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weight";
			definition = "Weight of the goods, as proven by the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity9.mmObject();
		}
	};
	protected Quantity9 quantity;
	/**
	 * Quantity of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity9
	 * Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the goods, as proven by the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of the goods, as proven by the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity9.mmObject();
		}
	};
	protected YesNoIndicator healthIndication;
	/**
	 * Indicates if the goods have passed the health check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmHealthCheck
	 * Goods.mmHealthCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HlthIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HealthIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the goods have passed the health check."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHealthIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Goods.mmHealthCheck;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "HlthIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HealthIndication";
			definition = "Indicates if the goods have passed the health check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator phytosanitaryIndication;
	/**
	 * Indicates if the goods have passed the phytosanitary check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmPhytosanitaryInspection
	 * Goods.mmPhytosanitaryInspection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhytosntryIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhytosanitaryIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the goods have passed the phytosanitary check."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhytosanitaryIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Goods.mmPhytosanitaryInspection;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "PhytosntryIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhytosanitaryIndication";
			definition = "Indicates if the goods have passed the phytosanitary check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmOrigin, CertifiedCharacteristics2Choice.mmQuality, CertifiedCharacteristics2Choice.mmAnalysis, CertifiedCharacteristics2Choice.mmWeight,
						CertifiedCharacteristics2Choice.mmQuantity, CertifiedCharacteristics2Choice.mmHealthIndication, CertifiedCharacteristics2Choice.mmPhytosanitaryIndication);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertifiedCharacteristics2Choice";
				definition = "Characteristics of the goods that are certified, in the context of a commercial trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Orgn", required = true)
	public CountryCode getOrigin() {
		return origin;
	}

	public void setOrigin(CountryCode origin) {
		this.origin = origin;
	}

	@XmlElement(name = "Qlty", required = true)
	public Max70Text getQuality() {
		return quality;
	}

	public void setQuality(Max70Text quality) {
		this.quality = quality;
	}

	@XmlElement(name = "Anlys", required = true)
	public Max70Text getAnalysis() {
		return analysis;
	}

	public void setAnalysis(Max70Text analysis) {
		this.analysis = analysis;
	}

	@XmlElement(name = "Wght", required = true)
	public Quantity9 getWeight() {
		return weight;
	}

	public void setWeight(Quantity9 weight) {
		this.weight = weight;
	}

	@XmlElement(name = "Qty", required = true)
	public Quantity9 getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity9 quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "HlthIndctn", required = true)
	public YesNoIndicator getHealthIndication() {
		return healthIndication;
	}

	public void setHealthIndication(YesNoIndicator healthIndication) {
		this.healthIndication = healthIndication;
	}

	@XmlElement(name = "PhytosntryIndctn", required = true)
	public YesNoIndicator getPhytosanitaryIndication() {
		return phytosanitaryIndication;
	}

	public void setPhytosanitaryIndication(YesNoIndicator phytosanitaryIndication) {
		this.phytosanitaryIndication = phytosanitaryIndication;
	}
}