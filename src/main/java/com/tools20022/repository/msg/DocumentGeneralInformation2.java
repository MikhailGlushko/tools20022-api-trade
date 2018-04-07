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
import com.tools20022.repository.codeset.ExternalDocumentType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BinaryFile1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentType
 * DocumentGeneralInformation2.mmDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentNumber
 * DocumentGeneralInformation2.mmDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmSenderReceiverSequenceIdentification
 * DocumentGeneralInformation2.mmSenderReceiverSequenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmIssueDate
 * DocumentGeneralInformation2.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmURL
 * DocumentGeneralInformation2.mmURL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmAttachedBinaryFile
 * DocumentGeneralInformation2.mmAttachedBinaryFile}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "DocumentGeneralInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentGeneralInformation2", propOrder = {"documentType", "documentNumber", "senderReceiverSequenceIdentification", "issueDate", "uRL", "attachedBinaryFile"})
public class DocumentGeneralInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DocTp", required = true)
	protected ExternalDocumentType1Code documentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentGeneralInformation2, ExternalDocumentType1Code> mmDocumentType = new MMMessageAttribute<DocumentGeneralInformation2, ExternalDocumentType1Code>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public ExternalDocumentType1Code getValue(DocumentGeneralInformation2 obj) {
			return obj.getDocumentType();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, ExternalDocumentType1Code value) {
			obj.setDocumentType(value);
		}
	};
	@XmlElement(name = "DocNb", required = true)
	protected Max35Text documentNumber;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentGeneralInformation2, Max35Text> mmDocumentNumber = new MMMessageAttribute<DocumentGeneralInformation2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "DocNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Unique identifier of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DocumentGeneralInformation2 obj) {
			return obj.getDocumentNumber();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, Max35Text value) {
			obj.setDocumentNumber(value);
		}
	};
	@XmlElement(name = "SndrRcvrSeqId")
	protected Max140Text senderReceiverSequenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrRcvrSeqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverSequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification sequence number for a specific couple sender/receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentGeneralInformation2, Optional<Max140Text>> mmSenderReceiverSequenceIdentification = new MMMessageAttribute<DocumentGeneralInformation2, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "SndrRcvrSeqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverSequenceIdentification";
			definition = "Specifies the identification sequence number for a specific couple sender/receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(DocumentGeneralInformation2 obj) {
			return obj.getSenderReceiverSequenceIdentification();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, Optional<Max140Text> value) {
			obj.setSenderReceiverSequenceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentGeneralInformation2, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<DocumentGeneralInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DocumentGeneralInformation2 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, Optional<ISODate> value) {
			obj.setIssueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "URL")
	protected Max256Text uRL;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "URL (Uniform Resource Locator) where the document can be found."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DocumentGeneralInformation2, Optional<Max256Text>> mmURL = new MMMessageAttribute<DocumentGeneralInformation2, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "URL";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URL";
			definition = "URL (Uniform Resource Locator) where the document can be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(DocumentGeneralInformation2 obj) {
			return obj.getURL();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, Optional<Max256Text> value) {
			obj.setURL(value.orElse(null));
		}
	};
	@XmlElement(name = "AttchdBinryFile")
	protected List<BinaryFile1> attachedBinaryFile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BinaryFile1
	 * BinaryFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdBinryFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedBinaryFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attached binary file for this document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentGeneralInformation2, List<BinaryFile1>> mmAttachedBinaryFile = new MMMessageAssociationEnd<DocumentGeneralInformation2, List<BinaryFile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation2.mmObject();
			isDerived = false;
			xmlTag = "AttchdBinryFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedBinaryFile";
			definition = "Attached binary file for this document.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BinaryFile1.mmObject();
		}

		@Override
		public List<BinaryFile1> getValue(DocumentGeneralInformation2 obj) {
			return obj.getAttachedBinaryFile();
		}

		@Override
		public void setValue(DocumentGeneralInformation2 obj, List<BinaryFile1> value) {
			obj.setAttachedBinaryFile(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentGeneralInformation2.mmDocumentType, com.tools20022.repository.msg.DocumentGeneralInformation2.mmDocumentNumber,
						com.tools20022.repository.msg.DocumentGeneralInformation2.mmSenderReceiverSequenceIdentification, com.tools20022.repository.msg.DocumentGeneralInformation2.mmIssueDate,
						com.tools20022.repository.msg.DocumentGeneralInformation2.mmURL, com.tools20022.repository.msg.DocumentGeneralInformation2.mmAttachedBinaryFile);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentGeneralInformation2";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalDocumentType1Code getDocumentType() {
		return documentType;
	}

	public DocumentGeneralInformation2 setDocumentType(ExternalDocumentType1Code documentType) {
		this.documentType = Objects.requireNonNull(documentType);
		return this;
	}

	public Max35Text getDocumentNumber() {
		return documentNumber;
	}

	public DocumentGeneralInformation2 setDocumentNumber(Max35Text documentNumber) {
		this.documentNumber = Objects.requireNonNull(documentNumber);
		return this;
	}

	public Optional<Max140Text> getSenderReceiverSequenceIdentification() {
		return senderReceiverSequenceIdentification == null ? Optional.empty() : Optional.of(senderReceiverSequenceIdentification);
	}

	public DocumentGeneralInformation2 setSenderReceiverSequenceIdentification(Max140Text senderReceiverSequenceIdentification) {
		this.senderReceiverSequenceIdentification = senderReceiverSequenceIdentification;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public DocumentGeneralInformation2 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<Max256Text> getURL() {
		return uRL == null ? Optional.empty() : Optional.of(uRL);
	}

	public DocumentGeneralInformation2 setURL(Max256Text uRL) {
		this.uRL = uRL;
		return this;
	}

	public List<BinaryFile1> getAttachedBinaryFile() {
		return attachedBinaryFile == null ? attachedBinaryFile = new ArrayList<>() : attachedBinaryFile;
	}

	public DocumentGeneralInformation2 setAttachedBinaryFile(List<BinaryFile1> attachedBinaryFile) {
		this.attachedBinaryFile = Objects.requireNonNull(attachedBinaryFile);
		return this;
	}
}