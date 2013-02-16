/**
 * ﻿Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
/**********************************************************************************
 Copyright (C) 2010
 by 52 North Initiative for Geospatial Open Source Software GmbH

 Contact: Andreas Wytzisk 
 52 North Initiative for Geospatial Open Source Software GmbH
 Martin-Luther-King-Weg 24
 48155 Muenster, Germany
 info@52north.org

 This program is free software; you can redistribute and/or modify it under the
 terms of the GNU General Public License version 2 as published by the Free
 Software Foundation.

 This program is distributed WITHOUT ANY WARRANTY; even without the implied
 WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 General Public License for more details.

 You should have received a copy of the GNU General Public License along with this 
 program (see gnu-gplv2.txt). If not, write to the Free Software Foundation, Inc., 
 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or visit the Free Software
 Foundation web page, http://www.fsf.org.

 Created on: 27.07.2010
 *********************************************************************************/
package org.n52.shared.service.rpc;

import org.n52.shared.responses.SesClientResponse;
import org.n52.shared.serializable.pojos.ComplexRuleData;
import org.n52.shared.serializable.pojos.Rule;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The Interface RpcSesRuleServiceAsync.
 * 
 * @author <a href="mailto:osmanov@52north.org">Artur Osmanov</a>
 */
public interface RpcSesRuleServiceAsync {

    void subscribe(String userID, String uuid, String medium, String eml, AsyncCallback<SesClientResponse> callback);

    void unSubscribe(String uuid, String userID, String medium, String format, AsyncCallback<SesClientResponse> callback);

    void createBasicRule(Rule rule, boolean edit, String oldRuleName, AsyncCallback<SesClientResponse> callback);

    void getAllOwnRules(String id, boolean edit,  AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void getAllOtherRules(String id, boolean edit, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void publishRule(String ruleName, boolean published, String role, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void getAllRules(AsyncCallback<SesClientResponse> callback);

    void deleteRule(String uuid, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void getRuleForEditing(String ruleName, AsyncCallback<SesClientResponse> callback);

    void getAllPublishedRules(String userID, int operator, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void ruleNameExists(String ruleName, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void createComplexRule(ComplexRuleData rule, boolean edit, String oldRuleName, AsyncCallback<SesClientResponse> callback);

    void getUserSubscriptions(String userID, AsyncCallback<SesClientResponse> callback);

    void search(String text, int criterion, String userID, AsyncCallback<SesClientResponse> callback);

    @Deprecated
    void copy(String userID, String ruleName, AsyncCallback<SesClientResponse> callback);
}
