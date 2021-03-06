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
import com.tools20022.repository.msg.LineItem13;

/**
 * If LatestShipmentDate is present, then LatestShipmentDate is not allowed
 * within each occurrence of LineItemDetails. If LatestShipmentDate is not
 * present, then LatestShipmentDate is allowed within each occurrence of
 * LineItemDetails.
 */
public class ConstraintLatestShipmentDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LatestShipmentDate is present, then LatestShipmentDate is not allowed within each occurrence of LineItemDetails. If LatestShipmentDate is not present, then LatestShipmentDate is allowed within each occurrence of LineItemDetails."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem13> forLineItem13 = new MMConstraint<LineItem13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDateRule";
			definition = "If LatestShipmentDate is present, then LatestShipmentDate is not allowed within each occurrence of LineItemDetails. If LatestShipmentDate is not present, then LatestShipmentDate is allowed within each occurrence of LineItemDetails.";
			owner_lazy = () -> LineItem13.mmObject();
		}

		@Override
		public void executeValidator(LineItem13 obj) throws Exception {
			checkLineItem13(obj);
		}
	};

	/**
	 * If LatestShipmentDate is present, then LatestShipmentDate is not allowed
	 * within each occurrence of LineItemDetails. If LatestShipmentDate is not
	 * present, then LatestShipmentDate is allowed within each occurrence of
	 * LineItemDetails.
	 */
	public static void checkLineItem13(LineItem13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}