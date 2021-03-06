/*
 * Copyright (c) 2001, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.gmbal.typelib;

import java.util.List;

/**
 *
 * @author ken
 */
public interface EvaluatedMethodDeclaration extends EvaluatedAccessibleDeclaration {
    List<EvaluatedType> parameterTypes() ;

    EvaluatedType returnType() ;
    
    java.lang.reflect.Method method() ;
}
