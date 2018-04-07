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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.msg.TradeSettlement2;

/**
 * Value according to external codelist.
 */
public class ConstraintR6 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmExemptionReasonCode
	 * TradeSettlement2.mmExemptionReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "R6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value according to external codelist."</li>
	 * </ul>
	 */
	public static final MMConstraint<Max4Text> forTradeSettlement2_ExemptionReasonCode = new MMConstraint<Max4Text>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "R6";
			definition = "Value according to external codelist.";
			owner_lazy = () -> TradeSettlement2.mmExemptionReasonCode;
		}

		@Override
		public void executeValidator(Max4Text obj) throws Exception {
			checkTradeSettlement2_ExemptionReasonCode(obj);
		}
	};

	/**
	 * Value according to external codelist.
	 */
	public static void checkTradeSettlement2_ExemptionReasonCode(Max4Text obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}