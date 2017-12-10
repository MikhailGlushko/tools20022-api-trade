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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnitOfMeasure4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the unit of measure by means of a code. The code is taken from
 * UN/ECE Recommendation 20.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Kilogram
 * UnitOfMeasure4Code.mmKilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Each
 * UnitOfMeasure4Code.mmEach}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#GBTon
 * UnitOfMeasure4Code.mmGBTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Metre
 * UnitOfMeasure4Code.mmMetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Inch
 * UnitOfMeasure4Code.mmInch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Yard
 * UnitOfMeasure4Code.mmYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#GBGallon
 * UnitOfMeasure4Code.mmGBGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Gram
 * UnitOfMeasure4Code.mmGram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Centimetre
 * UnitOfMeasure4Code.mmCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareMetre
 * UnitOfMeasure4Code.mmSquareMetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Foot
 * UnitOfMeasure4Code.mmFoot}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Mile
 * UnitOfMeasure4Code.mmMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareInch
 * UnitOfMeasure4Code.mmSquareInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareFoot
 * UnitOfMeasure4Code.mmSquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareMile
 * UnitOfMeasure4Code.mmSquareMile}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Ounce
 * UnitOfMeasure4Code.mmOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#GBPint
 * UnitOfMeasure4Code.mmGBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USPint
 * UnitOfMeasure4Code.mmUSPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#GBQuart
 * UnitOfMeasure4Code.mmGBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USQuart
 * UnitOfMeasure4Code.mmUSQuart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USGallon
 * UnitOfMeasure4Code.mmUSGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Millimetre
 * UnitOfMeasure4Code.mmMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Kilometre
 * UnitOfMeasure4Code.mmKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareYard
 * UnitOfMeasure4Code.mmSquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareMillimetre
 * UnitOfMeasure4Code.mmSquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareCentimetre
 * UnitOfMeasure4Code.mmSquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#SquareKilometre
 * UnitOfMeasure4Code.mmSquareKilometre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#CubicMillimetre
 * UnitOfMeasure4Code.mmCubicMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Centilitre
 * UnitOfMeasure4Code.mmCentilitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Litre
 * UnitOfMeasure4Code.mmLitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Pound
 * UnitOfMeasure4Code.mmPound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USTon
 * UnitOfMeasure4Code.mmUSTon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USBarrel
 * UnitOfMeasure4Code.mmUSBarrel}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Box
 * UnitOfMeasure4Code.mmBox}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Bottle
 * UnitOfMeasure4Code.mmBottle}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Carton
 * UnitOfMeasure4Code.mmCarton}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Container
 * UnitOfMeasure4Code.mmContainer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Crate
 * UnitOfMeasure4Code.mmCrate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#CubicInch
 * UnitOfMeasure4Code.mmCubicInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#CubicMeter
 * UnitOfMeasure4Code.mmCubicMeter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#GBFluidOunce
 * UnitOfMeasure4Code.mmGBFluidOunce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#USFluidOunce
 * UnitOfMeasure4Code.mmUSFluidOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Bag
 * UnitOfMeasure4Code.mmBag}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#Bale
 * UnitOfMeasure4Code.mmBale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code#MetricTon
 * UnitOfMeasure4Code.mmMetricTon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure2Code
 * UnitOfMeasure2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"KGM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Kilogram = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Each"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Each = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Each";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Each.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code GBTon = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.GBTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Metre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Inch = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Yard = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code GBGallon = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Gram = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Centimetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareMetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Foot = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Mile = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareInch = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareFoot = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareMile = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ounce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Ounce = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ounce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Ounce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code GBPint = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USPint = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code GBQuart = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USQuart = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USGallon = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Millimetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Kilometre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareYard = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareMillimetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareCentimetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code SquareKilometre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code CubicMillimetre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Centilitre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Litre = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Pound = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USTon = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USTon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBarrel"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USBarrel = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBarrel";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USBarrel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Box"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Box = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Box";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Box.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bottle"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Bottle = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bottle";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Bottle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Carton = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carton";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Carton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Container"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Container = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Container";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Container.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crate"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Crate = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Crate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code CubicInch = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CubicMeter"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code CubicMeter = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CubicMeter";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.CubicMeter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBFluidOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code GBFluidOunce = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBFluidOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.GBFluidOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFluidOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code USFluidOunce = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USFluidOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.USFluidOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bag"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Bag = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bag";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Bag.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bale"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code Bale = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bale";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.Bale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MetricTon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure4Code MetricTon = new UnitOfMeasure4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MetricTon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure4Code.mmObject();
			codeName = UnitOfMeasure2Code.MetricTon.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure4Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("KGM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasure4Code";
				definition = "Identifies the unit of measure by means of a code. The code is taken from UN/ECE Recommendation 20.";
				trace_lazy = () -> UnitOfMeasure2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure4Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure4Code.Each, com.tools20022.repository.codeset.UnitOfMeasure4Code.GBTon,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure4Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure4Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure4Code.Gram, com.tools20022.repository.codeset.UnitOfMeasure4Code.Centimetre,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure4Code.Foot, com.tools20022.repository.codeset.UnitOfMeasure4Code.Mile,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareFoot, com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareMile,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Ounce, com.tools20022.repository.codeset.UnitOfMeasure4Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure4Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.GBQuart, com.tools20022.repository.codeset.UnitOfMeasure4Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure4Code.USGallon,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Millimetre, com.tools20022.repository.codeset.UnitOfMeasure4Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareYard,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareMillimetre, com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure4Code.SquareKilometre,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.CubicMillimetre, com.tools20022.repository.codeset.UnitOfMeasure4Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure4Code.Litre,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Pound, com.tools20022.repository.codeset.UnitOfMeasure4Code.USTon, com.tools20022.repository.codeset.UnitOfMeasure4Code.USBarrel,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Box, com.tools20022.repository.codeset.UnitOfMeasure4Code.Bottle, com.tools20022.repository.codeset.UnitOfMeasure4Code.Carton,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Container, com.tools20022.repository.codeset.UnitOfMeasure4Code.Crate, com.tools20022.repository.codeset.UnitOfMeasure4Code.CubicInch,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.CubicMeter, com.tools20022.repository.codeset.UnitOfMeasure4Code.GBFluidOunce, com.tools20022.repository.codeset.UnitOfMeasure4Code.USFluidOunce,
						com.tools20022.repository.codeset.UnitOfMeasure4Code.Bag, com.tools20022.repository.codeset.UnitOfMeasure4Code.Bale, com.tools20022.repository.codeset.UnitOfMeasure4Code.MetricTon);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Each.getCodeName().get(), Each);
		codesByName.put(GBTon.getCodeName().get(), GBTon);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(Ounce.getCodeName().get(), Ounce);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(CubicMillimetre.getCodeName().get(), CubicMillimetre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(USTon.getCodeName().get(), USTon);
		codesByName.put(USBarrel.getCodeName().get(), USBarrel);
		codesByName.put(Box.getCodeName().get(), Box);
		codesByName.put(Bottle.getCodeName().get(), Bottle);
		codesByName.put(Carton.getCodeName().get(), Carton);
		codesByName.put(Container.getCodeName().get(), Container);
		codesByName.put(Crate.getCodeName().get(), Crate);
		codesByName.put(CubicInch.getCodeName().get(), CubicInch);
		codesByName.put(CubicMeter.getCodeName().get(), CubicMeter);
		codesByName.put(GBFluidOunce.getCodeName().get(), GBFluidOunce);
		codesByName.put(USFluidOunce.getCodeName().get(), USFluidOunce);
		codesByName.put(Bag.getCodeName().get(), Bag);
		codesByName.put(Bale.getCodeName().get(), Bale);
		codesByName.put(MetricTon.getCodeName().get(), MetricTon);
	}

	public static UnitOfMeasure4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure4Code[] values() {
		UnitOfMeasure4Code[] values = new UnitOfMeasure4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure4Code> {
		@Override
		public UnitOfMeasure4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}