/*******************************************************************************
 * Copyright (c) 2021 Christoph Läubrich and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Christoph Läubrich  - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.core.dotClasspath;

import java.io.File;

public interface SourceFolderClasspathEntry extends ProjectClasspathEntry {

    /**
     * 
     * @return the source folder
     */
    File getSourcePath();

    /**
     * 
     * @return the configured output folder
     */
    File getOutputFolder();
}
