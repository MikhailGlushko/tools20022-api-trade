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
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.UndertakingDocument;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Document presented for examination.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1#mmCompleteIndicator
 * DemandDocumentation1.mmCompleteIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1#mmCompletionInformation
 * DemandDocumentation1.mmCompletionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1#mmEnclosedFile
 * DemandDocumentation1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1#mmDemandNarrative
 * DemandDocumentation1.mmDemandNarrative}</li>
 * </ul>
 * </li>
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
 * "DemandDocumentation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Document presented for examination."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DemandDocumentation1", propOrder = {"completeIndicator", "completionInformation", "enclosedFile", "demandNarrative"})
public class DemandDocumentation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator completeIndicator;
	/**
	 * Indication as to whether the presentation is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1
	 * DemandDocumentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication as to whether the presentation is complete."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompleteIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DemandDocumentation1.mmObject();
			isDerived = false;
			xmlTag = "CmpltInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteIndicator";
			definition = "Indication as to whether the presentation is complete.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max2000Text completionInformation;
	/**
	 * Information related to an incomplete presentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1
	 * DemandDocumentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to an incomplete presentation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompletionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DemandDocumentation1.mmObject();
			isDerived = false;
			xmlTag = "CmpltnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionInformation";
			definition = "Information related to an incomplete presentation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Document9> enclosedFile;
	/**
	 * Document or template enclosed in the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document9 Document9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1
	 * DemandDocumentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document or template enclosed in the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnclosedFile = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UndertakingDocument.mmObject();
			componentContext_lazy = () -> DemandDocumentation1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the demand.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document9.mmObject();
		}
	};
	protected Max20000Text demandNarrative;
	/**
	 * Narrative text constituting the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DemandDocumentation1
	 * DemandDocumentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Narrative text constituting the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDemandNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DemandDocumentation1.mmObject();
			isDerived = false;
			xmlTag = "DmndNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandNarrative";
			definition = "Narrative text constituting the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DemandDocumentation1.mmCompleteIndicator, DemandDocumentation1.mmCompletionInformation, DemandDocumentation1.mmEnclosedFile, DemandDocumentation1.mmDemandNarrative);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DemandDocumentation1";
				definition = "Document presented for examination.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CmpltInd", required = true)
	public YesNoIndicator getCompleteIndicator() {
		return completeIndicator;
	}

	public void setCompleteIndicator(YesNoIndicator completeIndicator) {
		this.completeIndicator = completeIndicator;
	}

	@XmlElement(name = "CmpltnInf")
	public Max2000Text getCompletionInformation() {
		return completionInformation;
	}

	public void setCompletionInformation(Max2000Text completionInformation) {
		this.completionInformation = completionInformation;
	}

	@XmlElement(name = "NclsdFile")
	public List<Document9> getEnclosedFile() {
		return enclosedFile;
	}

	public void setEnclosedFile(List<com.tools20022.repository.msg.Document9> enclosedFile) {
		this.enclosedFile = enclosedFile;
	}

	@XmlElement(name = "DmndNrrtv")
	public Max20000Text getDemandNarrative() {
		return demandNarrative;
	}

	public void setDemandNarrative(Max20000Text demandNarrative) {
		this.demandNarrative = demandNarrative;
	}
}