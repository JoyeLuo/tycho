/*******************************************************************************
 * Copyright (c) 2015 SAP SE and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP SE - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.artifacts;

import org.eclipse.tycho.core.shared.BuildFailureException;

/**
 * Exception thrown when a dependency of a project cannot be resolved.
 */
public class DependencyResolutionException extends BuildFailureException {

    private static final long serialVersionUID = 1L;

    public DependencyResolutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DependencyResolutionException(String message) {
        super(message);
    }

}
